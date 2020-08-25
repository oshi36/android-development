package com.hoc.weatherapp.utils.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, xi = 2, d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007\u00a8\u0006\u0012"}, d2 = {"getBackgroundDrawableFromWeather", "", "weather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "getSoundUriFromCurrentWeather", "isDay", "", "w", "getIconDrawableFromCurrentWeather", "Landroid/content/Context;", "weatherConditionId", "", "weatherIcon", "", "getIconDrawableFromDailyWeather", "icon", "app_debug"})
public final class BackgroundAndSoundUtilKt {
    
    /**
     * 01d, 01n -> clear sky
     * 02d, 02n -> few clouds
     * 03d, 03n -> scattered clouds
     * 04d, 04n -> broken clouds
     * 09d, 09n -> shower rain
     * 10d, 10n -> rain
     * 11d, 11n -> thunderstorm
     * 13d, 13n -> snow
     * 50d, 50n -> mist
     */
    private static final boolean isDay(com.hoc.weatherapp.data.models.entity.CurrentWeather w, com.hoc.weatherapp.data.models.entity.City city) {
        return false;
    }
    
    @androidx.annotation.DrawableRes()
    public static final int getBackgroundDrawableFromWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather weather, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return 0;
    }
    
    @androidx.annotation.DrawableRes()
    public static final int getIconDrawableFromCurrentWeather(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getIconDrawableFromCurrentWeather, long weatherConditionId, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherIcon) {
        return 0;
    }
    
    @androidx.annotation.DrawableRes()
    public static final int getIconDrawableFromDailyWeather(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getIconDrawableFromDailyWeather, @org.jetbrains.annotations.NotNull()
    java.lang.String icon) {
        return 0;
    }
    
    @androidx.annotation.RawRes()
    public static final int getSoundUriFromCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather weather) {
        return 0;
    }
}