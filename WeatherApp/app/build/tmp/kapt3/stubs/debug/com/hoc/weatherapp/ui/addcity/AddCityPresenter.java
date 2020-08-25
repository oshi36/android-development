package com.hoc.weatherapp.ui.addcity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001.B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010,\u001a\u00020\u0010H\u0014J\b\u0010-\u001a\u00020\u0010H\u0014R&\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u001a\u001a\n \u0013*\u0004\u0018\u00010\u001b0\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u001b0\u001b0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010 \u001a\n \u0013*\u0004\u0018\u00010!0!8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b\"\u0010#R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010!0!0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010&\u001a\n \u0013*\u0004\u0018\u00010\'0\'8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b(\u0010)R\u001c\u0010+\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\'0\'0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityPresenter;", "Lcom/hannesdorfmann/mosby3/mvi/MviBasePresenter;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$View;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "cityRepository", "Lcom/hoc/weatherapp/data/CityRepository;", "currentWeatherRepository", "Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "application", "Landroid/app/Application;", "(Lcom/hoc/weatherapp/data/CityRepository;Lcom/hoc/weatherapp/data/CurrentWeatherRepository;Landroid/app/Application;)V", "addCityTransformer", "Lio/reactivex/ObservableTransformer;", "Lkotlin/Pair;", "", "addCurrentLocationProcessor", "", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "kotlin.jvm.PlatformType", "getFusedLocationProviderClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "fusedLocationProviderClient$delegate", "Lcom/hoc/weatherapp/utils/MyUnsafeLazyImpl;", "fusedLocationProviderClientLazy", "Lcom/hoc/weatherapp/utils/MyUnsafeLazyImpl;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "locationRequest$delegate", "locationRequestLazy", "locationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "getLocationSettingsRequest", "()Lcom/google/android/gms/location/LocationSettingsRequest;", "locationSettingsRequest$delegate", "locationSettingsRequestLazy", "settingsClient", "Lcom/google/android/gms/location/SettingsClient;", "getSettingsClient", "()Lcom/google/android/gms/location/SettingsClient;", "settingsClient$delegate", "settingsClientLazy", "bindIntents", "unbindIntents", "Companion", "app_debug"})
public final class AddCityPresenter extends com.hannesdorfmann.mosby3.mvi.MviBasePresenter<com.hoc.weatherapp.ui.addcity.AddCityContract.View, com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState> {
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl<com.google.android.gms.location.LocationRequest> locationRequestLazy = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl<com.google.android.gms.location.LocationSettingsRequest> locationSettingsRequestLazy = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl<com.google.android.gms.location.FusedLocationProviderClient> fusedLocationProviderClientLazy = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl<com.google.android.gms.location.SettingsClient> settingsClientLazy = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl locationRequest$delegate = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl fusedLocationProviderClient$delegate = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl locationSettingsRequest$delegate = null;
    private final com.hoc.weatherapp.utils.MyUnsafeLazyImpl settingsClient$delegate = null;
    private final io.reactivex.ObservableTransformer<kotlin.Pair<java.lang.Double, java.lang.Double>, com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState> addCityTransformer = null;
    private final io.reactivex.ObservableTransformer<kotlin.Unit, com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState> addCurrentLocationProcessor = null;
    private final com.hoc.weatherapp.data.CityRepository cityRepository = null;
    private final com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository = null;
    private final android.app.Application application = null;
    private static final java.lang.String TAG = "__add_city__";
    private static final com.hoc.weatherapp.ui.addcity.AddCityPresenter.Companion Companion = null;
    
    private final com.google.android.gms.location.LocationRequest getLocationRequest() {
        return null;
    }
    
    private final com.google.android.gms.location.FusedLocationProviderClient getFusedLocationProviderClient() {
        return null;
    }
    
    private final com.google.android.gms.location.LocationSettingsRequest getLocationSettingsRequest() {
        return null;
    }
    
    private final com.google.android.gms.location.SettingsClient getSettingsClient() {
        return null;
    }
    
    @java.lang.Override()
    protected void bindIntents() {
    }
    
    @java.lang.Override()
    protected void unbindIntents() {
    }
    
    public AddCityPresenter(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CityRepository cityRepository, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.CurrentWeatherRepository currentWeatherRepository, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityPresenter$Companion;", "", "()V", "TAG", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}