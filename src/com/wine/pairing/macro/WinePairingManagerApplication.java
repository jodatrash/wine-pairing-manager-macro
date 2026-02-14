package com.wine.pairing.macro;

import com.wine.pairing.macro.view.ConsoleMenu;
import com.wine.pairing.macro.services.ManagerWineService;

public class WinePairingManagerApplication {
    public static void main(String[] args) {
        ManagerWineService classManager = new ManagerWineService();
        ConsoleMenu menu = new ConsoleMenu(classManager);
        menu.display();
    }
}
