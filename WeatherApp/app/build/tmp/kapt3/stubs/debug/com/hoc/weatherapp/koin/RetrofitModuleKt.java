package com.hoc.weatherapp.koin;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, xi = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0007\u001a\u00020\bH\u0002\u001a\b\u0010\t\u001a\u00020\nH\u0002\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0002\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\rH\u0002\u001a\f\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"OPEN_WEATHER_MAP_RETROFIT", "Lorg/koin/core/qualifier/StringQualifier;", "TIMEZONE_DB_RETROFIT", "retrofitModule", "Lorg/koin/core/module/Module;", "getRetrofitModule", "()Lorg/koin/core/module/Module;", "getMoshi", "Lcom/squareup/moshi/Moshi;", "getOkHttpClient", "Lokhttp3/OkHttpClient;", "getOpenWeatherMapRetrofit", "Lretrofit2/Retrofit;", "Lorg/koin/core/scope/Scope;", "getTimezoneDbApiService", "Lcom/hoc/weatherapp/data/remote/TimezoneDbApiService;", "getTimezoneDbRetrofit", "getWeatherApiService", "Lcom/hoc/weatherapp/data/remote/OpenWeatherMapApiService;", "app_debug"})
public final class RetrofitModuleKt {
    private static final org.koin.core.qualifier.StringQualifier OPEN_WEATHER_MAP_RETROFIT = null;
    private static final org.koin.core.qualifier.StringQualifier TIMEZONE_DB_RETROFIT = null;
    @org.jetbrains.annotations.NotNull()
    private static final org.koin.core.module.Module retrofitModule = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.koin.core.module.Module getRetrofitModule() {
        return null;
    }
    
    private static final com.hoc.weatherapp.data.remote.TimezoneDbApiService getTimezoneDbApiService(@org.jetbrains.annotations.NotNull()
    org.koin.core.scope.Scope $this$getTimezoneDbApiService) {
        return null;
    }
    
    private static final retrofit2.Retrofit getTimezoneDbRetrofit(@org.jetbrains.annotations.NotNull()
    org.koin.core.scope.Scope $this$getTimezoneDbRetrofit) {
        return null;
    }
    
    private static final com.hoc.weatherapp.data.remote.OpenWeatherMapApiService getWeatherApiService(@org.jetbrains.annotations.NotNull()
    org.koin.core.scope.Scope $this$getWeatherApiService) {
        return null;
    }
    
    private static final retrofit2.Retrofit getOpenWeatherMapRetrofit(@org.jetbrains.annotations.NotNull()
    org.koin.core.scope.Scope $this$getOpenWeatherMapRetrofit) {
        return null;
    }
    
    private static final com.squareup.moshi.Moshi getMoshi() {
        return null;
    }
    
    private static final okhttp3.OkHttpClient getOkHttpClient() {
        return null;
    }
}