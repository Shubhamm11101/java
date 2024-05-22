public class left_rotate_element_array {
    public static void main(String args[]){
        int numbers[] = new int[] {23,43,45,65,77,4,5};
        //how many times rotate
        int n =3;
        System.out.println("Given array is: ");
        for(int i =0; i<numbers.length; i++){
            System.out.print(numbers[i]+ " ");
        }
           // left rotate n times
        for(int i=0; i<n; i++){
            int j,firstElement;
            //storing the first element of array to  move the last
            firstElement=numbers[0];
            for(j=0; j<numbers.length-1; j++){
                //shifting the element left by 3
                numbers[j] = numbers[j+1];
            }
            numbers[j] = firstElement;
        }
        System.out.println();
        //printing output
        System.out.print("Array after" + n + "left rotations: ");
        for(int i=0;i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
