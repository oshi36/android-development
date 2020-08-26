package com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001BG\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001a"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/FiveDayForecastResponse;", "", "cod", "", "message", "", "cnt", "", "list", "", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/DailyWeatherModel;", "city", "Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/City;", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/util/List;Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/City;)V", "getCity", "()Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/City;", "getCnt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCod", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "getMessage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "app_debug"})
public final class FiveDayForecastResponse {
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String cod = null;
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double message = null;
    
    /**
     * Number of lines returned by this API call
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long cnt = null;
    
    /**
     * List of daily weathers
     */
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.DailyWeatherModel> list = null;
    
    /**
     * City information
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.City city = null;
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCod() {
        return null;
    }
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getMessage() {
        return null;
    }
    
    /**
     * Number of lines returned by this API call
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getCnt() {
        return null;
    }
    
    /**
     * List of daily weathers
     */
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.DailyWeatherModel> getList() {
        return null;
    }
    
    /**
     * City information
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.City getCity() {
        return null;
    }
    
    public FiveDayForecastResponse(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cod")
    java.lang.String cod, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "message")
    java.lang.Double message, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "cnt")
    java.lang.Long cnt, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "list")
    java.util.List<com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.DailyWeatherModel> list, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "city")
    com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse.City city) {
        super();
    }
    
    public FiveDayForecastResponse() {
        super();
    }
}