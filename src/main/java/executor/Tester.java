package executor;

import executor.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tester {

    public static void main(String[] args) {

        int threshold = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(threshold);

        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            executorService.execute(task);
        }
    }
}
