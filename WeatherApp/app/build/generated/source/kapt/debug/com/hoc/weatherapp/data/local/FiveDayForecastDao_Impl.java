package com.hoc.weatherapp.data.local;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.RxRoom;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hoc.weatherapp.data.models.entity.DailyWeather;
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
public final class FiveDayForecastDao_Impl extends FiveDayForecastDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DailyWeather> __insertionAdapterOfDailyWeather;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDailyWeathersByCityId;

  public FiveDayForecastDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDailyWeather = new EntityInsertionAdapter<DailyWeather>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `five_day_forecast` (`id`,`data_time`,`temperature`,`temperature_min`,`temperature_max`,`pressure`,`sea_level`,`ground_level`,`humidity`,`main`,`description`,`icon`,`cloudiness`,`win_speed`,`win_degrees`,`rain_volume_for_last_3_hours`,`snow_volume_for_last_3_hours`,`city_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DailyWeather value) {
        stmt.bindLong(1, value.getId());
        final Long _tmp;
        _tmp = Converters.INSTANCE.dateToTimestamp(value.getTimeOfDataForecasted());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
        stmt.bindDouble(3, value.getTemperature());
        stmt.bindDouble(4, value.getTemperatureMin());
        stmt.bindDouble(5, value.getTemperatureMax());
        stmt.bindDouble(6, value.getPressure());
        stmt.bindDouble(7, value.getSeaLevel());
        stmt.bindDouble(8, value.getGroundLevel());
        stmt.bindLong(9, value.getHumidity());
        if (value.getMain() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getMain());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getDescription());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getIcon());
        }
        stmt.bindLong(13, value.getCloudiness());
        stmt.bindDouble(14, value.getWindSpeed());
        stmt.bindDouble(15, value.getWinDegrees());
        stmt.bindDouble(16, value.getRainVolumeForTheLast3Hours());
        stmt.bindDouble(17, value.getSnowVolumeForTheLast3Hours());
        stmt.bindLong(18, value.getCityId());
      }
    };
    this.__preparedStmtOfDeleteAllDailyWeathersByCityId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM five_day_forecast WHERE city_id = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertDailyWeathers(final List<DailyWeather> weathers) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfDailyWeather.insert(weathers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteDailyWeathersByCityIdAndInsert(final long cityId,
      final List<DailyWeather> weathers) {
    __db.beginTransaction();
    try {
      FiveDayForecastDao_Impl.super.deleteDailyWeathersByCityIdAndInsert(cityId, weathers);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllDailyWeathersByCityId(final long cityId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDailyWeathersByCityId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, cityId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllDailyWeathersByCityId.release(_stmt);
    }
  }

  @Override
  public Observable<List<DailyWeather>> getAllDailyWeathersByCityId(final long cityId) {
    final String _sql = "SELECT * FROM five_day_forecast WHERE city_id = ? ORDER BY data_time";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, cityId);
    return RxRoom.createObservable(__db, false, new String[]{"five_day_forecast"}, new Callable<List<DailyWeather>>() {
      @Override
      public List<DailyWeather> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTimeOfDataForecasted = CursorUtil.getColumnIndexOrThrow(_cursor, "data_time");
          final int _cursorIndexOfTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature");
          final int _cursorIndexOfTemperatureMin = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_min");
          final int _cursorIndexOfTemperatureMax = CursorUtil.getColumnIndexOrThrow(_cursor, "temperature_max");
          final int _cursorIndexOfPressure = CursorUtil.getColumnIndexOrThrow(_cursor, "pressure");
          final int _cursorIndexOfSeaLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "sea_level");
          final int _cursorIndexOfGroundLevel = CursorUtil.getColumnIndexOrThrow(_cursor, "ground_level");
          final int _cursorIndexOfHumidity = CursorUtil.getColumnIndexOrThrow(_cursor, "humidity");
          final int _cursorIndexOfMain = CursorUtil.getColumnIndexOrThrow(_cursor, "main");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "icon");
          final int _cursorIndexOfCloudiness = CursorUtil.getColumnIndexOrThrow(_cursor, "cloudiness");
          final int _cursorIndexOfWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "win_speed");
          final int _cursorIndexOfWinDegrees = CursorUtil.getColumnIndexOrThrow(_cursor, "win_degrees");
          final int _cursorIndexOfRainVolumeForTheLast3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "rain_volume_for_last_3_hours");
          final int _cursorIndexOfSnowVolumeForTheLast3Hours = CursorUtil.getColumnIndexOrThrow(_cursor, "snow_volume_for_last_3_hours");
          final int _cursorIndexOfCityId = CursorUtil.getColumnIndexOrThrow(_cursor, "city_id");
          final List<DailyWeather> _result = new ArrayList<DailyWeather>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DailyWeather _item;
            final Date _tmpTimeOfDataForecasted;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimeOfDataForecasted)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimeOfDataForecasted);
            }
            _tmpTimeOfDataForecasted = Converters.INSTANCE.fromTimestamp(_tmp);
            final double _tmpTemperature;
            _tmpTemperature = _cursor.getDouble(_cursorIndexOfTemperature);
            final double _tmpTemperatureMin;
            _tmpTemperatureMin = _cursor.getDouble(_cursorIndexOfTemperatureMin);
            final double _tmpTemperatureMax;
            _tmpTemperatureMax = _cursor.getDouble(_cursorIndexOfTemperatureMax);
            final double _tmpPressure;
            _tmpPressure = _cursor.getDouble(_cursorIndexOfPressure);
            final double _tmpSeaLevel;
            _tmpSeaLevel = _cursor.getDouble(_cursorIndexOfSeaLevel);
            final double _tmpGroundLevel;
            _tmpGroundLevel = _cursor.getDouble(_cursorIndexOfGroundLevel);
            final long _tmpHumidity;
            _tmpHumidity = _cursor.getLong(_cursorIndexOfHumidity);
            final String _tmpMain;
            _tmpMain = _cursor.getString(_cursorIndexOfMain);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpIcon;
            _tmpIcon = _cursor.getString(_cursorIndexOfIcon);
            final long _tmpCloudiness;
            _tmpCloudiness = _cursor.getLong(_cursorIndexOfCloudiness);
            final double _tmpWindSpeed;
            _tmpWindSpeed = _cursor.getDouble(_cursorIndexOfWindSpeed);
            final double _tmpWinDegrees;
            _tmpWinDegrees = _cursor.getDouble(_cursorIndexOfWinDegrees);
            final double _tmpRainVolumeForTheLast3Hours;
            _tmpRainVolumeForTheLast3Hours = _cursor.getDouble(_cursorIndexOfRainVolumeForTheLast3Hours);
            final double _tmpSnowVolumeForTheLast3Hours;
            _tmpSnowVolumeForTheLast3Hours = _cursor.getDouble(_cursorIndexOfSnowVolumeForTheLast3Hours);
            final long _tmpCityId;
            _tmpCityId = _cursor.getLong(_cursorIndexOfCityId);
            _item = new DailyWeather(_tmpTimeOfDataForecasted,_tmpTemperature,_tmpTemperatureMin,_tmpTemperatureMax,_tmpPressure,_tmpSeaLevel,_tmpGroundLevel,_tmpHumidity,_tmpMain,_tmpDescription,_tmpIcon,_tmpCloudiness,_tmpWindSpeed,_tmpWinDegrees,_tmpRainVolumeForTheLast3Hours,_tmpSnowVolumeForTheLast3Hours,_tmpCityId);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
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
