package net.trashlib.system.selector.wines.events;

import net.trashlib.system.selector.wines.utils.MessagesUtils;

import java.util.Scanner;

public class WineApp {
  Scanner userInput = new Scanner(System.in);

  public WineApp() {
    this.userInput = new Scanner(System.in);
  }

  public void onStart() {
    int option;
    displayMessage();
    do {
      option = getUserOption();
      processOption(option);
    } while (option != 0 );
  }

  public void displayMessage() {
    MessagesUtils messages = new MessagesUtils();
    System.out.println(messages.getWelcomeMessage());
    System.out.println(messages.getMessageInitial());
    System.out.println(messages.getQuestionMessage());
  }
  private int getUserOption() {
    return userInput.nextInt();
  }

  private void processOption(int option) {
    switch (option) {
        case 1:
            break;
        case 2:
            break;
        default:
            /*
            * TODO
            * Mejorar la forma de mostrar el mensaje de error, sin necesidad de tener otro objeto.
            */
            MessagesUtils messagesUtils = new MessagesUtils();
            System.out.println(messagesUtils.getErrorMessage());
            break;
    }
  }
}
