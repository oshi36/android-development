package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0018B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u0016\u001a\u00020\u0017H\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u0013\u001a&\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00120\u0012 \u0015*\u0012\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00120\u0012\u0018\u00010\u00140\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$View;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$ViewState;", "fiveDayForecastRepository", "Lcom/hoc/weatherapp/data/FiveDayForecastRepository;", "cityRepository", "Lcom/hoc/weatherapp/data/CityRepository;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "colorHolderSource", "Lcom/hoc/weatherapp/ui/main/ColorHolderSource;", "androidApplication", "Landroid/app/Application;", "(Lcom/hoc/weatherapp/data/FiveDayForecastRepository;Lcom/hoc/weatherapp/data/CityRepository;Lcom/hoc/weatherapp/data/local/SettingPreferences;Lcom/hoc/weatherapp/ui/main/ColorHolderSource;Landroid/app/Application;)V", "refreshWeatherProcessor", "Lio/reactivex/ObservableTransformer;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "weatherChangePartialState", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "bindIntents", "", "Companion", "app_debug"})
public final class DailyWeatherPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.View, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState> {
    private final io.reactivex.ObservableTransformer<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange> refreshWeatherProcessor = null;
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange> weatherChangePartialState = null;
    private final com.hoc.weatherapp.data.FiveDayForecastRepository fiveDayForecastRepository = null;
    private final com.hoc.weatherapp.data.CityRepository cityRepository = null;
    private final com.hoc.weatherapp.data.local.SettingPreferences settingPreferences = null;
    private final android.app.Application androidApplication = null;
    private static final java.lang.String TAG = "__five_day_forecast__";
    private static final io.reactivex.functions.Function<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherPresenter.Companion.Tuple5, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange> tupleToWeatherPartialChange = null;
    private static final io.reactivex.functions.BiFunction<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState> reducer = null;
    private static final io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange>> showError = null;
    private static final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    public DailyWeatherPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.FiveDayForecastRepository fiveDayForecastRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CityRepository cityRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SettingPreferences settingPreferences, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.ColorHolderSource colorHolderSource, @org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R(\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0002R\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u00a8\u0006\u0013"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherPresenter$Companion;", "", "()V", "TAG", "", "reducer", "Lio/reactivex/functions/BiFunction;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$ViewState;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "getReducer$annotations", "showError", "Lio/reactivex/functions/Function;", "", "Lio/reactivex/Observable;", "getShowError$annotations", "tupleToWeatherPartialChange", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherPresenter$Companion$Tuple5;", "getTupleToWeatherPartialChange$annotations", "Tuple5", "app_debug"})
    static final class Companion {
        
        @kotlin.ExperimentalStdlibApi()
        @java.lang.Deprecated()
        private static void getTupleToWeatherPartialChange$annotations() {
        }
        
        @java.lang.Deprecated()
        private static void getReducer$annotations() {
        }
        
        @java.lang.Deprecated()
        private static void getShowError$annotations() {
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\fH\u00c6\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0003JY\u0010\u001e\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u000eH\u00d6\u0001J\t\u0010#\u001a\u00020$H\u00d6\u0001R\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011\u00a8\u0006%"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherPresenter$Companion$Tuple5;", "", "weathers", "Lkotlin/Pair;", "Lcom/hoc/weatherapp/data/models/entity/City;", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "temperatureUnit", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "speedUnit", "Lcom/hoc/weatherapp/data/models/SpeedUnit;", "pressureUnit", "Lcom/hoc/weatherapp/data/models/PressureUnit;", "colors", "", "(Lkotlin/Pair;Lcom/hoc/weatherapp/data/models/TemperatureUnit;Lcom/hoc/weatherapp/data/models/SpeedUnit;Lcom/hoc/weatherapp/data/models/PressureUnit;Lkotlin/Pair;)V", "getColors", "()Lkotlin/Pair;", "getPressureUnit", "()Lcom/hoc/weatherapp/data/models/PressureUnit;", "getSpeedUnit", "()Lcom/hoc/weatherapp/data/models/SpeedUnit;", "getTemperatureUnit", "()Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "getWeathers", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
        static final class Tuple5 {
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> weathers = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.SpeedUnit speedUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.PressureUnit pressureUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final kotlin.Pair<java.lang.Integer, java.lang.Integer> colors = null;
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> getWeathers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.TemperatureUnit getTemperatureUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.SpeedUnit getSpeedUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.PressureUnit getPressureUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getColors() {
                return null;
            }
            
            public Tuple5(@org.jetbrains.annotations.NotNull()
            kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, ? extends java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> weathers, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit, @org.jetbrains.annotations.NotNull()
            kotlin.Pair<java.lang.Integer, java.lang.Integer> colors) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.TemperatureUnit component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.SpeedUnit component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.PressureUnit component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component5() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherPresenter.Companion.Tuple5 copy(@org.jetbrains.annotations.NotNull()
            kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, ? extends java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>> weathers, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit, @org.jetbrains.annotations.NotNull()
            kotlin.Pair<java.lang.Integer, java.lang.Integer> colors) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
}