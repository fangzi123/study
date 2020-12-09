import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangff
 * @desc TODO
 * @createTime 2020年12月09日 17:17:00
 */
public class PrintABC {
    private int times;
    private int count;
    ReentrantLock lock = new ReentrantLock();

    public PrintABC(int times) {
        this.times = times;
    }

    private void printABC(int abc,String name){
        for (int i = 0; i <times;) {
            lock.lock();
            if (count%3==abc) {
                count++;
                i++;
                System.out.print(name);
            }
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        PrintABC printABC = new PrintABC(10);

        new Thread(()->printABC.printABC(0,"A")).start();
        new Thread(()->printABC.printABC(1,"b")).start();
        new Thread(()->printABC.printABC(2,"c")).start();

    }
}
