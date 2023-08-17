import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class Program {
    public static void main(String[] args) {
        Toy toy1 = new Toy("1", "Car", 5, 20 );
        Toy toy2 = new Toy("2", "Doll", 3, 30);
        Toy toy3 = new Toy("3", "Ball", 2, 60);
        Toy toy4 = new Toy("4", "Tank", 7, 60);
        Toy toy5 = new Toy("5", "Transformer", 4, 50);
        Toy toy6 = new Toy("6", "Airfly", 6, 40);
        Toy toy7 = new Toy("7", "Mouse", 1, 37);
        Toy toy8 = new Toy("8", "Sky", 3, 62);
        Toy toy9 = new Toy("9", "Constructor", 4, 74);
        Toy toy10 = new Toy("10", "Game", 2, 14);
        Toy toy11 = new Toy("11", "Pay", 4, 36);
        Toy toy12 = new Toy("12", "Mosaic", 1, 15);

        PriorityQueue<Toy> queue = new PriorityQueue<>((t1, t2) -> Integer.compare(t2.getWeight(), t1.getWeight()));
        queue.add(toy1);
        queue.add(toy2);
        queue.add(toy3);
        queue.add(toy4);
        queue.add(toy5);
        queue.add(toy6);
        queue.add(toy7);
        queue.add(toy8);
        queue.add(toy9);
        queue.add(toy10);
        queue.add(toy11);
        queue.add(toy12);

        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            for (int i = 0; i < 10; i++) {
                Toy highestPriorityToy = queue.remove();
                String result = highestPriorityToy.getId() + ": " + highestPriorityToy.getName() + " " + highestPriorityToy.getWeight();
                writer.write(result + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
