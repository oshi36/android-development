package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00170\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00150\u00150\u0014H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0016\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010H\u0016J(\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00170 0\u00102\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00150\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/hoc/weatherapp/data/CurrentWeatherRepositoryImpl;", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "openWeatherMapApiService", "Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;", "timezoneDbApiService", "Lcom/hoc/weatherapp/data/remote/TimezoneDbApiService;", "currentWeatherLocalDataSource", "Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;", "fiveDayForecastLocalDataSource", "Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;", "cityLocalDataSource", "Lcom/hoc/weatherapp/data/local/CityLocalDataSource;", "selectedCityPreference", "Lcom/hoc/weatherapp/data/local/SelectedCityPreference;", "(Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;Lcom/hoc/weatherapp/data/remote/TimezoneDbApiService;Lcom/hoc/weatherapp/data/local/CurrentWeatherLocalDataSource;Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;Lcom/hoc/weatherapp/data/local/CityLocalDataSource;Lcom/hoc/weatherapp/data/local/SelectedCityPreference;)V", "refreshCurrentWeatherOfSelectedCitySingle", "Lio/reactivex/Single;", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "kotlin.jvm.PlatformType", "selectedCityAndCurrentWeatherObservable", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/utils/Optional;", "getAllCityAndCurrentWeathers", "", "querySearch", "", "getSelectedCityAndCurrentWeatherOfSelectedCity", "getZoneIdIfNeeded", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "refreshCurrentWeatherOfSelectedCity", "refreshWeatherOf", "Lkotlin/Pair;", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "app_debug"})
public final class CurrentWeatherRepositoryImpl implements com.hoc.weatherapp.data.CurrentWeatherRepository {
    private final io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> selectedCityAndCurrentWeatherObservable = null;
    private final io.reactivex.Single<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> refreshCurrentWeatherOfSelectedCitySingle = null;
    private final com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService = null;
    private final com.hoc.weatherapp.data.remote.TimezoneDbApiService timezoneDbApiService = null;
    private final com.hoc.weatherapp.data.local.CurrentWeatherLocalDataSource currentWeatherLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.CityLocalDataSource cityLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getAllCityAndCurrentWeathers(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getSelectedCityAndCurrentWeatherOfSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> refreshCurrentWeatherOfSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Pair<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>> refreshWeatherOf(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    private final io.reactivex.Single<java.lang.String> getZoneIdIfNeeded(com.hoc.weatherapp.data.models.entity.City city) {
        return null;
    }
    
    public CurrentWeatherRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.remote.TimezoneDbApiService timezoneDbApiService, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CurrentWeatherLocalDataSource currentWeatherLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.CityLocalDataSource cityLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference) {
        super();
    }
}