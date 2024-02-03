package com.example.finalSpringRadwane.util;

public enum Marcas {
    PORSCHE("Porsche"),
    MCLAREN("McLaren"),
    FERRARI("Ferrari"),
    BUGATTI("Bugatti"),
    PAGANI("Pagani"),
    KOENIGSEGG("Koenigsegg"),
    SALEEN("Saleen");

    private String str;

    Marcas(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
