package com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(\u00a8\u0006)"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/DailyWeatherModel;", "", "dt", "", "main", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Main;", "weather", "", "Lcom/hoc/weatherapp/data/models/apiresponse/WeatherModel;", "clouds", "Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;", "wind", "Lcom/hoc/weatherapp/data/models/apiresponse/Wind;", "rain", "Lcom/hoc/weatherapp/data/models/apiresponse/Rain;", "snow", "Lcom/hoc/weatherapp/data/models/apiresponse/Snow;", "sys", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Sys;", "dtTxt", "", "(Ljava/lang/Long;Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Main;Ljava/util/List;Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;Lcom/hoc/weatherapp/data/models/apiresponse/Wind;Lcom/hoc/weatherapp/data/models/apiresponse/Rain;Lcom/hoc/weatherapp/data/models/apiresponse/Snow;Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Sys;Ljava/lang/String;)V", "getClouds", "()Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;", "getDt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDtTxt", "()Ljava/lang/String;", "getMain", "()Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Main;", "getRain", "()Lcom/hoc/weatherapp/data/models/apiresponse/Rain;", "getSnow", "()Lcom/hoc/weatherapp/data/models/apiresponse/Snow;", "getSys", "()Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Sys;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/hoc/weatherapp/data/models/apiresponse/Wind;", "app_debug"})
public final class DailyWeatherModel {
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dt = null;
    
    /**
     * Main information
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Main main = null;
    
    /**
     * More info Weather condition codes
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> weather = null;
    
    /**
     * Cloud
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Clouds clouds = null;
    
    /**
     * Wind
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Wind wind = null;
    
    /**
     * Rain
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Rain rain = null;
    
    /**
     * Snow
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Snow snow = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Sys sys = null;
    
    /**
     * Data/time of calculation, UTC
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dtTxt = null;
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    /**
     * Main information
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Main getMain() {
        return null;
    }
    
    /**
     * More info Weather condition codes
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> getWeather() {
        return null;
    }
    
    /**
     * Cloud
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Clouds getClouds() {
        return null;
    }
    
    /**
     * Wind
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Wind getWind() {
        return null;
    }
    
    /**
     * Rain
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Rain getRain() {
        return null;
    }
    
    /**
     * Snow
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Snow getSnow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Sys getSys() {
        return null;
    }
    
    /**
     * Data/time of calculation, UTC
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDtTxt() {
        return null;
    }
    
    public DailyWeatherModel(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hoc.weatherapp.data.models.apiresponse.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.hoc.weatherapp.data.models.apiresponse.Wind wind, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.hoc.weatherapp.data.models.apiresponse.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "snow")
    com.hoc.weatherapp.data.models.apiresponse.Snow snow, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt_txt")
    java.lang.String dtTxt) {
        super();
    }
    
    public DailyWeatherModel() {
        super();
    }
}