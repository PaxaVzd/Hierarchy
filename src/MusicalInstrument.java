/**
 * Абстрактний клас для представлення музичного інструменту.
 */
public abstract class MusicalInstrument {
    private final String name;
    private final String material;
    private final double price;

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