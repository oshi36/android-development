package com.hoc.weatherapp.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007R7\u0010\u0005\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR4\u0010\f\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/ui/main/ColorHolderSource;", "", "androidApplication", "Landroid/app/Application;", "(Landroid/app/Application;)V", "colorObservable", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "getColorObservable", "()Lio/reactivex/Observable;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "change", "", "colors", "app_debug"})
public final class ColorHolderSource {
    private final io.reactivex.subjects.BehaviorSubject<kotlin.Pair<java.lang.Integer, java.lang.Integer>> subject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> colorObservable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Pair<java.lang.Integer, java.lang.Integer>> getColorObservable() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public final void change(@org.jetbrains.annotations.NotNull()
    kotlin.Pair<java.lang.Integer, java.lang.Integer> colors) {
    }
    
    public ColorHolderSource(@org.jetbrains.annotations.NotNull()
    android.app.Application androidApplication) {
        super();
    }
}