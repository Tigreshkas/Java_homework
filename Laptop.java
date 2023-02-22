import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Laptop {
    String name;
    String OS;
    String color;
    double weight;
    int RAM;
    int memory;
    int price;



    @Override
    public String toString() {
        return "Laptop: " + "name='" + name + '\'' + ", OS='" + OS + '\'' + ", color='" + color + '\'' +
                ", weight=" + weight + ", RAM=" + RAM + ", memory=" + memory + ", price=" + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, RAM);
    }

}