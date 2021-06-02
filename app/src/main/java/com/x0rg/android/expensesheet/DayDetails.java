package com.x0rg.android.expensesheet;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DayDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item_details);
        Intent dayIntent = getIntent();
        SummaryDay day = (SummaryDay) dayIntent.getSerializableExtra("dayObject");
        updateDetailsUI(day);
    }

    public void updateDetailsUI(SummaryDay day){
        TextView detailsBalance = (TextView) findViewById(R.id.details_balanceNet);
        detailsBalance.setText(day.getBalanceAmount());

        TextView detailsDate = (TextView) findViewById(R.id.details_date);
        detailsDate.setText(day.getDate());


        TextView detailsCredit = (TextView) findViewById(R.id.details_credit);
        detailsCredit.setText(day.getCreditAmount());

        TextView detailsDebt = (TextView) findViewById(R.id.details_debt);
        detailsDebt.setText(day.getDebtAmount());

    }

}
