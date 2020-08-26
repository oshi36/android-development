package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001cH\u0002J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\"\u0010\u0011\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0010 \u001f*\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c0\u001c0\u001eH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/hoc/weatherapp/data/CityRepositoryImpl;", "Lcom/hoc/weatherapp/data/CityRepository;", "openWeatherMapApiService", "Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;", "timezoneDbApiService", "Lcom/hoc/weatherapp/data/remote/TimezoneDbApiService;", "cityLocalDataSource", "Lcom/hoc/weatherapp/data/local/CityLocalDataSource;", "fiveDayForecastLocalDataSource", "Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;", "currentWeatherLocalDataSource", "Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;", "selectedCityPreference", "Lcom/hoc/weatherapp/data/local/SelectedCityPreference;", "(Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;Lcom/hoc/weatherapp/data/remote/TimezoneDbApiService;Lcom/hoc/weatherapp/data/local/CityLocalDataSource;Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;Lcom/hoc/weatherapp/data/local/SelectedCityPreference;)V", "selectedCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "getSelectedCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "addCityByLatLng", "Lio/reactivex/Single;", "latitude", "", "longitude", "changeSelectedCity", "Lio/reactivex/Completable;", "city", "optionalCity", "Lcom/hoc/weatherapp/utils/Optional;", "deleteCity", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "app_debug"})
public final class CityRepositoryImpl implements com.hoc.weatherapp.data.CityRepository {
    private final com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService = null;
    private final com.hoc.weatherapp.data.remote.TimezoneDbApiService timezoneDbApiService = null;
    private final com.hoc.weatherapp.data.local.CityLocalDataSource cityLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.CurrentWeatherLocalDataSource currentWeatherLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.hoc.weatherapp.data.models.entity.City getSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City>> getSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.hoc.weatherapp.data.models.entity.City> deleteCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.hoc.weatherapp.data.models.entity.City> addCityByLatLng(double latitude, double longitude) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable changeSelectedCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    private final io.reactivex.Completable changeSelectedCity(com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City> optionalCity) {
        return null;
    }
    
    public CityRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.remote.TimezoneDbApiService timezoneDbApiService, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CityLocalDataSource cityLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CurrentWeatherLocalDataSource currentWeatherLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference) {
        super();
    }
}