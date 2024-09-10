public class StringUpperCase {
    public String transform(String s){
        StringBuilder result = new StringBuilder(s.length());
        boolean capitalizeNext = true;

        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(capitalizeNext && Character.isLetter(currentChar)){
                result.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            }
            else{
                result.append(currentChar);
            }
            if(currentChar == ' '){
                capitalizeNext = true;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        StringUpperCase obj = new StringUpperCase();
        String input = "i love programming";
        String output = obj.transform(input);
        System.out.println(output);

    }
}
