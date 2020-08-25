package com.hoc.weatherapp.ui.cities;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u0016\u0010\u001c\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0014J\u0016\u0010*\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0019H\u0016J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0019H\u0016J\b\u00100\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u00160\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"}, d2 = {"Lcom/hoc/weatherapp/ui/cities/CitiesActivity;", "Lcom/hoc/weatherapp/ui/BaseMviActivity;", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$View;", "Lcom/hoc/weatherapp/ui/cities/CitiesPresenter;", "()V", "cityAdapter", "Lcom/hoc/weatherapp/ui/cities/CitiesAdapter;", "deletePositionPublishSubject", "Lio/reactivex/subjects/PublishSubject;", "", "kotlin.jvm.PlatformType", "deleteSnackBar", "Lcom/google/android/material/snackbar/Snackbar;", "refreshPositionPublishSubject", "refreshSnackBar", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root$delegate", "Lkotlin/Lazy;", "searchStringInitial", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent$InitialSearchStringIntent;", "snackBar", "changeSelectedCity", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/data/models/entity/City;", "createPresenter", "deleteCityAtPosition", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onStart", "refreshCurrentWeatherAtPosition", "render", "state", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$ViewState;", "searchStringIntent", "Lcom/hoc/weatherapp/ui/cities/CitiesContract$SearchStringIntent;", "setupRecyclerViewCities", "app_debug"})
public final class CitiesActivity extends com.hoc.weatherapp.ui.BaseMviActivity<com.hoc.weatherapp.ui.cities.CitiesContract.View, com.hoc.weatherapp.ui.cities.CitiesPresenter> implements com.hoc.weatherapp.ui.cities.CitiesContract.View {
    private com.google.android.material.snackbar.Snackbar refreshSnackBar;
    private com.google.android.material.snackbar.Snackbar snackBar;
    private com.google.android.material.snackbar.Snackbar deleteSnackBar;
    private final com.hoc.weatherapp.ui.cities.CitiesAdapter cityAdapter = null;
    private final kotlin.Lazy root$delegate = null;
    private final io.reactivex.subjects.PublishSubject<java.lang.Integer> deletePositionPublishSubject = null;
    private final io.reactivex.subjects.PublishSubject<java.lang.Integer> refreshPositionPublishSubject = null;
    private final io.reactivex.subjects.PublishSubject<com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent.InitialSearchStringIntent> searchStringInitial = null;
    private java.util.HashMap _$_findViewCache;
    
    private final android.view.View getRoot() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.cities.CitiesPresenter createPresenter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Integer> refreshCurrentWeatherAtPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Integer> deleteCityAtPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.data.models.entity.City> changeSelectedCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.hoc.weatherapp.ui.cities.CitiesContract.SearchStringIntent> searchStringIntent() {
        return null;
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.cities.CitiesContract.ViewState state) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void setupRecyclerViewCities() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public CitiesActivity() {
        super(false);
    }
}