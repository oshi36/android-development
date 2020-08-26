package com.hoc.weatherapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, xi = 2, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\r\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u000fH&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0011"}, d2 = {"Lcom/hoc/weatherapp/data/CityRepository;", "", "selectedCity", "Lcom/hoc/weatherapp/data/models/entity/City;", "getSelectedCity", "()Lcom/hoc/weatherapp/data/models/entity/City;", "addCityByLatLng", "Lio/reactivex/Single;", "latitude", "", "longitude", "changeSelectedCity", "Lio/reactivex/Completable;", "city", "deleteCity", "Lio/reactivex/Observable;", "Lcom/hoc/weatherapp/utils/Optional;", "app_debug"})
public abstract interface CityRepository {
    
    /**
     * Change selected city to [city]
     * @param city
     * @return a [Completable], emit [SaveSelectedCityError] when error
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable changeSelectedCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    /**
     * Add city by [latitude] and [longitude]
     * @param latitude
     * @param longitude
     * @return a [Single] emit added city or emit error
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.entity.City> addCityByLatLng(double latitude, double longitude);
    
    /**
     * Delete [city]
     * @param city
     * @return a [Single] of deleted city
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.hoc.weatherapp.data.models.entity.City> deleteCity(@org.jetbrains.annotations.NotNull()
    com.hoc.weatherapp.data.models.entity.City city);
    
    /**
     * Get stream of selected city
     * @return [Observable] emit None when having no selected city, otherwise emit Some of [City]
     */
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.hoc.weatherapp.utils.Optional<com.hoc.weatherapp.data.models.entity.City>> getSelectedCity();
    
    /**
     * Synchronous access  selected city
     */
    @org.jetbrains.annotations.Nullable()
    public abstract com.hoc.weatherapp.data.models.entity.City getSelectedCity();
}