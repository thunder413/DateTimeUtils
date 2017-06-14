package com.github.thunder413.datetimeutilssample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.thunder413.datetimeutils.DateTimeStyle;
import com.github.thunder413.datetimeutils.DateTimeUnits;
import com.github.thunder413.datetimeutils.DateTimeUtils;

import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Date date = new Date();
        Log.d(TAG,"Date To String >> "+DateTimeUtils.formatDate(new Date()));
        Log.d(TAG,"String To Date >> "+DateTimeUtils.formatDate("2017-06-13 04:14:49"));
        Log.d(TAG,"IsToDay >> "+DateTimeUtils.isToday(new Date()));
        Log.d(TAG,"IsToDay String >> "+DateTimeUtils.isToday("2017-06-15 04:14:49"));
        Log.d(TAG,"IsYesterdaY Date >> "+DateTimeUtils.isYesterday(new Date()));
        Log.d(TAG,"IsYesterdaY String >> "+DateTimeUtils.isYesterday("2017-06-12 04:14:49"));
        Log.d(TAG,"TimeAgo String >> "+DateTimeUtils.getTimeAgo(this,"2017-06-13 04:14:49"));
        Log.d(TAG,"TimeAgo Date >> "+DateTimeUtils.getTimeAgo(this,date));
        Log.d(TAG,"Diff in milliseconds >> "+DateTimeUtils.getDateDiff(new Date(),DateTimeUtils.formatDate("2017-06-13 04:14:49"), DateTimeUnits.MILLISECONDS));
        Log.d(TAG,"Diff in seconds >> "+DateTimeUtils.getDateDiff(new Date(),DateTimeUtils.formatDate("2017-06-13 04:14:49"), DateTimeUnits.SECONDS));
        Log.d(TAG,"Diff in minutes >> "+DateTimeUtils.getDateDiff(new Date(),DateTimeUtils.formatDate("2017-06-13 04:14:49"), DateTimeUnits.MINUTES));
        Log.d(TAG,"Diff in hours >> "+DateTimeUtils.getDateDiff(new Date(),DateTimeUtils.formatDate("2017-06-13 04:14:49"), DateTimeUnits.HOURS));
        Log.d(TAG,"Diff in days >> "+DateTimeUtils.getDateDiff(new Date(),DateTimeUtils.formatDate("2017-06-13 04:14:49"), DateTimeUnits.DAYS));
        Log.d(TAG,"Extract time from date >> "+DateTimeUtils.formatTime(new Date()));
        Log.d(TAG,"Extract time from dateString >> "+DateTimeUtils.formatTime("2017-06-13 04:14:49"));
        Log.d(TAG,"Millis to time  >> "+DateTimeUtils.millisToTime(25416660));
        Log.d(TAG,"Time to millis  >> "+DateTimeUtils.timeToMillis("14:20"));
        Log.d(TAG,"Revert Millis to time  >> "+DateTimeUtils.millisToTime(860000));
        Log.d(TAG,"FormatWithStyle  FULL >> "+DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.FULL));
        Log.d(TAG,"FormatWithStyle  LONG >> "+DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.LONG));
        Log.d(TAG,"FormatWithStyle  MEDIUM >> "+DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.MEDIUM));
        Log.d(TAG,"FormatWithStyle  SHORT >> "+DateTimeUtils.formatWithStyle(new Date(), DateTimeStyle.SHORT));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
