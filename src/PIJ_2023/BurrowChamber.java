package PIJ_2023;

public class BurrowChamber {
    private int food;
    private BurrowChamber left, right;
    public BurrowChamber(int food, BurrowChamber l, BurrowChamber r) {
        this.food = food; this.left = l; this.right = r;

    }

    public int totalFood() {
        int sum = 0;
        if (left == null && right == null) {
            return food;
        }
        if (left != null) {
            try {
                food += left.totalFood();
                food += right.totalFood();
            } catch (NullPointerException ignored) {
            }
            sum += food;
        } else {
            try {
                food += right.totalFood();
                food += left.totalFood();
            } catch (NullPointerException ignored) {
            }
            sum += food;
        }
        return sum;
    }
    public static void main(String[] args) {
        BurrowChamber bc = new BurrowChamber(20,
                new BurrowChamber(30,
                        new BurrowChamber(40, null, null),
                        new BurrowChamber(10, null, null)),
                new BurrowChamber(50,
                        new BurrowChamber(15, null, null),
                        null));

        System.out.println(bc.totalFood());
    }
}
