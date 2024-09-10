public class StringPalindrom {

    int isPalindrom(String str){
        int n = str.length();
        int start = 0;
        int end = n-1;
        while(start < end){
            if(str.charAt(start)!= str.charAt(end)){
                return 0;
            }
            start++;
            end--;
        }
        return 1;
    }
    public static void main(String[] args) {
        StringPalindrom sp = new StringPalindrom();
        int a = sp.isPalindrom("abba");
        if(a == 1){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Palindrom");
        }
    }
}
