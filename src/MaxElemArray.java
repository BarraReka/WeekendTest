/**
 * Created by blinstall on 2/25/2017.
 */
public class MaxElemArray {
    public static void main(String[] args) {

        int count = SkeletonJava.readIntConsole("how many elements?3");
        int[] elements = new int [count];

       for(int i=0; i<count; i++){
           elements[i]= SkeletonJava.readIntConsole("element?");
       }

        int max = findMax (elements);

        SkeletonJava.printConsole(max);
    }
    public static int findMax(int[] elements){
        int max = elements[0];
        for (int i=1; i< elements.length; i++){
            if(elements[i]>max){
                max=elements[i];
            }
        }
        return max;
    }
}
