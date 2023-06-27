package striverSDEsheet.string1;

import java.util.*;

public class longestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        Arrays.sort(strs,(a,b)->b.length()-a.length());
        String ans = strs[0];
        for(int i=0 ; i<strs.length ; i++){
            String temp = strs[i].substring(0,ans.length());
            while(ans.length()>0){
                if(ans.equals(temp)){
                    break;
                }
                temp=temp.substring(0,ans.length()-1);
                ans=ans.substring(0,ans.length()-1);
            }
        }
        System.out.println(Arrays.toString(strs)+" "+ans);
    }
}
