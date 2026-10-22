package com.enderdevelopment.spellbookmod;

public enum Spell {
    FIREBALL("fireball"),
    LIGHTNING("lightning"),
    FLING("fling"),
    CONTROL("control"),
    EXPLODE("explode");

    private final String name;

    Spell(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}