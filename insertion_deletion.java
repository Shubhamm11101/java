import java.util.Arrays;

public class insertion_deletion {
    public static void main(String args[]){
        int a[] ={2,3,4,51,6,7};
        int n = a.length;
        int index = 3;
        System.out.println(Arrays.toString(a));
        int newarr[] = new int[n++];
        int j =0;
        for(int i=0; i<newarr.length; i++){
        if(i==index){
            newarr[i] = 2;
        }
        else{
            newarr[i] = a[j];
            j++;
        }

        }
        System.out.println(Arrays.toString(newarr));
    }
}
