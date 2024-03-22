package org.example.enums;

public enum Plan {
    BASIC("BASIC", 1000),
    STANDARD("STANDARD", 2000),
    ADVANCE("ADVANCE", 3000);

    private String name;
    private int price;

    Plan(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}
