package basic;

import java.util.ArrayList;
import java.util.List;

public class amanexam {
    public static void main(String[] args) {
        List<String> pixels = new ArrayList<>();
        pixels.add("101");
        pixels.add("001");
        pixels.add("110");
        System.out.println(getMaximumGreyness(pixels));
    }
    public static int getMaximumGreyness(List<String> pixels){
        int max = Integer.MIN_VALUE;
        int[] row = new int[pixels.size()];
        int[] col = new int[pixels.get(0).length()];

        for (int i = 0; i < row.length; i++)
            row[i]=rowGreyness(i,pixels);

        for (int i = 0; i < col.length; i++)
            col[i] = colGreyness(i,pixels);

        for (int i = 0; i < row.length; i++)
            for (int j = 0; j < col.length; j++)
                if ((row[i]+col[j])>max)
                    max=row[i]+col[j];

        return max;
    }
    public static int rowGreyness(int i, List<String> pixels){
        int grey=0;
        for (int k = 0; k < pixels.get(0).length(); k++)
            if (pixels.get(i).charAt(k)=='1') grey++;
            else grey--;
        return grey;
    }
    public static int colGreyness(int i, List<String> pixels){
        int grey=0;
        for (int k = 0; k < pixels.size(); k++)
            if (pixels.get(k).charAt(i)=='1') grey++;
            else grey--;
        return grey;
    }
    private static int getMaximumGreyness(ArrayList<String> pixel) {
        int maxGreyness = 0;
        int m = pixel.size();
        int n = pixel.get(0).length();

        int[] row_1s = new int[m];
        for(int i=0; i<m; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(pixel.get(i).charAt(j) == '1') count++;
            }
            row_1s[i] = count;
        }

        int[] col_1s =new int[n];
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<m; j++){
                if(pixel.get(j).charAt(i) == '1') count++;
            }
            col_1s[i] = count;
        }


        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int tempGreyness = 2*(row_1s[i] + col_1s[j]) - (m + n);
                maxGreyness = Math.max(maxGreyness, tempGreyness);
            }
        }

        return maxGreyness;
    }
}
