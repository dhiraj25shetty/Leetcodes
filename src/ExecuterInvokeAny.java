import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable2 implements Callable {
    int num;
    public MyCallable2(int num) { this.num = num;
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
public class ExecuterInvokeAny {
    public static void main(String[] args) throws Exception{
        MyCallable2[] jobs = { new MyCallable2(10),
                new MyCallable2(20),
                new MyCallable2(30),
                new MyCallable2(40),
                new MyCallable2(50),
                new MyCallable2(60) };
        ExecutorService service = Executors.newFixedThreadPool(3);
        List<Callable<Object>> callableLists=new ArrayList<>();
        for(MyCallable2 job: jobs) {
            callableLists.add(job);
        }
            Object t=service.invokeAny(callableLists);
            System.out.println(t);
        service. shutdown();
    }
}

//invoek any we pass collection of callable object but it will return any one future object among them,whatever return type of
//call method is that only should be used to collect invokeAny
