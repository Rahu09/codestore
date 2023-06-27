package striverSDEsheet.string1;

public class reverseWordsInString {
    public static void main(String[] args) {

        String str = "how are   you doing     ";

        str=str.replaceAll("\\s+"," ").trim();////removing all extra spaces from string
        String[] arr = str.split(" ");
        int k = 0;
        int j = arr.length-1;
        while(k<=j){
            String temp = arr[k];
            arr[k]=arr[j];
            arr[j]=temp;
            k++;
            j--;
        }
        String ans="";
        for(int i=0 ; i<arr.length ; i++){
            ans+=arr[i]+" ";
        }
        ans.trim();
        System.out.println(ans);

    }

}