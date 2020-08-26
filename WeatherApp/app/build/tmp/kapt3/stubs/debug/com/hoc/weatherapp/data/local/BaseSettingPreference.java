package com.hoc.weatherapp.data.local;

import java.lang.System;

/**
 * Base class implement [PreferenceInterface], used to get and save value setting
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0017\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00028\u0000H\u0007\u00a2\u0006\u0002\u0010\fR+\u0010\b\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00008B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00018\u00008\u00000\u0010X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0011*\u0004\u0018\u00018\u00008\u00000\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/hoc/weatherapp/data/local/BaseSettingPreference;", "T", "", "Lcom/hoc/weatherapp/data/local/PreferenceInterface;", "delegateProperty", "Lkotlin/properties/ReadWriteProperty;", "(Lkotlin/properties/ReadWriteProperty;)V", "<set-?>", "_value", "get_value", "()Ljava/lang/Object;", "set_value", "(Ljava/lang/Object;)V", "_value$delegate", "Lkotlin/properties/ReadWriteProperty;", "observable", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "getObservable", "()Lio/reactivex/Observable;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "value", "getValue", "save", "", "saveActual", "app_debug"})
public final class BaseSettingPreference<T extends java.lang.Object> implements com.hoc.weatherapp.data.local.PreferenceInterface<T> {
    private final kotlin.properties.ReadWriteProperty _value$delegate = null;
    private final io.reactivex.subjects.BehaviorSubject<T> subject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<T> observable = null;
    
    private final T get_value() {
        return null;
    }
    
    private final void set_value(T p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public T getValue() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<T> getObservable() {
        return null;
    }
    
    /**
     * We call this method in onPreferenceChange of [androidx.preference.Preference.OnPreferenceChangeListener]
     * It called before the state of the Preference is about to be updated and before the state is persisted.
     * Because value will be persisted by [androidx.preference.Preference], only set [value] to [subject]
     * @param value
     */
    @androidx.annotation.MainThread()
    @java.lang.Override()
    public void save(@org.jetbrains.annotations.NotNull()
    T value) {
    }
    
    /**
     * Save actual [value] to shared preference, call on worker thread
     * @param value
     */
    @androidx.annotation.WorkerThread()
    public final void saveActual(@org.jetbrains.annotations.NotNull()
    T value) {
    }
    
    public BaseSettingPreference(@org.jetbrains.annotations.NotNull()
    kotlin.properties.ReadWriteProperty<java.lang.Object, T> delegateProperty) {
        super();
    }
}