package week08;

public class Pair <T, K>{
    private T object1;
    private K object2;

    public Pair(T object1, K object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Pair(T object) {
        this(object, (K)object);
    }
    public T getObject1() {
        return this.object1;
    }
    public K getObject2() {
        return this.object2;
    }

    public Pair swap() {
        return new Pair(getObject2(),getObject1());
    }
}
