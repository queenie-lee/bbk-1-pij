package week08;

public class Pair <T, K>{
    private T object1;
    private K object2;

    public Pair(T object1, K object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public Pair(Pair<? extends T, ? extends K> other) {
        this(other.object1, other.object2);
    }
    public T getObject1() {
        return this.object1;
    }
    public K getObject2() {
        return this.object2;
    }

    public Pair<K,T> swap() {
        return new Pair<>(getObject2(),getObject1());
    }
}
