package string;

public class romanToNum {
    public static void main(String[] args) {
        String s = "III";
        char[] roman = s.toCharArray();
        int no = 0;

        for(int i=0 ; i<s.length() ; i++){
            if(roman[i]=='M'){
                no+=1000;
            }else if(roman[i]=='D'){
                no+=500;

            }else if(roman[i]=='C'){
                if(i<s.length()-1){
                    if(roman[i+1]=='D'){
                        no=no+400;
                        i++;
                    }else if(roman[i+1]=='M'){
                        no=no+900;
                        i++;
                    }else{
                        no = no+100;
                    }
                }else{
                    no+=100;
                }

            }else if(roman[i]=='L'){
                no+=50;

            }else if(roman[i]=='X'){
                if(i<s.length()-1){
                    if(roman[i+1]=='L'){
                        no=no+40;
                        i++;
                    }else if(roman[i+1]=='C'){
                        no=no+90;
                        i++;
                    }else{
                        no = no+10;
                    }
                }else{
                    no+=10;
                }

            }else if(roman[i]=='V'){
                no+=5;

            }else if(roman[i]=='I'){
                if(i<s.length()-1){
                    if(roman[i+1]=='V'){
                        no=no+4;
                        i++;
                    }else if(roman[i+1]=='X'){
                        no=no+9;
                        i++;
                    }else{
                        no = no+1;
                    }
                }else{
                    no+=1;
                }


            }
        }
        System.out.println(no);
    }
}
