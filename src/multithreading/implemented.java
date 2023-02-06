package multithreading;

public class implemented {
    static class hi implements Runnable{
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {Thread.sleep(1000);}catch (Exception e){}
            }
        }
    }
    static class hello implements Runnable{
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("hello");
                try {Thread.sleep(1000);}catch (Exception e){}
            }
        }
    }
    public static void main (String[] args) throws Exception {

        hi obj1 = new hi();
        hello obj2 = new hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try { Thread.sleep(500); } catch (Exception e){}
        t2.start();

        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());

        System.out.println("bye");
    }
}
