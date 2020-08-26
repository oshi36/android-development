package com.hoc.weatherapp.data.models.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "five_day_forecast", foreignKeys = {@androidx.room.ForeignKey(entity = com.hoc.weatherapp.data.models.entity.City.class, childColumns = {"city_id"}, onUpdate = 5, onDelete = 5, parentColumns = {"id"})}, indices = {@androidx.room.Index(value = {"city_id"})})
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b7\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\f\u00a2\u0006\u0002\u0010\u0017J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\u000eH\u00c6\u0003J\t\u00106\u001a\u00020\fH\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\u000eH\u00c6\u0003J\u00b3\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\fH\u00c6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u00d6\u0003J\t\u0010K\u001a\u00020FH\u00d6\u0001J\t\u0010L\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020FH\u00d6\u0001R\u0016\u0010\u0016\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR$\u0010!\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010&R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001e\u00a8\u0006R"}, d2 = {"Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "Landroid/os/Parcelable;", "timeOfDataForecasted", "Ljava/util/Date;", "temperature", "", "temperatureMin", "temperatureMax", "pressure", "seaLevel", "groundLevel", "humidity", "", "main", "", "description", "icon", "cloudiness", "windSpeed", "winDegrees", "rainVolumeForTheLast3Hours", "snowVolumeForTheLast3Hours", "cityId", "(Ljava/util/Date;DDDDDDJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JDDDDJ)V", "getCityId", "()J", "getCloudiness", "getDescription", "()Ljava/lang/String;", "getGroundLevel", "()D", "getHumidity", "getIcon", "id", "getId$annotations", "()V", "getId", "setId", "(J)V", "getMain", "getPressure", "getRainVolumeForTheLast3Hours", "getSeaLevel", "getSnowVolumeForTheLast3Hours", "getTemperature", "getTemperatureMax", "getTemperatureMin", "getTimeOfDataForecasted", "()Ljava/util/Date;", "getWinDegrees", "getWindSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class DailyWeather implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @androidx.room.ColumnInfo(name = "id")
    private long id = 0L;
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data_time")
    private final java.util.Date timeOfDataForecasted = null;
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @androidx.room.ColumnInfo(name = "temperature")
    private final double temperature = 0.0;
    
    /**
     * Minimum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @androidx.room.ColumnInfo(name = "temperature_min")
    private final double temperatureMin = 0.0;
    
    /**
     * Maximum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @androidx.room.ColumnInfo(name = "temperature_max")
    private final double temperatureMax = 0.0;
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    @androidx.room.ColumnInfo(name = "pressure")
    private final double pressure = 0.0;
    
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    @androidx.room.ColumnInfo(name = "sea_level")
    private final double seaLevel = 0.0;
    
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    @androidx.room.ColumnInfo(name = "ground_level")
    private final double groundLevel = 0.0;
    
    /**
     * Humidity, %
     */
    @androidx.room.ColumnInfo(name = "humidity")
    private final long humidity = 0L;
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "main")
    private final java.lang.String main = null;
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "description")
    private final java.lang.String description = null;
    
    /**
     * Weather icon weatherId
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "icon")
    private final java.lang.String icon = null;
    
    /**
     * Cloudiness, %
     */
    @androidx.room.ColumnInfo(name = "cloudiness")
    private final long cloudiness = 0L;
    
    /**
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    @androidx.room.ColumnInfo(name = "win_speed")
    private final double windSpeed = 0.0;
    
    /**
     * Wind direction, degrees (meteorological)
     */
    @androidx.room.ColumnInfo(name = "win_degrees")
    private final double winDegrees = 0.0;
    
    /**
     * Rain volume for last 3 hours, mm
     */
    @androidx.room.ColumnInfo(name = "rain_volume_for_last_3_hours")
    private final double rainVolumeForTheLast3Hours = 0.0;
    
    /**
     * Snow volume for last 3 hours
     */
    @androidx.room.ColumnInfo(name = "snow_volume_for_last_3_hours")
    private final double snowVolumeForTheLast3Hours = 0.0;
    
    /**
     * Id of city
     */
    @androidx.room.ColumnInfo(name = "city_id")
    private final long cityId = 0L;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    @kotlinx.android.parcel.IgnoredOnParcel()
    @java.lang.Deprecated()
    public static void getId$annotations() {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getTimeOfDataForecasted() {
        return null;
    }
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double getTemperature() {
        return 0.0;
    }
    
    /**
     * Minimum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double getTemperatureMin() {
        return 0.0;
    }
    
    /**
     * Maximum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double getTemperatureMax() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    public final double getPressure() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    public final double getSeaLevel() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    public final double getGroundLevel() {
        return 0.0;
    }
    
    /**
     * Humidity, %
     */
    public final long getHumidity() {
        return 0L;
    }
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMain() {
        return null;
    }
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    /**
     * Weather icon weatherId
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIcon() {
        return null;
    }
    
    /**
     * Cloudiness, %
     */
    public final long getCloudiness() {
        return 0L;
    }
    
    /**
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    public final double getWindSpeed() {
        return 0.0;
    }
    
    /**
     * Wind direction, degrees (meteorological)
     */
    public final double getWinDegrees() {
        return 0.0;
    }
    
    /**
     * Rain volume for last 3 hours, mm
     */
    public final double getRainVolumeForTheLast3Hours() {
        return 0.0;
    }
    
    /**
     * Snow volume for last 3 hours
     */
    public final double getSnowVolumeForTheLast3Hours() {
        return 0.0;
    }
    
    /**
     * Id of city
     */
    public final long getCityId() {
        return 0L;
    }
    
    public DailyWeather(@org.jetbrains.annotations.NotNull()
    java.util.Date timeOfDataForecasted, double temperature, double temperatureMin, double temperatureMax, double pressure, double seaLevel, double groundLevel, long humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String main, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, long cloudiness, double windSpeed, double winDegrees, double rainVolumeForTheLast3Hours, double snowVolumeForTheLast3Hours, long cityId) {
        super();
    }
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component1() {
        return null;
    }
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component2() {
        return 0.0;
    }
    
    /**
     * Minimum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component3() {
        return 0.0;
    }
    
    /**
     * Maximum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component4() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    public final double component5() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level, hPa
     */
    public final double component6() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the ground level, hPa
     */
    public final double component7() {
        return 0.0;
    }
    
    /**
     * Humidity, %
     */
    public final long component8() {
        return 0L;
    }
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    /**
     * Weather icon weatherId
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    /**
     * Cloudiness, %
     */
    public final long component12() {
        return 0L;
    }
    
    /**
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    public final double component13() {
        return 0.0;
    }
    
    /**
     * Wind direction, degrees (meteorological)
     */
    public final double component14() {
        return 0.0;
    }
    
    /**
     * Rain volume for last 3 hours, mm
     */
    public final double component15() {
        return 0.0;
    }
    
    /**
     * Snow volume for last 3 hours
     */
    public final double component16() {
        return 0.0;
    }
    
    /**
     * Id of city
     */
    public final long component17() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.entity.DailyWeather copy(@org.jetbrains.annotations.NotNull()
    java.util.Date timeOfDataForecasted, double temperature, double temperatureMin, double temperatureMax, double pressure, double seaLevel, double groundLevel, long humidity, @org.jetbrains.annotations.NotNull()
    java.lang.String main, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, long cloudiness, double windSpeed, double winDegrees, double rainVolumeForTheLast3Hours, double snowVolumeForTheLast3Hours, long cityId) {
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
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3, xi = 2)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}