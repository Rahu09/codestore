package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class combin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        help(n,k,l,ans,0);
        // System.out.println(ans);

        for (int i = 0; i < ans.size(); i++) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                if(j==ans.get(i).size()-1){
                    System.out.print(ans.get(i).get(j));
                }else{
                    System.out.print(ans.get(i).get(j)+" ");
                }

            }
            System.out.println();

        }
    }

    public static void help(int n,int k,List<Integer> l,List<List<Integer>> ans,int start){
        if(l.size()==k){
            ans.add(new ArrayList<>(l));
            return;
        }

        for(int i=start;i<n;i++){
            l.add(i+1);
            help(n,k,l,ans,i+1);
            l.remove(l.size()-1);
        }
    }
}
