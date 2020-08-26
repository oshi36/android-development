package com.hoc.weatherapp.ui.cities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract;", "", "PartialStateChange", "SearchStringIntent", "View", "ViewState", "app_debug"})
public abstract interface CitiesContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "", "()V", "CityListItems", "DeleteCity", "Error", "RefreshWeather", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$CityListItems;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$Error;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$DeleteCity;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$RefreshWeather;", "app_debug"})
    public static abstract class PartialStateChange {
        
        private PartialStateChange() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$CityListItems;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "items", "", "Lcom/hoc/weatherapp/ui/cities/CityListItem;", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class CityListItems extends com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> items = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> getItems() {
                return null;
            }
            
            public CityListItems(@org.jetbrains.annotations.NotNull()
            java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> items) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange.CityListItems copy(@org.jetbrains.annotations.NotNull()
            java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> items) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$Error;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "throwable", "", "showMessage", "", "(Ljava/lang/Throwable;Z)V", "getShowMessage", "()Z", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange {
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
            public final com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange.Error copy(@org.jetbrains.annotations.NotNull()
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$DeleteCity;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "showMessage", "", "deletedCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "(ZLcom/hoc/weatherapp/data/models/entity/City;)V", "getDeletedCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "getShowMessage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class DeleteCity extends com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange {
            private final boolean showMessage = false;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.entity.City deletedCity = null;
            
            public final boolean getShowMessage() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City getDeletedCity() {
                return null;
            }
            
            public DeleteCity(boolean showMessage, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City deletedCity) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange.DeleteCity copy(boolean showMessage, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City deletedCity) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange$RefreshWeather;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$PartialStateChange;", "showMessage", "", "refreshCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "(ZLcom/hoc/weatherapp/data/models/entity/City;)V", "getRefreshCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "getShowMessage", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class RefreshWeather extends com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange {
            private final boolean showMessage = false;
            @org.jetbrains.annotations.NotNull()
            private final com.hoc.weatherapp.data.models.entity.City refreshCity = null;
            
            public final boolean getShowMessage() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City getRefreshCity() {
                return null;
            }
            
            public RefreshWeather(boolean showMessage, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City refreshCity) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.data.models.entity.City component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.cities.CitiesContract.PartialStateChange.RefreshWeather copy(boolean showMessage, @org.jetbrains.annotations.NotNull()
            com.hoc.weatherapp.data.models.entity.City refreshCity) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J[\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\'H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$ViewState;", "", "cityListItems", "", "Lcom/hoc/weatherapp/ui/cities/CityListItem;", "error", "", "showError", "", "showDeleteCitySuccessfully", "deletedCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "showRefreshSuccessfully", "refreshCity", "(Ljava/util/List;Ljava/lang/Throwable;ZZLcom/hoc/weatherapp/data/models/entity/City;ZLcom/hoc/weatherapp/data/models/entity/City;)V", "getCityListItems", "()Ljava/util/List;", "getDeletedCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "getError", "()Ljava/lang/Throwable;", "getRefreshCity", "getShowDeleteCitySuccessfully", "()Z", "getShowError", "getShowRefreshSuccessfully", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class ViewState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> cityListItems = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        private final boolean showError = false;
        private final boolean showDeleteCitySuccessfully = false;
        @org.jetbrains.annotations.Nullable()
        private final com.hoc.weatherapp.data.models.entity.City deletedCity = null;
        private final boolean showRefreshSuccessfully = false;
        @org.jetbrains.annotations.Nullable()
        private final com.hoc.weatherapp.data.models.entity.City refreshCity = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> getCityListItems() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
        
        public final boolean getShowError() {
            return false;
        }
        
        public final boolean getShowDeleteCitySuccessfully() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.hoc.weatherapp.data.models.entity.City getDeletedCity() {
            return null;
        }
        
        public final boolean getShowRefreshSuccessfully() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.hoc.weatherapp.data.models.entity.City getRefreshCity() {
            return null;
        }
        
        public ViewState(@org.jetbrains.annotations.NotNull()
        java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> cityListItems, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable error, boolean showError, boolean showDeleteCitySuccessfully, @org.jetbrains.annotations.Nullable()
        com.hoc.weatherapp.data.models.entity.City deletedCity, boolean showRefreshSuccessfully, @org.jetbrains.annotations.Nullable()
        com.hoc.weatherapp.data.models.entity.City refreshCity) {
            super();
        }
        
        public ViewState() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable component2() {
            return null;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean component4() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.hoc.weatherapp.data.models.entity.City component5() {
            return null;
        }
        
        public final boolean component6() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.hoc.weatherapp.data.models.entity.City component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.ui.cities.CitiesContract.ViewState copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.hoc.weatherapp.ui.cities.CityListItem> cityListItems, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable error, boolean showError, boolean showDeleteCitySuccessfully, @org.jetbrains.annotations.Nullable()
        com.hoc.weatherapp.data.models.entity.City deletedCity, boolean showRefreshSuccessfully, @org.jetbrains.annotations.Nullable()
        com.hoc.weatherapp.data.models.entity.City refreshCity) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "", "()V", "value", "", "getValue", "()Ljava/lang/String;", "InitialSearchStringIntent", "UserSearchStringIntent", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent$InitialSearchStringIntent;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent$UserSearchStringIntent;", "app_debug"})
    public static abstract class SearchStringIntent {
        
        @org.jetbrains.annotations.NotNull()
        public abstract java.lang.String getValue();
        
        private SearchStringIntent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent$InitialSearchStringIntent;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "()V", "value", "", "getValue", "()Ljava/lang/String;", "app_debug"})
        public static final class InitialSearchStringIntent extends com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent {
            @org.jetbrains.annotations.NotNull()
            private static final java.lang.String value = "";
            public static final com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent.InitialSearchStringIntent INSTANCE = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getValue() {
                return null;
            }
            
            private InitialSearchStringIntent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent$UserSearchStringIntent;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
        public static final class UserSearchStringIntent extends com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String getValue() {
                return null;
            }
            
            public UserSearchStringIntent(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent.UserSearchStringIntent copy(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesContract$View;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "changeSelectedCity", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/data/models/entity/City;", "deleteCityAtPosition", "", "refreshCurrentWeatherAtPosition", "render", "", "state", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$ViewState;", "searchStringIntent", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "app_debug"})
    public static abstract interface View extends com.hannesdorfmann.mosby3.mvp.MvpView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent> searchStringIntent();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<com.hoc.weatherapp.data.models.entity.City> changeSelectedCity();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<java.lang.Integer> deleteCityAtPosition();
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<java.lang.Integer> refreshCurrentWeatherAtPosition();
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.cities.CitiesContract.ViewState state);
    }
}