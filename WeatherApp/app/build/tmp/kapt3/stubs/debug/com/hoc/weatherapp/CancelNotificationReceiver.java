package com.hoc.weatherapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/CancelNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/KoinComponent;", "()V", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "getSettingPreferences", "()Lcom/hoc/weatherapp/data/local/SettingPreferences;", "settingPreferences$delegate", "Lkotlin/Lazy;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_debug"})
public final class CancelNotificationReceiver extends android.content.BroadcastReceiver implements org.koin.core.KoinComponent {
    private final kotlin.Lazy settingPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "CancelNotificationReceiver";
    private static final com.hoc.weatherapp.CancelNotificationReceiver.Companion Companion = null;
    
    private final com.hoc.weatherapp.data.local.SettingPreferences getSettingPreferences() {
        return null;
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    public CancelNotificationReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public org.koin.core.Koin getKoin() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/CancelNotificationReceiver$Companion;", "", "()V", "TAG", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}