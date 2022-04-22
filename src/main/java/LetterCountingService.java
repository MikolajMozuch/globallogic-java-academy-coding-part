import java.util.TreeMap;
import java.util.Locale;
public class LetterCountingService {
    public void letterCountingConsolePrint(String input) {
        String inputLowerCased = input.toLowerCase(Locale.getDefault());
        TreeMap<Character, Integer> letterToCount = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            for (char j = 'a'; j < 'z'; j++) {
                if (input.charAt(i) == j) {
                    if (letterToCount.containsKey(j) && letterToCount.containsValue(1)) {
                        Integer tempCount = letterToCount.get(j);
                        letterToCount.replace(j, tempCount, tempCount + 1);
                    } else {
                        letterToCount.put(j, 1);
                    }
                }
            }
        }
        System.out.println("Counted letters:");
        letterToCount.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
