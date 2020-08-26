package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJF\u0010\u0013\u001a@\u0012<\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f \u0010*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f\u0018\u00010\u000b0\u000b0\nH\u0016J:\u0010\u0014\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e \u0010*\u0016\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\f0\f0\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000RL\u0010\t\u001a@\u0012<\u0012:\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f \u0010*\u001c\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\f\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R@\u0010\u0011\u001a4\u00120\u0012.\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e \u0010*\u0016\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\f0\f0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/data/FiveDayForecastRepositoryImpl;", "Lcom/hoc/weatherapp/data/FiveDayForecastRepository;", "openWeatherMapApiService", "Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;", "fiveDayForecastLocalDataSource", "Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;", "selectedCityPreference", "Lcom/hoc/weatherapp/data/local/SelectedCityPreference;", "(Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;Lcom/hoc/weatherapp/data/local/FiveDayForecastLocalDataSource;Lcom/hoc/weatherapp/data/local/SelectedCityPreference;)V", "fiveDayForecastObservable", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/utils/Optional;", "Lkotlin/Pair;", "Lcom/hoc/weatherapp/data/models/entity/City;", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "kotlin.jvm.PlatformType", "refreshFiveDayForecast", "Lio/reactivex/Single;", "getFiveDayForecastOfSelectedCity", "refreshFiveDayForecastOfSelectedCity", "app_debug"})
public final class FiveDayForecastRepositoryImpl implements com.hoc.weatherapp.data.FiveDayForecastRepository {
    private final io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>>> fiveDayForecastObservable = null;
    private final io.reactivex.Single<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>> refreshFiveDayForecast = null;
    private final com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService = null;
    private final com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource = null;
    private final com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>>> getFiveDayForecastOfSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>> refreshFiveDayForecastOfSelectedCity() {
        return null;
    }
    
    public FiveDayForecastRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.remote.OpenWeatherMapApiService openWeatherMapApiService, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.FiveDayForecastLocalDataSource fiveDayForecastLocalDataSource, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SelectedCityPreference selectedCityPreference) {
        super();
    }
}