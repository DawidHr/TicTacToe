package model;

public class MainManu {

    public static void printMenu() {
        System.out.println("==================================");
        System.out.println("Witamy w naszej grze. Cieszymy się że gra zainteresowała");
        System.out.println("Poniżej proszę wybrać jedną z opcji");
        for (MainManuOption menu : MainManuOption.values()) {
            System.out.println(menu.getOption() + " - "+ menu.getDescription());
        }
        System.out.println("==================================");
    }

    public static boolean checkIfOptionCorrect(String option) {
        return MainManuOption.getMainMenuOptionByOption(option) != null;
    }

}
