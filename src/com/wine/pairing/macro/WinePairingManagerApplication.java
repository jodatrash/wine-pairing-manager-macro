package com.wine.main;

import com.wine.view.Menu;
import com.wine.manager.ClassManager;

public class WinePairingManagerApplication {
    public static void main(String[] args) {
        ClassManager classManager = new ClassManager();
        Menu menu = new Menu(classManager);
        menu.display();

        WineType wineList = new WineType();
        wineList.getWineList();
    }
}
