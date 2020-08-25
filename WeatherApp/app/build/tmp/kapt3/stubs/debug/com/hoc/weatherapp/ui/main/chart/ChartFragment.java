package com.hoc.weatherapp.ui.main.chart;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u0003H\u0016JI\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\b\u0004\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0083\bJ$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u0012*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/hoc/weatherapp/ui/main/chart/ChartFragment;", "Lcom/hannesdorfmann/mosby3/mvi/MviFragment;", "Lcom/hoc/weatherapp/ui/main/chart/ChartContract$View;", "Lcom/hoc/weatherapp/ui/main/chart/ChartPresenter;", "()V", "decimalFormat", "Ljava/text/DecimalFormat;", "labelsFormatter", "Lkotlin/Function1;", "", "", "kotlin.jvm.PlatformType", "createPresenter", "drawChart", "", "lineChartView", "Lcom/db/williamchart/view/LineChartView;", "dailyWeathers", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "transform", "lineColor", "", "gridColor", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "render", "viewState", "Lcom/hoc/weatherapp/ui/main/chart/ChartContract$ViewState;", "getLabels", "Companion", "app_debug"})
public final class ChartFragment extends com.hannesdorfmann.mosby3.mvi.MviFragment<com.hoc.weatherapp.ui.main.chart.ChartContract.View, com.hoc.weatherapp.ui.main.chart.ChartPresenter> implements com.hoc.weatherapp.ui.main.chart.ChartContract.View {
    private final java.text.DecimalFormat decimalFormat = null;
    private final kotlin.jvm.functions.Function1<java.lang.Float, java.lang.String> labelsFormatter = null;
    public static final long animationDuration = 1000L;
    private static final com.hoc.weatherapp.ui.main.chart.ChartFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.main.chart.ChartContract.ViewState viewState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.main.chart.ChartPresenter createPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {com.db.williamchart.ExperimentalFeature.class})
    @android.annotation.SuppressLint(value = {"Range"})
    private final void drawChart(com.db.williamchart.view.LineChartView lineChartView, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> dailyWeathers, kotlin.jvm.functions.Function1<? super com.hoc.weatherapp.data.models.entity.DailyWeather, java.lang.Float> transform, @androidx.annotation.ColorInt()
    int lineColor, @androidx.annotation.ColorInt()
    int gridColor) {
    }
    
    private final java.util.List<java.lang.String> getLabels(@org.jetbrains.annotations.NotNull()
    java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather> $this$getLabels) {
        return null;
    }
    
    public ChartFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/ui/main/chart/ChartFragment$Companion;", "", "()V", "animationDuration", "", "app_debug"})
    static final class Companion {
        
        private Companion() {
            super();
        }
    }
}