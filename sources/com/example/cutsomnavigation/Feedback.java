package com.example.cutsomnavigation;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import java.util.HashMap;

public class Feedback extends Fragment {
    /* access modifiers changed from: private */
    public String android_id;
    /* access modifiers changed from: private */
    public EditText feedme;
    private RatingBar rateme;
    float score = 0.0f;
    private Button sendme;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.feedback_form, container, false);
        this.android_id = Settings.Secure.getString(getContext().getContentResolver(), "android_id");
        this.feedme = (EditText) view.findViewById(R.id.dabba);
        this.rateme = (RatingBar) view.findViewById(R.id.ratingBar);
        this.sendme = (Button) view.findViewById(R.id.button33);
        this.rateme.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Feedback.this.score = v;
                HashMap<String, Object> maps = new HashMap<>();
                maps.put("Rating", new Float(Feedback.this.score));
                maps.put("Unique Android ID", Feedback.this.android_id.toString());
                FirebaseDatabase.getInstance().getReference().child("Star Ratings").push().setValue(maps).addOnCompleteListener(new OnCompleteListener<Void>() {
                    public void onComplete(Task<Void> task) {
                        Log.i("hola", "uploaded");
                    }
                });
            }
        });
        this.sendme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (Feedback.this.score == 0.0f) {
                    Toast.makeText(Feedback.this.getActivity().getApplicationContext(), "Please give star Ratings", 0).show();
                } else if (Feedback.this.feedme.getText().toString().matches("")) {
                    Toast.makeText(Feedback.this.getActivity().getApplicationContext(), "Please enter feedback", 0).show();
                } else {
                    HashMap<String, Object> maps = new HashMap<>();
                    maps.put("Rating", new Float(Feedback.this.score));
                    maps.put("Feedback", Feedback.this.feedme.getText().toString());
                    maps.put("Unique Android ID", Feedback.this.android_id.toString());
                    FirebaseDatabase.getInstance().getReference().child("Feedbacks").push().setValue(maps).addOnCompleteListener(new OnCompleteListener<Void>() {
                        public void onComplete(Task<Void> task) {
                            Log.i("hola", "uploaded");
                            Toast.makeText(Feedback.this.getActivity().getApplicationContext(), "Feedback Successfully Sent", 0).show();
                        }
                    });
                }
            }
        });
        return view;
    }
}
