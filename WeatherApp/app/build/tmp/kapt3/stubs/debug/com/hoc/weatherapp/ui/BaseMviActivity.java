package com.hoc.weatherapp.ui;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u000f\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0015J\b\u0010\u0015\u001a\u00020\u0012H\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/hoc/weatherapp/ui/BaseMviActivity;", "V", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "P", "Lcom/hannesdorfmann/mosby3/mvi/MviPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviActivity;", "noActionBar", "", "(Z)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "settings", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "getSettings", "()Lcom/hoc/weatherapp/data/local/SettingPreferences;", "settings$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public abstract class BaseMviActivity<V extends com.hannesdorfmann.mosby3.mvp.MvpView, P extends com.hannesdorfmann.mosby3.mvi.MviPresenter<V, ?>> extends com.hannesdorfmann.mosby3.mvi.MviActivity<V, P> {
    private final kotlin.Lazy settings$delegate = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final boolean noActionBar = false;
    private java.util.HashMap _$_findViewCache;
    
    private final com.hoc.weatherapp.data.local.SettingPreferences getSettings() {
        return null;
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseMviActivity(boolean noActionBar) {
        super();
    }
    
    public BaseMviActivity() {
        super();
    }
}