package com.x0rg.android.expensesheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<SummaryDay> days = new ArrayList<SummaryDay>();
        days.add(new SummaryDay(12, 13,14));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(5,6,7));
        days.add(new SummaryDay(7,8,9));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(100,200,300));
        days.add(new SummaryDay(12, 13,14));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(5,6,7));
        days.add(new SummaryDay(7,8,9));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(100,200,300));
        days.add(new SummaryDay(12, 13,14));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(5,6,7));
        days.add(new SummaryDay(7,8,9));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(100,200,300));
        days.add(new SummaryDay(12, 13,14));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(5,6,7));
        days.add(new SummaryDay(7,8,9));
        days.add(new SummaryDay(10,11,12));
        days.add(new SummaryDay(100,200,300));

        SummaryDayAdapter itemsAdapter = new SummaryDayAdapter(this, days);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

    }
}