package com.hoc.weatherapp.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017R(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u000b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u000b*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028WX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001f"}, d2 = {"Lcom/hoc/weatherapp/data/local/SelectedCityPreference;", "Lcom/hoc/weatherapp/data/local/PreferenceInterface;", "Lcom/hoc/weatherapp/utils/Optional;", "Lcom/hoc/weatherapp/data/models/entity/City;", "sharedPreferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Landroid/content/SharedPreferences;Lcom/squareup/moshi/Moshi;)V", "citySubject", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "<set-?>", "", "selectedCityJsonString", "getSelectedCityJsonString", "()Ljava/lang/String;", "setSelectedCityJsonString", "(Ljava/lang/String;)V", "selectedCityJsonString$delegate", "Lkotlin/properties/ReadWriteProperty;", "value", "getValue", "()Lcom/hoc/weatherapp/utils/Optional;", "getSelectedCityFromSharedPref", "save", "", "app_debug"})
public final class SelectedCityPreference implements com.hoc.weatherapp.data.local.PreferenceInterface<com.hoc.weatherapp.utils.Optional<? extends com.hoc.weatherapp.data.models.entity.City>> {
    private final kotlin.properties.ReadWriteProperty selectedCityJsonString$delegate = null;
    private final io.reactivex.subjects.BehaviorSubject<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City>> citySubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City>> observable = null;
    private final com.squareup.moshi.Moshi moshi = null;
    
    private final java.lang.String getSelectedCityJsonString() {
        return null;
    }
    
    private final void setSelectedCityJsonString(java.lang.String p0) {
    }
    
    @androidx.annotation.WorkerThread()
    private final com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City> getSelectedCityFromSharedPref() {
        return null;
    }
    
    /**
     * Save [value] to shared preference
     * @param value
     */
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City> value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City>> getObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.WorkerThread()
    @java.lang.Override()
    public com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City> getValue() {
        return null;
    }
    
    public SelectedCityPreference(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        super();
    }
}