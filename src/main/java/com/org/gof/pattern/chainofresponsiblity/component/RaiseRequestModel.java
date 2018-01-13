package com.org.gof.pattern.chainofresponsiblity.component;

public class RaiseRequestModel extends RequestModel {

    public final static String RAISE_TYPE = "raise";

    public RaiseRequestModel() {
        super(RAISE_TYPE);
    }

    public RaiseRequestModel(String userName, float amount) {
        super(RAISE_TYPE);
        this.userName = userName;
        this.amount = amount;
    }

    private String userName;
    private float amount;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
