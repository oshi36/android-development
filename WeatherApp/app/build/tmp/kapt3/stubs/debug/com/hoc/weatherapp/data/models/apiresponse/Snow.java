package com.hoc.weatherapp.data.models.apiresponse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/Snow;", "", "_3h", "", "(Ljava/lang/Double;)V", "get_3h", "()Ljava/lang/Double;", "Ljava/lang/Double;", "app_debug"})
public final class Snow {
    
    /**
     * Snow volume for last 3 hours
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double _3h = null;
    
    /**
     * Snow volume for last 3 hours
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double get_3h() {
        return null;
    }
    
    public Snow(@org.jetbrains.annotations.Nullable()
    @com.squareup.moshi.Json(name = "3h")
    java.lang.Double _3h) {
        super();
    }
    
    public Snow() {
        super();
    }
}