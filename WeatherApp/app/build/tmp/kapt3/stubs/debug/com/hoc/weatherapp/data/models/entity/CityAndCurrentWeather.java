package com.hoc.weatherapp.data.models.entity;

import java.lang.System;

/**
 * This class captures the relationship between a [City] and a city's [CurrentWeather]s, which is
 * used by Room to fetch the related entities.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "", "()V", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "getCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "setCity", "(Lcom/hoc/weatherapp/data/models/entity/City;)V", "currentWeather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "getCurrentWeather", "()Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "setCurrentWeather", "(Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;)V", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class CityAndCurrentWeather {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    public com.hoc.weatherapp.data.models.entity.City city;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    public com.hoc.weatherapp.data.models.entity.CurrentWeather currentWeather;
    
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.entity.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.entity.CurrentWeather getCurrentWeather() {
        return null;
    }
    
    public final void setCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CityAndCurrentWeather() {
        super();
    }
}