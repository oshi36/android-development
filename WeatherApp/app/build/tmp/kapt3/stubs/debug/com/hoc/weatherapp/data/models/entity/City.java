package com.hoc.weatherapp.data.models.entity;

import java.lang.System;

/**
 * Declaring the column info allows for the renaming of variables without implementing a
 * database migration, as the column name would not change.
 */
@kotlinx.android.parcel.Parcelize()
@androidx.room.Entity(tableName = "cities")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u00d6\u0003J\t\u0010\"\u001a\u00020\u001dH\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001dH\u00d6\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006)"}, d2 = {"Lcom/hoc/weatherapp/data/models/entity/City;", "Landroid/os/Parcelable;", "id", "", "name", "", "country", "lat", "", "lng", "zoneId", "(JLjava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "getId", "()J", "getLat", "()D", "getLng", "getName", "getZoneId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class City implements android.os.Parcelable {
    
    /**
     * Id of city
     */
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final long id = 0L;
    
    /**
     * Name of city
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "name")
    private final java.lang.String name = null;
    
    /**
     * Country of city
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "country")
    private final java.lang.String country = null;
    
    /**
     * Latitude of city
     */
    @androidx.room.ColumnInfo(name = "lat")
    private final double lat = 0.0;
    
    /**
     * Longitude of city
     */
    @androidx.room.ColumnInfo(name = "lng")
    private final double lng = 0.0;
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "zone_id")
    private final java.lang.String zoneId = null;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    /**
     * Id of city
     */
    public final long getId() {
        return 0L;
    }
    
    /**
     * Name of city
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    /**
     * Country of city
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCountry() {
        return null;
    }
    
    /**
     * Latitude of city
     */
    public final double getLat() {
        return 0.0;
    }
    
    /**
     * Longitude of city
     */
    public final double getLng() {
        return 0.0;
    }
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getZoneId() {
        return null;
    }
    
    public City(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String country, double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId) {
        super();
    }
    
    /**
     * Id of city
     */
    public final long component1() {
        return 0L;
    }
    
    /**
     * Name of city
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    /**
     * Country of city
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    /**
     * Latitude of city
     */
    public final double component4() {
        return 0.0;
    }
    
    /**
     * Longitude of city
     */
    public final double component5() {
        return 0.0;
    }
    
    /**
     * The time zone name.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    /**
     * Declaring the column info allows for the renaming of variables without implementing a
     * database migration, as the column name would not change.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.hoc.weatherapp.data.models.entity.City copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String country, double lat, double lng, @org.jetbrains.annotations.NotNull()
    java.lang.String zoneId) {
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