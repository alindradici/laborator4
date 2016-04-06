/**
 * Created by alin on 4/5/2016.
 */
import java.util.*;
public class prob3 {

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int sum =0;
        int numar;
        int sup =0;

        do{
            System.out.println("enter number :");
            numar = input.nextInt();
         if(numar!=0) {
             int fnum = numar % 10;

             while (numar > 9) {
                 numar /= 10;
             }
             int snum=numar;
             int total = fnum + snum;
             sup =sup+total;
         }

        }while(numar!=0);

        System.out.println(sup);


    }
}
