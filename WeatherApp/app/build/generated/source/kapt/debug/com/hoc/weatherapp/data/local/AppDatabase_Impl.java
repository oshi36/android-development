package com.hoc.weatherapp.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CityDao _cityDao;

  private volatile CurrentWeatherDao _currentWeatherDao;

  private volatile FiveDayForecastDao _fiveDayForecastDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `current_weathers` (`city_id` INTEGER NOT NULL, `cloudiness` INTEGER NOT NULL, `main` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `temperature` REAL NOT NULL, `pressure` REAL NOT NULL, `humidity` INTEGER NOT NULL, `temperature_min` REAL NOT NULL, `temperature_max` REAL NOT NULL, `win_speed` REAL NOT NULL, `win_degrees` REAL NOT NULL, `data_time` INTEGER NOT NULL, `rain_volume_for_last_3_hours` REAL NOT NULL, `snow_volume_for_last_3_hours` REAL NOT NULL, `visibilityKm` REAL NOT NULL, `sunrise` INTEGER NOT NULL, `sunset` INTEGER NOT NULL, `weather_condition_id` INTEGER NOT NULL, PRIMARY KEY(`city_id`), FOREIGN KEY(`city_id`) REFERENCES `cities`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `cities` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `country` TEXT NOT NULL, `lat` REAL NOT NULL, `lng` REAL NOT NULL, `zone_id` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `five_day_forecast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `data_time` INTEGER NOT NULL, `temperature` REAL NOT NULL, `temperature_min` REAL NOT NULL, `temperature_max` REAL NOT NULL, `pressure` REAL NOT NULL, `sea_level` REAL NOT NULL, `ground_level` REAL NOT NULL, `humidity` INTEGER NOT NULL, `main` TEXT NOT NULL, `description` TEXT NOT NULL, `icon` TEXT NOT NULL, `cloudiness` INTEGER NOT NULL, `win_speed` REAL NOT NULL, `win_degrees` REAL NOT NULL, `rain_volume_for_last_3_hours` REAL NOT NULL, `snow_volume_for_last_3_hours` REAL NOT NULL, `city_id` INTEGER NOT NULL, FOREIGN KEY(`city_id`) REFERENCES `cities`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_five_day_forecast_city_id` ON `five_day_forecast` (`city_id`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7e5c3da2839242b78a4ef22a10b3d97c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `current_weathers`");
        _db.execSQL("DROP TABLE IF EXISTS `cities`");
        _db.execSQL("DROP TABLE IF EXISTS `five_day_forecast`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentWeathers = new HashMap<String, TableInfo.Column>(19);
        _columnsCurrentWeathers.put("city_id", new TableInfo.Column("city_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("cloudiness", new TableInfo.Column("cloudiness", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("main", new TableInfo.Column("main", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("temperature", new TableInfo.Column("temperature", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("pressure", new TableInfo.Column("pressure", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("temperature_min", new TableInfo.Column("temperature_min", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("temperature_max", new TableInfo.Column("temperature_max", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("win_speed", new TableInfo.Column("win_speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("win_degrees", new TableInfo.Column("win_degrees", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("data_time", new TableInfo.Column("data_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("rain_volume_for_last_3_hours", new TableInfo.Column("rain_volume_for_last_3_hours", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("snow_volume_for_last_3_hours", new TableInfo.Column("snow_volume_for_last_3_hours", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("visibilityKm", new TableInfo.Column("visibilityKm", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("sunrise", new TableInfo.Column("sunrise", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("sunset", new TableInfo.Column("sunset", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeathers.put("weather_condition_id", new TableInfo.Column("weather_condition_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeathers = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysCurrentWeathers.add(new TableInfo.ForeignKey("cities", "CASCADE", "NO ACTION",Arrays.asList("city_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesCurrentWeathers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeathers = new TableInfo("current_weathers", _columnsCurrentWeathers, _foreignKeysCurrentWeathers, _indicesCurrentWeathers);
        final TableInfo _existingCurrentWeathers = TableInfo.read(_db, "current_weathers");
        if (! _infoCurrentWeathers.equals(_existingCurrentWeathers)) {
          return new RoomOpenHelper.ValidationResult(false, "current_weathers(com.hoc.weatherapp.data.models.entity.CurrentWeather).\n"
                  + " Expected:\n" + _infoCurrentWeathers + "\n"
                  + " Found:\n" + _existingCurrentWeathers);
        }
        final HashMap<String, TableInfo.Column> _columnsCities = new HashMap<String, TableInfo.Column>(6);
        _columnsCities.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("country", new TableInfo.Column("country", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("lat", new TableInfo.Column("lat", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("lng", new TableInfo.Column("lng", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCities.put("zone_id", new TableInfo.Column("zone_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCities = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCities = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCities = new TableInfo("cities", _columnsCities, _foreignKeysCities, _indicesCities);
        final TableInfo _existingCities = TableInfo.read(_db, "cities");
        if (! _infoCities.equals(_existingCities)) {
          return new RoomOpenHelper.ValidationResult(false, "cities(com.hoc.weatherapp.data.models.entity.City).\n"
                  + " Expected:\n" + _infoCities + "\n"
                  + " Found:\n" + _existingCities);
        }
        final HashMap<String, TableInfo.Column> _columnsFiveDayForecast = new HashMap<String, TableInfo.Column>(18);
        _columnsFiveDayForecast.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("data_time", new TableInfo.Column("data_time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("temperature", new TableInfo.Column("temperature", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("temperature_min", new TableInfo.Column("temperature_min", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("temperature_max", new TableInfo.Column("temperature_max", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("pressure", new TableInfo.Column("pressure", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("sea_level", new TableInfo.Column("sea_level", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("ground_level", new TableInfo.Column("ground_level", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("humidity", new TableInfo.Column("humidity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("main", new TableInfo.Column("main", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("icon", new TableInfo.Column("icon", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("cloudiness", new TableInfo.Column("cloudiness", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("win_speed", new TableInfo.Column("win_speed", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("win_degrees", new TableInfo.Column("win_degrees", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("rain_volume_for_last_3_hours", new TableInfo.Column("rain_volume_for_last_3_hours", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("snow_volume_for_last_3_hours", new TableInfo.Column("snow_volume_for_last_3_hours", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsFiveDayForecast.put("city_id", new TableInfo.Column("city_id", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFiveDayForecast = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysFiveDayForecast.add(new TableInfo.ForeignKey("cities", "CASCADE", "CASCADE",Arrays.asList("city_id"), Arrays.asList("id")));
        final HashSet<TableInfo.Index> _indicesFiveDayForecast = new HashSet<TableInfo.Index>(1);
        _indicesFiveDayForecast.add(new TableInfo.Index("index_five_day_forecast_city_id", false, Arrays.asList("city_id")));
        final TableInfo _infoFiveDayForecast = new TableInfo("five_day_forecast", _columnsFiveDayForecast, _foreignKeysFiveDayForecast, _indicesFiveDayForecast);
        final TableInfo _existingFiveDayForecast = TableInfo.read(_db, "five_day_forecast");
        if (! _infoFiveDayForecast.equals(_existingFiveDayForecast)) {
          return new RoomOpenHelper.ValidationResult(false, "five_day_forecast(com.hoc.weatherapp.data.models.entity.DailyWeather).\n"
                  + " Expected:\n" + _infoFiveDayForecast + "\n"
                  + " Found:\n" + _existingFiveDayForecast);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7e5c3da2839242b78a4ef22a10b3d97c", "d44ed4b2c6b275c7a31ec0a8d3d10238");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "current_weathers","cities","five_day_forecast");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `current_weathers`");
      _db.execSQL("DELETE FROM `cities`");
      _db.execSQL("DELETE FROM `five_day_forecast`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CityDao cityDao() {
    if (_cityDao != null) {
      return _cityDao;
    } else {
      synchronized(this) {
        if(_cityDao == null) {
          _cityDao = new CityDao_Impl(this);
        }
        return _cityDao;
      }
    }
  }

  @Override
  public CurrentWeatherDao weatherDao() {
    if (_currentWeatherDao != null) {
      return _currentWeatherDao;
    } else {
      synchronized(this) {
        if(_currentWeatherDao == null) {
          _currentWeatherDao = new CurrentWeatherDao_Impl(this);
        }
        return _currentWeatherDao;
      }
    }
  }

  @Override
  public FiveDayForecastDao fiveDayForecastDao() {
    if (_fiveDayForecastDao != null) {
      return _fiveDayForecastDao;
    } else {
      synchronized(this) {
        if(_fiveDayForecastDao == null) {
          _fiveDayForecastDao = new FiveDayForecastDao_Impl(this);
        }
        return _fiveDayForecastDao;
      }
    }
  }
}
