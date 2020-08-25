package com.hoc.weatherapp.data;

import java.lang.System;

/**
 * Map response from api to local database entity
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/hoc/weatherapp/data/Mapper;", "", "()V", "responseToCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "response", "Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/CurrentWeatherResponse;", "zoneId", "", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/FiveDayForecastResponse;", "responseToCurrentWeatherEntity", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "responseToListDailyWeatherEntity", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "app_debug"})
public final class Mapper {
    public static final com.hoc.weatherapp.data.Mapper INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> responseToListDailyWeatherEntity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.FiveDayForecastResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.hoc.weatherapp.data.models.entity.CurrentWeather responseToCurrentWeatherEntity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.CurrentWeatherResponse response) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.hoc.weatherapp.data.models.entity.City responseToCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.CurrentWeatherResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.hoc.weatherapp.data.models.entity.City responseToCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.FiveDayForecastResponse response) {
        return null;
    }
    
    private Mapper() {
        super();
    }
}