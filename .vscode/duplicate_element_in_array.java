public class duplicate_element_in_array {
public static void main(String args[]){
int a[] =  {2,3,2,4,4,54,67};
System.out.println("Duplicate element of this array is: ");
for(int i=0; i<a.length; i++){
for(int j=i+1; j<a.length; j++){
if(a[i]==a[j]){
System.out.println(a[i]);
}
}
}
    
} 
}
