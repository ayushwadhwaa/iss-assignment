import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
	@Override
	public void run(){
		try{
			for(int i=1; i<=10; i++){
				System.out.println(i);
				Thread.sleep(250);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
public class ExecutorServiceSample {
	public static void main(String[] args){
        
		ExecutorService executor = Executors.newFixedThreadPool(4);
		for(int i=0; i<10; i++){
			executor.submit(new Worker());
		}
        executor.shutdown();
    }
}