package POPII_2021;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Question 4
 */
public class AnimalProcess {
    public static ArrayList<String> makesSound(ArrayList<Animal> ls, String sound ) {
        ArrayList<String> selectedAnimalList = new ArrayList<>();
        for (Animal i : ls) {
            if (i.getSound().equals(sound)) {
                selectedAnimalList.add(i.getName());
            }
        }
        return selectedAnimalList;
    }
    public static void main(String[] args) {
//        Scanner scanner = new Scanner( System.in );
        ArrayList<Animal> lst = new ArrayList<Animal>();
        lst.add( new Cat()); lst.add( new Dog());
        lst.add( new FurryCat()); lst.add( new Cat());
        System.out.println( makesSound( lst, "meows"));
    }

}
