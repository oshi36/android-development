package com.hoc.weatherapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\r\u00a8\u0006\u000e"}, d2 = {"Lcom/hoc/weatherapp/utils/UnitConverter;", "", "()V", "convertPressure", "", "pressureIn_hPa", "to", "Lcom/hoc/weatherapp/data/models/PressureUnit;", "convertSpeed", "speedInMetersPerSecond", "Lcom/hoc/weatherapp/data/models/SpeedUnit;", "convertTemperature", "temperatureInKelvin", "Lcom/hoc/weatherapp/data/models/TemperatureUnit;", "app_debug"})
public final class UnitConverter {
    public static final com.hoc.weatherapp.utils.UnitConverter INSTANCE = null;
    
    /**
     * Convert [temperatureInKelvin] from [KELVIN] to [to]
     */
    public final double convertTemperature(double temperatureInKelvin, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.TemperatureUnit to) {
        return 0.0;
    }
    
    /**
     * Convert [speedInMetersPerSecond] from [METERS_PER_SECOND] to [to]
     */
    public final double convertSpeed(double speedInMetersPerSecond, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.SpeedUnit to) {
        return 0.0;
    }
    
    /**
     * Convert [pressureIn_hPa] from [HPA] to [to]
     */
    public final double convertPressure(double pressureIn_hPa, @org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.PressureUnit to) {
        return 0.0;
    }
    
    private UnitConverter() {
        super();
    }
}