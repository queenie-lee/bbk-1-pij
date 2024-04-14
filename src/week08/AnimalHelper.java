package week08;

public class AnimalHelper {
    public static Animal doSomething(Box<Animal> animalBox) {
        animalBox.setData(new Animal());
        animalBox.setData(new Dog());
        return animalBox.getData();
    }

    public static void main(String[] args) {
        Box<Animal> animalBox = new Box<>(new Cat());
        Animal animal = AnimalHelper.doSomething(animalBox);
    }
}
