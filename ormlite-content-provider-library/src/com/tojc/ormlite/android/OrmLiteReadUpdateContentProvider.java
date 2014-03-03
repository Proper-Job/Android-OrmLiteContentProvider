package com.tojc.ormlite.android;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.tojc.ormlite.android.framework.MatcherPattern;
import com.tojc.ormlite.android.framework.OperationParameters.DeleteParameters;
import com.tojc.ormlite.android.framework.OperationParameters.InsertParameters;

public abstract class OrmLiteReadUpdateContentProvider<T extends OrmLiteSqliteOpenHelper> extends OrmLiteSimpleContentProvider<T> {
	/*
     * @see
     * com.tojc.ormlite.android.OrmLiteDefaultContentProvider#onInsert(com.j256
     * .ormlite.android. apptools.OrmLiteSqliteOpenHelper,
     * com.tojc.ormlite.android.framework.MatcherPattern,
     * com.tojc.ormlite.android.framework.OperationParameters.InsertParameters)
     */
    @Override
    public Uri onInsert(T helper, SQLiteDatabase db, MatcherPattern target, InsertParameters parameter) {
        return null;
    }

    /*
     * @see
     * com.tojc.ormlite.android.OrmLiteDefaultContentProvider#onDelete(com.j256
     * .ormlite.android. apptools.OrmLiteSqliteOpenHelper,
     * com.tojc.ormlite.android.framework.MatcherPattern,
     * com.tojc.ormlite.android.framework.OperationParameters.DeleteParameters)
     */
    @Override
    public int onDelete(T helper, SQLiteDatabase db, MatcherPattern target, DeleteParameters parameter) {
        return 0;
    }
    
    /*
     * @see android.content.ContentProvider#insert(android.net.Uri, android.content.ContentValues)
     */
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    /*
     * @see android.content.ContentProvider#delete(android.net.Uri, java.lang.String,
     * java.lang.String[])
     */
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    /*
     * @see android.content.ContentProvider#bulkInsert(android.net.Uri,
     * android.content.ContentValues[])
     */
    @Override
    public int bulkInsert(Uri uri, ContentValues[] values) {
        return 0;
    }

    /**
     * You implement this method. At the timing of bulkInsert() method, which calls the
     * onBulkInsert(). Start the transaction, will be called for each record.
     * @param helper
     *            This is a helper object. It is the same as one that can be retrieved by
     *            this.getHelper().
     * @param db
     *            This is a SQLiteDatabase object. Return the object obtained by
     *            helper.getWritableDatabase().
     * @param target
     *            It is MatcherPattern objects that match to evaluate Uri by UriMatcher. You can
     *            access information in the tables and columns, ContentUri, MimeType etc.
     * @param parameter
     *            Arguments passed to the insert() method.
     * @return Please set value to be returned in the original insert() method.
     */
    @Override
    public Uri onBulkInsert(T helper, SQLiteDatabase db, MatcherPattern target, InsertParameters parameter) {
        return null;
    }
	
}
