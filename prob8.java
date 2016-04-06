/**
 * Created by alin on 4/6/2016.
 */
//suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n

import java.util.*;
public class prob8 {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = 2;
        int c=3;
        int first = (1+a+a);
        int temp=first;
        int temp2=a;
        int putere=0;


        for (int i = 1; i < b; i++) {
            first = first * temp;

        } temp = temp/first;

        for(int i=0;i<c;i++){
            putere += a*temp2;
            c++;

        }temp2 = temp2/a;

        int total = first + putere;

        System.out.println(total);

    }
}