package com.example.finalSpringRadwane.util;

public enum CamposCoche {

    MATRICULA("matricula"),
    MARCA("marca"),
    MODELO("modelo"),
    POTENCIA("potencia");

    private String str;

    CamposCoche(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
