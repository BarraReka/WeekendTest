/**
 * Created by blinstall on 2/25/2017.
 */
public class ArraysExample {
    public static void main(String[] args) {

        int[] numbers= new int[5];
        numbers[4]=5;

        int[] nums = {1,5,6,3,7,9};

        SkeletonJava.printConsole(nums[5]);

        int [][] matrix= new int[3][4];
        matrix[0][3]=4;
        int [][] mat=
                {{1,2},
                {3,4},
                {5}};
        SkeletonJava.printConsole(mat[1][0]);


        int[] arrayInt = {0,1,2,3,5,4,8,9};
        int[] squares = new int[arrayInt.length];
        for (int i=0; i<arrayInt.length; i++){
            squares[i]= arrayInt[i]*arrayInt[i];
        }
        for(int square : squares){
            System.out.println(square);
        }

        int j=0;
            for (int pow: arrayInt){
            int elemArray =pow*pow;
            squares[j]=elemArray;
                System.out.println(squares[j]);
                j++;

     }




         }
}
