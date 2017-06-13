package com.github.thunder413.datetimeutils;


import android.content.Context;

import java.util.Date;

/**
 * DateTimeStyle
 *
 * Defined style for parsing date into string used by {@link DateTimeUtils#formatWithStyle(Date, DateTimeStyle)}
 * and also {@link DateTimeUtils#getTimeAgo(Context, Date, DateTimeStyle)}
 *
 * @author thunder413
 * @version 1.0
 */
public enum DateTimeStyle {
    /**
     * Style full e.g Tuesday, June 13, 2017
     */
    FULL,
    /**
     * Style long e.g June 13, 2017
     */
    LONG,
    /**
     * Style medium e.g Jun 13, 2017
     */
    MEDIUM,
    /**
     * Style short e.g 06/13/17
     */
    SHORT,
    /**
     * Style for ago time e.g 3h ago
     */
    AGO_SHORT_STRING,
    /**
     * Style for ago time e.g 3 hours ago
     */
    AGO_FULL_STRING
}
