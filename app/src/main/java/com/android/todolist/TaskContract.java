package com.android.todolist;

import android.provider.BaseColumns;

/**
 * Created by Sheldon on 3/11/2018.
 */

public class TaskContract {
    public static final String DB_NAME = "com.android.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}