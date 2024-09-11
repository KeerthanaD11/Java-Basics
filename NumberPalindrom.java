public class NumberPalindrom {
    public static boolean isPalindrom(int x){
        int temp = x, rem, rev=0;
        if(x<0)
            return false;
        else{
            while(temp!=0){
                rem = temp%10;
                rev = rev*10 + rem;
                temp/=10;
            }
            if(x == rev)
                return true;
            else
                return false;
        }
    }

    public static void main(String[] args) {
        boolean a = NumberPalindrom.isPalindrom(-121);
        System.out.println(a);
    }
}
