package com.hoc.weatherapp.ui;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0015J\b\u0010\u0011\u001a\u00020\u000eH\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/hoc/weatherapp/ui/BaseAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "noActionBar", "", "(Z)V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "settings", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "getSettings", "()Lcom/hoc/weatherapp/data/local/SettingPreferences;", "settings$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_debug"})
public abstract class BaseAppCompatActivity extends androidx.appcompat.app.AppCompatActivity {
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
    
    public BaseAppCompatActivity(boolean noActionBar) {
        super();
    }
    
    public BaseAppCompatActivity() {
        super();
    }
}