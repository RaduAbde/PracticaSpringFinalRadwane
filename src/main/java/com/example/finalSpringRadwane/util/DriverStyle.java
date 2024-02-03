package com.example.finalSpringRadwane.util;

public enum DriverStyle {
    AGRESIVO("Agresivo"),
    DRIFTER("Drifter"),
    NORMAL("Normal"),
    RAMMER("Rammer");

    private String str;

    DriverStyle(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
