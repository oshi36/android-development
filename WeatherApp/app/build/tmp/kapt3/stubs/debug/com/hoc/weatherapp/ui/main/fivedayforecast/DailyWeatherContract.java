package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract;", "", "PartialStateChange", "RefreshIntent", "View", "ViewState", "app_debug"})
public abstract interface DailyWeatherContract {
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "", "()V", "Error", "RefreshWeatherSuccess", "Weather", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$Error;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$Weather;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$RefreshWeatherSuccess;", "app_debug"})
    public static abstract class PartialStateChange {
        
        private PartialStateChange() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$Error;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "throwable", "", "showMessage", "", "(Ljava/lang/Throwable;Z)V", "getShowMessage", "()Z", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Error extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange {
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
            public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange.Error copy(@org.jetbrains.annotations.NotNull()
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$Weather;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "dailyWeatherListItem", "", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "(Ljava/util/List;)V", "getDailyWeatherListItem", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class Weather extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem = null;
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> getDailyWeatherListItem() {
                return null;
            }
            
            public Weather(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange.Weather copy(@org.jetbrains.annotations.NotNull()
            java.util.List<? extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem) {
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
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange$RefreshWeatherSuccess;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$PartialStateChange;", "showMessage", "", "(Z)V", "getShowMessage", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class RefreshWeatherSuccess extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange {
            private final boolean showMessage = false;
            
            public final boolean getShowMessage() {
                return false;
            }
            
            public RefreshWeatherSuccess(boolean showMessage) {
                super();
            }
            
            public final boolean component1() {
                return false;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.PartialStateChange.RefreshWeatherSuccess copy(boolean showMessage) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$ViewState;", "", "dailyWeatherListItem", "", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "error", "", "showError", "", "showRefreshSuccessfully", "(Ljava/util/List;Ljava/lang/Throwable;ZZ)V", "getDailyWeatherListItem", "()Ljava/util/List;", "getError", "()Ljava/lang/Throwable;", "getShowError", "()Z", "getShowRefreshSuccessfully", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class ViewState {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Throwable error = null;
        private final boolean showError = false;
        private final boolean showRefreshSuccessfully = false;
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> getDailyWeatherListItem() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Throwable getError() {
            return null;
        }
        
        public final boolean getShowError() {
            return false;
        }
        
        public final boolean getShowRefreshSuccessfully() {
            return false;
        }
        
        public ViewState(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable error, boolean showError, boolean showRefreshSuccessfully) {
            super();
        }
        
        public ViewState() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> component1() {
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
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState copy(@org.jetbrains.annotations.Nullable()
        java.util.List<? extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem> dailyWeatherListItem, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable error, boolean showError, boolean showRefreshSuccessfully) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "", "()V", "InitialRefreshIntent", "UserRefreshIntent", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent$InitialRefreshIntent;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent$UserRefreshIntent;", "app_debug"})
    public static abstract class RefreshIntent {
        
        private RefreshIntent() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent$InitialRefreshIntent;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "()V", "app_debug"})
        public static final class InitialRefreshIntent extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent {
            public static final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent.InitialRefreshIntent INSTANCE = null;
            
            private InitialRefreshIntent() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent$UserRefreshIntent;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "()V", "app_debug"})
        public static final class UserRefreshIntent extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent {
            public static final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent.UserRefreshIntent INSTANCE = null;
            
            private UserRefreshIntent() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$View;", "Lcom/hannesdorfmann/mosby3/mvp/MvpView;", "refreshDailyWeatherIntent", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$RefreshIntent;", "render", "", "viewState", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherContract$ViewState;", "app_debug"})
    public static abstract interface View extends com.hannesdorfmann.mosby3.mvp.MvpView {
        
        @org.jetbrains.annotations.NotNull()
        public abstract io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.RefreshIntent> refreshDailyWeatherIntent();
        
        public abstract void render(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherContract.ViewState viewState);
    }
}