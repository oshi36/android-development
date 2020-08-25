package com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u00b3\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0003\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b&\u0010\"R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b\'\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u00107\u00a8\u00068"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/CurrentWeatherResponse;", "", "coord", "Lcom/hoc/weatherapp/data/models/apiresponse/Coord;", "weather", "", "Lcom/hoc/weatherapp/data/models/apiresponse/WeatherModel;", "base", "", "main", "Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Main;", "visibility", "", "wind", "Lcom/hoc/weatherapp/data/models/apiresponse/Wind;", "clouds", "Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;", "dt", "", "sys", "Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Sys;", "id", "name", "cod", "rain", "Lcom/hoc/weatherapp/data/models/apiresponse/Rain;", "snow", "Lcom/hoc/weatherapp/data/models/apiresponse/Snow;", "(Lcom/hoc/weatherapp/data/models/apiresponse/Coord;Ljava/util/List;Ljava/lang/String;Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Main;Ljava/lang/Double;Lcom/hoc/weatherapp/data/models/apiresponse/Wind;Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;Ljava/lang/Long;Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Sys;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Lcom/hoc/weatherapp/data/models/apiresponse/Rain;Lcom/hoc/weatherapp/data/models/apiresponse/Snow;)V", "getBase", "()Ljava/lang/String;", "getClouds", "()Lcom/hoc/weatherapp/data/models/apiresponse/Clouds;", "getCod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCoord", "()Lcom/hoc/weatherapp/data/models/apiresponse/Coord;", "getDt", "getId", "getMain", "()Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Main;", "getName", "getRain", "()Lcom/hoc/weatherapp/data/models/apiresponse/Rain;", "getSnow", "()Lcom/hoc/weatherapp/data/models/apiresponse/Snow;", "getSys", "()Lcom/hoc/weatherapp/data/models/apiresponse/currentweatherapiresponse/Sys;", "getVisibility", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getWeather", "()Ljava/util/List;", "getWind", "()Lcom/hoc/weatherapp/data/models/apiresponse/Wind;", "app_debug"})
public final class CurrentWeatherResponse {
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Coord coord = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> weather = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String base = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Main main = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double visibility = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Wind wind = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Clouds clouds = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long dt = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Sys sys = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long cod = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Rain rain = null;
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Snow snow = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Coord getCoord() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> getWeather() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Main getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Wind getWind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Clouds getClouds() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Sys getSys() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCod() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Rain getRain() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Snow getSnow() {
        return null;
    }
    
    public CurrentWeatherResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    com.hoc.weatherapp.data.models.apiresponse.Coord coord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "weather")
    java.util.List<com.hoc.weatherapp.data.models.apiresponse.WeatherModel> weather, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "base")
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Main main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "visibilityKm")
    java.lang.Double visibility, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "wind")
    com.hoc.weatherapp.data.models.apiresponse.Wind wind, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "clouds")
    com.hoc.weatherapp.data.models.apiresponse.Clouds clouds, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "dt")
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sys")
    com.hoc.weatherapp.data.models.apiresponse.currentweatherapiresponse.Sys sys, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.Long cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "rain")
    com.hoc.weatherapp.data.models.apiresponse.Rain rain, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "snow")
    com.hoc.weatherapp.data.models.apiresponse.Snow snow) {
        super();
    }
    
    public CurrentWeatherResponse() {
        super();
    }
}