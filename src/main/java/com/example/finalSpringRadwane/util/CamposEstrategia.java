package com.example.finalSpringRadwane.util;

public enum CamposEstrategia {

    ID("id"),
    NEUMATICOS("neumaticos"),
    COMBUSTIBLE("combustible");

    private String str;

    CamposEstrategia(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
