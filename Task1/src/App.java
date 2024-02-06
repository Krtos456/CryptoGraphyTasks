import java.io.File;
import java.io.IOException;
import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        /**
         * Mohamed hadhif hassan
         * S2102706
         * Crytohraghy
         * Credit card vallidation
         * 
         * while (myReader.hasNextLine())
         **/

        // Definitions
        File myObj = new File("Input.txt");
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> CardList = new ArrayList<>();

        // testing
        /*
         * System.out.println(revesString("doubtfire"));
         */

        while (myReader.hasNextLine()) {
            String newString = myReader.nextLine();
            if (newString.length() == 16) {
                CardList.add(newString);

            }
        }

    }

    public static Boolean validate(String CardNo) {
        String Reversed = revesString(CardNo);

        int OddSum = 0;
        int sum2 = 0;

        for (int digit = 0; digit < CardNo.length(); digit += 2) {
            OddSum += Character.getNumericValue(CardNo.charAt(digit));
        }

        for (int digit = 1; digit < CardNo.length(); digit += 2) {
            int CurrentDigit = CardNo.charAt(digit);
            int Doubled = CurrentDigit * 2;
            if (Doubled >= 10) {
                Doubled %10
            }
            sum2 += Character.getNumericValue(CardNo.charAt(digit));
        }
        return false;
    }

    public static String revesString(String StringtoReverse) {
        char digit;
        String ReversedNumber = "";
        for (int i = 0; i < StringtoReverse.length(); i++) {
            digit = StringtoReverse.charAt(i);
            ReversedNumber = digit + ReversedNumber;
        }

        return ReversedNumber;
    }
}
