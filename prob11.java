import java.util.*;

public class prob11 {

    public static void main(String [] args){

        int [] a = {12,1,12,3,5,23,5,12,5,6,7,8,9,12,4};
        int [] b = new int[a.length];
         for(int i=0;i<a.length;i++){
            if(a[i]>=5 && a[i]<20){
              b[i] = a[i];
            }

         } for(int x:b){
            if(x!=0){
                System.out.print(x+" ");
            }

        }

        }

    }


