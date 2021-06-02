package com.x0rg.android.expensesheet;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SummaryDay implements Serializable {
    private int mBalanceAmount;
    private int mCreditAmount;
    private int mDebtAmount;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    private final String mDate;


    public SummaryDay(int balanceAmount, int creditAmount, int debtAmount) {
        mBalanceAmount = balanceAmount;
        mCreditAmount = creditAmount;
        mDebtAmount = debtAmount;
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("MM-dd-yyyy \n h:mm a");
        mDate = dateFormat.format(calendar.getTime());
    }

    public String getBalanceAmount() {
        return "" + mBalanceAmount;
    }
    public String getCreditAmount(){
        return "Credit: +" + mCreditAmount;
    }
    public String getDebtAmount() {
        return "Debt: -" + mDebtAmount;
    }
    public String getDate() { return "" + mDate;}
}
