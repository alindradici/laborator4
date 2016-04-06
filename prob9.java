/**
 * Created by alin on 4/6/2016.
 */
public class prob9 {

    public static void main(String [] args){

        int [] a ={3,1,8,2,6,4};
        int temp;
        boolean check = false;

       while(check==false){
           check=true;

            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    check=false;
                }

            }
        }
        for(int c : a){
            System.out.println(c);
        }

    }

    }

