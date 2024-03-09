package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.3.0 */
public final class zzaat {
    public static final zzaai<String> zzcli = zzaai.zza(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    public static final zzaai<String> zzclj = zzaai.zza(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    private static final zzaca<Boolean> zzclk = zzacp.zzclk;
    private static final zzaai<Integer> zzcll = zzaai.zza(1, "gads:http_url_connection_factory:timeout_millis", 10000);
    public static final zzaai<String> zzclm = zzaai.zza(1, "gads:video_exo_player:version", "3");
    public static final zzaai<Integer> zzcln = zzaai.zza(1, "gads:video_exo_player:connect_timeout", 8000);
    public static final zzaai<Integer> zzclo = zzaai.zza(1, "gads:video_exo_player:read_timeout", 8000);
    public static final zzaai<Integer> zzclp = zzaai.zza(1, "gads:video_exo_player:loading_check_interval", 1048576);
    public static final zzaai<Integer> zzclq = zzaai.zza(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
    public static final zzaai<Integer> zzclr = zzaai.zza(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
    public static final zzaai<Integer> zzcls = zzaai.zza(1, "gads:video_exo_player_socket_receive_buffer_size", 0);
    public static final zzaai<String> zzclt = zzaai.zza(1, "gads:video_exo_player:precache_exceptions", "");
    public static final zzaai<Integer> zzclu = zzaai.zza(1, "gads:video_exo_player:min_retry_count", -1);
    public static final zzaai<Boolean> zzclv = zzaai.zza(1, "gads:video_exo_player:fmp4_extractor_enabled", (Boolean) false);
    public static final zzaai<Integer> zzclw = zzaai.zza(1, "gads:video_stream_cache:limit_count", 5);
    public static final zzaai<Integer> zzclx = zzaai.zza(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final zzaai<Integer> zzcly = zzaai.zza(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final zzaai<Long> zzclz = zzaai.zzb(1, "gads:video_stream_cache:limit_time_sec", 300);
    public static final zzaai<Long> zzcma = zzaai.zzb(1, "gads:video_stream_cache:notify_interval_millis", 125);
    public static final zzaai<Integer> zzcmb = zzaai.zza(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final zzaai<String> zzcmc = zzaai.zza(1, "gads:video:metric_frame_hash_times", "");
    public static final zzaai<Long> zzcmd = zzaai.zzb(1, "gads:video:metric_frame_hash_time_leniency", 500);
    public static final zzaai<Boolean> zzcme = zzaai.zza(1, "gads:video:force_watermark", (Boolean) false);
    public static final zzaai<Long> zzcmf = zzaai.zzb(1, "gads:video:surface_update_min_spacing_ms", 1000);
    public static final zzaai<Boolean> zzcmg = zzaai.zza(1, "gads:video:spinner:enabled", (Boolean) false);
    public static final zzaai<Integer> zzcmh = zzaai.zza(1, "gads:video:spinner:scale", 4);
    public static final zzaai<Long> zzcmi = zzaai.zzb(1, "gads:video:spinner:jank_threshold_ms", 50);
    public static final zzaai<Boolean> zzcmj = zzaai.zza(1, "gads:video:aggressive_media_codec_release", (Boolean) false);
    public static final zzaai<Boolean> zzcmk = zzaai.zza(1, "gads:memory_bundle:debug_info", (Boolean) false);
    public static final zzaai<String> zzcml = zzaai.zza(1, "gads:video:codec_query_mime_types", "");
    public static final zzaai<Integer> zzcmm = zzaai.zza(1, "gads:video:codec_query_minimum_version", 16);
    public static final zzaai<String> zzcmn = zzaai.zza(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");
    public static final zzaai<String> zzcmo = zzaai.zza(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");
    public static final zzaai<String> zzcmp = zzaai.zza(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
    public static final zzaai<String> zzcmq = zzaai.zza(1, "gad:mraid:version", "3.0");
    public static final zzaai<Boolean> zzcmr = zzaai.zza(1, "gads:mraid:expanded_interstitial_fix", (Boolean) false);
    public static final zzaai<Boolean> zzcms = zzaai.zza(1, "gads:mraid:initial_size_fallback", (Boolean) false);
    public static final zzaai<Integer> zzcmt = zzaai.zza(1, "gads:content_vertical_fingerprint_number", 100);
    public static final zzaai<Integer> zzcmu = zzaai.zza(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final zzaai<Integer> zzcmv = zzaai.zza(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final zzaai<String> zzcmw = zzaai.zza(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final zzaai<String> zzcmx = zzaai.zza(1, "gads:content_fetch_exclude_view_tag", "none");
    public static final zzaai<Boolean> zzcmy = zzaai.zza(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);
    public static final zzaai<Boolean> zzcmz = zzaai.zza(1, "gads:content_fetch_enable_new_content_score", (Boolean) false);
    public static final zzaai<Boolean> zzcna = zzaai.zza(1, "gads:content_fetch_enable_serve_once", (Boolean) false);
    public static final zzaai<Boolean> zzcnb = zzaai.zza(1, "gads:sai:enabled", (Boolean) true);
    public static final zzaai<String> zzcnc = zzaai.zza(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final zzaai<String> zzcnd = zzaai.zza(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");
    public static final zzaai<Boolean> zzcne = zzaai.zza(1, "gads:sai:using_macro:enabled", (Boolean) false);
    public static final zzaai<String> zzcnf = zzaai.zza(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final zzaai<Long> zzcng = zzaai.zzb(1, "gads:sai:timeout_ms", -1);
    public static final zzaai<Integer> zzcnh = zzaai.zza(1, "gads:sai:scion_thread_pool_size", 5);
    public static final zzaai<Boolean> zzcni = zzaai.zza(1, "gads:sai:app_measurement_enabled3", (Boolean) false);
    public static final zzaai<Integer> zzcnj = zzaai.zza(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);
    public static final zzaai<Boolean> zzcnk = zzaai.zza(1, "gads:sai:force_through_reflection", (Boolean) true);
    public static final zzaai<Boolean> zzcnl = zzaai.zza(1, "gads:sai:gmscore_availability_check_disabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnm = zzaai.zza(1, "gads:sai:logging_disabled_for_drx", (Boolean) false);
    public static final zzaai<Boolean> zzcnn = zzaai.zza(1, "gads:sai:inject_firebase_proxy", (Boolean) false);
    public static final zzaai<Boolean> zzcno = zzaai.zza(1, "gads:sai:app_measurement_npa_enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnp = zzaai.zza(1, "gads:interstitial:app_must_be_foreground:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnq = zzaai.zza(1, "gads:interstitial:foreground_report:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnr = zzaai.zza(1, "gads:webview:error_web_response:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcns = zzaai.zza(1, "gads:webview:pause_interstitial:enabled", (Boolean) true);
    private static final zzaai<Boolean> zzcnt = zzaai.zza(1, "gads:rsku:webviewgone:kill_process:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnu = zzaai.zza(1, "gads:webviewgone:kill_process:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcnv = zzaai.zza(1, "gads:rsku:webviewgone:new_onshow:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcnw = zzaai.zza(1, "gads:webviewgone:new_onshow:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcnx = zzaai.zza(1, "gads:webview:pause_resume:enabled", (Boolean) true);
    public static final zzaai<String> zzcny = zzaai.zza(1, "gads:webview_cookie_url", "googleads.g.doubleclick.net");
    private static final zzaai<Boolean> zzcnz = zzaai.zza(1, "gads:new_rewarded_ad:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcoa = zzaai.zza(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);
    private static final zzaai<Long> zzcob = zzaai.zzb(1, "gads:rewarded:adapter_timeout_ms", 20000);
    public static final zzaai<Boolean> zzcoc = zzaai.zza(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcod = zzaai.zza(1, "gads:rewarded:ssv_custom_data_enabled", (Boolean) true);
    public static final zzaai<Long> zzcoe = zzaai.zzb(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500);
    public static final zzaai<Long> zzcof = zzaai.zzb(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final zzaai<Boolean> zzcog = zzaai.zza(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);
    public static final zzaai<Long> zzcoh = zzaai.zzb(1, "gads:adid_values_in_adrequest:timeout", 2000);
    public static final zzaai<Boolean> zzcoi = zzaai.zza(1, "gads:disable_adid_values_in_ms", (Boolean) false);
    public static final zzaai<Long> zzcoj = zzaai.zzb(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000);
    public static final zzaai<Boolean> zzcok = zzaai.zza(1, "gads:custom_close_blocking:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcol = zzaai.zza(1, "gads:disabling_closable_area:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcom = zzaai.zza(1, "gads:use_system_ui_for_fullscreen:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcon = zzaai.zza(1, "gads:ad_overlay:collect_cutout_info:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcoo = zzaai.zza(1, "gads:impression_optimization_enabled", (Boolean) false);
    private static final zzaai<String> zzcop = zzaai.zza(1, "gads:banner_ad_pool:schema", "customTargeting");
    private static final zzaai<Integer> zzcoq = zzaai.zza(1, "gads:banner_ad_pool:max_queues", 3);
    private static final zzaai<Integer> zzcor = zzaai.zza(1, "gads:banner_ad_pool:max_pools", 3);
    public static final zzaai<Boolean> zzcos = zzaai.zza(1, "gads:delay_banner_renderer:enabled", (Boolean) true);
    private static final zzaai<Boolean> zzcot = zzaai.zza(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcou = zzaai.zza(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);
    private static final zzaai<String> zzcov = zzaai.zza(1, "gads:interstitial_ad_pool:schema", "customTargeting");
    private static final zzaai<String> zzcow = zzaai.zza(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
    private static final zzaai<Integer> zzcox = zzaai.zza(1, "gads:interstitial_ad_pool:max_pools", 3);
    private static final zzaai<Integer> zzcoy = zzaai.zza(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
    private static final zzaai<Integer> zzcoz = zzaai.zza(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
    private static final zzaai<String> zzcpa = zzaai.zza(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
    private static final zzaai<Integer> zzcpb = zzaai.zza(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
    private static final zzaai<Integer> zzcpc = zzaai.zza(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
    private static final zzaai<Long> zzcpd = zzaai.zzb(1, "gads:interstitial_ad_pool:discard_thresholds", 0);
    private static final zzaai<Long> zzcpe = zzaai.zzb(1, "gads:interstitial_ad_pool:miss_thresholds", 0);
    private static final zzaai<Float> zzcpf = zzaai.zza(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
    private static final zzaai<Float> zzcpg = zzaai.zza(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
    public static final zzaai<String> zzcph = zzaai.zza(1, "gads:spherical_video:vertex_shader", "");
    public static final zzaai<String> zzcpi = zzaai.zza(1, "gads:spherical_video:fragment_shader", "");
    public static final zzaai<Boolean> zzcpj = zzaai.zza(1, "gads:include_local_global_rectangles", (Boolean) false);
    public static final zzaai<Long> zzcpk = zzaai.zzb(1, "gads:position_watcher:throttle_ms", 200);
    public static final zzaai<Long> zzcpl = zzaai.zzb(1, "gads:position_watcher:scroll_aware_throttle_ms", 33);
    public static final zzaai<Boolean> zzcpm = zzaai.zza(1, "gads:position_watcher:enable_scroll_aware_ads", (Boolean) false);
    public static final zzaai<Boolean> zzcpn = zzaai.zza(1, "gads:position_watcher:send_scroll_data", (Boolean) false);
    private static final zzaai<Boolean> zzcpo = zzaai.zza(1, "gads:gen204_signals:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcpp = zzaai.zza(1, "gads:extra_sdk_versions_for_crash_reports:enabled", (Boolean) false);
    public static final zzaai<String> zzcpq = zzaai.zza(1, "gads:logged_adapter_version_classes", "");
    public static final zzaai<Long> zzcpr = zzaai.zzb(1, "gads:rtb_v1_1:signal_timeout_ms", 1000);
    public static final zzaai<Boolean> zzcps = zzaai.zza(1, "gads:rtb_signal:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcpt = zzaai.zza(1, "gads:rtb_v1_1:cld:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcpu = zzaai.zza(1, "gads:rtb_v1_1:cld:check_regex:enabled", (Boolean) true);
    public static final zzaai<String> zzcpv = zzaai.zza(1, "gads:rtb_logging:regex", "(?!)");
    public static final zzaai<Boolean> zzcpw = zzaai.zza(1, "gads:presentation_error:urls_enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcpx = zzaai.zza(1, "gads:rtb_interstitial:use_fullscreen_monitor", (Boolean) false);
    public static final zzaai<Boolean> zzcpy = zzaai.zza(1, "gads:v1_1:adapter_initialization:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcpz = zzaai.zza(1, "gads:adapter_initialization:min_sdk_version", 15301000);
    public static final zzaai<Long> zzcqa = zzaai.zzb(1, "gads:adapter_initialization:timeout", 30);
    public static final zzaai<Long> zzcqb = zzaai.zzb(1, "gads:adapter_initialization:cld_timeout", 10);
    public static final zzaai<Boolean> zzcqc = zzaai.zza(1, "gads:initialization_csi:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcqd = zzaai.zza(1, "gads:initialization_csi_control:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqe = zzaai.zza(1, "gads:msa:experiments:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqf = zzaai.zza(1, "gads:msa:experiments:ps:enabled", (Boolean) false);
    public static final zzaai<Integer> zzcqg = zzaai.zza(1, "gads:gestures:a2:enabled", 0);
    public static final zzaai<Boolean> zzcqh = zzaai.zza(1, "gads:gestures:clearTd:enabled", (Boolean) false);
    public static final zzaca<Boolean> zzcqi = zzacq.zzdbd;
    public static final zzaai<Boolean> zzcqj = zzaai.zza(1, "gads:gestures:errorlogging:enabled", (Boolean) false);
    public static final zzaai<Long> zzcqk = zzaai.zzb(1, "gads:gestures:task_timeout", 2000);
    public static final zzaai<Boolean> zzcql = zzaai.zza(1, "gads:gestures:asig:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqm = zzaai.zza(1, "gads:gestures:ans:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqn = zzaai.zza(1, "gads:gestures:tos:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqo = zzaai.zza(1, "gads:gestures:brt:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcqp = zzaai.zza(1, "gads:gestures:fpi:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqq = zzaai.zza(1, "gads:signal:app_permissions:disabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqr = zzaai.zza(1, "gads:gestures:inthex:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqs = zzaai.zza(1, "gads:gestures:hpk:enabled", (Boolean) true);
    public static final zzaai<String> zzcqt = zzaai.zza(1, "gads:gestures:pk", "");
    public static final zzaai<Boolean> zzcqu = zzaai.zza(1, "gads:gestures:bs:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcqv = zzaai.zza(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcqw = zzaai.zza(1, "gads:gestures:init_new_thread:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcqx = zzaai.zza(1, "gads:gestures:pds:enabled", (Boolean) true);
    private static final zzaai<Integer> zzcqy = zzaai.zza(1, "gads:gestures:as2percentage", 0);
    public static final zzaai<Boolean> zzcqz = zzaai.zza(1, "gads:gestures:las:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcra = zzaai.zza(1, "gads:gestures:ns:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcrb = zzaai.zza(1, "gads:gestures:vdd:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcrc = zzaai.zza(1, "gads:native:asset_view_touch_events", (Boolean) false);
    public static final zzaai<Boolean> zzcrd = zzaai.zza(1, "gads:native:set_touch_listener_on_asset_views", (Boolean) true);
    public static final zzaai<Boolean> zzcre = zzaai.zza(1, "gads:ais:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcrf = zzaai.zza(1, "gads:stav:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcrg = zzaai.zza(1, "gads:send_available_disk_space:enabled", (Boolean) false);
    private static final zzaai<String> zzcrh;
    public static final zzaai<String> zzcri = zzaai.zza(1, "gads:sdk_core_constants:caps", "");
    private static final zzaai<Boolean> zzcrj = zzaai.zza(1, "gads:js_flags:disable_phenotype", (Boolean) false);
    public static final zzaai<String> zzcrk = zzaai.zza(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    private static final zzaai<String> zzcrl = zzaai.zza(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final zzaai<String> zzcrm = zzaai.zza(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final zzaai<Integer> zzcrn = zzaai.zza(1, "gads:native_video_load_timeout", 10);
    private static final zzaai<Integer> zzcro = zzaai.zza(1, "gads:omid:native_webview_load_timeout", 2000);
    public static final zzaai<Boolean> zzcrp = zzaai.zza(1, "gads:enable_native_media_aspect_ratio", (Boolean) true);
    public static final zzaai<Boolean> zzcrq = zzaai.zza(1, "gads:native:media_content_main_image:enabled", (Boolean) true);
    public static final zzaai<String> zzcrr = zzaai.zza(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    private static final zzaai<Boolean> zzcrs = zzaai.zza(1, "gads:enable_store_active_view_state", (Boolean) false);
    public static final zzaai<Boolean> zzcrt = zzaai.zza(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);
    public static final zzaai<Boolean> zzcru = zzaai.zza(1, "gads:native:media_view_match_parent:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcrv = zzaai.zza(1, "gads:native:count_impression_for_assets", (Boolean) false);
    private static final zzaai<Boolean> zzcrw = zzaai.zza(1, "gads:instream_ad:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcrx = zzaai.zza(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);
    private static final zzaai<Boolean> zzcry = zzaai.zza(1, "gads:auto_location_for_coarse_permission", (Boolean) false);
    private static final zzaai<String> zzcrz = zzaai.zzb(1, "gads:auto_location_for_coarse_permission:experiment_id");
    public static final zzaai<Long> zzcsa = zzaai.zzb(1, "gads:auto_location_timeout", 2000);
    private static final zzaai<String> zzcsb = zzaai.zzb(1, "gads:auto_location_timeout:experiment_id");
    private static final zzaai<Long> zzcsc = zzaai.zzb(1, "gads:auto_location_interval", -1);
    private static final zzaai<String> zzcsd = zzaai.zzb(1, "gads:auto_location_interval:experiment_id");
    public static final zzaai<Boolean> zzcse = zzaai.zza(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcsf = zzaai.zza(1, "gads:get_request_signals_cld:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcsg = zzaai.zza(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", (Boolean) true);
    public static final zzaai<Long> zzcsh = zzaai.zzb(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000);
    public static final zzaai<Long> zzcsi = zzaai.zzb(1, "gads:parental_controls:timeout", 2000);
    private static final zzaai<Integer> zzcsj = zzaai.zza(1, "gads:cache:ad_request_timeout_millis", (int) ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION);
    private static final zzaai<Integer> zzcsk = zzaai.zza(1, "gads:cache:max_concurrent_downloads", 10);
    private static final zzaai<Long> zzcsl = zzaai.zzb(1, "gads:cache:javascript_timeout_millis", 5000);
    public static final zzaai<Boolean> zzcsm = zzaai.zza(1, "gads:cache:bind_on_foreground", (Boolean) false);
    public static final zzaai<Boolean> zzcsn = zzaai.zza(1, "gads:cache:bind_on_init", (Boolean) false);
    public static final zzaai<Boolean> zzcso = zzaai.zza(1, "gads:cache:bind_on_request", (Boolean) false);
    public static final zzaai<Long> zzcsp = zzaai.zzb(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final zzaai<Boolean> zzcsq = zzaai.zza(1, "gads:cache:use_cache_data_source", (Boolean) false);
    public static final zzaai<Boolean> zzcsr = zzaai.zza(1, "gads:cache:connection_per_read", (Boolean) false);
    public static final zzaai<Long> zzcss = zzaai.zzb(1, "gads:cache:connection_timeout", 5000);
    public static final zzaai<Long> zzcst = zzaai.zzb(1, "gads:cache:read_only_connection_timeout", 5000);
    public static final zzaai<Boolean> zzcsu = zzaai.zza(1, "gads:http_assets_cache:enabled", (Boolean) false);
    public static final zzaai<String> zzcsv = zzaai.zza(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final zzaai<Integer> zzcsw = zzaai.zza(1, "gads:http_assets_cache:time_out", 100);
    public static final zzaai<Boolean> zzcsx = zzaai.zza(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcsy = zzaai.zza(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);
    public static final zzaai<Long> zzcsz = zzaai.zzb(1, "gads:debug_hold_gesture:time_millis", 2000);
    public static final zzaai<String> zzcta = zzaai.zza(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final zzaai<String> zzctb = zzaai.zza(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final zzaai<String> zzctc = zzaai.zza(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final zzaai<String> zzctd = zzaai.zza(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final zzaai<Integer> zzcte = zzaai.zza(1, "gads:drx_debug:timeout_ms", 5000);
    public static final zzaai<Integer> zzctf = zzaai.zza(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final zzaai<Boolean> zzctg = zzaai.zza(1, "gad:interstitial_for_multi_window", (Boolean) false);
    public static final zzaai<Boolean> zzcth = zzaai.zza(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);
    public static final zzaai<Boolean> zzcti = zzaai.zza(1, "gad:interstitial_multi_window_method", (Boolean) false);
    public static final zzaai<Integer> zzctj = zzaai.zza(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final zzaai<Boolean> zzctk = zzaai.zza(1, "gads:clearcut_logging:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzctl = zzaai.zza(1, "gads:clearcut_logging:write_to_file", (Boolean) false);
    public static final zzaai<Boolean> zzctm = zzaai.zza(1, "gad:publisher_testing:force_local_request:enabled", (Boolean) true);
    public static final zzaai<String> zzctn = zzaai.zza(1, "gad:publisher_testing:force_local_request:enabled_list", "");
    public static final zzaai<String> zzcto = zzaai.zza(1, "gad:publisher_testing:force_local_request:disabled_list", "");
    public static final zzaai<Integer> zzctp = zzaai.zza(1, "gad:http_redirect_max_count:times", 8);
    public static final zzaai<Boolean> zzctq = zzaai.zza(1, "gads:omid:enabled", (Boolean) true);
    public static final zzaai<Integer> zzctr = zzaai.zza(1, "gads:omid:destroy_webview_delay", 1000);
    private static final zzaai<Boolean> zzcts = zzaai.zza(1, "gads:omid_1_3_activate:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzctt = zzaai.zza(1, "gads:omid_1_3_create_html_session:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzctu = zzaai.zza(1, "gads:omid_1_3_create_js_session:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzctv = zzaai.zza(1, "gads:nonagon:banner:enabled", (Boolean) true);
    private static final zzaai<String> zzctw = zzaai.zza(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
    private static final zzaai<Boolean> zzctx = zzaai.zza(1, "gads:nonagon:app_open:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcty = zzaai.zza(1, "gads:app_open_beta:min_version", 999999999);
    private static final zzaai<String> zzctz = zzaai.zza(1, "gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
    private static final zzaai<Boolean> zzcua = zzaai.zza(1, "gads:nonagon:interstitial:enabled", (Boolean) true);
    private static final zzaai<String> zzcub = zzaai.zza(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
    private static final zzaai<Boolean> zzcuc = zzaai.zza(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcud = zzaai.zza(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) true);
    public static final zzaai<String> zzcue = zzaai.zza(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    private static final zzaai<Boolean> zzcuf = zzaai.zza(1, "gads:nonagon:nativead:enabled", (Boolean) true);
    private static final zzaai<String> zzcug = zzaai.zza(1, "gads:nonagon:nativead:app_name", "(?!)");
    public static final zzaai<Boolean> zzcuh = zzaai.zza(1, "gads:nonagon:banner:check_dp_size", (Boolean) true);
    public static final zzaai<Boolean> zzcui = zzaai.zza(1, "gads:nonagon:rewarded:load_multiple_ads", (Boolean) true);
    private static final zzaai<Boolean> zzcuj = zzaai.zza(1, "gads:nonagon:return_last_error_code", (Boolean) false);
    public static final zzaai<Boolean> zzcuk = zzaai.zza(1, "gads:nonagon:return_no_fill_error_code", (Boolean) false);
    public static final zzaai<Boolean> zzcul = zzaai.zza(1, "gads:nonagon:continue_on_no_fill", (Boolean) false);
    private static final zzaai<Boolean> zzcum = zzaai.zza(1, "gads:nonagon:open_not_loaded_interstitial", (Boolean) true);
    public static final zzaai<Boolean> zzcun = zzaai.zza(1, "gads:nonagon:separate_timeout:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcuo = zzaai.zza(1, "gads:nonagon:request_timeout:seconds", 60);
    public static final zzaai<Boolean> zzcup = zzaai.zza(1, "gads:nonagon:banner_recursive_renderer", (Boolean) false);
    public static final zzaai<Boolean> zzcuq = zzaai.zza(1, "gads:nonagon:app_stats_lock:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcur = zzaai.zza(1, "gads:nonagon:app_stats_main_thread:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcus = zzaai.zza(1, "gads:uri_query_to_map_bg_thread:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcut = zzaai.zza(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcuu = zzaai.zza(1, "gads:active_view_gmsg_separate_pool:enabled", (Boolean) true);
    private static final zzaai<Boolean> zzcuv = zzaai.zza(1, "gads:nonagon:service:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcuw = zzaai.zza(1, "gads:nonagon:dpl_cancel_destroy_webview:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcux = zzaai.zza(1, "gads:signals:ad_id_info:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcuy = zzaai.zza(1, "gads:signals:app_index:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcuz = zzaai.zza(1, "gads:signals:attestation_token:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcva = zzaai.zza(1, "gads:signals:cache:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcvb = zzaai.zza(1, "gads:signals:doritos:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcvc = zzaai.zza(1, "gads:signals:doritos:v1:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcvd = zzaai.zza(1, "gads:signals:doritos:v2:immediate:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcve = zzaai.zza(1, "gads:signals:location:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcvf = zzaai.zza(1, "gads:signals:network_prediction:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcvg = zzaai.zza(1, "gads:signals:parental_control:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcvh = zzaai.zza(1, "gads:signals:video_decoder:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcvi = zzaai.zza(1, "gads:signals:app_version_name:enabled", (Boolean) false);
    private static final zzaai<Boolean> zzcvj = zzaai.zza(1, "gads:attestation_token:enabled", (Boolean) false);
    public static final zzaai<Long> zzcvk = zzaai.zzb(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000);
    public static final zzaai<Integer> zzcvl = zzaai.zza(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final zzaai<Integer> zzcvm = zzaai.zza(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);
    public static final zzaai<Integer> zzcvn = zzaai.zza(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);
    public static final zzaai<Integer> zzcvo = zzaai.zza(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);
    private static final zzaca<Boolean> zzcvp = zzacr.zzdbe;
    public static final zzaai<Boolean> zzcvq = zzaai.zza(1, "gads:consent:shared_preference_reading:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcvr = zzaai.zza(1, "gads:consent:iab_consent_info:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcvs = zzaai.zza(1, "gads:fc_consent:shared_preference_reading:enabled", (Boolean) true);
    public static final zzaai<String> zzcvt = zzaai.zza(1, "gads:sp:json_string", "");
    public static final zzaai<Boolean> zzcvu = zzaai.zza(1, "gads:nativeads:image:sample:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcvv = zzaai.zza(1, "gads:nativeads:image:sample:pixels", 1048576);
    public static final zzaai<Boolean> zzcvw = zzaai.zza(1, "gads:nativeads:pub_image_scale_type:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcvx = zzaai.zza(1, "gads:offline_signaling:enabled", (Boolean) false);
    public static final zzaai<Integer> zzcvy = zzaai.zza(1, "gads:offline_signaling:log_maximum", 100);
    public static final zzaai<Boolean> zzcvz = zzaai.zza(1, "gads:nativeads:template_signal:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcwa = zzaai.zza(1, "gads:nativeads:media_content_aspect_ratio:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcwb = zzaai.zza(1, "gads:nativeads:media_content_metadata:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcwc = zzaai.zza(1, "gads:ar_ads:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcwd = zzaai.zza(1, "gads:precache_pool:verbose_logging", (Boolean) false);
    public static final zzaai<Integer> zzcwe = zzaai.zza(1, "gads:rewarded_precache_pool:count", 0);
    public static final zzaai<Integer> zzcwf = zzaai.zza(1, "gads:interstitial_precache_pool:count", 0);
    public static final zzaai<String> zzcwg = zzaai.zza(1, "gads:rewarded_precache_pool:discard_strategy", "lru");
    public static final zzaai<String> zzcwh = zzaai.zza(1, "gads:interstitial_precache_pool:discard_strategy", "lru");
    public static final zzaai<String> zzcwi = zzaai.zza(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaai<String> zzcwj = zzaai.zza(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaai<Integer> zzcwk = zzaai.zza(1, "gads:rewarded_precache_pool:size", 1);
    public static final zzaai<Integer> zzcwl = zzaai.zza(1, "gads:interstitial_precache_pool:size", 1);
    public static final zzaai<Integer> zzcwm = zzaai.zza(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);
    public static final zzaai<Integer> zzcwn = zzaai.zza(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);
    public static final zzaai<String> zzcwo = zzaai.zza(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaai<String> zzcwp = zzaai.zza(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaai<String> zzcwq = zzaai.zza(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final zzaai<String> zzcwr = zzaai.zza(1, "gads:app_open_precache_pool:discard_strategy", "oldest");
    public static final zzaai<Integer> zzcws = zzaai.zza(1, "gads:app_open_precache_pool:count", 0);
    public static final zzaai<String> zzcwt = zzaai.zza(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
    public static final zzaai<Integer> zzcwu = zzaai.zza(1, "gads:app_open_precache_pool:size", 1);
    public static final zzaai<Integer> zzcwv = zzaai.zza(1, "gads:app_open_precache_pool:ad_time_limit", 14400);
    public static final zzaai<Boolean> zzcww = zzaai.zza(1, "gads:memory_leak:b129558083", (Boolean) false);
    public static final zzaai<Boolean> zzcwx = zzaai.zza(1, "gads:unhandled_event_reporting:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcwy = zzaai.zza(1, "gads:response_info:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcwz = zzaai.zza(1, "gads:csi:interstitial_failed_to_show:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxa = zzaai.zza(1, "gads:csi:mediation_failure:enabled", (Boolean) false);
    public static final zzaai<String> zzcxb = zzaai.zza(1, "gads:csi:error_parsing:regex", "^(\\d+)");
    public static final zzaai<Boolean> zzcxc = zzaai.zza(1, "gads:signal_collection_without_rendering:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcxd = zzaai.zza(1, "gads:native_ads_signal:timeout", 1000);
    public static final zzaai<Integer> zzcxe = zzaai.zza(1, "gads:signal_v2:min_version", 19677000);
    public static final zzaai<Boolean> zzcxf = zzaai.zza(2, "DISABLE_CRASH_REPORTING", (Boolean) false);
    public static final zzaai<Boolean> zzcxg = zzaai.zza(1, "gads:paid_event_listener:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxh = zzaai.zza(1, "gads:is_in_scroll_view_new_api:enabled", (Boolean) true);
    public static final zzaai<Boolean> zzcxi = zzaai.zza(1, "gads:native_ad_policy_validator:enabled", (Boolean) true);
    public static final zzaai<Integer> zzcxj = zzaai.zza(1, "gads:policy_validator_layoutparam:flags", 808);
    public static final zzaai<Boolean> zzcxk = zzaai.zza(2, "NATIVE_AD_DEBUGGER_ENABLED", (Boolean) false);
    public static final zzaai<Integer> zzcxl = zzaai.zza(1, "gads:policy_validator_overlay_width:dp", 350);
    public static final zzaai<Integer> zzcxm = zzaai.zza(1, "gads:policy_validator_overlay_height:dp", 140);
    public static final zzaai<Boolean> zzcxn = zzaai.zza(1, "gads:use_wide_viewport:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxo = zzaai.zza(1, "gads:load_with_overview_mode:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxp = zzaai.zza(1, "gads:wire_banner_listener_after_request:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxq = zzaai.zza(1, "gads:wire_rewarded_listener_after_request:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxr = zzaai.zza(1, "gads:wire_app_open_listener_after_request:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxs = zzaai.zza(1, "gads:wire_interstitial_listener_after_request:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxt = zzaai.zza(1, "gads:wire_ad_loader_listener_after_request:enabled", (Boolean) false);
    public static final zzaai<Boolean> zzcxu = zzaai.zza(1, "gads:server_transaction_source:enabled", (Boolean) false);
    public static final zzaai<String> zzcxv = zzaai.zza(1, "gads:server_transaction_source:list", "Network");
    public static final zzaai<Boolean> zzcxw = zzaai.zza(1, "gads:can_open_app_and_open_app_action:enabled", (Boolean) false);
    public static final zzaai<Integer> zzcxx = zzaai.zza(1, "gads:ad_error_api:min_version", 999999999);

    public static void initialize(Context context) {
        zzbal.zza(new zzaaw(context));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzade, com.google.android.gms.internal.ads.zzaan] */
    public static void zza(Context context, int i, JSONObject jSONObject) {
        zzwe.zzps();
        SharedPreferences.Editor edit = context.getSharedPreferences("google_ads_flags", 0).edit();
        zzacf.zza(new zzaan(zzwe.zzpt(), edit, jSONObject));
        zzwe.zzpt().zza(edit, 1, jSONObject);
        zzwe.zzps();
        edit.commit();
    }

    public static List<String> zzrd() {
        return zzwe.zzpt().zzrd();
    }

    public static List<String> zzre() {
        return zzwe.zzpt().zzre();
    }

    static {
        zzaai<String> zza = zzaai.zza(1, "gads:sdk_core_constants:experiment_id", (String) null);
        zzwe.zzpt().zzb(zza);
        zzcrh = zza;
    }
}
