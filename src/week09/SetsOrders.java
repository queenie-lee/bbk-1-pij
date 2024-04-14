package week09;
import java.util.*;

public class SetsOrders {
    public static void SetAdd(Set<? super String> set) {
        set.add("Java");
        set.add("C");
        set.add("PHP");
        set.add("JavaScript");
        set.add("Python");
        set.add("Rust");
        set.add("Haskell");
        set.add("Go");
        set.add("Prolog");
    }

    public static void SetPrint(Collection<?> collection) {
        for (Object i : collection) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HashSet<String> hashSetLang = new HashSet<>();
        LinkedHashSet<String> linkedHashSetLang = new LinkedHashSet<>();
        TreeSet<String> treeSetLang = new TreeSet<>();
        SetAdd(hashSetLang);
        SetAdd(linkedHashSetLang);
        SetAdd(treeSetLang);
        SetPrint(hashSetLang);
        SetPrint(linkedHashSetLang);
        SetPrint(treeSetLang);

    }
}
