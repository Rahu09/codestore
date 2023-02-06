package basic;

public class biscut {
    public static void main(String[] args) {
        int n=6 , k=2, ind = 0, res = -1;
        int[] biscut = new int[n];
        while(n!=1){
            int temp=k;
            while (temp!=0) {
                if (biscut[ind]==0 || temp==k)
                    temp--;
                ind++;
                if (ind> biscut.length-1)
                    ind=0;
            }
            if (biscut[ind]==1)
                ind++;
            biscut[ind]=1;
            n--;
        }
        for (int i = 0; i < biscut.length; i++)
            if (biscut[i]==0)
                res=i+1;
        System.out.println(res);
    }
}