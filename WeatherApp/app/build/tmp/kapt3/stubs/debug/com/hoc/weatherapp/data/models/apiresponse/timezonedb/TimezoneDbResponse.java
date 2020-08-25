package com.hoc.weatherapp.data.models.apiresponse.timezonedb;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/data/models/apiresponse/timezonedb/TimezoneDbResponse;", "", "status", "", "message", "zoneName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "getZoneName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class TimezoneDbResponse {
    
    /**
     * Status of the API query. Either OK or FAILED.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    
    /**
     * Error message. Empty if no error.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String zoneName = null;
    
    /**
     * Status of the API query. Either OK or FAILED.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    /**
     * Error message. Empty if no error.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZoneName() {
        return null;
    }
    
    public TimezoneDbResponse(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "zoneName")
    java.lang.String zoneName) {
        super();
    }
    
    /**
     * Status of the API query. Either OK or FAILED.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    /**
     * Error message. Empty if no error.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.apiresponse.timezonedb.TimezoneDbResponse copy(@org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "status")
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "message")
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    @com.squareup.moshi.Json(name = "zoneName")
    java.lang.String zoneName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}