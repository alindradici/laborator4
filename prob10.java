
public class prob10 {

    public void dublate(){
        int [] a = {1,2,4,6,7,9,12,43,62,1,57,1,8,6};
        for(int i=0;i<a.length/2;i++){
            System.out.println(2*a[i]);
        }
        for(int i=a.length/2;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(3*a[i]);
            }

        }
    }
}
