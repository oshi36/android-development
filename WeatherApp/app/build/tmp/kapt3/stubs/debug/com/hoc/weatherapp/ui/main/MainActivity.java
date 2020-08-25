package com.hoc.weatherapp.ui.main;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0014J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0015H\u0014J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0002R(\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainActivity;", "Lcom/hoc/weatherapp/ui/BaseMviActivity;", "Lcom/hoc/weatherapp/ui/main/MainContract$View;", "Lcom/hoc/weatherapp/ui/main/MainPresenter;", "()V", "changeBackground", "Lio/reactivex/subjects/PublishSubject;", "Lcom/hoc/weatherapp/utils/Optional;", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "mediaPlayer", "Landroid/media/MediaPlayer;", "target1", "Lcom/bumptech/glide/request/target/CustomViewTarget;", "target2", "changeColorIntent", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "createPresenter", "enableIndicatorAndViewPager", "", "isEnable", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStop", "playSound", "weather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "render", "state", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "renderCityAndWeather", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState$CityAndWeather;", "renderNoSelectedCity", "setupViewPager", "stopSound", "updateBackground", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "SectionsPagerAdapter", "app_debug"})
public final class MainActivity extends com.hoc.weatherapp.ui.BaseMviActivity<com.hoc.weatherapp.ui.main.MainContract.View, com.hoc.weatherapp.ui.main.MainPresenter> implements com.hoc.weatherapp.ui.main.MainContract.View {
    private android.media.MediaPlayer mediaPlayer;
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.utils.Optional<android.graphics.Bitmap>> changeBackground = null;
    private com.bumptech.glide.request.target.CustomViewTarget<?, ?> target1;
    private com.bumptech.glide.request.target.CustomViewTarget<?, ?> target2;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    private final void setupViewPager() {
    }
    
    private final void enableIndicatorAndViewPager(boolean isEnable) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void updateBackground(com.hoc.weatherapp.data.models.entity.CurrentWeather weather, com.hoc.weatherapp.data.models.entity.City city) {
    }
    
    private final void stopSound() {
    }
    
    private final void playSound(com.hoc.weatherapp.data.models.entity.CurrentWeather weather) {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.MainContract.ViewState state) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> changeColorIntent() {
        return null;
    }
    
    private final void renderCityAndWeather(com.hoc.weatherapp.ui.main.MainContract.ViewState.CityAndWeather state) {
    }
    
    private final void renderNoSelectedCity() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.main.MainPresenter createPresenter() {
        return null;
    }
    
    public MainActivity() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainActivity$SectionsPagerAdapter;", "Landroidx/fragment/app/FragmentPagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragments", "", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/List;)V", "getCount", "", "getItem", "position", "app_debug"})
    static final class SectionsPagerAdapter extends androidx.fragment.app.FragmentPagerAdapter {
        private final java.util.List<androidx.fragment.app.Fragment> fragments = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.fragment.app.Fragment getItem(int position) {
            return null;
        }
        
        @java.lang.Override()
        public int getCount() {
            return 0;
        }
        
        public SectionsPagerAdapter(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
        java.util.List<? extends androidx.fragment.app.Fragment> fragments) {
            super(null);
        }
    }
}