package PIJ_2023;

public class WorkerHelper {
    public static void main(String[] args) {
        Manager m1 = new Manager("Farnsworth");
        Manager m2 = new Manager("Leela");
        Worker w1 = new Worker("Fry", "Delivery expert");
        Worker w2 = new Worker("Bender", "Metal worker");
        m1.addSubordinate(m2); m2.addSubordinate(w1); m2.addSubordinate(w2);
        Worker[] company = { w1, w2, m2, m1 };
        for (Worker w : company) {
            System.out.println(m1.hasSubordinate(w) + " "
                    + m2.hasSubordinate(w) + " " + w);
        }
    }
}
