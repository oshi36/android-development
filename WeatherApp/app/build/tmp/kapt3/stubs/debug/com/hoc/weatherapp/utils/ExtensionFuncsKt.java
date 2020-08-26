package com.hoc.weatherapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, xi = 2, d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\b\u001a2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a@\u0010\u0011\u001a\u00020\u0012\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0086\b\u00a2\u0006\u0002\u0010\u0018\u001aD\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001a\b\u0004\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00010\u001cH\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u001d\u001a\u00020\u001e*\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0002\u001a%\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0001\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a\u001c\u0010\"\u001a\u00020\u0012*\u00020#2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\'\u001a\u001c\u0010(\u001a\u00020)*\u00020*2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020%\u001a\u0019\u0010.\u001a\u00020\u0012\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\b*\u00020\bH\u0086\b\u001a\u0014\u0010/\u001a\u00020%*\u00020\b2\b\b\u0001\u00100\u001a\u00020%\u001a\u001c\u00101\u001a\u000202*\u00020\b2\u0006\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020%\u001a\u0014\u00101\u001a\u0004\u0018\u000102*\u0002032\u0006\u0010+\u001a\u00020,\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u00064"}, d2 = {"asObservable", "Lio/reactivex/Observable;", "T", "", "Lio/reactivex/subjects/Subject;", "checkLocationSettingAndGetCurrentLocation", "Lio/reactivex/Single;", "Landroid/location/Location;", "Landroid/content/Context;", "settingsClient", "Lcom/google/android/gms/location/SettingsClient;", "locationSettingsRequest", "Lcom/google/android/gms/location/LocationSettingsRequest;", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "debug", "", "msg", "tag", "", "throwable", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V", "exhaustMap", "R", "transform", "Lkotlin/Function1;", "isAccessLocationPermissionDenied", "", "emitter", "Lio/reactivex/ObservableEmitter;", "notOfType", "setColorFilter", "Landroid/graphics/drawable/Drawable;", "color", "", "mode", "Lcom/hoc/weatherapp/utils/Mode;", "snackBar", "Lcom/google/android/material/snackbar/Snackbar;", "Landroid/view/View;", "message", "", "duration", "startActivity", "themeColor", "attrRes", "toast", "Landroid/widget/Toast;", "Landroidx/fragment/app/Fragment;", "app_debug"})
public final class ExtensionFuncsKt {
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"ControlFlowWithEmptyBody", "ControlFlowWithEmptyBody"})
    public static final android.widget.Toast toast(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message, @ToastDuration()
    int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.google.android.material.snackbar.Snackbar snackBar(@org.jetbrains.annotations.NotNull()
    android.view.View $this$snackBar, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message, @SnackbarDuration()
    int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.widget.Toast toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public static final io.reactivex.Single<android.location.Location> checkLocationSettingAndGetCurrentLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$checkLocationSettingAndGetCurrentLocation, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.SettingsClient settingsClient, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationSettingsRequest locationSettingsRequest, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient, @org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationRequest locationRequest) {
        return null;
    }
    
    private static final boolean isAccessLocationPermissionDenied(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$isAccessLocationPermissionDenied, io.reactivex.ObservableEmitter<android.location.Location> emitter) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object, R extends java.lang.Object>io.reactivex.Observable<R> exhaustMap(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<T> $this$exhaustMap, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends io.reactivex.Observable<R>> transform) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"nothing_to_inline"})
    public static final <T extends java.lang.Object>io.reactivex.Observable<T> asObservable(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.Subject<T> $this$asObservable) {
        return null;
    }
    
    public static final int themeColor(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$themeColor, @androidx.annotation.AttrRes()
    int attrRes) {
        return 0;
    }
    
    public static final void setColorFilter(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable $this$setColorFilter, int color, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.utils.Mode mode) {
    }
}