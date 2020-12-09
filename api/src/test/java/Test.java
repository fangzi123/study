import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger(0);

        new Thread(()->{
            while (integer.get()<=30){
                if (integer.get()%3==0) {
                    System.out.print("A");
                    integer.incrementAndGet();
                }
            }
        }).start();

        new Thread(()->{
            while (integer.get()<=30){
                if (integer.get()%3==1) {
                    System.out.print("B");
                    integer.incrementAndGet();
                }
            }
        }).start();
        new Thread(()->{
            while (integer.get()<=30){
                if (integer.get()%3==2) {
                    System.out.print("C");
                    integer.incrementAndGet();
                }
            }
        }).start();
    }


}
