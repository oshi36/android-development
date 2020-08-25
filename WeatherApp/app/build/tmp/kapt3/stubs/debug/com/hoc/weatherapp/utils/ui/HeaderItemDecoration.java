package com.hoc.weatherapp.utils.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\"\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002J \u0010\u0017\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/HeaderItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "listener", "Lcom/hoc/weatherapp/utils/ui/HeaderItemDecoration$StickyHeaderInterface;", "(Lcom/hoc/weatherapp/utils/ui/HeaderItemDecoration$StickyHeaderInterface;)V", "headerView", "Landroid/view/View;", "drawHeader", "", "c", "Landroid/graphics/Canvas;", "header", "fixLayoutSize", "parent", "Landroid/view/ViewGroup;", "view", "getChildInContact", "Landroidx/recyclerview/widget/RecyclerView;", "contactPoint", "", "moveHeader", "currentHeader", "nextHeader", "onDrawOver", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "StickyHeaderInterface", "app_debug"})
public final class HeaderItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    private android.view.View headerView;
    private final com.hoc.weatherapp.utils.ui.HeaderItemDecoration.StickyHeaderInterface listener = null;
    
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void drawHeader(android.graphics.Canvas c, android.view.View header) {
    }
    
    private final void moveHeader(android.graphics.Canvas c, android.view.View currentHeader, android.view.View nextHeader) {
    }
    
    private final android.view.View getChildInContact(androidx.recyclerview.widget.RecyclerView parent, int contactPoint) {
        return null;
    }
    
    private final void fixLayoutSize(android.view.ViewGroup parent, android.view.View view) {
    }
    
    public HeaderItemDecoration(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.utils.ui.HeaderItemDecoration.StickyHeaderInterface listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H&J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0003H&\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0010"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/HeaderItemDecoration$StickyHeaderInterface;", "", "headerLayout", "", "getHeaderLayout", "()I", "bindHeaderData", "", "header", "Landroid/view/View;", "headerPosition", "getHeaderPositionForItem", "itemPosition", "(I)Ljava/lang/Integer;", "isHeader", "", "app_debug"})
    public static abstract interface StickyHeaderInterface {
        
        public abstract int getHeaderLayout();
        
        @org.jetbrains.annotations.Nullable()
        public abstract java.lang.Integer getHeaderPositionForItem(int itemPosition);
        
        public abstract void bindHeaderData(@org.jetbrains.annotations.NotNull()
        android.view.View header, int headerPosition);
        
        public abstract boolean isHeader(int itemPosition);
    }
}