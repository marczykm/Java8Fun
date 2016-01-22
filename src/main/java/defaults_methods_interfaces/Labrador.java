package defaults_methods_interfaces;

/**
 * Created by MMARCZYK on 2016-01-22.
 */
public class Labrador implements Dog {
    @Override
    public void bark() {
        System.out.println("Woof, woof!");
    }

    @Override
    public void run() {
        System.out.println("Labradors don't run, we just walk.");
    }
}
