public class subsequence_String {
    public static void Subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        
        // to be add
        Subsequences(str, idx+1, newString+currChar);

        // to not to be add
        Subsequences(str, idx+1, newString);

    }
    public static void main(String args[]){
    String str = "abc";
    Subsequences(str, 0, "");
    }
}
