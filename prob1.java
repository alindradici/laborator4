import java.util.*;

public class prob1 {


    public void maina () {

        Scanner input = new Scanner(System.in);

        System.out.println("enter number");
        int scan = input.nextInt();
        int[] a = {1, 3, 4, 6, 7, 8, 10, 12, 14, 23};

       for(int i=0;i<a.length;i++){
           if(scan==a[i]){
               System.out.println("numar gasit pe pozitia "+i);
               return;
           }
       }
        System.out.println("-1");
    }
}
