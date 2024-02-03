package com.example.finalSpringRadwane.util;

public enum Tables {

    COCHE("Coche"),
    EQUIPO("Equipo"),
    ESTRATEGIAS("Estrategias"),
    PILOTO("Piloto");

    private String str;

    Tables(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

}
