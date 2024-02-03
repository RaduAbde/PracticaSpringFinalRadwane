package com.example.finalSpringRadwane.util;

public enum Competicion {
    MARIO_KART_GRAND_PRIX("Mario Kart Grand Prix"),
    THE_1_CLUB("The 1% Club"),
    CRASH_TAG_TEAM_RACING_CUP("Crash Tag Team Racing Cup"),
    WRECK_FEST("Wreck Fest");


    private String str;

    Competicion(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
