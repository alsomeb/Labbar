package uppgift9;

import java.util.ArrayList;
import java.util.List;

public class HuvudProgram {
    public HuvudProgram() {
        List<RomanLetters> letters = new ArrayList<>(
                List.of(RomanLetters.I, RomanLetters.V, RomanLetters.X, RomanLetters.L, RomanLetters.C, RomanLetters.D, RomanLetters.M)
        );

        letters.forEach(letter -> System.out.println(letter.getIntValue()));
    }

    public static void main(String[] args) {
        new HuvudProgram();
    }
}
