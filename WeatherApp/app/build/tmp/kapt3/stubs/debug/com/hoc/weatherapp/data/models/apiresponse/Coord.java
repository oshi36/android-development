package com.hoc.weatherapp.data.models.apiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/Coord;", "", "lon", "", "lat", "(Ljava/lang/Double;Ljava/lang/Double;)V", "getLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLon", "app_debug"})
public final class Coord {
    
    /**
     * City geo location, latitude
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double lon = null;
    
    /**
     * City geo location, longitude
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double lat = null;
    
    /**
     * City geo location, latitude
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLon() {
        return null;
    }
    
    /**
     * City geo location, longitude
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    public Coord(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lon")
    java.lang.Double lon, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "lat")
    java.lang.Double lat) {
        super();
    }
    
    public Coord() {
        super();
    }
}