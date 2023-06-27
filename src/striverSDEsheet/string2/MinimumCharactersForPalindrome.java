package striverSDEsheet.string2;

public class MinimumCharactersForPalindrome {
    public static void main(String[] args) {
        String str = "abb";
        if(str.length()==1)
            System.out.println(0+" end");
        if(str.length()==2){
            if(str.charAt(0)==str.charAt(1))
                System.out.println(0+" end");
            System.out.println(1+" end");
        }
        int s = (str.length()-1)/2;
        int maxInd = -1;
        for(int i=0 ; i<=(str.length()-1)/2 ; i++){
            int len1 = isPalin(str,s,s);
            int len2 = -1;
            if(str.length()%2!=0 && i==0)  //will cause problem for even palindrome
                len2 = isPalin(str,s,s+1);
            maxInd=Math.max(maxInd,Math.max(len1,len2));
            s--;
        }
        System.out.println(str.length()-1-maxInd);
    }
    public static int isPalin(String str, int start, int end) {

        int len = start;
        for(int i =len ; i>=0 ; i--){
            if(str.charAt(start)!=str.charAt(end)){
                break;
            }else{
                end++;
                start--;
            }
        }
        if(start<0){
            return end-1;
        }
        return -1;
    }
}
