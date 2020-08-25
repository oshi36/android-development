package com.hoc.weatherapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00030\u00030\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/main/MainContract$View;", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "currentWeatherRepository", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "colorHolderSource", "Lcom/hoc/weatherapp/ui/main/ColorHolderSource;", "androidApplication", "Landroid/app/Application;", "(Lcom/hoc/weatherapp/data/CurrentWeatherRepository;Lcom/hoc/weatherapp/ui/main/ColorHolderSource;Landroid/app/Application;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "state", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "bindIntents", "", "unbindIntents", "Companion", "app_debug"})
public final class MainPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.main.MainContract.View, com.hoc.weatherapp.ui.main.MainContract.ViewState> {
    private io.reactivex.disposables.Disposable disposable;
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.MainContract.ViewState> state = null;
    private final com.hoc.weatherapp.ui.main.ColorHolderSource colorHolderSource = null;
    private final android.app.Application androidApplication = null;
    private static final java.lang.String TAG = "__main__";
    private static final com.hoc.weatherapp.ui.main.MainPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    @java.lang.Override()
    protected void unbindIntents() {
    }
    
    public MainPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.ColorHolderSource colorHolderSource, @org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainPresenter$Companion;", "", "()V", "TAG", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}