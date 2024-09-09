/*public class ReverseAString{
    public static void main(String [] args){
        String str = "hello";
        int n = str.length();
        int halfLength = (n+1)/2;
        for(int i = halfLength-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        for(int i = halfLength; i<n; i++){
            System.out.print(str.charAt(i));
        }
    }
}*/

public class ReverseAString {
    public static void main(String[] args) {
        String str = "hello";
        int n = str.length();
        int halfLength = (n+1)/2;
        for(int i = 0; i<halfLength; i++){
            System.out.print(str.charAt(i));
        }
        for(int i=n-1; i>=halfLength; i--){
            System.out.print(str.charAt(i));
        }
    }
}