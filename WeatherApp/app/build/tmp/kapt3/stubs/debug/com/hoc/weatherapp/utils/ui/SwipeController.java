package com.hoc.weatherapp.utils.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0002J(\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\fH\u0016J@\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000eH\u0016J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\'\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0010H\u0016J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010,\u001a\u00020\u000eH\u0002J@\u0010-\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000eH\u0003J@\u0010.\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000eH\u0003J@\u0010/\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u000eH\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/SwipeController;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "buttonsActions", "Lcom/hoc/weatherapp/utils/ui/SwipeControllerActions;", "(Lcom/hoc/weatherapp/utils/ui/SwipeControllerActions;)V", "buttonInstance", "Landroid/graphics/RectF;", "buttonShowedState", "Lcom/hoc/weatherapp/utils/ui/ButtonState;", "buttonWidth", "", "currentViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "swipeBack", "", "convertToAbsoluteDirection", "", "flags", "layoutDirection", "drawButtons", "", "c", "Landroid/graphics/Canvas;", "viewHolder", "drawText", "text", "", "button", "p", "Landroid/graphics/Paint;", "getMovementFlags", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onChildDraw", "dX", "dY", "actionState", "isCurrentlyActive", "onDraw", "onMove", "target", "onSwiped", "direction", "setItemsClickable", "isClickable", "setTouchDownListener", "setTouchListener", "setTouchUpListener", "app_debug"})
public final class SwipeController extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
    private com.hoc.weatherapp.utils.ui.ButtonState buttonShowedState = com.hoc.weatherapp.utils.ui.ButtonState.GONE;
    private boolean swipeBack = false;
    private final float buttonWidth = 192.0F;
    private androidx.recyclerview.widget.RecyclerView.ViewHolder currentViewHolder;
    private android.graphics.RectF buttonInstance;
    private final com.hoc.weatherapp.utils.ui.SwipeControllerActions buttonsActions = null;
    
    @java.lang.Override()
    public int getMovementFlags(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override()
    public boolean onMove(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override()
    public void onSwiped(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override()
    public int convertToAbsoluteDirection(int flags, int layoutDirection) {
        return 0;
    }
    
    @java.lang.Override()
    public void onChildDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchListener(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchDownListener(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    private final void setTouchUpListener(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
    
    private final void setItemsClickable(androidx.recyclerview.widget.RecyclerView recyclerView, boolean isClickable) {
    }
    
    private final void drawButtons(android.graphics.Canvas c, androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
    }
    
    private final void drawText(java.lang.String text, android.graphics.Canvas c, android.graphics.RectF button, android.graphics.Paint p) {
    }
    
    public final void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c) {
    }
    
    public SwipeController(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.utils.ui.SwipeControllerActions buttonsActions) {
        super();
    }
}