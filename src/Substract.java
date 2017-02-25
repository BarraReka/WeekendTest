/**
 * Created by blinstall on 2/25/2017.
 */
public class Substract {

        public static int substract(int x, int y) {

            int max, min;

            if (x > y) {
                max = x;
                min = y;
            } else {
                max = y;
                min = x;
            }

            int diff=max ;
            //int counter = y;

            // while (counter!=0){
            for (int counter = 0; counter < min; counter++) {
                diff = diff- 1;
                SkeletonJava.printConsole("Substracting 1 from diff");
                // counter-=1;
            }
            return diff;
        }

}
