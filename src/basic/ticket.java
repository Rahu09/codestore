package basic;

public class ticket {
    static int[] comp;
    static int swap = 0;

    public static void main(String[] args) {
        int[] in = {2,1,5,3,6,4};
        comp= new int[in.length];
        boolean noticket = false;

        for (int i = 0; i < in.length; i++)
            if ((in[i]-(i+1))>2)
                noticket=true;

        for (int i = 0; i < in.length; i++)
            comp[i]=in[i];

        for (int i = 0; i < comp.length; i++) {
            if (comp[i] != i+1) {
                int temp=-1;
                for (int j = 0; j < comp.length; j++) {
                    if (comp[j] == i+1) {
                        temp=j;
                        break;
                    }
                }
                swap(comp,i,temp);
            }
        }
        if (noticket) {System.out.println("NO-TICKET");}
        else {System.out.println(swap);}
    }
    public static void swap(int[] comp,int i , int temp){
        int tem =  comp[i];
        comp[i] = comp[temp];
        comp[temp]=tem;
        swap++;
    }
}
