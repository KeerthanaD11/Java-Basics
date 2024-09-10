import java.util.*;
public class StringAnagram {
    static boolean isAnagram(String a, String b){
        a = a.replace(" ","");
        b = b.replace(" ", "");
        
        a = a.toUpperCase();
        b = b.toUpperCase();

        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        boolean a = isAnagram("The Classroom","School Master");
        if(a==true){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not an Anagram");
        }
        
    }
}
