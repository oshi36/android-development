package com.hoc.weatherapp.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0017J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/hoc/weatherapp/data/local/FiveDayForecastDao;", "", "()V", "deleteAllDailyWeathersByCityId", "", "cityId", "", "deleteDailyWeathersByCityIdAndInsert", "weathers", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "getAllDailyWeathersByCityId", "Lio/reactivex/Observable;", "insertDailyWeathers", "app_debug"})
public abstract class FiveDayForecastDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertDailyWeathers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers);
    
    @androidx.room.Query(value = "DELETE FROM five_day_forecast WHERE city_id = :cityId")
    public abstract void deleteAllDailyWeathersByCityId(long cityId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM five_day_forecast WHERE city_id = :cityId ORDER BY data_time")
    public abstract io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> getAllDailyWeathersByCityId(long cityId);
    
    @androidx.room.Transaction()
    public void deleteDailyWeathersByCityIdAndInsert(long cityId, @org.jetbrains.annotations.NotNull()
    java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers) {
    }
    
    public FiveDayForecastDao() {
        super();
    }
}