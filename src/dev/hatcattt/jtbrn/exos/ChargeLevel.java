package dev.hatcattt.jtbrn.exos;

public enum ChargeLevel {

    FULL(4, "green"),
    HIGH(3, "green"),
    MEDIUM(2, "yellow"),
    LOW(1, "red");

    final int sections;
    final String color;

    ChargeLevel(int sections, String color) {
        this.sections = sections;
        this.color = color;
    }

    public int getSections() {
        return sections;
    }

    public String getColor() {
        return color;
    }

    public static ChargeLevel findByNumberOfSections(int sections) {
        for (ChargeLevel value : values()) {
            if (value.sections == sections) {
                return value;
            }
        }
        return null;
    }
}
enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    final int level;
    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}


class TestEnum {
    public static void main(String[] args) {
        System.out.println(ChargeLevel.findByNumberOfSections(3));
        DangerLevel high = DangerLevel.HIGH;
        DangerLevel medium = DangerLevel.MEDIUM;

        System.out.println(high.getLevel() > medium.getLevel()); // true
    }
}
