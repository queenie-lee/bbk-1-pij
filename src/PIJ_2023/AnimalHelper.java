package PIJ_2023;

import java.util.ArrayList;
import java.util.List;

/**
 * Question 1
 */
public class AnimalHelper {
    public static List<Animal> gatherAnimalsAtBBK(Object[] array) {
        ArrayList<Animal> listOfAnimals = new ArrayList<>();
        if (array.length == 0) {
        } else {
            for (int i = 0; i < array.length; i++) {
                Object arrayObject = array[i];
                if (arrayObject instanceof Animal) {
                    listOfAnimals.add((Animal) arrayObject);
                }
            }
        }

        return listOfAnimals;
    }

    public static void main(String[] args) {
        Object[] list = {new Cat(), "Hello", new Cat(), "Bye"};
        System.out.println(gatherAnimalsAtBBK(list));
    }
}
