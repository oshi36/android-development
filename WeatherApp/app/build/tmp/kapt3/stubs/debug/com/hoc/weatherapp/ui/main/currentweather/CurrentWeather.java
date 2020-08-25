package com.hoc.weatherapp.ui.main.currentweather;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0006H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u0006H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\bH\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u000205H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014\u00a8\u00067"}, d2 = {"Lcom/hoc/weatherapp/ui/main/currentweather/CurrentWeather;", "", "temperatureString", "", "pressureString", "humidity", "", "rainVolumeForThe3HoursMm", "", "weatherConditionId", "weatherIcon", "description", "dataTimeString", "zoneId", "winSpeed", "winSpeedString", "winDirection", "visibilityKm", "(Ljava/lang/String;Ljava/lang/String;JDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;D)V", "getDataTimeString", "()Ljava/lang/String;", "getDescription", "getHumidity", "()J", "getPressureString", "getRainVolumeForThe3HoursMm", "()D", "getTemperatureString", "getVisibilityKm", "getWeatherConditionId", "getWeatherIcon", "getWinDirection", "getWinSpeed", "getWinSpeedString", "getZoneId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class CurrentWeather {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String temperatureString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String pressureString = null;
    private final long humidity = 0L;
    private final double rainVolumeForThe3HoursMm = 0.0;
    private final long weatherConditionId = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String weatherIcon = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String dataTimeString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String zoneId = null;
    
    /**
     * m/s
     */
    private final double winSpeed = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String winSpeedString = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String winDirection = null;
    private final double visibilityKm = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTemperatureString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPressureString() {
        return null;
    }
    
    public final long getHumidity() {
        return 0L;
    }
    
    public final double getRainVolumeForThe3HoursMm() {
        return 0.0;
    }
    
    public final long getWeatherConditionId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeatherIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDataTimeString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZoneId() {
        return null;
    }
    
    /**
     * m/s
     */
    public final double getWinSpeed() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWinSpeedString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWinDirection() {
        return null;
    }
    
    public final double getVisibilityKm() {
        return 0.0;
    }
    
    public CurrentWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String temperatureString, @org.jetbrains.annotations.NotNull()
    java.lang.String pressureString, long humidity, double rainVolumeForThe3HoursMm, long weatherConditionId, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String dataTimeString, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId, double winSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String winSpeedString, @org.jetbrains.annotations.NotNull()
    java.lang.String winDirection, double visibilityKm) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final long component3() {
        return 0L;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * m/s
     */
    public final double component10() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.ui.main.currentweather.CurrentWeather copy(@org.jetbrains.annotations.NotNull()
    java.lang.String temperatureString, @org.jetbrains.annotations.NotNull()
    java.lang.String pressureString, long humidity, double rainVolumeForThe3HoursMm, long weatherConditionId, @org.jetbrains.annotations.NotNull()
    java.lang.String weatherIcon, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String dataTimeString, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId, double winSpeed, @org.jetbrains.annotations.NotNull()
    java.lang.String winSpeedString, @org.jetbrains.annotations.NotNull()
    java.lang.String winDirection, double visibilityKm) {
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