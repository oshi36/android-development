package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "", "()V", "Header", "Weather", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Header;", "app_debug"})
public abstract class DailyWeatherListItem {
    
    private DailyWeatherListItem() {
        super();
    }
    
    @kotlinx.android.parcel.Parcelize()
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0019J\u0015\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\u0007H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\u0007H\u00c6\u0003J\t\u00105\u001a\u00020\u0016H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0007H\u00c6\u0003J\t\u00108\u001a\u00020\u0007H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0007H\u00c6\u0003J\t\u0010;\u001a\u00020\u0007H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\u0007H\u00c6\u0003J\t\u0010>\u001a\u00020\u0007H\u00c6\u0003J\t\u0010?\u001a\u00020\u0007H\u00c6\u0003J\u00bf\u0001\u0010@\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0007H\u00c6\u0001J\t\u0010A\u001a\u00020\u0005H\u00d6\u0001J\u0013\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u00d6\u0003J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001J\t\u0010G\u001a\u00020\u0007H\u00d6\u0001J\u0019\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0013\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.\u00a8\u0006M"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "Landroid/os/Parcelable;", "colors", "Lkotlin/Pair;", "", "weatherIcon", "", "dataTime", "Lorg/threeten/bp/ZonedDateTime;", "weatherDescription", "temperatureMin", "temperatureMax", "temperature", "pressure", "seaLevel", "groundLevel", "humidity", "main", "cloudiness", "winSpeed", "windDirection", "Lcom/hoc/weatherapp/data/models/WindDirection;", "rainVolumeForTheLast3Hours", "snowVolumeForTheLast3Hours", "(Lkotlin/Pair;Ljava/lang/String;Lorg/threeten/bp/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/hoc/weatherapp/data/models/WindDirection;Ljava/lang/String;Ljava/lang/String;)V", "getCloudiness", "()Ljava/lang/String;", "getColors", "()Lkotlin/Pair;", "getDataTime", "()Lorg/threeten/bp/ZonedDateTime;", "getGroundLevel", "getHumidity", "getMain", "getPressure", "getRainVolumeForTheLast3Hours", "getSeaLevel", "getSnowVolumeForTheLast3Hours", "getTemperature", "getTemperatureMax", "getTemperatureMin", "getWeatherDescription", "getWeatherIcon", "getWinSpeed", "getWindDirection", "()Lcom/hoc/weatherapp/data/models/WindDirection;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
    public static final class Weather extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem implements android.os.Parcelable {
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Pair<java.lang.Integer, java.lang.Integer> colors = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String weatherIcon = null;
        @org.jetbrains.annotations.NotNull()
        private final org.threeten.bp.ZonedDateTime dataTime = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String weatherDescription = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String temperatureMin = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String temperatureMax = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String temperature = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String pressure = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String seaLevel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String groundLevel = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String humidity = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String main = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String cloudiness = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String winSpeed = null;
        @org.jetbrains.annotations.NotNull()
        private final com.hoc.weatherapp.data.models.WindDirection windDirection = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String rainVolumeForTheLast3Hours = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String snowVolumeForTheLast3Hours = null;
        public static final android.os.Parcelable.Creator CREATOR = null;
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> getColors() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWeatherIcon() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.ZonedDateTime getDataTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWeatherDescription() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTemperatureMin() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTemperatureMax() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTemperature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPressure() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSeaLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGroundLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getHumidity() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMain() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCloudiness() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getWinSpeed() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.data.models.WindDirection getWindDirection() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getRainVolumeForTheLast3Hours() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSnowVolumeForTheLast3Hours() {
            return null;
        }
        
        public Weather(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<java.lang.Integer, java.lang.Integer> colors, @org.jetbrains.annotations.NotNull()
        java.lang.String weatherIcon, @org.jetbrains.annotations.NotNull()
        org.threeten.bp.ZonedDateTime dataTime, @org.jetbrains.annotations.NotNull()
        java.lang.String weatherDescription, @org.jetbrains.annotations.NotNull()
        java.lang.String temperatureMin, @org.jetbrains.annotations.NotNull()
        java.lang.String temperatureMax, @org.jetbrains.annotations.NotNull()
        java.lang.String temperature, @org.jetbrains.annotations.NotNull()
        java.lang.String pressure, @org.jetbrains.annotations.NotNull()
        java.lang.String seaLevel, @org.jetbrains.annotations.NotNull()
        java.lang.String groundLevel, @org.jetbrains.annotations.NotNull()
        java.lang.String humidity, @org.jetbrains.annotations.NotNull()
        java.lang.String main, @org.jetbrains.annotations.NotNull()
        java.lang.String cloudiness, @org.jetbrains.annotations.NotNull()
        java.lang.String winSpeed, @org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.data.models.WindDirection windDirection, @org.jetbrains.annotations.NotNull()
        java.lang.String rainVolumeForTheLast3Hours, @org.jetbrains.annotations.NotNull()
        java.lang.String snowVolumeForTheLast3Hours) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlin.Pair<java.lang.Integer, java.lang.Integer> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.ZonedDateTime component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.data.models.WindDirection component15() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component17() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather copy(@org.jetbrains.annotations.NotNull()
        kotlin.Pair<java.lang.Integer, java.lang.Integer> colors, @org.jetbrains.annotations.NotNull()
        java.lang.String weatherIcon, @org.jetbrains.annotations.NotNull()
        org.threeten.bp.ZonedDateTime dataTime, @org.jetbrains.annotations.NotNull()
        java.lang.String weatherDescription, @org.jetbrains.annotations.NotNull()
        java.lang.String temperatureMin, @org.jetbrains.annotations.NotNull()
        java.lang.String temperatureMax, @org.jetbrains.annotations.NotNull()
        java.lang.String temperature, @org.jetbrains.annotations.NotNull()
        java.lang.String pressure, @org.jetbrains.annotations.NotNull()
        java.lang.String seaLevel, @org.jetbrains.annotations.NotNull()
        java.lang.String groundLevel, @org.jetbrains.annotations.NotNull()
        java.lang.String humidity, @org.jetbrains.annotations.NotNull()
        java.lang.String main, @org.jetbrains.annotations.NotNull()
        java.lang.String cloudiness, @org.jetbrains.annotations.NotNull()
        java.lang.String winSpeed, @org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.data.models.WindDirection windDirection, @org.jetbrains.annotations.NotNull()
        java.lang.String rainVolumeForTheLast3Hours, @org.jetbrains.annotations.NotNull()
        java.lang.String snowVolumeForTheLast3Hours) {
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
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Header;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "date", "Lorg/threeten/bp/ZonedDateTime;", "(Lorg/threeten/bp/ZonedDateTime;)V", "getDate", "()Lorg/threeten/bp/ZonedDateTime;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Header extends com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem {
        @org.jetbrains.annotations.NotNull()
        private final org.threeten.bp.ZonedDateTime date = null;
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.ZonedDateTime getDate() {
            return null;
        }
        
        public Header(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.ZonedDateTime date) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.threeten.bp.ZonedDateTime component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Header copy(@org.jetbrains.annotations.NotNull()
        org.threeten.bp.ZonedDateTime date) {
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
}