package com.x0rg.android.expensesheet;

public class SummaryDay {
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
        return "+" + mCreditAmount;
    }
    public String getDebtAmount() {
        return "-" + mDebtAmount;
    }

}
