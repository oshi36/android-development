package com.hoc.weatherapp.ui.addcity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract;", "", "View", "ViewState", "app_debug"})
public abstract interface AddCityContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "", "()V", "AddCitySuccessfully", "Error", "Loading", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$Loading;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$AddCitySuccessfully;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$Error;", "app_debug"})
    public static abstract class ViewState {
        
        private ViewState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$Loading;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "()V", "app_debug"})
        public static final class Loading extends com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState {
            public static final com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState.Loading INSTANCE = null;
            
            private Loading() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$AddCitySuccessfully;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "showMessage", "", "(Lcom/hoc/weatherapp/data/models/entity/City;Z)V", "getCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "getShowMessage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class AddCitySuccessfully extends com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState {
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.entity.City city = null;
            private final boolean showMessage = false;
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City getCity() {
                return null;
            }
            
            public final boolean getShowMessage() {
                return false;
            }
            
            public AddCitySuccessfully(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City city, boolean showMessage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City component1() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState.AddCitySuccessfully copy(@org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City city, boolean showMessage) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState$Error;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "throwable", "", "showMessage", "", "(Ljava/lang/Throwable;Z)V", "getShowMessage", "()Z", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            private final boolean showMessage = false;
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
            
            public final boolean getShowMessage() {
                return false;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable, boolean showMessage) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable, boolean showMessage) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityContract$View;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "addCityByLatLngIntent", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "addCurrentLocationIntent", "", "render", "state", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "app_debug"})
    public static abstract interface View extends com.hannesdorfmann.mosby3.mvp.MvpView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<kotlin.Unit> addCurrentLocationIntent();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<kotlin.Pair<java.lang.Double, java.lang.Double>> addCityByLatLngIntent();
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState state);
    }
}