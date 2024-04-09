package week08;

public class PairHelper {
    public static void main(String[] args) {
        Pair pair = new Pair(42,"Thingy");
        System.out.println(pair.getObject1());
        System.out.println(pair.getObject2());
        Pair pair2 = pair.swap();
        System.out.println(pair2.getObject1());
        System.out.println(pair2.getObject2());
    }
}
