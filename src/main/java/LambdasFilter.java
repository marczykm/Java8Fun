import helpers.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by MMARCZYK on 2016-01-20.
 */
public class LambdasFilter {

    private static List<Apple> apples = Arrays.asList(new Apple[]{
            new Apple("green", 150),
            new Apple("red", 200),
            new Apple("green", 160)
    });

    public static void main(String[] args) {
        oldMethod();
        System.out.println();
        newMethod();
    }

    public static void oldMethod(){
        List<Apple> greenBigApples = new ArrayList<>();
        for(Apple a : apples)
            if (a.isGreen() && a.isHeavierThan150())
                greenBigApples.add(a);
        greenBigApples.forEach(System.out::print);
    }

    public static void newMethod(){
        List<Apple> greenBigApples = apples.stream()
                .filter(Apple::isGreen)
                .filter(Apple::isHeavierThan150)
                .collect(Collectors.toList());
        greenBigApples.forEach(System.out::print);
    }
}
