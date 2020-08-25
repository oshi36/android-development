package com.hoc.weatherapp.ui.main.fivedayforecast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004$%&\'B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u000fH\u0016J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u000fH\u0016R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006("}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/hoc/weatherapp/utils/ui/HeaderItemDecoration$StickyHeaderInterface;", "()V", "_clickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "kotlin.jvm.PlatformType", "clickObservable", "Lio/reactivex/Observable;", "getClickObservable", "()Lio/reactivex/Observable;", "headerLayout", "", "getHeaderLayout", "()I", "bindHeaderData", "", "header", "Landroid/view/View;", "headerPosition", "getHeaderPositionForItem", "itemPosition", "(I)Ljava/lang/Integer;", "getItemViewType", "position", "isHeader", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "DailyWeatherViewHolder", "HeaderViewHolder", "ViewType", "app_debug"})
public final class DailyWeatherAdapter extends androidx.recyclerview.widget.ListAdapter<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements com.hoc.weatherapp.utils.ui.HeaderItemDecoration.StickyHeaderInterface {
    private final int headerLayout = com.hoc.weatherapp.R.layout.daily_weather_header_layout;
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather> _clickSubject = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather> clickObservable = null;
    private static final org.threeten.bp.format.DateTimeFormatter HEADER_DATE_FORMATTER = null;
    private static final org.threeten.bp.format.DateTimeFormatter ITEM_DATE_FORMATTER = null;
    private static final int HEADER_TYPE = 1;
    private static final int DAILY_WEATHER_TYPE = 3;
    public static final com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherAdapter.Companion Companion = null;
    
    @java.lang.Override()
    public int getHeaderLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Integer getHeaderPositionForItem(int itemPosition) {
        return null;
    }
    
    @java.lang.Override()
    public void bindHeaderData(@org.jetbrains.annotations.NotNull()
    android.view.View header, int headerPosition) {
    }
    
    @java.lang.Override()
    public boolean isHeader(int itemPosition) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather> getClickObservable() {
        return null;
    }
    
    @com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherAdapter.ViewType()
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, @com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherAdapter.ViewType()
    int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public DailyWeatherAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "textViewDate", "Landroid/widget/TextView;", "bind", "", "header", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Header;", "app_debug"})
    public static final class HeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView textViewDate = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Header header) {
        }
        
        public HeaderViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter$DailyWeatherViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter;Landroid/view/View;)V", "imageIconCityItem", "Landroidx/appcompat/widget/AppCompatImageView;", "textTempMax", "Landroid/widget/TextView;", "textTempMin", "textViewDataTime", "textWeather", "bind", "", "weather", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Weather;", "onClick", "v", "app_debug"})
    public final class DailyWeatherViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final android.widget.TextView textWeather = null;
        private final androidx.appcompat.widget.AppCompatImageView imageIconCityItem = null;
        private final android.widget.TextView textViewDataTime = null;
        private final android.widget.TextView textTempMax = null;
        private final android.widget.TextView textTempMin = null;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Weather weather) {
        }
        
        public DailyWeatherViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @androidx.annotation.IntDef(value = {1, 3})
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter$ViewType;", "", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface ViewType {
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J1\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherAdapter$Companion;", "", "()V", "DAILY_WEATHER_TYPE", "", "HEADER_DATE_FORMATTER", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "HEADER_TYPE", "ITEM_DATE_FORMATTER", "bindHeader", "", "textView", "Landroid/widget/TextView;", "headerItem", "Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Header;", "itemView", "Landroid/view/View;", "iconBackgroundColor", "(Landroid/widget/TextView;Lcom/hoc/weatherapp/ui/main/fivedayforecast/DailyWeatherListItem$Header;Landroid/view/View;Ljava/lang/Integer;)V", "app_debug"})
    public static final class Companion {
        
        private final void bindHeader(android.widget.TextView textView, com.hoc.weatherapp.ui.main.fivedayforecast.DailyWeatherListItem.Header headerItem, android.view.View itemView, @androidx.annotation.ColorInt()
        java.lang.Integer iconBackgroundColor) {
        }
        
        private Companion() {
            super();
        }
    }
}