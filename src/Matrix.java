public class Matrix {

    public static double dot(double[] a, double[] b) {

        double[] dotProduct = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            dotProduct[i] = a[i] * b[i];
        }
        double k = 0;
        for (int j = 0; j < dotProduct.length; j++) {
            k = k + dotProduct[j];
        }
        return k;
    }
    
    public static double[][] multiply(double[][] a, double[][] b) {

        if (a[0].length != b.length) {
            throw new ArithmeticException("error! number of rows of first matrix " +
                    "do not match number of columns in second matrix.");
        } else {
            double[][] product = new double[a.length][b[0].length];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    product[i][j] = 0.0;
                }
            }

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    for (int k = 0; k < a[0].length; k++) {
                        product[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return product;
        }
    }

    public static double[][] transpose(double[][] a) {

        double[][] transposed = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                transposed[j][i] = a[i][j];
            }
        }
        return transposed;
    }

    public static double[] multiply(double[][] a, double[] x) {

        if (a[0].length != x.length) {
            throw new ArithmeticException("error! number of columns in matrix " +
                    "do not match number of components in vector.");
        } else {
            double[] product = new double[x.length];
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    sum += a[i][j] * x[j];
                }
                product[i] = sum;
                sum = 0;
            }
            return product;
        }
    }

    public static double[] multiply(double[] x, double[][] a) {

        if (a.length != x.length) {
            throw new ArithmeticException("error! number of rows in matrix " +
                    "do not match number of components in vector.");
        } else {
            double[] product = new double[x.length];
            double sum = 0;
            for (int i = 0; i < a[0].length; i++) {
                for (int j = 0; j < a.length; j++) {
                    sum += x[j] * a[j][i];
                }
                product[i] = sum;
                sum = 0;
            }
            return product;
        }
    }
}

