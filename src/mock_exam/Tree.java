package mock_exam;

import java.util.*;
public class Tree<A extends Comparable<? super A>>  {
    private A data;
    private List<Tree<A>> children;
    public Tree(A data, List<Tree<A>> children) {
        this.data = data;
        this.children = new ArrayList<>(children);
    }
    public Tree(A data) { // creates a leaf (a tree without children)
        this(data, List.of());
    }
    public A max() {
        return this.max((o1,o2) -> o1.compareTo(o2));
    }

    public A max(Comparator<A> cmp) {
        A maxData = this.data;
        for (Tree<A> child : children) {
            A childMax = child.max(cmp);
            if (cmp.compare(maxData, childMax) < 0) {
                maxData = childMax;
            }
        }
        return maxData;
    }

    /**
     * For all children, call checker on child. If returns true, replace it with m.make(),
     * Otherwise, if checker returns false, call replace subtrees on child.
     */
    public int replaceSubtrees(Checker<Tree<A>> c, Maker<Tree<A>> m) {
        int replacementCounter = 0;
        for (int i = 0; i < children.size(); i++) {
            if (c.check(children.get(i))) {
                children.set(i, m.make());
                replacementCounter++;
            } else {
                replacementCounter += children.get(i).replaceSubtrees(c, m);
            }
        }
        return replacementCounter;
    }
    public static void main(String[] args) {
        Tree<Integer> t = new Tree<>(3, List.of(
                new Tree<>(4, List.of(new Tree<>(5))),
                new Tree<>(5, List.of(new Tree<>(5), new Tree<>(6))),
                new Tree<>(7)));
        System.out.println(t.max());

        int n = t.replaceSubtrees((s) -> s.data.equals(5),
                () -> new Tree<>(8));

        int m = t.replaceSubtrees((s) -> {
                    return s.children.size() == 2;
                },
                () -> new Tree<>(10));
        System.out.println(n);
        System.out.println(t.max((o1, o2) -> -(o1.compareTo(o2))));

        System.out.println(m);
        System.out.println(t.max((o1, o2) -> o1.compareTo(o2)));

    }
}
