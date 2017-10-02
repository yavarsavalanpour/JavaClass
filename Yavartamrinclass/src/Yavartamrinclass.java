public class Yavartamrinclass {
    public static void main(String[] args) {

//one
//        sort();
//two
//        System.out.println(comp());
//three
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the order of the square matrix");
//        int n = input.nextInt();
//        System.out.println("Enter the elements of the square matrix");
//        double[][] mat = new double[n][n];
//        for(int i=0; i<n; i++)
//        {
//            for(int j=0; j<n; j++)
//            {
//                mat[i][j] = input.nextDouble();
//            }
        }
        double[][] temp = {{2, 3, 8}, {3, 4, 2}, {3, 4, 5}};
        System.out.println(determinan(temp, 3));
//one
//        String[] inputs = {"seyyedAli","sEyyedMamad","ahmad","salman","seyyedJavad","reza","hasan","mojtaba","sasan","yaghub"};
//        System.out.println(seyeed(inputs));
//two
//        System.out.println(rev("hannahr"));

    }

    public static void sort() {
        int[] inputs = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        java.util.Arrays.sort(inputs);
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i] + " ");
        }
    }

    public static boolean comp() {
        int[] inputs = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        int[] inputs2 = {5, 2, 9, 6, 23, 12, 34, 0, 1};
        return (java.util.Arrays.equals(inputs, inputs2));

    }


    public static int seyeed(String[] temp) {
        int counter = 0;
        for (String ch : temp
                ) {
            if (ch.toUpperCase().contains("SEYYED"))
                counter++;
        }

        return counter;
    }


    public static boolean rev(String temp) {
        String ch = new StringBuilder(temp).reverse().toString();
        return (ch.equals(temp));

    }


    public static double determinan(double A[][], int N) {
        double det = 0;
        if (N == 1) {
            det = A[0][0];
        } else if (N == 2) {
            det = A[0][0] * A[1][1] - A[1][0] * A[0][1];
        } else {
            det = 0;
            for (int j1 = 0; j1 < N; j1++) {
                double[][] m = new double[N - 1][];
                for (int k = 0; k < (N - 1); k++) {
                    m[k] = new double[N - 1];
                }
                for (int i = 1; i < N; i++) {
                    int j2 = 0;
                    for (int j = 0; j < N; j++) {
                        if (j == j1)
                            continue;
                        m[i - 1][j2] = A[i][j];
                        j2++;
                    }
                }
                det += Math.pow(-1.0, 1.0 + j1 + 1.0) * A[0][j1] * determinan(m, N - 1);
            }
        }
        return det;
    }

}
