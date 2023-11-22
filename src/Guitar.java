/**
 * Конкретний клас для гітари.
 */
public class Guitar extends MusicalInstrument {
    private final int numberOfStrings;

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
