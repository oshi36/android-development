package com.hoc.weatherapp.ui.map;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/hoc/weatherapp/ui/map/MapActivity;", "Lcom/hoc/weatherapp/ui/BaseAppCompatActivity;", "()V", "cityRepository", "Lcom/hoc/weatherapp/data/CityRepository;", "getCityRepository", "()Lcom/hoc/weatherapp/data/CityRepository;", "cityRepository$delegate", "Lkotlin/Lazy;", "loadMap", "", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "app_debug"})
public final class MapActivity extends com.hoc.weatherapp.ui.BaseAppCompatActivity {
    private final kotlin.Lazy cityRepository$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.hoc.weatherapp.data.CityRepository getCityRepository() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void loadMap(com.hoc.weatherapp.data.models.entity.City city) {
    }
    
    public MapActivity() {
        super(false);
    }
}