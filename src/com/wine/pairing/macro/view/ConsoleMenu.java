package com.wine.pairing.macro.view;

import com.wine.pairing.macro.services.ManagerWineService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.wine.pairing.macro.constants.ApplicationConstants.*;

public class ConsoleMenu {


    private final List<String> menuOption = List.of(
            "[1] - Iniciar.",
            "[2] - Acerca de." + "\n"
    );

    private final Scanner scanner;
    private final ManagerWineService classManager;


    public ConsoleMenu(ManagerWineService classManager) {
        this.classManager = classManager;
        this.scanner = new Scanner(System.in);
    }

    public void display() {
        int option;
        do {
            displayMenu();
            option = userInput();
            if (option == ERROR_CODE) continue;
            processOption(option);
        } while (option != EXIT_OPTION);
        close();
    }

    private int userInput() {
        try {
            int opt = scanner.nextInt();
            scanner.nextLine();
            if (opt < MIN_RANGE || opt > MAX_RANGE) {
                return ERROR_CODE;
            }
            return opt;
        } catch (InputMismatchException e) {
            System.out.printf("Ingresa un valor entero [%d - %d]%n", MIN_RANGE, MAX_RANGE);
            scanner.nextLine();
            return ERROR_CODE;
        }
    }

    private void displayMenu() {
        System.out.println("Bienvenido al sistema gestor de vinos.");
        for (String opt : menuOption) {
            System.out.println(opt);
        }
        System.out.print(">> Ingresa una opción: ");
    }

    private void processOption(int option) {
        switch (option) {
            case 1 -> System.out.println("Iniciando aplicativo.");
            case 2 -> System.out.println("Acerca de.");
            case 0 -> System.out.println("Finalizando aplicativo.");
            default -> System.out.println("No se ha encontrado la opción.");
        }
    }

    private void close() {
        scanner.close();
    }
}
