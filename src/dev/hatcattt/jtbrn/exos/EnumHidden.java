package dev.hatcattt.jtbrn.exos;

public class EnumHidden {

    public static void main(String[] args) {
        int counter = 0;

        for (var value : Secret.values()) {
            counter += value.name().startsWith("STAR") ? 1 : 0;
        }
        System.out.println(counter);
    }
}

enum Secret {
    STAR, CRASH, START, STARTING, STOP, STATION
}

