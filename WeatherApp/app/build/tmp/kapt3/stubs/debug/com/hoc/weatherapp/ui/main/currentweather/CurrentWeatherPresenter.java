package com.hoc.weatherapp.ui.main.currentweather;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0014\u001a\u00020\u0015H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f \u0010*\u0012\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u000e0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$View;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$ViewState;", "currentWeatherRepository", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "cityRepository", "Lcom/hoc/weatherapp/data/CityRepository;", "androidApplication", "Landroid/app/Application;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "(Lcom/hoc/weatherapp/data/CurrentWeatherRepository;Lcom/hoc/weatherapp/data/CityRepository;Landroid/app/Application;Lcom/hoc/weatherapp/data/local/SettingPreferences;)V", "cityAndWeatherPartialChange", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$PartialStateChange;", "kotlin.jvm.PlatformType", "refreshWeatherProcessor", "Lio/reactivex/ObservableTransformer;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$RefreshIntent;", "bindIntents", "", "Companion", "app_debug"})
public final class CurrentWeatherPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.View, com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.ViewState> {
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.PartialStateChange> cityAndWeatherPartialChange = null;
    private final io.reactivex.ObservableTransformer<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.RefreshIntent, com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.PartialStateChange> refreshWeatherProcessor = null;
    private final com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository = null;
    private final com.hoc.weatherapp.data.CityRepository cityRepository = null;
    private final android.app.Application androidApplication = null;
    private final com.hoc.weatherapp.data.local.SettingPreferences settingPreferences = null;
    private static final java.lang.String TAG = "__current_weather__";
    private static final org.threeten.bp.format.DateTimeFormatter LAST_UPDATED_FORMATTER = null;
    private static final io.reactivex.functions.BiFunction<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.ViewState, com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.PartialStateChange, com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.ViewState> reducer = null;
    private static final com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    public CurrentWeatherPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CityRepository cityRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SettingPreferences settingPreferences) {
        super();
    }
    
    private static final com.hoc.weatherapp.ui.main.currentweather.CurrentWeather toCurrentWeather(com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather cityAndCurrentWeather, com.hoc.weatherapp.data.models.SpeedUnit speedUnit, com.hoc.weatherapp.data.models.PressureUnit pressureUnit, com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit) {
        return null;
    }
    
    private static final io.reactivex.Observable<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.PartialStateChange> showError(java.lang.Throwable throwable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0002\u00a8\u0006\u001c"}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherPresenter$Companion;", "", "()V", "LAST_UPDATED_FORMATTER", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "TAG", "", "reducer", "Lio/reactivex/functions/BiFunction;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$ViewState;", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherContract$PartialStateChange;", "getReducer$annotations", "showError", "Lio/reactivex/Observable;", "throwable", "", "toCurrentWeather", "Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeather;", "cityAndCurrentWeather", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "speedUnit", "Lcom/hoc/weatherapp/data/models/SpeedUnit;", "pressureUnit", "Lcom/hoc/weatherapp/data/models/PressureUnit;", "temperatureUnit", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "Tuple4", "app_debug"})
    static final class Companion {
        
        @java.lang.Deprecated()
        private static void getReducer$annotations() {
        }
        
        private final com.hoc.weatherapp.ui.main.currentweather.CurrentWeather toCurrentWeather(com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather cityAndCurrentWeather, com.hoc.weatherapp.data.models.SpeedUnit speedUnit, com.hoc.weatherapp.data.models.PressureUnit pressureUnit, com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit) {
            return null;
        }
        
        private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherContract.PartialStateChange> showError(java.lang.Throwable throwable) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeatherPresenter$Companion$Tuple4;", "", "speedUnit", "Lcom/hoc/weatherapp/data/models/SpeedUnit;", "pressureUnit", "Lcom/hoc/weatherapp/data/models/PressureUnit;", "temperatureUnit", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "optional", "Lcom/hoc/weatherapp/utils/Optional;", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "(Lcom/hoc/weatherapp/data/models/SpeedUnit;Lcom/hoc/weatherapp/data/models/PressureUnit;Lcom/hoc/weatherapp/data/models/TemperatureUnit;Lcom/hoc/weatherapp/utils/Optional;)V", "getOptional", "()Lcom/hoc/weatherapp/utils/Optional;", "getPressureUnit", "()Lcom/hoc/weatherapp/data/models/PressureUnit;", "getSpeedUnit", "()Lcom/hoc/weatherapp/data/models/SpeedUnit;", "getTemperatureUnit", "()Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
        static final class Tuple4 {
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.SpeedUnit speedUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.PressureUnit pressureUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> optional = null;
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.SpeedUnit getSpeedUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.PressureUnit getPressureUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.TemperatureUnit getTemperatureUnit() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> getOptional() {
                return null;
            }
            
            public Tuple4(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> optional) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.SpeedUnit component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.PressureUnit component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.TemperatureUnit component3() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> component4() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.currentweather.CurrentWeatherPresenter.Companion.Tuple4 copy(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> optional) {
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