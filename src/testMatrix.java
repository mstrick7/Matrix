import java.util.Arrays;

public class testMatrix {

    public static void main(String[] args) {

        double[][] anArray = {{2.3, 3.4, 5.7}, {4.4, 7.8, 6.2}, {3.4, 5.6, 7.2}};
        double[] aVector = {3.0,1.0,3.0};
        double[] multiplied = new double[aVector.length];
        multiplied = Matrix.multiply(aVector, anArray);
        for (int i = 0; i < multiplied.length; i++) {
                System.out.println(multiplied[i]);
            }
        }
    }




