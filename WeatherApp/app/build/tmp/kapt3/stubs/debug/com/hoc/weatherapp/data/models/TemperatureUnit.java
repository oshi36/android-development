package com.hoc.weatherapp.data.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0004H\u0016j\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2 = {"Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "", "(Ljava/lang/String;I)V", "format", "", "temperatureInKelvin", "", "symbol", "toString", "FAHRENHEIT", "CELSIUS", "KELVIN", "Companion", "app_debug"})
public enum TemperatureUnit {
    /*public static final*/ FAHRENHEIT /* = new FAHRENHEIT() */,
    /*public static final*/ CELSIUS /* = new CELSIUS() */,
    /*public static final*/ KELVIN /* = new KELVIN() */;
    public static final com.hoc.weatherapp.data.models.TemperatureUnit.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String format(double temperatureInKelvin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String symbol() {
        return null;
    }
    
    TemperatureUnit() {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/data/models/TemperatureUnit$Companion;", "", "()V", "fromString", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "s", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.data.models.TemperatureUnit fromString(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}