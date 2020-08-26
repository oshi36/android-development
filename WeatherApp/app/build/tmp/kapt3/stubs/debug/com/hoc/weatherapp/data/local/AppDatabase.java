package com.hoc.weatherapp.data.local;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.hoc.weatherapp.data.local.Converters.class})
@androidx.room.Database(entities = {com.hoc.weatherapp.data.models.entity.CurrentWeather.class, com.hoc.weatherapp.data.models.entity.City.class, com.hoc.weatherapp.data.models.entity.DailyWeather.class}, version = 2, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\n"}, d2 = {"Lcom/hoc/weatherapp/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cityDao", "Lcom/hoc/weatherapp/data/local/CityDao;", "fiveDayForecastDao", "Lcom/hoc/weatherapp/data/local/FiveDayForecastDao;", "weatherDao", "Lcom/hoc/weatherapp/data/local/CurrentWeatherDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "WEATHER_APP_DB";
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    private static volatile com.hoc.weatherapp.data.local.AppDatabase instance;
    public static final com.hoc.weatherapp.data.local.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hoc.weatherapp.data.local.CityDao cityDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hoc.weatherapp.data.local.CurrentWeatherDao weatherDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.hoc.weatherapp.data.local.FiveDayForecastDao fiveDayForecastDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/hoc/weatherapp/data/local/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "instance", "Lcom/hoc/weatherapp/data/local/AppDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.data.local.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}