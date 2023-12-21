import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addNewToy(int id, String name, int quantity, double frequency) {
        toys.add(new Toy(id, name, quantity, frequency));
    }

    public void changeFrequency(int toyId, double newFrequency) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setFrequency(newFrequency);
                break;
            }
        }
    }

    public void drawPrizeToy() {
        List<Toy> availableToys = new ArrayList<>();

        for (Toy toy : toys) {
            for (int i = 0; i < toy.getFrequency(); i++) {
                availableToys.add(toy);
            }
        }

        Random random = new Random();
        int index = random.nextInt(availableToys.size());

        Toy selectedToy = availableToys.get(index);
        selectedToy.decreaseQuantity();
        prizeToys.add(selectedToy);
    }

    public void distributePrize() {
        if (!prizeToys.isEmpty()) {
            Toy prizeToy = prizeToys.remove(0);
            writeToFile(prizeToy);
        }
    }

    private void writeToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("prize_toys.txt", true)) {
            writer.write("Призовая игрушка - ID: " + toy.getId() + ", Наименование: " + toy.getName() + "\n");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}