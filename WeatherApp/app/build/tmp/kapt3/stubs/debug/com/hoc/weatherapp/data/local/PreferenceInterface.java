package com.hoc.weatherapp.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\r"}, d2 = {"Lcom/hoc/weatherapp/data/local/PreferenceInterface;", "T", "", "observable", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", "value", "getValue", "()Ljava/lang/Object;", "save", "", "(Ljava/lang/Object;)V", "app_debug"})
public abstract interface PreferenceInterface<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract T getValue();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<T> getObservable();
    
    /**
     * Save [value] to shared preference
     * @param value
     */
    public abstract void save(@org.jetbrains.annotations.NotNull()
    T value);
}