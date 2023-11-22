/**
 * Абстрактний клас для представлення музичного інструменту.
 */
public abstract class MusicalInstrument {
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
