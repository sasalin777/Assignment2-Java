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
                newArrayadd[newArrayadd.length-1] = nums2[0];
              //  System.out.println(newArrayadd[i])
            } else {
                newArrayadd[i] = nums2[i];
            }
        }


        for (i = 0; i <= newArrayremove.length - 1; i++) {


                newArrayremove[i] = newArrayadd[i+1];

            }

        //       System.out.print(Arrays.toString(newArrayadd));
        //System.out.println(newArrayadd[i]);


            // int[] newArray = new int[nums2.length-1];
            //for (i=1;i<=newArray.length-1;i++) {

            // newArray[i]=nums2[i];


            //}
            //System.out.printf("%d",nums1[0]);


            System.out.println("\n----------------------------------------------");


        }
    }







