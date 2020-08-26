package com.hoc.weatherapp.ui.main.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0014R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00030\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/hoc/weatherapp/ui/main/chart/ChartPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/main/chart/ChartContract$View;", "Lcom/hoc/weatherapp/ui/main/chart/ChartContract$ViewState;", "fiveDayForecastRepository", "Lcom/hoc/weatherapp/data/FiveDayForecastRepository;", "settingPreferences", "Lcom/hoc/weatherapp/data/local/SettingPreferences;", "(Lcom/hoc/weatherapp/data/FiveDayForecastRepository;Lcom/hoc/weatherapp/data/local/SettingPreferences;)V", "viewState", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "bindIntents", "", "Companion", "app_debug"})
public final class ChartPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.main.chart.ChartContract.View, com.hoc.weatherapp.ui.main.chart.ChartContract.ViewState> {
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.chart.ChartContract.ViewState> viewState = null;
    private static final java.lang.String TAG = "__chart__";
    private static final com.hoc.weatherapp.ui.main.chart.ChartPresenter.Companion Companion = null;
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    public ChartPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.FiveDayForecastRepository fiveDayForecastRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.local.SettingPreferences settingPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hoc/weatherapp/ui/main/chart/ChartPresenter$Companion;", "", "()V", "TAG", "", "Tuple4", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\nH\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lcom/hoc/weatherapp/ui/main/chart/ChartPresenter$Companion$Tuple4;", "", "weathers", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "temperatureUnit", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "speedUnit", "Lcom/hoc/weatherapp/data/models/SpeedUnit;", "pressureUnit", "Lcom/hoc/weatherapp/data/models/PressureUnit;", "(Ljava/util/List;Lcom/hoc/weatherapp/data/models/TemperatureUnit;Lcom/hoc/weatherapp/data/models/SpeedUnit;Lcom/hoc/weatherapp/data/models/PressureUnit;)V", "getPressureUnit", "()Lcom/hoc/weatherapp/data/models/PressureUnit;", "getSpeedUnit", "()Lcom/hoc/weatherapp/data/models/SpeedUnit;", "getTemperatureUnit", "()Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "getWeathers", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
        static final class Tuple4 {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.SpeedUnit speedUnit = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.PressureUnit pressureUnit = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> getWeathers() {
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
            
            public Tuple4(@org.jetbrains.annotations.NotNull()
            java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> component1() {
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
            public final com.hoc.weatherapp.ui.main.chart.ChartPresenter.Companion.Tuple4 copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> weathers, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.TemperatureUnit temperatureUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.SpeedUnit speedUnit, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.PressureUnit pressureUnit) {
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