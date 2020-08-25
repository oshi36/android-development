package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0003H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0016J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherFragment;", "Lcom/hannesdorfmann/mosby3/mvi/MviFragment;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$View;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherPresenter;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "dailyWeatherAdapter", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter;", "errorSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "initialRefreshSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent$InitialRefreshIntent;", "kotlin.jvm.PlatformType", "refreshSnackBar", "createPresenter", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "", "onResume", "onViewCreated", "view", "refreshDailyWeatherIntent", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "render", "viewState", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$ViewState;", "showDetail", "item", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "app_debug"})
public final class DailyWeatherFragment extends com.hannesdorfmann.mosby3.mvi.MviFragment<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.View, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherPresenter> implements com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.View {
    private com.google.android.material.snackbar.Snackbar errorSnackBar;
    private com.google.android.material.snackbar.Snackbar refreshSnackBar;
    private final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherAdapter dailyWeatherAdapter = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent.InitialRefreshIntent> initialRefreshSubject = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent> refreshDailyWeatherIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherPresenter createPresenter() {
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
    
    private final void showDetail(com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather item) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState viewState) {
    }
    
    public DailyWeatherFragment() {
        super();
    }
}