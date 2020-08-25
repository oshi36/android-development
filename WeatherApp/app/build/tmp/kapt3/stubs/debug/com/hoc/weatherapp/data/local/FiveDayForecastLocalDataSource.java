package com.hoc.weatherapp.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r2\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;", "", "fiveDayForecastDao", "Lcom/hoc/weatherapp/data/local/FiveDayForecastDao;", "(Lcom/hoc/weatherapp/data/local/FiveDayForecastDao;)V", "deleteDailyWeathersByCityIdAndInsert", "Lio/reactivex/Completable;", "cityId", "", "weathers", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "getAllDailyWeathersByCityId", "Lio/reactivex/Observable;", "id", "app_debug"})
public final class FiveDayForecastLocalDataSource {
    private final com.hoc.weatherapp.data.local.FiveDayForecastDao fiveDayForecastDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> getAllDailyWeathersByCityId(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteDailyWeathersByCityIdAndInsert(long cityId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers) {
        return null;
    }
    
    public FiveDayForecastLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.FiveDayForecastDao fiveDayForecastDao) {
        super();
    }
}