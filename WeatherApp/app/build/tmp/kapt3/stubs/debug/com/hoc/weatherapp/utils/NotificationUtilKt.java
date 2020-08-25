package com.hoc.weatherapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, xi = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u001c\u0010\f\u001a\u00020\t*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a,\u0010\u0011\u001a\u00020\t*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"ACTION_CANCEL_NOTIFICATION", "", "DATE_TIME_FORMATTER", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "TAG", "WEATHER_NOTIFICATION_ID", "", "cancelNotificationById", "", "Landroid/content/Context;", "id", "showNotificationIfEnabled", "cityAndCurrentWeather", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "showOrUpdateNotification", "weather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "unit", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "popUpAndSound", "", "app_debug"})
public final class NotificationUtilKt {
    public static final int WEATHER_NOTIFICATION_ID = 2;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CANCEL_NOTIFICATION = "com.hoc.weatherapp.CancelNotificationReceiver";
    private static final org.threeten.bp.format.DateTimeFormatter DATE_TIME_FORMATTER = null;
    private static final java.lang.String TAG = "__notification__";
    
    @kotlin.ExperimentalStdlibApi()
    public static final void showOrUpdateNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showOrUpdateNotification, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather weather, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.TemperatureUnit unit, boolean popUpAndSound) {
    }
    
    public static final void cancelNotificationById(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$cancelNotificationById, int id) {
    }
    
    @kotlin.ExperimentalStdlibApi()
    public static final void showNotificationIfEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$showNotificationIfEnabled, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather cityAndCurrentWeather, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SettingPreferences settingPreferences) {
    }
}