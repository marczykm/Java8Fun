package defaults_methods_interfaces;

/**
 * Created by MMARCZYK on 2016-01-22.
 */
public interface Dog {
    void bark();
    void run();
    default void sleep(){
        System.out.println("Zzz...");
    };
}
