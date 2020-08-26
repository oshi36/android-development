package com.hoc.weatherapp.ui.cities;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0019\u001a\u00020\u001aH\u0014J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001cH\u0002J\"\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001cH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\u00160\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$View;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$ViewState;", "cityRepository", "Lcom/hoc/weatherapp/data/CityRepository;", "currentWeatherRepository", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "fiveDayForecastRepository", "Lcom/hoc/weatherapp/data/FiveDayForecastRepository;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "androidApplication", "Landroid/app/Application;", "(Lcom/hoc/weatherapp/data/CityRepository;Lcom/hoc/weatherapp/data/CurrentWeatherRepository;Lcom/hoc/weatherapp/data/FiveDayForecastRepository;Lcom/hoc/weatherapp/data/local/SettingPreferences;Landroid/app/Application;)V", "changeSelectedCityProcessor", "Lio/reactivex/ObservableTransformer;", "Lcom/hoc/weatherapp/data/models/entity/City;", "", "cityListItemsPartialChange", "", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "searchIntentProcessor", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "bindIntents", "", "deleteCityPartialChange", "Lio/reactivex/Observable;", "cityAndCurrentWeathers", "refreshWeather", "Companion", "app_debug"})
public final class CitiesPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.cities.CitiesContract.View, com.hoc.weatherapp.ui.cities.CitiesContract.ViewState> {
    private final io.reactivex.ObservableTransformer<com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent, java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> searchIntentProcessor = null;
    private final io.reactivex.ObservableTransformer<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>, com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange> cityListItemsPartialChange = null;
    private final io.reactivex.ObservableTransformer<com.hoc.weatherapp.data.models.entity.City, java.lang.Object> changeSelectedCityProcessor = null;
    private final com.hoc.weatherapp.data.CityRepository cityRepository = null;
    private final com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository = null;
    private final com.hoc.weatherapp.data.FiveDayForecastRepository fiveDayForecastRepository = null;
    private final com.hoc.weatherapp.data.local.SettingPreferences settingPreferences = null;
    private final android.app.Application androidApplication = null;
    private static final java.lang.String TAG = "__cities__";
    private static final long SNACKBAR_DURATION = 2000L;
    private static final io.reactivex.functions.BiFunction<com.hoc.weatherapp.ui.cities.CitiesContract.ViewState, com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange, com.hoc.weatherapp.ui.cities.CitiesContract.ViewState> reducer = null;
    private static final io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange>> showError = null;
    private static final com.hoc.weatherapp.ui.cities.CitiesPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange> refreshWeather(io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> cityAndCurrentWeathers) {
        return null;
    }
    
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange> deleteCityPartialChange(io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> cityAndCurrentWeathers) {
        return null;
    }
    
    public CitiesPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CityRepository cityRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.FiveDayForecastRepository fiveDayForecastRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SettingPreferences settingPreferences, @org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002R(\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\r8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesPresenter$Companion;", "", "()V", "SNACKBAR_DURATION", "", "TAG", "", "reducer", "Lio/reactivex/functions/BiFunction;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$ViewState;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "getReducer$annotations", "showError", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Observable;", "getShowError$annotations", "app_debug"})
    static final class Companion {
        
        @java.lang.Deprecated()
        private static void getReducer$annotations() {
        }
        
        @java.lang.Deprecated()
        private static void getShowError$annotations() {
        }
        
        private Companion() {
            super();
        }
    }
}