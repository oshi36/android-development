package com.hoc.weatherapp.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000eH\u0017\u00a8\u0006\u0013"}, d2 = {"Lcom/hoc/weatherapp/data/local/CurrentWeatherDao;", "", "()V", "getAllCityAndCurrentWeathers", "Lio/reactivex/Observable;", "", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "querySearch", "", "getCityAndCurrentWeatherByCityId", "cityId", "", "insertCurrentWeather", "currentWeather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "updateCurrentWeather", "", "upsert", "weather", "app_debug"})
public abstract class CurrentWeatherDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM current_weathers INNER JOIN cities ON current_weathers.city_id = cities.id\n                WHERE city_id = :cityId LIMIT 1")
    public abstract io.reactivex.Observable<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> getCityAndCurrentWeatherByCityId(long cityId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM current_weathers INNER JOIN cities ON current_weathers.city_id = cities.id\n            WHERE cities.name LIKE \'%\' || :querySearch || \'%\'\n                   OR cities.country LIKE \'%\' || :querySearch || \'%\'\n                   OR current_weathers.description LIKE \'%\' || :querySearch || \'%\'\n                   OR current_weathers.main LIKE \'%\' || :querySearch || \'%\'\n            ORDER BY city_id")
    public abstract io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getAllCityAndCurrentWeathers(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather currentWeather);
    
    @androidx.room.Update()
    public abstract void updateCurrentWeather(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather currentWeather);
    
    @androidx.room.Transaction()
    public void upsert(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.CurrentWeather weather) {
    }
    
    public CurrentWeatherDao() {
        super();
    }
}