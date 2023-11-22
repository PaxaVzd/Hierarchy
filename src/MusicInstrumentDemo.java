import java.util.Scanner;

/**
 * Абстрактний клас для представлення музичного інструменту.
 */
abstract class MusicalInstrument {
    private String name;
    private String material;
    private double price;

    /**
     * Конструктор класу MusicalInstrument.
     *
     * @param name     Назва інструменту.
     * @param material Матеріал, з якого виготовлений інструмент.
     * @param price    Ціна інструменту.
     */
    public MusicalInstrument(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    /**
     * Отримати назву інструменту.
     *
     * @return Назва інструменту.
     */
    public String getName() {
        return name;
    }

    /**
     * Отримати матеріал інструменту.
     *
     * @return Матеріал інструменту.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Отримати ціну інструменту.
     *
     * @return Ціна інструменту.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Абстрактний метод для відтворення звуку.
     */
    public abstract void play();

    /**
     * Метод для виведення інформації про інструмент.
     */
    public void displayInfo() {
        System.out.println("Назва: " + name);
        System.out.println("Матеріал: " + material);
        System.out.println("Ціна: $" + price);
    }
}

/**
 * Конкретний клас для гітари.
 */
class Guitar extends MusicalInstrument {
    private int numberOfStrings;

    /**
     * Конструктор класу Guitar.
     *
     * @param name            Назва гітари.
     * @param material        Матеріал, з якого виготовлена гітара.
     * @param price           Ціна гітари.
     * @param numberOfStrings Кількість струн на гітарі.
     */
    public Guitar(String name, String material, double price, int numberOfStrings) {
        super(name, material, price);
        this.numberOfStrings = numberOfStrings;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void play() {
        System.out.println("Грає на гітарі");
    }

    /**
     * Додатковий метод для виведення інформації про гітару.
     */
    public void displayGuitarInfo() {
        displayInfo();
        System.out.println("Кількість струн: " + getNumberOfStrings());
    }

    /**
     * Отримати кількість струн на гітарі.
     *
     * @return Кількість струн.
     */
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}

/**
 * Конкретний клас для барабанів.
 */
class Drum extends MusicalInstrument {
    private int numberOfDrumheads;

    /**
     * Конструктор класу Drum.
     *
     * @param name               Назва барабанів.
     * @param material           Матеріал, з якого виготовлені барабани.
     * @param price              Ціна барабанів.
     * @param numberOfDrumheads Кількість барабанних голів.
     */
    public Drum(String name, String material, double price, int numberOfDrumheads) {
        super(name, material, price);
        this.numberOfDrumheads = numberOfDrumheads;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void play() {
        System.out.println("Грає на барабанах");
    }

    /**
     * Додатковий метод для виведення інформації про барабани.
     */
    public void displayDrumInfo() {
        displayInfo();
        System.out.println("Кількість барабанних голів: " + getNumberOfDrumheads());
    }

    /**
     * Отримати кількість барабанних голів.
     *
     * @return Кількість барабанних голів.
     */
    public int getNumberOfDrumheads() {
        return numberOfDrumheads;
    }
}

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
