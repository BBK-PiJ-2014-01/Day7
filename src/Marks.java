/**
 * Created by Pierre on 04/11/2014.
 */
import java.util.Scanner;

public class Marks {

    static public void main(String[] args) {
        boolean finished = false;
        int input;
        int distinctions = 0;
        int passes = 0;
        int invalids = 0;
        int fails = 0;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input a mark: ");
            input = in.nextInt();
            if (input == -1)
                finished = true;
            else
                if ((input >= 0) && (input <= 49))
                    fails++;
                else
                    if ((input >= 50) && (input <= 69))
                        passes++;
                    else
                    if ((input >= 70) && (input <= 100))
                        distinctions++;
                    else
                        if ((input < 0) || (input > 100))
                            invalids++;
        } while (!finished);
        System.out.println("There are "+ (passes+distinctions+fails) + " students: " + distinctions + " distinctions, "
                + passes + " pass, " + fails + " fails (plus " + invalids + " invalid)");

    }
}
