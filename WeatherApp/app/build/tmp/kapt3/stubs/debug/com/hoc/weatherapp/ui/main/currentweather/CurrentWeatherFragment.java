package com.hoc.weatherapp.ui.main.currentweather;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0002J$\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherFragment;", "Lcom/hannesdorfmann/mosby3/mvi/MviFragment;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$View;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherPresenter;", "()V", "errorSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "refreshInitial", "Lio/reactivex/subjects/PublishSubject;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$RefreshIntent$InitialRefreshIntent;", "kotlin.jvm.PlatformType", "refreshSnackBar", "createPresenter", "noSelectedCity", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "refreshCurrentWeatherIntent", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$RefreshIntent;", "render", "state", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$ViewState;", "updateUi", "weather", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeather;", "updateWeatherIcon", "weatherIcon", "", "weatherConditionId", "", "Companion", "app_debug"})
public final class CurrentWeatherFragment extends com.hannesdorfmann.mosby3.mvi.MviFragment<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.View, com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherPresenter> implements com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.View {
    private com.google.android.material.snackbar.Snackbar errorSnackBar;
    private com.google.android.material.snackbar.Snackbar refreshSnackBar;
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.RefreshIntent.InitialRefreshIntent> refreshInitial = null;
    private static final java.text.DecimalFormat NUMBER_FORMAT = null;
    public static final com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.RefreshIntent> refreshCurrentWeatherIntent() {
        return null;
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.ViewState state) {
    }
    
    private final void noSelectedCity() {
    }
    
    private final void updateUi(com.hoc.weatherapp.ui.main.currentweather.CurrentWeather weather) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherPresenter createPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateWeatherIcon(java.lang.String weatherIcon, long weatherConditionId) {
    }
    
    public CurrentWeatherFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherFragment$Companion;", "", "()V", "NUMBER_FORMAT", "Ljava/text/DecimalFormat;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}