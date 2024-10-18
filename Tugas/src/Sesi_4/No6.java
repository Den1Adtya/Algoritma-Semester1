package Sesi_4;

public class No6 {
    public static void main(String[] args) {
        int a = 0;
        int b =0;
         int c = 0; 
         int d = 1;  
         int i =1;
              while (c <=81  ){
                  System.out.print(d +" ");
                if (i==1){
                c=1;
                }else{d=a+b+c;}
                a=b;
                b=c;
                c=d;
                i++;
             }
             
    }
}
