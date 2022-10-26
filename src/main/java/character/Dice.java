package character;
import java.util.Arrays;
public class Dice {
    public static int roll(){
        int [] rand = new int[6];
        int sum;

        for(int i=0; i<rand.length; i++) {
            rand[i] = (int) (1 + (Math.random() * (6 - 1))); // from 1 to 6
        }

        Arrays.sort(rand);
        rand[0] = rand[1] = rand [2] = 0;
        sum = Arrays.stream(rand).sum();

        return sum;
    }
}
