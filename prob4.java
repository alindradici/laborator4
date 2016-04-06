import java.util.*;
public class prob4 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter number: ");
        int num = input.nextInt();
        boolean tof = (num>9&&num<24 );
        System.out.println(tof);
    }
}
