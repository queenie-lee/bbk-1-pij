package week17;

import java.util.Random;
import java.util.concurrent.Callable;

public class MealOrder implements Callable<Meal> {
    private String dish;
    private Random random;

    public MealOrder(String dish) {
        this.dish = dish;
        random = new Random();
    }
    private static final int MEALPREPTIME = 200;
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Meal call() throws Exception {
        int millisToWait = random.nextInt(5,20)*1000;
//        Thread.sleep(millisToWait);
        while (millisToWait > 0) {
            System.out.print(dish.charAt(0));
            Thread.sleep(200);
            millisToWait -= 200;
        }
        // wait, return meal
        // every 200 ms, return waiting
        return new Meal(dish);
    }
}
