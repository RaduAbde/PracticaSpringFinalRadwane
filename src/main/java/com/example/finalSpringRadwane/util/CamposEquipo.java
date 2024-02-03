package com.example.finalSpringRadwane.util;

public enum CamposEquipo {

    ID("id"),
    NOMBRE("nombre"),
    PRESUPUESTO("presupuesto"),
    COMPETICION("competicion");


    private String str;

    CamposEquipo(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
