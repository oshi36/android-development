package com.hoc.weatherapp.ui.cities;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u001c\u0010\u0015\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/hoc/weatherapp/ui/cities/CityListItem;", "Lcom/hoc/weatherapp/ui/cities/CitiesAdapter$ViewHolder;", "()V", "_itemClickSubject", "Lio/reactivex/subjects/PublishSubject;", "Lcom/hoc/weatherapp/data/models/entity/City;", "kotlin.jvm.PlatformType", "itemClickObservable", "Lio/reactivex/Observable;", "getItemClickObservable", "()Lio/reactivex/Observable;", "onBindViewHolder", "", "holder", "position", "", "payloads", "", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class CitiesAdapter extends androidx.recyclerview.widget.ListAdapter<com.hoc.weatherapp.ui.cities.CityListItem, com.hoc.weatherapp.ui.cities.CitiesAdapter.ViewHolder> {
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.data.models.entity.City> _itemClickSubject = null;
    private static final org.threeten.bp.format.DateTimeFormatter TIME_FORMATTER = null;
    public static final com.hoc.weatherapp.ui.cities.CitiesAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.hoc.weatherapp.data.models.entity.City> getItemClickObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.cities.CitiesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.cities.CitiesAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.cities.CitiesAdapter.ViewHolder holder, int position, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Object> payloads) {
    }
    
    public CitiesAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "itemView", "Landroid/view/View;", "(Lcom/hoc/weatherapp/ui/cities/CitiesAdapter;Landroid/view/View;)V", "imageIconCityItem", "Landroidx/appcompat/widget/AppCompatImageView;", "radioButtonSelectedCity", "Landroidx/appcompat/widget/AppCompatRadioButton;", "textLastUpdated", "Landroid/widget/TextView;", "textMain", "textName", "textTemps", "bind", "", "item", "Lcom/hoc/weatherapp/ui/cities/CityListItem;", "onClick", "v", "updateRadio", "isSelected", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final android.widget.TextView textName = null;
        private final android.widget.TextView textMain = null;
        private final android.widget.TextView textLastUpdated = null;
        private final android.widget.TextView textTemps = null;
        private final androidx.appcompat.widget.AppCompatImageView imageIconCityItem = null;
        private final androidx.appcompat.widget.AppCompatRadioButton radioButtonSelectedCity = null;
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.hoc.weatherapp.ui.cities.CityListItem item) {
        }
        
        public final void updateRadio(boolean isSelected) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesAdapter$Companion;", "", "()V", "TIME_FORMATTER", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}