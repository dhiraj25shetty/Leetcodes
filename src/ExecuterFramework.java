import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class PrintJob implements Runnable{
    String name;
    public PrintJob(String name) { this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + "...Job started by Thread: " + Thread.currentThread().getName());
        try { Thread.sleep(5000); }
        catch (InterruptedException ex) {
        }
        System.out.println(name + "...Job completed by Thread: " + Thread.currentThread().getName());
    }

}
public class ExecuterFramework {
    public static void main(String[] args) {
        PrintJob[] jobs = { new PrintJob("Dhiraj"),
                new PrintJob("Virat"),
                new PrintJob("Sachin"),
                new PrintJob("Dravid"),
                new PrintJob("Bumrah"),
                new PrintJob("Siraj")
        };
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(PrintJob job: jobs) {
            service.submit(job);
        }
        System.out.println("Shuting Down!"); service. shutdown();
    }
}
