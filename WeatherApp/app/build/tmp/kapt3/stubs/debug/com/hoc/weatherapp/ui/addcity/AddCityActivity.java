package com.hoc.weatherapp.ui.addcity;

import java.lang.System;

@kotlin.ExperimentalStdlibApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0002:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00070\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000bH\u0002J\b\u0010$\u001a\u00020\u000bH\u0002R4\u0010\u0005\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b \t*\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u000b0\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityActivity;", "Lcom/hoc/weatherapp/ui/BaseMviActivity;", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$View;", "Lcom/hoc/weatherapp/ui/addcity/AddCityPresenter;", "()V", "publishSubjectAutoCompletePlace", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "publishSubjectTriggerAddCurrentLocation", "", "tag", "", "addCityByLatLngIntent", "Lio/reactivex/Observable;", "addCurrentLocationIntent", "createPresenter", "hideProgressbar", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "render", "state", "Lcom/hoc/weatherapp/ui/addcity/AddCityContract$ViewState;", "setupAutoCompletePlace", "showProgressbar", "Companion", "app_debug"})
public final class AddCityActivity extends com.hoc.weatherapp.ui.BaseMviActivity<com.hoc.weatherapp.ui.addcity.AddCityContract.View, com.hoc.weatherapp.ui.addcity.AddCityPresenter> implements com.hoc.weatherapp.ui.addcity.AddCityContract.View {
    private final java.lang.String tag = "addcity";
    private final io.reactivex.subjects.PublishSubject<kotlin.Pair<java.lang.Double, java.lang.Double>> publishSubjectAutoCompletePlace = null;
    private final io.reactivex.subjects.PublishSubject<kotlin.Unit> publishSubjectTriggerAddCurrentLocation = null;
    public static final int REQUEST_CHECK_SETTINGS = 1;
    public static final com.hoc.weatherapp.ui.addcity.AddCityActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Unit> addCurrentLocationIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<kotlin.Pair<java.lang.Double, java.lang.Double>> addCityByLatLngIntent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.hoc.weatherapp.ui.addcity.AddCityPresenter createPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void render(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.ui.addcity.AddCityContract.ViewState state) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupAutoCompletePlace() {
    }
    
    private final void showProgressbar() {
    }
    
    private final void hideProgressbar() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public AddCityActivity() {
        super(false);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/hoc/weatherapp/ui/addcity/AddCityActivity$Companion;", "", "()V", "REQUEST_CHECK_SETTINGS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}