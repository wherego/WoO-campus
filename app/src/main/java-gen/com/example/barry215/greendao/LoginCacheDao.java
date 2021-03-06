package com.example.barry215.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.barry215.greendao.LoginCache;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOGIN_CACHE".
*/
public class LoginCacheDao extends AbstractDao<LoginCache, Long> {

    public static final String TABLENAME = "LOGIN_CACHE";

    /**
     * Properties of entity LoginCache.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property IsLogin = new Property(1, Boolean.class, "isLogin", false, "IS_LOGIN");
        public final static Property LastLoginTime = new Property(2, java.util.Date.class, "lastLoginTime", false, "LAST_LOGIN_TIME");
        public final static Property UserId = new Property(3, String.class, "userId", false, "USER_ID");
        public final static Property PlayId = new Property(4, String.class, "playId", false, "PLAY_ID");
    };


    public LoginCacheDao(DaoConfig config) {
        super(config);
    }
    
    public LoginCacheDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOGIN_CACHE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IS_LOGIN\" INTEGER," + // 1: isLogin
                "\"LAST_LOGIN_TIME\" INTEGER," + // 2: lastLoginTime
                "\"USER_ID\" TEXT," + // 3: userId
                "\"PLAY_ID\" TEXT);"); // 4: playId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOGIN_CACHE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, LoginCache entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Boolean isLogin = entity.getIsLogin();
        if (isLogin != null) {
            stmt.bindLong(2, isLogin ? 1L: 0L);
        }
 
        java.util.Date lastLoginTime = entity.getLastLoginTime();
        if (lastLoginTime != null) {
            stmt.bindLong(3, lastLoginTime.getTime());
        }
 
        String userId = entity.getUserId();
        if (userId != null) {
            stmt.bindString(4, userId);
        }
 
        String playId = entity.getPlayId();
        if (playId != null) {
            stmt.bindString(5, playId);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public LoginCache readEntity(Cursor cursor, int offset) {
        LoginCache entity = new LoginCache( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0, // isLogin
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // lastLoginTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // playId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, LoginCache entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setIsLogin(cursor.isNull(offset + 1) ? null : cursor.getShort(offset + 1) != 0);
        entity.setLastLoginTime(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setUserId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPlayId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(LoginCache entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(LoginCache entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
