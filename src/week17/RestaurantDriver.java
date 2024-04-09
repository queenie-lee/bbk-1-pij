package week17;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// for Chefs - limited by nThreads
//ExecutorService newFixedThreadPool(int nThreads)

// for customers - first come first served
// ExecutorService newSingleThreadExecutor()
public class RestaurantDriver {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(3);

        List<String> dishes = List.of(
                "Avocado", "Bun", "Chips", "", "Pizza", "Rice", "Spaghetti", "Tomatoes"
        );

        List<Future<Meal>> futures = new ArrayList<>();
        for (String dish : dishes) {
            Future<Meal> future = restaurant.order(dish);
            futures.add(future);
        }
        for (Future future : futures) {
            try {
                Meal result = (Meal) future.get();
                System.out.println("\nEating " + result);
            } catch (InterruptedException | ExecutionException e) {
                System.out.println("\nSomething went wrong: " + e.getLocalizedMessage());
            }
        }
    }
}
