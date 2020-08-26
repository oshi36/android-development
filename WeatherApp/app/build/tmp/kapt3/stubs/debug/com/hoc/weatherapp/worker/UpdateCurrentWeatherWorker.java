package com.hoc.weatherapp.worker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0017R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0017"}, d2 = {"Lcom/hoc/weatherapp/worker/UpdateCurrentWeatherWorker;", "Landroidx/work/RxWorker;", "Lorg/koin/core/KoinComponent;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "currentWeatherRepository", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "getCurrentWeatherRepository", "()Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "currentWeatherRepository$delegate", "Lkotlin/Lazy;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "getSettingPreferences", "()Lcom/hoc/weatherapp/data/local/SettingPreferences;", "settingPreferences$delegate", "createWork", "Lio/reactivex/Single;", "Landroidx/work/ListenableWorker$Result;", "Companion", "app_debug"})
public final class UpdateCurrentWeatherWorker extends androidx.work.RxWorker implements org.koin.core.KoinComponent {
    private final kotlin.Lazy currentWeatherRepository$delegate = null;
    private final kotlin.Lazy settingPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String UNIQUE_WORK_NAME = "com.hoc.weatherapp.worker.UpdateCurrentWeatherWorker";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "com.hoc.weatherapp.worker.UpdateCurrentWeatherWorker";
    private static final java.lang.String RESULT = "RESULT";
    public static final com.hoc.weatherapp.worker.UpdateCurrentWeatherWorker.Companion Companion = null;
    
    private final com.hoc.weatherapp.data.CurrentWeatherRepository getCurrentWeatherRepository() {
        return null;
    }
    
    private final com.hoc.weatherapp.data.local.SettingPreferences getSettingPreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.ExperimentalStdlibApi()
    @java.lang.Override()
    public io.reactivex.Single<androidx.work.ListenableWorker.Result> createWork() {
        return null;
    }
    
    public UpdateCurrentWeatherWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters workerParams) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/worker/UpdateCurrentWeatherWorker$Companion;", "", "()V", "RESULT", "", "TAG", "UNIQUE_WORK_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}