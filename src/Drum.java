/**
 * Конкретний клас для барабанів.
 */
public class Drum extends MusicalInstrument {
    private final int numberOfDrumheads;

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
