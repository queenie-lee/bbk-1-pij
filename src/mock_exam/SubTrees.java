//package mock_exam;
//
//import java.util.List;
//
///**
// * Checks all subtrees contained in the tree, checks if the root node is equal to 5
// * Creates a new node containing 8.
// */
//public class SubTrees<A> extends Tree {
//
//    public SubTrees(Object data, List children) {
//        super(data, children);
//    }
//
//    public SubTrees(Object data) {
//        super(data);
//    }
//    public <A extends Comparable<? super A> max() {
//
//        return A;
//    }
//    public int replaceSubtrees(Checker<Tree<A>> c, Maker<Tree<A>> m) {}
//
//    public static void main(String[] args) {
//        Tree<Integer> t = new Tree<>(3, List.of(
//                new Tree<>(4, List.of(new Tree<>(5))),
//                new Tree<>(5, List.of(new Tree<>(5), new Tree<>(6))),
//                new Tree<>(7)));
//        int n = t.replaceSubtrees((s) -> s.data.equals(5),
//                () -> new Tree<>(8));
//    }
//}
