package com.example.maciej.flightsearch;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.content.Intent;
/**
 * Created by Maciej on 03.12.2017.
 */

public class CalendarActivity extends AppCompatActivity{
    private static final String TAG="CalendarActivity";
    private CalendarView mCalendarView;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_layout);
        mCalendarView=(CalendarView) findViewById(R.id.calendarView);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView calendarView, int year, int month, int day) {
                String date= year + "/" + (month+1) + "/" +day;
                Intent intent =new Intent(CalendarActivity.this, MainActivity.class);
                intent.putExtra("date",date);
                startActivity(intent);
            }
        });
    }
}
