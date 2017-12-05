import java.util.Arrays;
import java.util.List;

public class RotationalCipher {
    static final String ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    List<String> characterListLower = Arrays.asList(ALPHABET_LOWER.split(""));
    List<String> characterListUpper = Arrays.asList(ALPHABET_UPPER.split(""));
    private int shift;

    public RotationalCipher(int shift) {
        this.shift = shift;
    }

    String rotate(String letters) {
        List<String> stringList = Arrays.asList(letters.split(""));
        StringBuilder stringBuilder = new StringBuilder();
        String afterShift;
        int indexOfLetter;
        for (String s : stringList) {
            if (characterListLower.contains(s)) {
                indexOfLetter = characterListLower.indexOf(s);
                if (indexOfLetter + shift < characterListLower.size())
                    stringBuilder.append(characterListLower.get(indexOfLetter + shift));
                else
                    stringBuilder.append(characterListLower.get(shift - (characterListLower.size() - indexOfLetter)));
            }
            else if (characterListUpper.contains(s)) {
                indexOfLetter = characterListUpper.indexOf(s);
                if (indexOfLetter + shift < characterListUpper.size())
                    stringBuilder.append(characterListUpper.get(indexOfLetter + shift));
                else
                    stringBuilder.append(characterListUpper.get(shift - (characterListUpper.size() - indexOfLetter)));
            }
            else
                stringBuilder.append(s);
        }
        afterShift = stringBuilder.toString();
        return afterShift;
    }