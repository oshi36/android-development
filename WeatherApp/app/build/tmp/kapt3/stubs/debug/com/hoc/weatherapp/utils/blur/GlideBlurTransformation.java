package com.hoc.weatherapp.utils.blur;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fH\u0014J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/hoc/weatherapp/utils/blur/GlideBlurTransformation;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "context", "Landroid/content/Context;", "radius", "", "(Landroid/content/Context;F)V", "equals", "", "other", "", "hashCode", "", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "app_debug"})
public final class GlideBlurTransformation extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private final android.content.Context context = null;
    private final float radius = 0.0F;
    private static final java.lang.String ID = "com.hoc.weatherapp.utils.blur.GlideBlurTransformation";
    public static final com.hoc.weatherapp.utils.blur.GlideBlurTransformation.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
        return null;
    }
    
    @java.lang.Override()
    public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
    java.security.MessageDigest messageDigest) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public GlideBlurTransformation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, float radius) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/utils/blur/GlideBlurTransformation$Companion;", "", "()V", "ID", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}