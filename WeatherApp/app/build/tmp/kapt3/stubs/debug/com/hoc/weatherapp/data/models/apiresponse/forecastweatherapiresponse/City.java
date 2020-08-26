package com.hoc.weatherapp.data.models.apiresponse.forecastweatherapiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/forecastweatherapiresponse/City;", "", "id", "", "name", "", "coord", "Lcom/hoc/weatherapp/data/models/apiresponse/Coord;", "country", "(Ljava/lang/Long;Ljava/lang/String;Lcom/hoc/weatherapp/data/models/apiresponse/Coord;Ljava/lang/String;)V", "getCoord", "()Lcom/hoc/weatherapp/data/models/apiresponse/Coord;", "getCountry", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "app_debug"})
public final class City {
    
    /**
     * City ID
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    
    /**
     * City name
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    
    /**
     * Location
     */
    @org.jetbrains.annotations.Nullable()
    private final com.hoc.weatherapp.data.models.apiresponse.Coord coord = null;
    
    /**
     * Country code (GB, JP etc.)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    
    /**
     * City ID
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    /**
     * City name
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * Location
     */
    @org.jetbrains.annotations.Nullable()
    public final com.hoc.weatherapp.data.models.apiresponse.Coord getCoord() {
        return null;
    }
    
    /**
     * Country code (GB, JP etc.)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    public City(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "name")
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "coord")
    com.hoc.weatherapp.data.models.apiresponse.Coord coord, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "country")
    java.lang.String country) {
        super();
    }
    
    public City() {
        super();
    }
}