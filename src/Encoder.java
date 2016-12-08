
public class Encoder {
    public static String getEncodedText(String input) {
        String myString = "";
        char[] charts = input.toCharArray();
        for (char x : charts) {
            int y = x;
            int z = y + 3;
            char crypted = (char) z;
            myString += crypted;
        }
        return myString;
    }
    
    public static String getRegularText(String input) {
        String myString = "";
        char[] charts = input.toCharArray();
        for (char x : charts) {
            int y = x;
            int z = y - 3;
            char crypted = (char) z;
            myString += crypted;
        }
        return myString;
    }
}