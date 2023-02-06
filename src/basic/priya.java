package basic;

public class priya {
    public static void main(String[] args) {
        int[] ch = {12,11,6,1,-1,23,12,1,28,-43,6,98,11,2,7,88,9,-4,-54,25,19,-12,-32,65,3,-9};
        System.out.println(findStringWeight(ch, "Spring AND Hibernate"));
    }
    public static int findStringWeight(int[] input1, String input2){

        String[] in =input2.split(" ");
        int sum=1;

        for (int i = 0; i <in.length ; i++) {
            String str = in[i];
            int temp =0;
            for (int j = 0; j < in[i].length(); j++) {
                String s = str.substring(j,j+1).toLowerCase();
                int z = (int)s.charAt(0)-'a';
                temp=+input1[z];
                if(input1[z]<0 &&(j==0 || j==str.length()-1)){
                    temp+=z+1;
                }
            }
            sum=sum*temp;
        }
        return sum;
    }
}
