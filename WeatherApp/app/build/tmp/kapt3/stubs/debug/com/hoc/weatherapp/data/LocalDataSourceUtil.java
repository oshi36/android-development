package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/hoc/weatherapp/data/LocalDataSourceUtil;", "", "()V", "saveCityAndCurrentWeather", "Lio/reactivex/Single;", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "cityLocalDataSource", "Lcom/hoc/weatherapp/data/local/CityLocalDataSource;", "currentWeatherLocalDataSource", "Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;", "response", "Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/CurrentWeatherResponse;", "zoneId", "", "saveFiveDayForecastWeather", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "fiveDayForecastLocalDataSource", "Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/FiveDayForecastResponse;", "app_debug"})
public final class LocalDataSourceUtil {
    public static final com.hoc.weatherapp.data.LocalDataSourceUtil INSTANCE = null;
    
    /**
     * Save city and current weather to local database
     * @param cityLocalDataSource
     * @param currentWeatherLocalDataSource
     * @param response Response from api
     * @return [Single] emit [CityAndCurrentWeather]
     */
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> saveCityAndCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CityLocalDataSource cityLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CurrentWeatherLocalDataSource currentWeatherLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.CurrentWeatherResponse response, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId) {
        return null;
    }
    
    /**
     * Save five day forecast weather to local database
     * @param fiveDayForecastLocalDataSource
     * @param response
     * @return [Single] emit [List] of [DailyWeather]s
     */
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Single<java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> saveFiveDayForecastWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.FiveDayForecastResponse response) {
        return null;
    }
    
    private LocalDataSourceUtil() {
        super();
    }
}