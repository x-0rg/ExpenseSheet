package com.x0rg.android.expensesheet;

import java.io.Serializable;

public class SummaryDay implements Serializable {
    private int mBalanceAmount;
    private int mCreditAmount;
    private int mDebtAmount;

    public SummaryDay(int balanceAmount, int creditAmount, int debtAmount) {
        mBalanceAmount = balanceAmount;
        mCreditAmount = creditAmount;
        mDebtAmount = debtAmount;
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

}
