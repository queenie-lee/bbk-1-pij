package week09;

import week08.Animal;
import week08.Cat;
import week08.Dog;

import java.util.Collection;
import java.util.LinkedList;

public class ElementCounterHelper {
    public static void main(String[] args) {
        Collection<Animal> group;
        group = new LinkedList<>();
        group.add(new Dog());
        group.add(new Cat());
        group.add(new Dog());
        group.add(new Dog());
        group.add(new Dog());

        ElementCounter<Animal> elements = new ElementCounter<>();
        System.out.println(elements.count(group));
    }
}
