package striverSDEsheet.string1;

public class atoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        s=s.trim();
//        System.out.println(s);
        String ans = "";
        int i=0;
        boolean neg=false;
        if(s.charAt(0)=='-'){
            neg=true;
            i++;
            s=s.substring(1,s.length());
        }
        System.out.println(s);
        for(i=0 ; i<s.length()  ; i++){
            if(!(s.charAt(i)>='0' && s.charAt(i)<='9'))
                break;
            else
                ans+=""+s.charAt(i);

        }
        System.out.println(ans);
        if(ans.length()==0)
            System.out.println(0);
        else {
            int ii = Integer.parseInt(ans);
            if(neg)
                ii=-ii;
            System.out.println(ii);
        }
    }
}
