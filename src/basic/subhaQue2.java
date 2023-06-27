package basic;
import java.util.*;

public class subhaQue2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<List>> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(new ArrayList<>());
            int no = sc.nextInt();
            for (int j = 0; j < no; j++) {
                input.get(i).add(new ArrayList<>());
                input.get(i).get(j).add(sc.next());
                input.get(i).get(j).add(sc.nextInt());
                input.get(i).get(j).add(sc.nextInt());
            }
        }
        sort(input);
        for (ArrayList<List> lists : input)
            System.out.println(noOfDecor(lists));
    }
    public static int noOfDecor(ArrayList<List> input){
        int min = Integer.MAX_VALUE;
        int l = -1;

        for (int i = input.size()-1; i >= 0; i--)
            if((int) input.get(i).get(1)==1){
                min=1;
                l=(int) input.get(i).get(2);
                break;
            }

        if (min!=1) {return -1;}
        if (l==10000) {return 1;}

        for (int i = input.size()-1; i >= 0; i--)
            if((int) input.get(i).get(1)<=l+1){
                l=(int) input.get(i).get(2);
                break;
            }

        if (l==10000) {return 2;}

        for (int i = input.size()-1; i >= 0; i--)
            if((int) input.get(i).get(1)<=l+1){
                l=(int) input.get(i).get(2);
                break;
            }

        if (l==10000) {return 3;}
        return -1;
    }
    public static void sort(ArrayList<ArrayList<List>> input){
        for (ArrayList<List> lists : input) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < lists.size() - 1; j++)
                for (int k = 0; k < lists.size() - j - 1; k++)
                    if ((int) lists.get(k).get(2) > (int) lists.get(k + 1).get(2)) {
                        ArrayList<Object> temp = (ArrayList<Object>) lists.get(k);
                        lists.set(k, lists.get(k + 1));
                        lists.set(k + 1, temp);
                    }
        }
    }
}
/*
4
4
POSTERS 1 100
SCENERIES 3000 9000
GREY 6000 10000
WALLPAPERS 90 3010
3
PAINTINGS 4000 10000
POSTERS 1000 7000
WALLPAPERS 1 2000
5
POSTERS 1 1000
WALLPAPERS 1001 10000
PURPLE 6000 10000
PAINTINGS 100 6000
GREEN 1 10000
6
POSTERS 1 100
PAINTINGS 1 1000
WALLPAPERS 100 1000
SCENERIES 9000 10000
BLACK 5000 8000
MAGENTA 1000 2000
*/
