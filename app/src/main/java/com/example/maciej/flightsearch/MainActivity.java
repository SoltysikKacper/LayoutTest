package com.example.maciej.flightsearch;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private TextView theDate;
    private Button btnGoCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        theDate = (TextView) findViewById(R.id.startDate);
        btnGoCalendar = (Button)findViewById(R.id.btnSD);

        Intent incomingIntent=getIntent();
        String date=incomingIntent.getStringExtra("date");
        theDate.setText(date);
        btnGoCalendar.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CalendarActivity.class);
                startActivity(intent);
            }
        });
    }

}
