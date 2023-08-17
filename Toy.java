public class Toy {
    private String id;
    private String name;
    private int amount;
    private int weight;

    public Toy(String id, String name, int amount, int weight) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAmount() {
        return amount;
    }
    public int getWeight() {
        return weight;
    }
}
