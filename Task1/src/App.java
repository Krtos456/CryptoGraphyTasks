import java.io.File;
import java.io.IOException;
import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

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
        System.out.println(System.getProperty("user.dir"));
        File myObj = new File("Input.txt");
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> CardList = new ArrayList<>();

        while (myReader.hasNextLine()) {
            String newString = myReader.nextLine();
            if (newString.length() == 16) {
                CardList.add(newString);
                validate(newString);

            } else {
                System.out.println("error card length is incorrect");
                System.out.println("card length" + newString.length());
            }

        }

    }

    public static Boolean validate(String CardNo) {
        String Reversed = revesString(CardNo);

        int OddSum = 0;
        int EvenSum = 0;
        Boolean CardValid;// ?

        System.out.println("Oddsum numbers ");
        for (int digit = 0; digit < Reversed.length(); digit += 2) {
            OddSum += Character.getNumericValue(Reversed.charAt(digit));
        }

        for (int digit = 1; digit < CardNo.length(); digit += 2) {
            int CurrentDigit = Reversed.charAt(digit) - '0';
            int Doubled = CurrentDigit * 2;

            CurrentDigit = Doubled;
            if (Doubled >= 10) {
                CurrentDigit = (Doubled % 10) + ((int) (Doubled / 10));
            }
            EvenSum += CurrentDigit;
        }
        System.out.println("");

        CardValid = ((OddSum + EvenSum) % 10) == 0;

        System.out.println("Card Number: " + CardNo);
        System.out.println("Valid: " + CardValid);
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
