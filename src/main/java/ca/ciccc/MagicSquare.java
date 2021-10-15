package ca.ciccc;

/**
 *
 * Magic Squares are square arrays of numbers that have the interesting property that
 * the numbers in each column, and in each row, all add up to the same total.
 *
 * Given an n x n square of numbers, determine if it is magic square.
 *
 * Reference: {@link java.lang.Integer}
 * Integer is a wrapper class for {@code int} primitive type.
 */
public class MagicSquare {
    /* n rows and n cols square */
    private int n;
    /* 2-Dimensional array to represent the square */
    private Integer[][] square;

    /**
     * Constructor that takes n as the number of rows and cols.
     * @param n number of rows and cols.
     */
    public MagicSquare(int n) {
        this.n = n;
        this.square = new Integer[n][n];
    }

    /**
     * Constructor that takes n as the number of rows and cols.
     * Initializes square 2-Dimensional array.
     * @param n number of rows and cols.
     * @param square
     */
    public MagicSquare(int n, Integer[][] square) {
        this.n = n;
        this.square = square;
    }

    /**
     * Getter for square
     * @return {@code this.square}
     */
    public Integer[][] getSquare() {
        return square;
    }

    /**
     * Setter for square.
     * @param square
     */
    public void setSquare(Integer[][] square) {
        this.square = square;
    }

    /**
     * Check if {@code square} is magic square or not. (static helper method)
     * @param square 2-Dimensional array
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     *
     * Sample Input
     * {
     *   {16, 3, 2, 13},
     *   {5, 10, 11, 8},
     *   {9, 6, 7, 12},
     *   {4, 15, 14, 1}
     * }
     *
     * Sample Output
     * true
     *
     * Explanation: The sums of each row and col are equal.
     */
    public static boolean isMagicSquare(Integer[][] square) {
        // TODO: You need to implement this method.
        int[] newArrayrsumi = new int[square.length];
        int[] newArrayrsumj =new int[square[0].length];
        int row = square.length;
        int coloums=square[0].length;
        int counts2 = 0;
        int counts3 = 0;

        for (int i = 0; i <= (row - 1); i++) {
            for (int j = 0; j <= (coloums - 1); j++) {
                newArrayrsumi[i] += square[i][j];
            }
            // System.out.println(newArrayrsum[i]);

        }
        for (int k = 0; k <= (newArrayrsumi.length - 2); k++) {
            if (newArrayrsumi[k] == newArrayrsumi[k + 1]) {
                counts2 += 1;
            }

        }

        for (int i = 0; i <= (row - 1); i++) {
            for (int j = 0; j <= (coloums - 1); j++) {
                newArrayrsumj[i] += square[j][i];
            }
            // System.out.println(newArrayrsum[i]);

        }
        for ( int k1 = 0; k1 <= (newArrayrsumj.length - 2); k1++) {
            if (newArrayrsumj[k1] == newArrayrsumj[k1 + 1]) {
                counts3 += 1;



            }


        }
        boolean rowresult=(counts2 == newArrayrsumi.length - 1);
        boolean colresult=(counts3 == newArrayrsumj.length - 1);
        return ((rowresult == true) & (colresult) ==true) ;
    }



    /**
     * Check if {@code this.square} is magic square or not.
     * @return {@code true} if {@code square} is magic, otherwise {@code false}
     */
    public boolean isMagicSquare() {
        return isMagicSquare(this.square);
    }
}
