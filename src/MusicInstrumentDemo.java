import java.util.Scanner;

/**
 * Міні-програма для демонстрації використання ієрархії.
 */
public class MusicInstrumentDemo {
    /**
     * Точка входу в програму.
     *
     * @param args Аргументи командного рядка (не використовуються в цій програмі).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Грати на гітарі");
            System.out.println("2. Грати на барабанах");
            System.out.println("3. Вихід");
            System.out.print("Введіть ваш вибір: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    playGuitar();
                    break;
                case 2:
                    playDrums();
                    break;
                case 3:
                    System.out.println("Завершення програми. До побачення!");
                    break;
                default:
                    System.out.println("Невірний вибір. Будь ласка, введіть правильну опцію.");
            }
        } while (choice != 3);

        scanner.close();
    }

    /**
     * Метод для відтворення гри на гітарі.
     */
    private static void playGuitar() {
        Guitar guitar = new Guitar("Акустична гітара", "Дерево", 500.0, 6);
        guitar.displayGuitarInfo();
        guitar.play();
    }

    /**
     * Метод для відтворення гри на барабанах.
     */
    private static void playDrums() {
        Drum drum = new Drum("Набір барабанів", "Метал", 800.0, 3);
        drum.displayDrumInfo();
        drum.play();
    }
}
