package com.hoc.weatherapp.data.models.entity;

import java.lang.System;

/**
 * Declaring the column info allows for the renaming of variables without implementing a
 * database migration, as the column name would not change.
 */
@androidx.room.Entity(tableName = "current_weathers", foreignKeys = {@androidx.room.ForeignKey(entity = com.hoc.weatherapp.data.models.entity.City.class, childColumns = {"city_id"}, onDelete = 5, parentColumns = {"id"})})
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\nH\u00c6\u0003J\t\u00103\u001a\u00020\nH\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\u0012H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\t\u00108\u001a\u00020\nH\u00c6\u0003J\t\u00109\u001a\u00020\u0012H\u00c6\u0003J\t\u0010:\u001a\u00020\u0012H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0006H\u00c6\u0003J\t\u0010>\u001a\u00020\u0006H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\nH\u00c6\u0003J\t\u0010A\u001a\u00020\nH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\u00c7\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\t\u0010E\u001a\u00020FH\u00d6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u00d6\u0003J\t\u0010K\u001a\u00020FH\u00d6\u0001J\t\u0010L\u001a\u00020\u0006H\u00d6\u0001J\u0019\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020FH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010%R\u0016\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0016\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010%\u00a8\u0006R"}, d2 = {"Lcom/hoc/weatherapp/data/models/entity/CurrentWeather;", "Landroid/os/Parcelable;", "cityId", "", "cloudiness", "main", "", "description", "icon", "temperature", "", "pressure", "humidity", "temperatureMin", "temperatureMax", "winSpeed", "winDegrees", "dataTime", "Ljava/util/Date;", "rainVolumeForThe3Hours", "snowVolumeForThe3Hours", "visibility", "sunrise", "sunset", "weatherConditionId", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DDJDDDDLjava/util/Date;DDDLjava/util/Date;Ljava/util/Date;J)V", "getCityId", "()J", "getCloudiness", "getDataTime", "()Ljava/util/Date;", "getDescription", "()Ljava/lang/String;", "getHumidity", "getIcon", "getMain", "getPressure", "()D", "getRainVolumeForThe3Hours", "getSnowVolumeForThe3Hours", "getSunrise", "getSunset", "getTemperature", "getTemperatureMax", "getTemperatureMin", "getVisibility", "getWeatherConditionId", "getWinDegrees", "getWinSpeed", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class CurrentWeather implements android.os.Parcelable {
    
    /**
     * Id of city
     */
    @androidx.room.ColumnInfo(name = "city_id")
    @androidx.room.PrimaryKey()
    private final long cityId = 0L;
    
    /**
     * Cloudiness, %
     */
    @androidx.room.ColumnInfo(name = "cloudiness")
    private final long cloudiness = 0L;
    
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
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    @androidx.room.ColumnInfo(name = "temperature")
    private final double temperature = 0.0;
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    @androidx.room.ColumnInfo(name = "pressure")
    private final double pressure = 0.0;
    
    /**
     * Humidity, %
     */
    @androidx.room.ColumnInfo(name = "humidity")
    private final long humidity = 0L;
    
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
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    @androidx.room.ColumnInfo(name = "win_speed")
    private final double winSpeed = 0.0;
    
    /**
     * Wind direction, degrees (meteorological)
     */
    @androidx.room.ColumnInfo(name = "win_degrees")
    private final double winDegrees = 0.0;
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "data_time")
    private final java.util.Date dataTime = null;
    
    /**
     * Rain volume for last 3 hours, mm
     */
    @androidx.room.ColumnInfo(name = "rain_volume_for_last_3_hours")
    private final double rainVolumeForThe3Hours = 0.0;
    
    /**
     * Snow volume for last 3 hours
     */
    @androidx.room.ColumnInfo(name = "snow_volume_for_last_3_hours")
    private final double snowVolumeForThe3Hours = 0.0;
    
    /**
     * Visibility, meter
     */
    @androidx.room.ColumnInfo(name = "visibilityKm")
    private final double visibility = 0.0;
    
    /**
     * Sunrise time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sunrise")
    private final java.util.Date sunrise = null;
    
    /**
     * Sunset time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "sunset")
    private final java.util.Date sunset = null;
    
    /**
     * Weather condition weatherId
     */
    @androidx.room.ColumnInfo(name = "weather_condition_id")
    private final long weatherConditionId = 0L;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    /**
     * Id of city
     */
    public final long getCityId() {
        return 0L;
    }
    
    /**
     * Cloudiness, %
     */
    public final long getCloudiness() {
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
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double getTemperature() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
     */
    public final double getPressure() {
        return 0.0;
    }
    
    /**
     * Humidity, %
     */
    public final long getHumidity() {
        return 0L;
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
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    public final double getWinSpeed() {
        return 0.0;
    }
    
    /**
     * Wind direction, degrees (meteorological)
     */
    public final double getWinDegrees() {
        return 0.0;
    }
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getDataTime() {
        return null;
    }
    
    /**
     * Rain volume for last 3 hours, mm
     */
    public final double getRainVolumeForThe3Hours() {
        return 0.0;
    }
    
    /**
     * Snow volume for last 3 hours
     */
    public final double getSnowVolumeForThe3Hours() {
        return 0.0;
    }
    
    /**
     * Visibility, meter
     */
    public final double getVisibility() {
        return 0.0;
    }
    
    /**
     * Sunrise time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getSunrise() {
        return null;
    }
    
    /**
     * Sunset time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getSunset() {
        return null;
    }
    
    /**
     * Weather condition weatherId
     */
    public final long getWeatherConditionId() {
        return 0L;
    }
    
    public CurrentWeather(long cityId, long cloudiness, @org.jetbrains.annotations.NotNull()
    java.lang.String main, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, double temperature, double pressure, long humidity, double temperatureMin, double temperatureMax, double winSpeed, double winDegrees, @org.jetbrains.annotations.NotNull()
    java.util.Date dataTime, double rainVolumeForThe3Hours, double snowVolumeForThe3Hours, double visibility, @org.jetbrains.annotations.NotNull()
    java.util.Date sunrise, @org.jetbrains.annotations.NotNull()
    java.util.Date sunset, long weatherConditionId) {
        super();
    }
    
    /**
     * Id of city
     */
    public final long component1() {
        return 0L;
    }
    
    /**
     * Cloudiness, %
     */
    public final long component2() {
        return 0L;
    }
    
    /**
     * Group of weather parameters (Rain, Snow, Extreme etc.)
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Weather condition within the group
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    /**
     * Weather icon weatherId
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    /**
     * Temperature. Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component6() {
        return 0.0;
    }
    
    /**
     * Atmospheric pressure on the sea level by default, hPa
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
     * Minimum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component9() {
        return 0.0;
    }
    
    /**
     * Maximum temperature at the moment of calculation.
     * This is deviation from 'temp' that is possible for large cities and megalopolises geographically expanded (use these parameter optionally).
     * Unit Default: Kelvin, Metric: Celsius, Imperial: Fahrenheit.
     */
    public final double component10() {
        return 0.0;
    }
    
    /**
     * Wind speed. Unit Default: meter/sec, Metric: meter/sec, Imperial: miles/hour.
     */
    public final double component11() {
        return 0.0;
    }
    
    /**
     * Wind direction, degrees (meteorological)
     */
    public final double component12() {
        return 0.0;
    }
    
    /**
     * Time of data forecasted, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component13() {
        return null;
    }
    
    /**
     * Rain volume for last 3 hours, mm
     */
    public final double component14() {
        return 0.0;
    }
    
    /**
     * Snow volume for last 3 hours
     */
    public final double component15() {
        return 0.0;
    }
    
    /**
     * Visibility, meter
     */
    public final double component16() {
        return 0.0;
    }
    
    /**
     * Sunrise time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component17() {
        return null;
    }
    
    /**
     * Sunset time, unix, UTC
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date component18() {
        return null;
    }
    
    /**
     * Weather condition weatherId
     */
    public final long component19() {
        return 0L;
    }
    
    /**
     * Declaring the column info allows for the renaming of variables without implementing a
     * database migration, as the column name would not change.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.entity.CurrentWeather copy(long cityId, long cloudiness, @org.jetbrains.annotations.NotNull()
    java.lang.String main, @org.jetbrains.annotations.NotNull()
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    java.lang.String icon, double temperature, double pressure, long humidity, double temperatureMin, double temperatureMax, double winSpeed, double winDegrees, @org.jetbrains.annotations.NotNull()
    java.util.Date dataTime, double rainVolumeForThe3Hours, double snowVolumeForThe3Hours, double visibility, @org.jetbrains.annotations.NotNull()
    java.util.Date sunrise, @org.jetbrains.annotations.NotNull()
    java.util.Date sunset, long weatherConditionId) {
        return null;
    }
    
    /**
     * Declaring the column info allows for the renaming of variables without implementing a
     * database migration, as the column name would not change.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Declaring the column info allows for the renaming of variables without implementing a
     * database migration, as the column name would not change.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Declaring the column info allows for the renaming of variables without implementing a
     * database migration, as the column name would not change.
     */
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