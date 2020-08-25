package com.hoc.weatherapp.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/data/local/CityDao;", "", "()V", "deleteCity", "", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "insertCity", "", "updateCity", "upsert", "app_debug"})
public abstract class CityDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insertCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    @androidx.room.Update()
    public abstract void updateCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    @androidx.room.Delete()
    public abstract void deleteCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    @androidx.room.Transaction()
    public void upsert(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
    }
    
    public CityDao() {
        super();
    }
}