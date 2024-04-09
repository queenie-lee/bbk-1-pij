package week17;

import java.util.concurrent.*;

public class Restaurant {
    ExecutorService executorService;

    private static void informAboutExecutionException(ExecutionException e) {
        Throwable t = e.getCause();
        System.out.println("Oh dear! Something went wrong with meal preparation: " + t.getMessage());
    }
    public Restaurant(int nCooks) {
        executorService = Executors.newFixedThreadPool(nCooks);
    }

    public Future<Meal> order(String dishName) {
        MealOrder mealOrder = new MealOrder(dishName);
        return executorService.submit(mealOrder);
    }

    public void shutdown() {
        executorService.shutdown();
    }

}
