package com.x0rg.android.expensesheet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SummaryDayAdapter extends ArrayAdapter<SummaryDay> {

    public SummaryDayAdapter(Context context, ArrayList<SummaryDay> days) {
        super(context,0, days);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        SummaryDay currentDay = getItem(position);

        TextView todayBalance = (TextView) listItemView.findViewById(R.id.today_balance);
        todayBalance.setText(currentDay.getBalanceAmount());

        TextView todayCredit = (TextView) listItemView.findViewById(R.id.today_credit);
        todayCredit.setText(currentDay.getCreditAmount());

        TextView todayDebt = (TextView) listItemView.findViewById(R.id.today_debt);
        todayDebt.setText(currentDay.getDebtAmount());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentDay.getDate());

        return listItemView;
    }
}


