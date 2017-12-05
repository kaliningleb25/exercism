import java.util.regex.Matcher;
import java.util.regex.Pattern;

class LuhnValidator {

    boolean isValid(String candidate) {
        int sum = 0;
        candidate = candidate.replaceAll("\\s", ""); // Get only numbers from input string
        Pattern pattern = Pattern.compile("[\\D]|^0{1}$");
        Matcher matcher = pattern.matcher(candidate);

        if (matcher.find())
            return false;

        char[] c = candidate.toCharArray();
        int[] num = new int[c.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(String.valueOf(c[i]));    // Input string of numbers to array of ints
        }


        for (int i = 0; i < num.length; i++) {
            if (num.length % 2 == 0) {
                if (i % 2 == 0) {
                    num[i] = num[i] * 2;
                    sum += num[i] > 9 ? num[i] - 9 : num[i];
                } else
                    sum += num[i];
            }
            else {
                if (i % 2 == 1) {
                    num[i] = num[i] * 2;
                    sum += num[i] > 9 ? num[i] - 9 : num[i];
                } else
                    sum += num[i];
            }

        }

        return sum % 10 == 0;
    }

}
