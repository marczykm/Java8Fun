package helpers;

/**
 * Created by MMARCZYK on 2016-01-20.
 */
public class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isGreen() {
        return "green".equals(color);
    }

    public boolean isHeavierThan150(){
        return (weight > 150);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
