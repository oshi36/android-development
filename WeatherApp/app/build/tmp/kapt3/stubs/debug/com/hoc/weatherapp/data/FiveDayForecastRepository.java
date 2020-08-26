package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\u00040\u0003H&J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00050\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/hoc/weatherapp/data/FiveDayForecastRepository;", "", "getFiveDayForecastOfSelectedCity", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/utils/Optional;", "Lkotlin/Pair;", "Lcom/hoc/weatherapp/data/models/entity/City;", "", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "refreshFiveDayForecastOfSelectedCity", "Lio/reactivex/Single;", "app_debug"})
public abstract interface FiveDayForecastRepository {
    
    /**
     * Get stream of five day weather, get from local database
     * @return [Observable] emit [None] when having no selected city, otherwise emit [Some] of [DailyWeather]s with [City]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>>> getFiveDayForecastOfSelectedCity();
    
    /**
     * Refresh five day forecast of selected city, get from api
     * @return [Single] emit result or error, emit [NoSelectedCityException] when having no selected city
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Pair<com.hoc.weatherapp.data.models.entity.City, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>> refreshFiveDayForecastOfSelectedCity();
}