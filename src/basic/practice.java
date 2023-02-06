package basic;

public class practice {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,4,3};
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        rahul obj = new rahul();
        obj.prr();

    }
    static class rahu{
        private void prr(){
            System.out.println("hi");
        }
    }
    static class rahul extends rahu{
        public void prr(){
            System.out.println("hllo");
        }
    }
}
