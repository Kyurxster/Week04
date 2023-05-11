package sg.edu.rp.c346.id22020995.week04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    //initiate variables
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link variables
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get time
                int hour = tp.getHour();
                int minute = tp.getMinute();

                //set time display
                String timeDisplay = String.format("Time is %d:%d", hour, minute);
                tvDisplay.setText(timeDisplay);
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get date
                int year = dp.getYear();
                int month = dp.getMonth();
                int day = dp.getDayOfMonth();
                //set date display
                String dateDisplay = String.format("Date is %d / %d / %d", day, month, year);
                tvDisplay.setText(dateDisplay);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //set time to 12AM
                tp.setHour(0);
                tp.setMinute(0);
                //set date to jan 01, 2020
                dp.updateDate(2020,0, 1);
            }
        });

    }
}