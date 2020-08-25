package com.hoc.weatherapp.worker;

import java.lang.System;

/**
 * Worker util
 * Enqueue and cancel update weather worker
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0082\bJ\b\u0010\u000f\u001a\u00020\tH\u0007J\b\u0010\u0010\u001a\u00020\tH\u0007J-\u0010\u0011\u001a\u00020\t\"\b\b\u0000\u0010\f*\u00020\u0001*\b\u0012\u0004\u0012\u0002H\f0\u00042\u000e\b\u0004\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013H\u0082\f\u00a8\u0006\u0015"}, d2 = {"Lcom/hoc/weatherapp/worker/WorkerUtil;", "", "()V", "cancelAllWorkByTag", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/Operation$State$SUCCESS;", "tag", "", "cancelUpdateCurrentWeatherWorkRequest", "", "cancelUpdateDailyWeatherWorkRequest", "enqueuePeriodic", "T", "Landroidx/work/ListenableWorker;", "uniqueName", "enqueueUpdateCurrentWeatherWorkRequest", "enqueueUpdateDailyWeatherWorkRequest", "then", "listener", "Lkotlin/Function0;", "DirectExecutor", "app_debug"})
public final class WorkerUtil {
    public static final com.hoc.weatherapp.worker.WorkerUtil INSTANCE = null;
    
    /**
     */
    private final <T extends java.lang.Object>void then(@org.jetbrains.annotations.NotNull()
    com.google.common.util.concurrent.ListenableFuture<T> $this$then, kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    /**
     * @param [tag] The tag used to identify the work
     * @return A [ListenableFuture] with information about [Operation]
     * [Operation.State.SUCCESS] state.
     */
    private static final com.google.common.util.concurrent.ListenableFuture<androidx.work.Operation.State.SUCCESS> cancelAllWorkByTag(java.lang.String tag) {
        return null;
    }
    
    /**
     * Enqueue update current weather work request
     */
    public static final void enqueueUpdateCurrentWeatherWorkRequest() {
    }
    
    /**
     * Enqueue update daily weather work request
     */
    public static final void enqueueUpdateDailyWeatherWorkRequest() {
    }
    
    /**
     * Cancel update current weather work request
     */
    public static final void cancelUpdateCurrentWeatherWorkRequest() {
    }
    
    /**
     * Cancel update daily weather work request
     */
    public static final void cancelUpdateDailyWeatherWorkRequest() {
    }
    
    private WorkerUtil() {
        super();
    }
    
    /**
     * Executor object that runs each task in the thread that invokes
     * [Executor.execute] execute.
     */
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/hoc/weatherapp/worker/WorkerUtil$DirectExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", "", "command", "Ljava/lang/Runnable;", "toString", "", "app_debug"})
    static final class DirectExecutor implements java.util.concurrent.Executor {
        public static final com.hoc.weatherapp.worker.WorkerUtil.DirectExecutor INSTANCE = null;
        
        @java.lang.Override()
        public void execute(@org.jetbrains.annotations.NotNull()
        java.lang.Runnable command) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        private DirectExecutor() {
            super();
        }
    }
}