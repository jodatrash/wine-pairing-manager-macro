package com.wine.pairing.macro.constants;

import java.util.List;

public class MenuApplication {
    private static final List<String> menuApp = List.of(
            "Tinto",
            "Blanco",
            "Espumoso"
    );

    public void displayList() {
        for (String wineList : menuApp) {
            System.out.println(wineList);
        }
    }
}
