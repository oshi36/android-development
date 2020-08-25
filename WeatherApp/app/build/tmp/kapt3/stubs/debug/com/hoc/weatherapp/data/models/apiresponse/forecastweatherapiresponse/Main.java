package com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001Be\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000eR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0018\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/Main;", "", "temp", "", "tempMin", "tempMax", "pressure", "seaLevel", "grndLevel", "humidity", "", "tempKf", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;)V", "getGrndLevel", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getHumidity", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPressure", "getSeaLevel", "getTemp", "getTempKf", "getTempMax", "getTempMin", "app_debug"})
public final class Main {
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double temp = null;
    
    /**
     * Minimum temperatureString at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double tempMin = null;
    
    /**
     * Maximum temperatureString at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double tempMax = null;
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double pressure = null;
    
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double seaLevel = null;
    
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double grndLevel = null;
    
    /**
     * Humidity, %
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long humidity = null;
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double tempKf = null;
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemp() {
        return null;
    }
    
    /**
     * Minimum temperatureString at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempMin() {
        return null;
    }
    
    /**
     * Maximum temperatureString at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempMax() {
        return null;
    }
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getPressure() {
        return null;
    }
    
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getSeaLevel() {
        return null;
    }
    
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getGrndLevel() {
        return null;
    }
    
    /**
     * Humidity, %
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getHumidity() {
        return null;
    }
    
    /**
     * Internal parameter
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTempKf() {
        return null;
    }
    
    public Main(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "temp")
    java.lang.Double temp, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "temp_min")
    java.lang.Double tempMin, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "temp_max")
    java.lang.Double tempMax, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "pressure")
    java.lang.Double pressure, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "sea_level")
    java.lang.Double seaLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "grnd_level")
    java.lang.Double grndLevel, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "humidity")
    java.lang.Long humidity, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "temp_kf")
    java.lang.Double tempKf) {
        super();
    }
    
    public Main() {
        super();
    }
}