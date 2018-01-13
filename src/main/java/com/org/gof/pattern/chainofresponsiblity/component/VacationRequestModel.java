package com.org.gof.pattern.chainofresponsiblity.component;

public class VacationRequestModel extends RequestModel {

    public final static String VACATION_TYPE = "vacation";

    public VacationRequestModel() {
        super(VACATION_TYPE);
    }

    public VacationRequestModel(String user, int days) {
        super(VACATION_TYPE);
        this.user = user;
        this.days = days;
    }
    private String user;
    private int days;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
