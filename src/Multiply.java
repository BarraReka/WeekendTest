/**
 * Created by blinstall on 2/25/2017.
 */
public class Multiply {

    public static int multiply(int x, int y) {

        int max, min;

        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        int mult=max ;
        //int counter = y;

        // while (counter!=0){
        for (int counter = 1; counter < min; counter++) {

            mult+=max;

            SkeletonJava.printConsole("Adding min for "+counter+"times");
            // counter-=1;
        }
        return mult;
    }

}
