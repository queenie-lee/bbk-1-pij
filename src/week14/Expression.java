package week14;
/**
 * Represents a (simple or complex) mathematical expression. An Expression
 * can provide its value and its number of nodes as a tree.
 */
public interface Expression {

    /**
     * Returns the int value represented by this Expression.
     *
     * @return the int value represented by this Expression
     */
    int value();

    /**
     * Returns the number of sub-expressions of this Expression (its "size").
     *
     * @return the number of nodes of this Expression.
     */
    int numberOfNodes();

    String toString(); // makes the toString implementation mandatory -- this way, your printing will not fail
}