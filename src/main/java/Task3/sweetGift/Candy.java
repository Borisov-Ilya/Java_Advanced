package Task3.sweetGift;

public class Candy extends Sweets {
    String name;
    int price;
    int weight;
    String uniqueParameter;

    public Candy(String name, int price, int weight, String uniqueParameter){
        super(name, price, weight, uniqueParameter);
        this.name = name;
        this.price = price;
        this.weight =  weight;
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
