package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J(\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\r0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/data/CurrentWeatherRepository;", "", "getAllCityAndCurrentWeathers", "Lio/reactivex/Observable;", "", "Lcom/hoc/weatherapp/data/models/entity/CityAndCurrentWeather;", "querySearch", "", "getSelectedCityAndCurrentWeatherOfSelectedCity", "Lcom/hoc/weatherapp/utils/Optional;", "refreshCurrentWeatherOfSelectedCity", "Lio/reactivex/Single;", "refreshWeatherOf", "Lkotlin/Pair;", "Lcom/hoc/weatherapp/data/models/entity/DailyWeather;", "city", "Lcom/hoc/weatherapp/data/models/entity/City;", "app_debug"})
public abstract interface CurrentWeatherRepository {
    
    /**
     * Refresh both current weather and five day forecast of [city], get from api
     * @return [Single] emit result or error
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<kotlin.Pair<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather, java.util.List<com.hoc.weatherapp.data.models.entity.DailyWeather>>> refreshWeatherOf(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    /**
     * Refresh current weather of selected city, get from api
     * @return [Single] emit result or error ([NoSelectedCityException] when have no selected city)
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather> refreshCurrentWeatherOfSelectedCity();
    
    /**
     * Get pair of selected city and current weather, get from local database
     * @return [Observable] that emits [Optional]s of [CityAndCurrentWeather], None when having no selected city
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getSelectedCityAndCurrentWeatherOfSelectedCity();
    
    /**
     * Get all pair of city and current weather, get from local database
     * @return [Observable] that emits [List]s of [CityAndCurrentWeather]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.util.List<com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather>> getAllCityAndCurrentWeathers(@org.jetbrains.annotations.NotNull()
    java.lang.String querySearch);
}