package com.neoteric.transitivedemo.interfaces;

public enum PaymentStatus {

    success(" payment success"),
    failure(" payment fail"),
    pending(" payment pending");

    private String label;

    PaymentStatus(String label){
        this.label=label;
    }

    public String getLabel() {
        return label;
    }
}