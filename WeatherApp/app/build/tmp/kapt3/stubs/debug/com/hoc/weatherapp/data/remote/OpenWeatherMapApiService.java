package com.hoc.weatherapp.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\'\u00a8\u0006\r"}, d2 = {"Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;", "", "get5DayEvery3HourForecastByCityId", "Lio/reactivex/Single;", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/FiveDayForecastResponse;", "id", "", "getCurrentWeatherByCityId", "Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/CurrentWeatherResponse;", "getCurrentWeatherByLatLng", "lat", "", "lon", "app_debug"})
public abstract interface OpenWeatherMapApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.CurrentWeatherResponse> getCurrentWeatherByLatLng(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.CurrentWeatherResponse> getCurrentWeatherByCityId(@retrofit2.http.Query(value = "id")
    long id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.FiveDayForecastResponse> get5DayEvery3HourForecastByCityId(@retrofit2.http.Query(value = "id")
    long id);
}