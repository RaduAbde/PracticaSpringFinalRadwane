package com.example.finalSpringRadwane.util;

public enum Neumaticos {
    BLANDOS("Blandos"),LLUVIA("Lluvia"),DUROS("Duros");

    private String str;

    Neumaticos(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
