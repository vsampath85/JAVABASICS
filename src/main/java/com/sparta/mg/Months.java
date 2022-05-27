package com.sparta.mg;

public enum Months {
    January("SpecialDay"),
    Feburary("Holiday"),
    March("YearEnd"),
    April("YearStart"),
    May("BankHoliday");

    private String months;

    Months(String months) {
        this.months = months;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public static void main(String[] args) {
        Months mymonth = Months.January;
        System.out.println(mymonth.getMonths());

    }
}