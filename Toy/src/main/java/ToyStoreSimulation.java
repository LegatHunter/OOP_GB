public class ToyStoreSimulation {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();
        toyStore.addNewToy(1, "Кукла", 10, 20);
        toyStore.addNewToy(2, "Машинка", 15, 30);
        toyStore.addNewToy(3, "Робот", 20, 40); //

        toyStore.changeFrequency(1, 25);

        toyStore.drawPrizeToy();
        toyStore.distributePrize();
    }
}