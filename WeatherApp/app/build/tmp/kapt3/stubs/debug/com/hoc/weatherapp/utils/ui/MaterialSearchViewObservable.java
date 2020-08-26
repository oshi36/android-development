package com.hoc.weatherapp.utils.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/MaterialSearchViewObservable;", "Lio/reactivex/Observable;", "", "view", "Lcom/miguelcatalan/materialsearchview/MaterialSearchView;", "(Lcom/miguelcatalan/materialsearchview/MaterialSearchView;)V", "subscribeActual", "", "observer", "Lio/reactivex/Observer;", "Listener", "app_debug"})
public final class MaterialSearchViewObservable extends io.reactivex.Observable<java.lang.String> {
    private final com.miguelcatalan.materialsearchview.MaterialSearchView view = null;
    
    @java.lang.Override()
    protected void subscribeActual(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observer<? super java.lang.String> observer) {
    }
    
    public MaterialSearchViewObservable(@org.jetbrains.annotations.NotNull()
    com.miguelcatalan.materialsearchview.MaterialSearchView view) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/MaterialSearchViewObservable$Listener;", "Lio/reactivex/android/MainThreadDisposable;", "Lcom/miguelcatalan/materialsearchview/MaterialSearchView$OnQueryTextListener;", "view", "Lcom/miguelcatalan/materialsearchview/MaterialSearchView;", "observer", "Lio/reactivex/Observer;", "", "(Lcom/miguelcatalan/materialsearchview/MaterialSearchView;Lio/reactivex/Observer;)V", "onDispose", "", "onQueryTextChange", "", "newText", "onQueryTextSubmit", "query", "app_debug"})
    static final class Listener extends io.reactivex.android.MainThreadDisposable implements com.miguelcatalan.materialsearchview.MaterialSearchView.OnQueryTextListener {
        private final com.miguelcatalan.materialsearchview.MaterialSearchView view = null;
        private final io.reactivex.Observer<? super java.lang.String> observer = null;
        
        @java.lang.Override()
        public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
        java.lang.String newText) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
        java.lang.String query) {
            return false;
        }
        
        @java.lang.Override()
        protected void onDispose() {
        }
        
        public Listener(@org.jetbrains.annotations.NotNull()
        com.miguelcatalan.materialsearchview.MaterialSearchView view, @org.jetbrains.annotations.NotNull()
        io.reactivex.Observer<? super java.lang.String> observer) {
            super();
        }
    }
}