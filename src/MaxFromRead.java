/**
 * Created by blinstall on 2/25/2017.
 */
public class MaxFromRead {
    public static void main(String[] args) {
        int n = SkeletonJava.readIntConsole("How many numbers sould I read?");

        int max=Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int read= SkeletonJava.readIntConsole("Give me a number!");
            if (read>max){
                max=read;
            }
        }
        SkeletonJava.printConsole(max);
    }
}
