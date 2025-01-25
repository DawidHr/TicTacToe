package model;

import java.util.Scanner;

public class Game {
    public Game() {
    }

    public void startApplication() {
        Scanner scanner = new Scanner(System.in);
        printFirstMenu();
        int selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1: {
                printSecondMenu();
                selectedOption = scanner.nextInt();
            }
            case 2: {
                printSecondMenu();
                selectedOption = scanner.nextInt();
            }
            case 3: {
                System.exit(0);
            }
            default: {
                System.out.println("Coś poszło nie tak");
            }
        }
    }

    private void printFirstMenu() {
        System.out.println("Witamy w naszej grze. Cieszymy się że gra zainteresowała");
        System.out.println("Poniżej proszę wybrać jedną z opcji");
        System.out.println("1 - Zagraj innym graczem");
        System.out.println("2 - Zagraj z komputerem");
        System.out.println("3 - Wyjście z gry");
    }

    private void printSecondMenu() {
        System.out.println("Wybierz wielkość planszy");
        for (BoardSize size: BoardSize.values()) {
            System.out.println(size.size + " - wielkość planszy");
        }
    }
}
