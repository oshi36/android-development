package com.hoc.weatherapp.data.local;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hoc.weatherapp.data.models.entity.City;
import com.hoc.weatherapp.data.models.entity.CityAndCurrentWeather;
import com.hoc.weatherapp.data.models.entity.CurrentWeather;
import io.reactivex.Observable;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CurrentWeatherDao_Impl extends CurrentWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CurrentWeather> __insertionAdapterOfCurrentWeather;

  private final EntityDeletionOrUpdateAdapter<CurrentWeather> __updateAdapterOfCurrentWeather;

  public CurrentWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCurrentWeather = new EntityInsertionAdapter<CurrentWeather>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `current_weathers` (`city_id`,`cloudiness`,`main`,`description`,`icon`,`temperature`,`pressure`,`humidity`,`temperature_min`,`temperature_max`,`win_speed`,`win_degrees`,`data_time`,`rain_volume_for_last_3_hours`,`snow_volume_for_last_3_hours`,`visibilityKm`,`sunrise`,`sunset`,`weather_condition_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeather value) {
        stmt.bindLong(1, value.getCityId());
        stmt.bindLong(2, value.getCloudiness());
        if (value.getMain() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMain());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIcon());
        }
        stmt.bindDouble(6, value.getTemperature());
        stmt.bindDouble(7, value.getPressure());
        stmt.bindLong(8, value.getHumidity());
        stmt.bindDouble(9, value.getTemperatureMin());
        stmt.bindDouble(10, value.getTemperatureMax());
        stmt.bindDouble(11, value.getWinSpeed());
        stmt.bindDouble(12, value.getWinDegrees());
        final Long _tmp;
        _tmp = Converters.INSTANCE.dateToTimestamp(value.getDataTime());
        if (_tmp == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp);
        }
        stmt.bindDouble(14, value.getRainVolumeForThe3Hours());
        stmt.bindDouble(15, value.getSnowVolumeForThe3Hours());
        stmt.bindDouble(16, value.getVisibility());
        final Long _tmp_1;
        _tmp_1 = Converters.INSTANCE.dateToTimestamp(value.getSunrise());
        if (_tmp_1 == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = Converters.INSTANCE.dateToTimestamp(value.getSunset());
        if (_tmp_2 == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, _tmp_2);
        }
        stmt.bindLong(19, value.getWeatherConditionId());
      }
    };
    this.__updateAdapterOfCurrentWeather = new EntityDeletionOrUpdateAdapter<CurrentWeather>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `current_weathers` SET `city_id` = ?,`cloudiness` = ?,`main` = ?,`description` = ?,`icon` = ?,`temperature` = ?,`pressure` = ?,`humidity` = ?,`temperature_min` = ?,`temperature_max` = ?,`win_speed` = ?,`win_degrees` = ?,`data_time` = ?,`rain_volume_for_last_3_hours` = ?,`snow_volume_for_last_3_hours` = ?,`visibilityKm` = ?,`sunrise` = ?,`sunset` = ?,`weather_condition_id` = ? WHERE `city_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CurrentWeather value) {
        stmt.bindLong(1, value.getCityId());
        stmt.bindLong(2, value.getCloudiness());
        if (value.getMain() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMain());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getIcon());
        }
        stmt.bindDouble(6, value.getTemperature());
        stmt.bindDouble(7, value.getPressure());
        stmt.bindLong(8, value.getHumidity());
        stmt.bindDouble(9, value.getTemperatureMin());
        stmt.bindDouble(10, value.getTemperatureMax());
        stmt.bindDouble(11, value.getWinSpeed());
        stmt.bindDouble(12, value.getWinDegrees());
        final Long _tmp;
        _tmp = Converters.INSTANCE.dateToTimestamp(value.getDataTime());
        if (_tmp == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindLong(13, _tmp);
        }
        stmt.bindDouble(14, value.getRainVolumeForThe3Hours());
        stmt.bindDouble(15, value.getSnowVolumeForThe3Hours());
        stmt.bindDouble(16, value.getVisibility());
        final Long _tmp_1;
        _tmp_1 = Converters.INSTANCE.dateToTimestamp(value.getSunrise());
        if (_tmp_1 == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindLong(17, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = Converters.INSTANCE.dateToTimestamp(value.getSunset());
        if (_tmp_2 == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindLong(18, _tmp_2);
        }
        stmt.bindLong(19, value.getWeatherConditionId());
        stmt.bindLong(20, value.getCityId());
      }
    };
  }

  @Override
  public long insertCurrentWeather(final CurrentWeather currentWeather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCurrentWeather.insertAndReturnId(currentWeather);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCurrentWeather(final CurrentWeather currentWeather) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCurrentWeather.handle(currentWeather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsert(final CurrentWeather weather) {
    __db.beginTransaction();
    try {
      CurrentWeatherDao_Impl.super.upsert(weather);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Observable<CityAndCurrentWeather> getCityAndCurrentWeatherByCityId(final long cityId) {
    final String _sql = "SELECT * FROM current_weathers INNER JOIN cities ON current_weathers.city_id = cities.id\n"
            + "                WHERE city_id = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, cityId);
    return RxRoom.createObservable(__db, false, new String[]{"current_weathers","cities"}, new Callable<CityAndCurrentWeather>() {
      @Override
      public CityAndCurrentWeather call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "city_id");
          final int _cursorIndexOfCloudiness = CursorUtil.getColumnIndexOrThrow(_cursor, "cloudiness");
          final int _cursorIndexOfMain = CursorUtil.getColumnIndexOrThrow(_cursor, "main");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfTemperatureMin = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_min");
          final int _cursorIndexOfTemperatureMax = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_max");
          final int _cursorIndexOfWinSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "win_speed");
          final int _cursorIndexOfWinDegrees = CursorUtil.getColumnIndexOrThrow(_cursor, "win_degrees");
          final int _cursorIndexOfDataTime = CursorUtil.getColumnIndexOrThrow(_cursor, "data_time");
          final int _cursorIndexOfRainVolumeForThe3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "rain_volume_for_last_3_hours");
          final int _cursorIndexOfSnowVolumeForThe3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "snow_volume_for_last_3_hours");
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibilityKm");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfWeatherConditionId = CursorUtil.getColumnIndexOrThrow(_cursor, "weather_condition_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "zone_id");
          final CityAndCurrentWeather _result;
          if(_cursor.moveToFirst()) {
            final CurrentWeather _tmpCurrentWeather;
            if (! (_cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfCloudiness) && _cursor.isNull(_cursorIndexOfMain) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIcon) && _cursor.isNull(_cursorIndexOfTemperature) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfTemperatureMin) && _cursor.isNull(_cursorIndexOfTemperatureMax) && _cursor.isNull(_cursorIndexOfWinSpeed) && _cursor.isNull(_cursorIndexOfWinDegrees) && _cursor.isNull(_cursorIndexOfDataTime) && _cursor.isNull(_cursorIndexOfRainVolumeForThe3Hours) && _cursor.isNull(_cursorIndexOfSnowVolumeForThe3Hours) && _cursor.isNull(_cursorIndexOfVisibility) && _cursor.isNull(_cursorIndexOfSunrise) && _cursor.isNull(_cursorIndexOfSunset) && _cursor.isNull(_cursorIndexOfWeatherConditionId))) {
              final long _tmpCityId;
              _tmpCityId = _cursor.getLong(_cursorIndexOfCityId);
              final long _tmpCloudiness;
              _tmpCloudiness = _cursor.getLong(_cursorIndexOfCloudiness);
              final String _tmpMain;
              _tmpMain = _cursor.getString(_cursorIndexOfMain);
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpIcon;
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
              final double _tmpTemperature;
              _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
              final double _tmpPressure;
              _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
              final long _tmpHumidity;
              _tmpHumidity = _cursor.getLong(_cursorIndexOfHumidity);
              final double _tmpTemperatureMin;
              _tmpTemperatureMin = _cursor.getDouble(_cursorIndexOfTemperatureMin);
              final double _tmpTemperatureMax;
              _tmpTemperatureMax = _cursor.getDouble(_cursorIndexOfTemperatureMax);
              final double _tmpWinSpeed;
              _tmpWinSpeed = _cursor.getDouble(_cursorIndexOfWinSpeed);
              final double _tmpWinDegrees;
              _tmpWinDegrees = _cursor.getDouble(_cursorIndexOfWinDegrees);
              final Date _tmpDataTime;
              final Long _tmp;
              if (_cursor.isNull(_cursorIndexOfDataTime)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getLong(_cursorIndexOfDataTime);
              }
              _tmpDataTime = Converters.INSTANCE.fromTimestamp(_tmp);
              final double _tmpRainVolumeForThe3Hours;
              _tmpRainVolumeForThe3Hours = _cursor.getDouble(_cursorIndexOfRainVolumeForThe3Hours);
              final double _tmpSnowVolumeForThe3Hours;
              _tmpSnowVolumeForThe3Hours = _cursor.getDouble(_cursorIndexOfSnowVolumeForThe3Hours);
              final double _tmpVisibility;
              _tmpVisibility = _cursor.getDouble(_cursorIndexOfVisibility);
              final Date _tmpSunrise;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfSunrise)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfSunrise);
              }
              _tmpSunrise = Converters.INSTANCE.fromTimestamp(_tmp_1);
              final Date _tmpSunset;
              final Long _tmp_2;
              if (_cursor.isNull(_cursorIndexOfSunset)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getLong(_cursorIndexOfSunset);
              }
              _tmpSunset = Converters.INSTANCE.fromTimestamp(_tmp_2);
              final long _tmpWeatherConditionId;
              _tmpWeatherConditionId = _cursor.getLong(_cursorIndexOfWeatherConditionId);
              _tmpCurrentWeather = new CurrentWeather(_tmpCityId,_tmpCloudiness,_tmpMain,_tmpDescription,_tmpIcon,_tmpTemperature,_tmpPressure,_tmpHumidity,_tmpTemperatureMin,_tmpTemperatureMax,_tmpWinSpeed,_tmpWinDegrees,_tmpDataTime,_tmpRainVolumeForThe3Hours,_tmpSnowVolumeForThe3Hours,_tmpVisibility,_tmpSunrise,_tmpSunset,_tmpWeatherConditionId);
            }  else  {
              _tmpCurrentWeather = null;
            }
            final City _tmpCity;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfZoneId))) {
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpCountry;
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              final double _tmpLng;
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
              final String _tmpZoneId;
              _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
              _tmpCity = new City(_tmpId,_tmpName,_tmpCountry,_tmpLat,_tmpLng,_tmpZoneId);
            }  else  {
              _tmpCity = null;
            }
            _result = new CityAndCurrentWeather();
            _result.currentWeather = _tmpCurrentWeather;
            _result.city = _tmpCity;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Observable<List<CityAndCurrentWeather>> getAllCityAndCurrentWeathers(
      final String querySearch) {
    final String _sql = "SELECT * FROM current_weathers INNER JOIN cities ON current_weathers.city_id = cities.id\n"
            + "            WHERE cities.name LIKE '%' || ? || '%'\n"
            + "                   OR cities.country LIKE '%' || ? || '%'\n"
            + "                   OR current_weathers.description LIKE '%' || ? || '%'\n"
            + "                   OR current_weathers.main LIKE '%' || ? || '%'\n"
            + "            ORDER BY city_id";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 4);
    int _argIndex = 1;
    if (querySearch == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, querySearch);
    }
    _argIndex = 2;
    if (querySearch == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, querySearch);
    }
    _argIndex = 3;
    if (querySearch == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, querySearch);
    }
    _argIndex = 4;
    if (querySearch == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, querySearch);
    }
    return RxRoom.createObservable(__db, false, new String[]{"current_weathers","cities"}, new Callable<List<CityAndCurrentWeather>>() {
      @Override
      public List<CityAndCurrentWeather> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "city_id");
          final int _cursorIndexOfCloudiness = CursorUtil.getColumnIndexOrThrow(_cursor, "cloudiness");
          final int _cursorIndexOfMain = CursorUtil.getColumnIndexOrThrow(_cursor, "main");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfTemperatureMin = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_min");
          final int _cursorIndexOfTemperatureMax = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_max");
          final int _cursorIndexOfWinSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "win_speed");
          final int _cursorIndexOfWinDegrees = CursorUtil.getColumnIndexOrThrow(_cursor, "win_degrees");
          final int _cursorIndexOfDataTime = CursorUtil.getColumnIndexOrThrow(_cursor, "data_time");
          final int _cursorIndexOfRainVolumeForThe3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "rain_volume_for_last_3_hours");
          final int _cursorIndexOfSnowVolumeForThe3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "snow_volume_for_last_3_hours");
          final int _cursorIndexOfVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "visibilityKm");
          final int _cursorIndexOfSunrise = CursorUtil.getColumnIndexOrThrow(_cursor, "sunrise");
          final int _cursorIndexOfSunset = CursorUtil.getColumnIndexOrThrow(_cursor, "sunset");
          final int _cursorIndexOfWeatherConditionId = CursorUtil.getColumnIndexOrThrow(_cursor, "weather_condition_id");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "country");
          final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
          final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
          final int _cursorIndexOfZoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "zone_id");
          final List<CityAndCurrentWeather> _result = new ArrayList<CityAndCurrentWeather>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CityAndCurrentWeather _item;
            final CurrentWeather _tmpCurrentWeather;
            if (! (_cursor.isNull(_cursorIndexOfCityId) && _cursor.isNull(_cursorIndexOfCloudiness) && _cursor.isNull(_cursorIndexOfMain) && _cursor.isNull(_cursorIndexOfDescription) && _cursor.isNull(_cursorIndexOfIcon) && _cursor.isNull(_cursorIndexOfTemperature) && _cursor.isNull(_cursorIndexOfPressure) && _cursor.isNull(_cursorIndexOfHumidity) && _cursor.isNull(_cursorIndexOfTemperatureMin) && _cursor.isNull(_cursorIndexOfTemperatureMax) && _cursor.isNull(_cursorIndexOfWinSpeed) && _cursor.isNull(_cursorIndexOfWinDegrees) && _cursor.isNull(_cursorIndexOfDataTime) && _cursor.isNull(_cursorIndexOfRainVolumeForThe3Hours) && _cursor.isNull(_cursorIndexOfSnowVolumeForThe3Hours) && _cursor.isNull(_cursorIndexOfVisibility) && _cursor.isNull(_cursorIndexOfSunrise) && _cursor.isNull(_cursorIndexOfSunset) && _cursor.isNull(_cursorIndexOfWeatherConditionId))) {
              final long _tmpCityId;
              _tmpCityId = _cursor.getLong(_cursorIndexOfCityId);
              final long _tmpCloudiness;
              _tmpCloudiness = _cursor.getLong(_cursorIndexOfCloudiness);
              final String _tmpMain;
              _tmpMain = _cursor.getString(_cursorIndexOfMain);
              final String _tmpDescription;
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
              final String _tmpIcon;
              _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
              final double _tmpTemperature;
              _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
              final double _tmpPressure;
              _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
              final long _tmpHumidity;
              _tmpHumidity = _cursor.getLong(_cursorIndexOfHumidity);
              final double _tmpTemperatureMin;
              _tmpTemperatureMin = _cursor.getDouble(_cursorIndexOfTemperatureMin);
              final double _tmpTemperatureMax;
              _tmpTemperatureMax = _cursor.getDouble(_cursorIndexOfTemperatureMax);
              final double _tmpWinSpeed;
              _tmpWinSpeed = _cursor.getDouble(_cursorIndexOfWinSpeed);
              final double _tmpWinDegrees;
              _tmpWinDegrees = _cursor.getDouble(_cursorIndexOfWinDegrees);
              final Date _tmpDataTime;
              final Long _tmp;
              if (_cursor.isNull(_cursorIndexOfDataTime)) {
                _tmp = null;
              } else {
                _tmp = _cursor.getLong(_cursorIndexOfDataTime);
              }
              _tmpDataTime = Converters.INSTANCE.fromTimestamp(_tmp);
              final double _tmpRainVolumeForThe3Hours;
              _tmpRainVolumeForThe3Hours = _cursor.getDouble(_cursorIndexOfRainVolumeForThe3Hours);
              final double _tmpSnowVolumeForThe3Hours;
              _tmpSnowVolumeForThe3Hours = _cursor.getDouble(_cursorIndexOfSnowVolumeForThe3Hours);
              final double _tmpVisibility;
              _tmpVisibility = _cursor.getDouble(_cursorIndexOfVisibility);
              final Date _tmpSunrise;
              final Long _tmp_1;
              if (_cursor.isNull(_cursorIndexOfSunrise)) {
                _tmp_1 = null;
              } else {
                _tmp_1 = _cursor.getLong(_cursorIndexOfSunrise);
              }
              _tmpSunrise = Converters.INSTANCE.fromTimestamp(_tmp_1);
              final Date _tmpSunset;
              final Long _tmp_2;
              if (_cursor.isNull(_cursorIndexOfSunset)) {
                _tmp_2 = null;
              } else {
                _tmp_2 = _cursor.getLong(_cursorIndexOfSunset);
              }
              _tmpSunset = Converters.INSTANCE.fromTimestamp(_tmp_2);
              final long _tmpWeatherConditionId;
              _tmpWeatherConditionId = _cursor.getLong(_cursorIndexOfWeatherConditionId);
              _tmpCurrentWeather = new CurrentWeather(_tmpCityId,_tmpCloudiness,_tmpMain,_tmpDescription,_tmpIcon,_tmpTemperature,_tmpPressure,_tmpHumidity,_tmpTemperatureMin,_tmpTemperatureMax,_tmpWinSpeed,_tmpWinDegrees,_tmpDataTime,_tmpRainVolumeForThe3Hours,_tmpSnowVolumeForThe3Hours,_tmpVisibility,_tmpSunrise,_tmpSunset,_tmpWeatherConditionId);
            }  else  {
              _tmpCurrentWeather = null;
            }
            final City _tmpCity;
            if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfCountry) && _cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfZoneId))) {
              final long _tmpId;
              _tmpId = _cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              _tmpName = _cursor.getString(_cursorIndexOfName);
              final String _tmpCountry;
              _tmpCountry = _cursor.getString(_cursorIndexOfCountry);
              final double _tmpLat;
              _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
              final double _tmpLng;
              _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
              final String _tmpZoneId;
              _tmpZoneId = _cursor.getString(_cursorIndexOfZoneId);
              _tmpCity = new City(_tmpId,_tmpName,_tmpCountry,_tmpLat,_tmpLng,_tmpZoneId);
            }  else  {
              _tmpCity = null;
            }
            _item = new CityAndCurrentWeather();
            _item.currentWeather = _tmpCurrentWeather;
            _item.city = _tmpCity;
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
