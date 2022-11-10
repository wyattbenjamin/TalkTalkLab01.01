import java.sql.SQLOutput;

public class Chapter7 {
    public static void printPermutations (int cents)  {
        int pennies;
        for (int q = 0; q*25 <= cents; q++)
            for (int d = 0; d*10+q*25 < cents; d++) {
                for (int n = 0; n*5+d*10+q*25 < cents; n++)  {
                        pennies = cents - n*5+d*10+q*25;
                        System.out.println(cents+ " = " + q + " quarters " + d + " dimes " + n + " nickels "+ pennies + "pennies");
                    }
                }
            }
    }

