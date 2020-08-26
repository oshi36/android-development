package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyDetailActivity;", "Lcom/hoc/weatherapp/ui/BaseAppCompatActivity;", "()V", "bind", "", "item", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "Landroid/view/MenuItem;", "Companion", "VH", "app_debug"})
public final class DailyDetailActivity extends com.hoc.weatherapp.ui.BaseAppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "com.hoc.weatherapp.ui.main.fivedayforecast.daily_detail_activity";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ITEM_KEY = "com.hoc.weatherapp.ui.main.fivedayforecast.daily_detail_activity_item";
    public static final com.hoc.weatherapp.ui.main.fivedayforecast.DailyDetailActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bind(com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather item) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public DailyDetailActivity() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\b\b\u0001\u0010\u0010\u001a\u00020\u000eR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyDetailActivity$VH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "text", "Landroid/widget/TextView;", "bind", "", "pair", "Lkotlin/Pair;", "", "", "iconBackgroundColor", "app_debug"})
    public static final class VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView image = null;
        private final android.widget.TextView text = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<java.lang.Integer, java.lang.String> pair, @androidx.annotation.ColorInt()
        int iconBackgroundColor) {
        }
        
        public VH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyDetailActivity$Companion;", "", "()V", "ITEM_KEY", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}