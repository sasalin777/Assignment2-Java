package ca.ciccc;
import java.util.Arrays;
public class sasatest {


    public static void main(String[] args) {
        /**
         * Write nested for-loops to produce the following output from the given input n.
         * @param n number to create a pattern.
         * @return pattern
         *
         * Sample Input / Output
         * numberLoops(3);
         *
         * Sample Output
         * ..1
         * .22
         * 333
         *
         */
        int n = 5;
        int i;
        int j;
        String result = "";

        for (i = 1; i <= n; i++) {
            for (j = n - i; j > 0; j--) {
                result += ".";
            }
            for (int k = 1; k <= i; k++) {

                result += String.valueOf(i);
            }
            result += "\n";
        }

        System.out.printf("restut:\n%s", result);


        System.out.println("----------------------------------------------");
/**
 * index practice
 */


        Integer[] array1 = {2, 4, 6, 8, 8, 8, 10};

        int getIndex = Arrays.asList(array1).indexOf(8);
        int ar;

        System.out.println("8 is located at " + getIndex + " index");

        System.out.println("\n----------------------------------------------");
        /**
         * Given an array of integers, return true if the number of 1s is greater than the number of 7s
         * @param nums array of ints
         * @return true if the number of 1s is greater than the number of 7s
         */
        int a[] = {1, 2, 2, 7, 1, 7, 7};
        int n1 = 1;
        int n2 = 7;
        int k = 0;
        int q = 0;

        for (i = 0; i <= (a.length - 1); i++) {

            if (a[i] == n1) {
                //a[i];
                k += 1;
            }

        }

        for (i = 0; i <= (a.length - 1); i++) {

            if (a[i] == n2) {
                //a[i];
                q += 1;
            }

        }

        System.out.printf("count: %d", k);
        System.out.printf("count: %d", q);
        if (k > q) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }


        System.out.println("\n----------------------------------------------");
        /**
         * Return the sum of numbers in the array, returning 0 for an empty array. Except the number 13
         * is very unlucky, so it does not count the number that comes immediately after a 13, also 13 itself
         * does not count.
         * @param nums array of numbers
         * @return the sum except for 13
         *
         * Sample Input / Output
         * sumExcept13({1, 2, 2, 1}) -> 6
         * sumExcept13({1, 2, 2, 1, 13} -> 6
         * sumExcept13({1, 2, 13, 2, 1, 13} -> 4
         */
        int sum = 0;
        int sum1 = 0;
        int nums[] = {1, 2, 13, 2, 1, 13};
        for (i = 0; i <= (nums.length - 1); i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                if ((i + 1) <= nums.length - 1) {
                    sum1 += nums[i + 1];
                }

            }


        }
        int finalsum = sum - sum1;
        System.out.println(finalsum);
        System.out.println("\n----------------------------------------------");


        /**
         * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} return {2, 5, 3, 6}.
         * You may modify and return the given array, or return a new array.
         * @param nums array of ints
         * @return shifted array
         *
         * Sample Input / Output
         * shiftArray({6, 2, 5, 3}) -> {2, 4, 3, 6}
         * shiftArray({2, 3}) -> {3, 2}
         * shiftArray({7}) -> {7}
         */

        int nums1[] = {6, 2, 5, 3};
        //int newNums1[]={};
        for (i = 1; i <= nums1.length - 1; i++) {
            System.out.printf("%d, ", nums1[i]);
        }
        System.out.printf("%d", nums1[0]);

        System.out.println("\n----------------------------------------------");


        int nums2[] = {6, 2, 5, 3};

        int[] newArrayadd = new int[nums2.length + 1];
        int[] newArrayremove = new int[nums2.length];
        for (i = 0; i <= newArrayadd.length - 2; i++) {
            if (i == 0) {
                newArrayadd[0] = nums2[0];
                newArrayadd[newArrayadd.length - 1] = nums2[0];
                //  System.out.println(newArrayadd[i])
            } else {
                newArrayadd[i] = nums2[i];
            }
        }


        for (i = 0; i <= newArrayremove.length - 1; i++) {


            newArrayremove[i] = newArrayadd[i + 1];

        }

        //       System.out.print(Arrays.toString(newArrayadd));
        //System.out.println(newArrayadd[i]);


        System.out.println("\n----------------------------------------------");

        /**
         * Return true if the array contains three increasing adjacent numbers, otherwise false.
         * @param nums array of ints.
         * @return true if the array contains three increasing adjacent numbers, otherwise false.
         */

        int nums7[] = {10, 9, 8, -100, -99, -98, 100};
        int counttimes = 0;
        for (i = 0; i <= nums7.length - 2; i++) {
            if ((nums7[i] - nums7[i + 1]) == -1) {
                counttimes += 1;
            }
        }

        if (counttimes >= 2) {
            System.out.println("Y");
        }


        System.out.println("\n----------------------------------------------");

        /**
         *Return true if the array contains the same number of odds and even numbers, otherwise false.
         */


        //int n1=1;
        //int n2=7;
        int nums77[] = {1, 2, 4, 5, 7, 6, 5, 6, 7, 6};
        int k1 = 0;
        int q1 = 0;

        for (i = 0; i <= (nums77.length - 1); i++) {
            if (nums77[i] % 2 == 0) {
                k1 += 1;
            } else {
                q1 += 1;
            }


            // return k>q;
        }

        System.out.println(k1);
        System.out.println(q1);

        System.out.println("\n----------------------------------------------");
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
        //int nums777[][]={{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
       // int nums777[][]={{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
      // int nums777[][]={{5, 10, 1, 3}, {10, 4, 2, 3}, {1, 2, 8, 5}, {3, 3, 5, 0}};
        int nums777[][]={{1, 1}, {2, 1}};
        int[] newArrayrsumi = new int[nums777.length];
        int[] newArrayrsumj =new int[nums777[0].length];
        int row=nums777.length;
        int coloums=nums777[0].length;
        int counts2=0;
        int counts3=0;

//         for (i=0; i<=(row-1); i++)
//        {
//            for (j=0; j<=(coloums-1); j++)
//            {
//                newArrayrsumi[i]+=nums777[i][j];
//            }
//           // System.out.println(newArrayrsum[i]);
//
//            }
//        for (k=0; k<=(newArrayrsumi.length-2); k++)
//        {
//            if (newArrayrsumi[k]== newArrayrsumi[k+1])
//            { counts2+=1;}
//            if (counts2==newArrayrsumi.length-1){System.out.println("Y");}
//
//
//        }
        for ( i = 0; i <= (row - 1); i++) {
            for ( j = 0; j <= (coloums - 1); j++) {
                newArrayrsumj[i] += nums777[j][i];
            }
            // System.out.println(newArrayrsum[i]);

        }
        for ( k1 = 0; k1 <= (newArrayrsumj.length - 2); k1++) {
            if (newArrayrsumj[k1] == newArrayrsumj[k1 + 1]) {
                counts3 += 1;



            }


        }
        //System.out.println(newArrayrsum[i]);
        if (counts3==newArrayrsumj.length-1){System.out.println("Y");}
        else {System.out.println("N");}



       // }














    }
    }







