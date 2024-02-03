package com.example.finalSpringRadwane.util;

public enum CamposPiloto {
    DNI("dni"),
    NOMBRE("nombre"),
    EDAD("edad"),
    ESTILO("estilo");

    private String str;

    CamposPiloto(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
