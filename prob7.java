
public class prob7 {

    public void maiMare(){
        int [] a = {11, 13, 9, 8, 16,5,1};
        for(int i=0; i<a.length-1;i++){
            if(a[i] > a[i+1]){
                System.out.print(a[i]+"\t");
                System.out.println(a[i+1]);
            }
        }
    }
}
