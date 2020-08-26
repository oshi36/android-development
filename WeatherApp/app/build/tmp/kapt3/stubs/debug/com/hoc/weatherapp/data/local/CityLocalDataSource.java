package com.hoc.weatherapp.data.local;

import java.lang.System;

/**
 * A wrapper of [CityDao]
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/hoc/weatherapp/data/local/CityLocalDataSource;", "", "cityDao", "Lcom/hoc/weatherapp/data/local/CityDao;", "(Lcom/hoc/weatherapp/data/local/CityDao;)V", "deleteCity", "Lio/reactivex/Completable;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "insertOrUpdateCity", "app_debug"})
public final class CityLocalDataSource {
    private final com.hoc.weatherapp.data.local.CityDao cityDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable insertOrUpdateCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    public CityLocalDataSource(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CityDao cityDao) {
        super();
    }
}