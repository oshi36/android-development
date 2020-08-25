package com.hoc.weatherapp.data.local;

import java.lang.System;

/**
 * A wrapper of [CurrentWeatherDao]
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;", "", "currentWeatherDao", "Lcom/hoc/weatherapp/data/local/CurrentWeatherDao;", "(Lcom/hoc/weatherapp/data/local/CurrentWeatherDao;)V", "getAllCityAndCurrentWeathers", "Lio/reactivex/Observable;", "", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "querySearch", "", "getCityAndCurrentWeatherByCityId", "cityId", "", "insertOrUpdateCurrentWeather", "Lio/reactivex/Completable;", "weather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "app_debug"})
public final class CurrentWeatherLocalDataSource {
    private final com.hoc.weatherapp.data.local.CurrentWeatherDao currentWeatherDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> getCityAndCurrentWeatherByCityId(long cityId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getAllCityAndCurrentWeathers(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable insertOrUpdateCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather weather) {
        return null;
    }
    
    public CurrentWeatherLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CurrentWeatherDao currentWeatherDao) {
        super();
    }
}