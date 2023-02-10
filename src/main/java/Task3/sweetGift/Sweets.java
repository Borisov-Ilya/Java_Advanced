package Task3.sweetGift;

public abstract class Sweets {
    String name;
    int price;
    int weight;
    String uniqueParameter;

    public Sweets(String name, int price, int weight, String uniqueParameter) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.uniqueParameter = uniqueParameter;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }
}
