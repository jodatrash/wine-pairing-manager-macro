package net.trashlib.system.selector.wines.utils;

public class MessagesUtils {
    private String WELCOME_MESSAGE = "Bienvenido al Sistema Selector de Vinos!";
    private String MESSAGE_INITIAL = "Elegimos el vino adecuado para tu comida.";
    private String QUESTION_MESSAGE = "Responde correctamente con: \n(y)es. \n(n)o.";
    private String ERROR_MESSAGE = "Por favor seleccione una opción valida!";
    private String CONFIRM_MESSAGE = "Are you sure you want to continue connecting (yes/no)?";

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public String getMessageInitial() {
        return MESSAGE_INITIAL;
    }

    public String getQuestionMessage() {
        return QUESTION_MESSAGE;
    }

    public String getErrorMessage() {
        return ERROR_MESSAGE;
    }
}
