package com.hoc.weatherapp.utils.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/hoc/weatherapp/utils/ui/SwipeControllerActions;", "", "onLeftClicked", "", "adapterPosition", "", "onRightClicked", "app_debug"})
public abstract interface SwipeControllerActions {
    
    public abstract void onLeftClicked(int adapterPosition);
    
    public abstract void onRightClicked(int adapterPosition);
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 3, xi = 2)
    public final class DefaultImpls {
        
        public static void onLeftClicked(com.hoc.weatherapp.utils.ui.SwipeControllerActions $this, int adapterPosition) {
        }
        
        public static void onRightClicked(com.hoc.weatherapp.utils.ui.SwipeControllerActions $this, int adapterPosition) {
        }
    }
}