package com.hoc.weatherapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, xi = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u0001H\u0003H\u0086\b\u00a2\u0006\u0002\u0010\b\u001ax\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\n\"\u0004\b\u0000\u0010\u0003*\u00020\u00042A\u0010\u000b\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u0011H\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H\u00030\f\u00a2\u0006\u0002\b\u00102\u0006\u0010\u000f\u001a\u0002H\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0011\u001a\u00bb\u0001\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u00042A\u0010\u000b\u001a=\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u0011H\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u0002H\u00030\f\u00a2\u0006\u0002\b\u00102A\u0010\u0013\u001a=\u0012\u0004\u0012\u00020\u0014\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u0011H\u0003\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\u0002\b\u00102\u0006\u0010\u000f\u001a\u0002H\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0016\u001a\u001c\u0010\u0017\u001a\u00020\u0018*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0018H\u0001\u001a\u001c\u0010\u0019\u001a\u00020\u0014*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0018H\u0001\u00a8\u0006\u001a"}, d2 = {"delegate", "Lkotlin/properties/ReadWriteProperty;", "", "T", "Landroid/content/SharedPreferences;", "key", "", "default", "(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/Object;)Lkotlin/properties/ReadWriteProperty;", "delegateVal", "Lkotlin/properties/ReadOnlyProperty;", "getter", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "defaultValue", "Lkotlin/ExtensionFunctionType;", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ReadOnlyProperty;", "delegateVar", "setter", "Landroid/content/SharedPreferences$Editor;", "value", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ReadWriteProperty;", "getDouble", "", "putDouble", "app_debug"})
public final class SharedPrefExtensionKt {
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.PublishedApi()
    public static final android.content.SharedPreferences.Editor putDouble(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences.Editor $this$putDouble, @org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
        return null;
    }
    
    @kotlin.PublishedApi()
    public static final double getDouble(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$getDouble, @org.jetbrains.annotations.NotNull()
    java.lang.String key, double defaultValue) {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlin.properties.ReadWriteProperty<java.lang.Object, T> delegateVar(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$delegateVar, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.content.SharedPreferences, ? super java.lang.String, ? super T, ? extends T> getter, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.content.SharedPreferences.Editor, ? super java.lang.String, ? super T, ? extends android.content.SharedPreferences.Editor> setter, T defaultValue, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>kotlin.properties.ReadOnlyProperty<java.lang.Object, T> delegateVal(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences $this$delegateVal, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.content.SharedPreferences, ? super java.lang.String, ? super T, ? extends T> getter, T defaultValue, @org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
}