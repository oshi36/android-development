package com.hoc.weatherapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainContract;", "", "View", "ViewState", "app_debug"})
public abstract interface MainContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "", "()V", "vibrantColor", "", "getVibrantColor", "()I", "CityAndWeather", "NoSelectedCity", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState$CityAndWeather;", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState$NoSelectedCity;", "app_debug"})
    public static abstract class ViewState {
        
        public abstract int getVibrantColor();
        
        private ViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainContract$ViewState$CityAndWeather;", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "weather", "Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "vibrantColor", "", "(Lcom/hoc/weatherapp/data/models/entity/City;Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;I)V", "getCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "getVibrantColor", "()I", "getWeather", "()Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class CityAndWeather extends com.hoc.weatherapp.ui.main.MainContract.ViewState {
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.entity.City city = null;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.entity.CurrentWeather weather = null;
            private final int vibrantColor = 0;
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City getCity() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.CurrentWeather getWeather() {
                return null;
            }
            
            @java.lang.Override()
            public int getVibrantColor() {
                return 0;
            }
            
            public CityAndWeather(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City city, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.CurrentWeather weather, @androidx.annotation.ColorInt()
            int vibrantColor) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.CurrentWeather component2() {
                return null;
            }
            
            public final int component3() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.MainContract.ViewState.CityAndWeather copy(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City city, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.CurrentWeather weather, @androidx.annotation.ColorInt()
            int vibrantColor) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainContract$ViewState$NoSelectedCity;", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "vibrantColor", "", "(I)V", "getVibrantColor", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
        public static final class NoSelectedCity extends com.hoc.weatherapp.ui.main.MainContract.ViewState {
            private final int vibrantColor = 0;
            
            @java.lang.Override()
            public int getVibrantColor() {
                return 0;
            }
            
            public NoSelectedCity(@androidx.annotation.ColorInt()
            int vibrantColor) {
                super();
            }
            
            public final int component1() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.MainContract.ViewState.NoSelectedCity copy(@androidx.annotation.ColorInt()
            int vibrantColor) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/hoc/weatherapp/ui/main/MainContract$View;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "changeColorIntent", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "render", "", "state", "Lcom/hoc/weatherapp/ui/main/MainContract$ViewState;", "app_debug"})
    public static abstract interface View extends com.hannesdorfmann.mosby3.mvp.MvpView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> changeColorIntent();
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.main.MainContract.ViewState state);
    }
}