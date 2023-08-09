import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(splitString("Viktor Ivanov Ivan Petrov", ' ')));
    }

    public static String[] trimString(String str) {
        String[] result = new String[2];

        result[0] = str.substring(0, str.length()/2);
        result[1] = str.substring(str.length()/2);

        return result;
    }

    public static String[] splitString(String str, char ch) {
        return str.split(String.valueOf(ch));
    }

}

