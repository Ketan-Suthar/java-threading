import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class _13_SingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor(r -> {
            System.out.println("hello word");
            return null;
        });
        executor.awaitTermination(100, TimeUnit.SECONDS);
    }
}
