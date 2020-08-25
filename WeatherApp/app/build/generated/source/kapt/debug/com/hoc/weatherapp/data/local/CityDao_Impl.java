package com.hoc.weatherapp.data.local;

import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hoc.weatherapp.data.models.entity.City;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CityDao_Impl extends CityDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<City> __insertionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __deletionAdapterOfCity;

  private final EntityDeletionOrUpdateAdapter<City> __updateAdapterOfCity;

  public CityDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCity = new EntityInsertionAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `cities` (`id`,`name`,`country`,`lat`,`lng`,`zone_id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountry());
        }
        stmt.bindDouble(4, value.getLat());
        stmt.bindDouble(5, value.getLng());
        if (value.getZoneId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getZoneId());
        }
      }
    };
    this.__deletionAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `cities` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCity = new EntityDeletionOrUpdateAdapter<City>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `cities` SET `id` = ?,`name` = ?,`country` = ?,`lat` = ?,`lng` = ?,`zone_id` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, City value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getCountry() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCountry());
        }
        stmt.bindDouble(4, value.getLat());
        stmt.bindDouble(5, value.getLng());
        if (value.getZoneId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getZoneId());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public long insertCity(final City city) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfCity.insertAndReturnId(city);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteCity(final City city) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfCity.handle(city);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateCity(final City city) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfCity.handle(city);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsert(final City city) {
    __db.beginTransaction();
    try {
      CityDao_Impl.super.upsert(city);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
