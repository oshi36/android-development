package com.hoc.weatherapp.data.models.apiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/WeatherModel;", "", "id", "", "main", "", "description", "icon", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getIcon", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMain", "app_debug"})
public final class WeatherModel {
    
    /**
     * Weather condition id
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long id = null;
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String main = null;
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    
    /**
     * Weather icon id
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String icon = null;
    
    /**
     * Weather condition id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMain() {
        return null;
    }
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Weather icon id
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIcon() {
        return null;
    }
    
    public WeatherModel(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "id")
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "main")
    java.lang.String main, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "description")
    java.lang.String description, @org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "icon")
    java.lang.String icon) {
        super();
    }
    
    public WeatherModel() {
        super();
    }
}