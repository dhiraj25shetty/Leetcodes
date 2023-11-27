import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable3 implements Callable {
    int num;
    public MyCallable3(int num) { this.num = num;
    }
    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ":is responsible to find sum of first " + num + " numbers");
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum+=i;
        }
        return sum;
    }
}
public class ExecuterInvokeAll {
    public static void main(String[] args) throws Exception{
        MyCallable3[] jobs = { new MyCallable3(10),
                new MyCallable3(20),
                new MyCallable3(30),
                new MyCallable3(40),
                new MyCallable3(50),
                new MyCallable3(60) };
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<Object>> callableLists=new ArrayList<>();
        for(MyCallable3 job: jobs) {
            callableLists.add(job);
        }
        //Object t=service.invokeAll(callableLists);
        List<Future<Object>> futures = service.invokeAll(callableLists);
        for(Future<Object> fut:futures)
            System.out.println(fut.get());

        service. shutdown();
    }
}

//invoek All we pass collection of callable object but it will return any one future object among them,whatever return type of
//call method is that only should be used to collect invokeAny
