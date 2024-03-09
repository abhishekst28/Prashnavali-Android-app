package com.example.cutsomnavigation;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.cutsomnavigation.HomeWatcher;
import com.example.cutsomnavigation.MusicService;
import com.google.android.material.navigation.NavigationView;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    public static final Random RANDOM = new Random();
    private ServiceConnection Scon = new ServiceConnection() {
        public void onServiceConnected(ComponentName name, IBinder binder) {
            MusicService unused = MainActivity.this.mServ = ((MusicService.ServiceBinder) binder).getService();
        }

        public void onServiceDisconnected(ComponentName name) {
            MusicService unused = MainActivity.this.mServ = null;
        }
    };
    DrawerLayout drawerLayout;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    HomeWatcher mHomeWatcher;
    private boolean mIsBound = false;
    /* access modifiers changed from: private */
    public MusicService mServ;
    NavigationView nav;
    ActionBarDrawerToggle toggle;

    public static long randomLong(long lower, long upper) {
        return ((long) (RANDOM.nextDouble() * ((double) (upper - lower)))) + lower;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        Log.d("olaTag", "This is my message");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.nav = (NavigationView) findViewById(R.id.navmenu);
        this.drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, this.drawerLayout, toolbar, R.string.open, R.string.close);
        this.toggle = actionBarDrawerToggle;
        this.drawerLayout.addDrawerListener(actionBarDrawerToggle);
        this.toggle.syncState();
        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
        HomeWatcher homeWatcher = new HomeWatcher(this);
        this.mHomeWatcher = homeWatcher;
        homeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            public void onHomePressed() {
                if (MainActivity.this.mServ != null) {
                    MainActivity.this.mServ.pauseMusic();
                }
            }

            public void onHomeLongPressed() {
                if (MainActivity.this.mServ != null) {
                    MainActivity.this.mServ.pauseMusic();
                }
            }
        });
        this.mHomeWatcher.startWatch();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.fragmentManager = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.fragmentTransaction = beginTransaction;
        beginTransaction.add((int) R.id.frag_container, (Fragment) new FirstFragment());
        this.fragmentTransaction.commit();
        this.nav.setNavigationItemSelectedListener(this);
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Log.d("borTag", "insod");
        switch (menuItem.getItemId()) {
            case R.id.feedback:
                Toast.makeText(getApplicationContext(), "Feedback panel is Open", 1).show();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                this.fragmentManager = supportFragmentManager;
                FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
                this.fragmentTransaction = beginTransaction;
                beginTransaction.replace(R.id.frag_container, new Feedback());
                this.fragmentTransaction.commit();
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                break;
            case R.id.info:
                Toast.makeText(getApplicationContext(), "Information panel is Open", 1).show();
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                this.fragmentManager = supportFragmentManager2;
                FragmentTransaction beginTransaction2 = supportFragmentManager2.beginTransaction();
                this.fragmentTransaction = beginTransaction2;
                beginTransaction2.replace(R.id.frag_container, new SecondFragment());
                this.fragmentTransaction.commit();
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                break;
            case R.id.menu_home:
                Toast.makeText(getApplicationContext(), "Home Panel is Open", 1).show();
                FragmentManager supportFragmentManager3 = getSupportFragmentManager();
                this.fragmentManager = supportFragmentManager3;
                FragmentTransaction beginTransaction3 = supportFragmentManager3.beginTransaction();
                this.fragmentTransaction = beginTransaction3;
                beginTransaction3.replace(R.id.frag_container, new FirstFragment());
                this.fragmentTransaction.commit();
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                break;
            case R.id.menu_setting:
                Toast.makeText(getApplicationContext(), "Setting Panel is Open", 1).show();
                FragmentManager supportFragmentManager4 = getSupportFragmentManager();
                this.fragmentManager = supportFragmentManager4;
                FragmentTransaction beginTransaction4 = supportFragmentManager4.beginTransaction();
                this.fragmentTransaction = beginTransaction4;
                beginTransaction4.replace(R.id.frag_container, new MusicSetting());
                this.fragmentTransaction.commit();
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                Log.d("myTag", "This is my message");
                break;
            case R.id.share:
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                Intent sharingIntent = new Intent("android.intent.action.SEND");
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra("android.intent.extra.TEXT", "https://play.google.com/store/apps/details?id=com.blogspot.shivashaktiapp.ramshalakaprashnawali&hl=en");
                sharingIntent.putExtra("android.intent.extra.SUBJECT", "Prashnavali App");
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
                this.drawerLayout.closeDrawer((int) GravityCompat.START);
                break;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void doBindService() {
        bindService(new Intent(this, MusicService.class), this.Scon, 1);
        this.mIsBound = true;
    }

    /* access modifiers changed from: package-private */
    public void doUnbindService() {
        if (this.mIsBound) {
            unbindService(this.Scon);
            this.mIsBound = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MusicService musicService = this.mServ;
        if (musicService != null) {
            musicService.resumeMusic();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        doUnbindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        stopService(music);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        MusicService musicService;
        super.onPause();
        PowerManager pm = (PowerManager) getSystemService("power");
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }
        if (!isScreenOn && (musicService = this.mServ) != null) {
            musicService.pauseMusic();
        }
    }
}
