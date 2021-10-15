package ca.ciccc;



/**
 * //import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;
 * This is the starter file for the Assignment 2
 *
 * @author Derrick Park
 * @version 1.0
 */
public class Assignment2 {
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

    public String numberLoops(int n) {

        int i;
        int j;
        String result = "";

        for (i =1;i<=n;i++)
        {
            for (j=n-i;j>0;j--)
            {
                result += ".";
            }
            for (int k=1;k<=i;k++){

                result +=String.valueOf(i);}
            if (i!=n) {result+="\n";}
        }

        return result;
    }






    /**
     * Given an array of integers, return true if the number of 1s is greater than the number of 7s
     * @param nums array of ints
     * @return true if the number of 1s is greater than the number of 7s
     */
    public boolean countNumbers(int[] nums) {

        int n1=1;
        int n2=7;
        int k=0;
        int q=0;

        for(int i=0 ;i<=(nums.length-1) ;i++)
        {
            if(nums[i]==n1 )
            {
             k+=1;
            }
        }

        for(int i=0 ;i<=(nums.length-1) ;i++)
        {

            if(nums[i]==n2 )
            {
                q+=1;
            }
        }
        return k>q;
    }

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
    public int sumExcept13(int[] nums) {
        int sum=0;
        int sum1=0;

        for(int i=0 ;i<=(nums.length-1) ;i++)
        {
            if (nums[i]!=13) { sum+=nums[i];}
            else {

                    if ((i+1) <= nums.length-1) {
                        sum1+=nums[i+1];}



            }


        }
        int finalsum = sum-sum1;

        return finalsum;
    }

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
    public int[] shiftArray(int[] nums) {

        int[] newArrayadd = new int[nums.length + 1];
        int[] newArrayremove = new int[nums.length];

        for (int i = 0; i <= newArrayadd.length - 2; i++) {
            if (i == 0) {
                newArrayadd[0] = nums[0];
                newArrayadd[newArrayadd.length-1] = nums[0];
                //  System.out.println(newArrayadd[i])
            } else {
                newArrayadd[i] = nums[i];
            }
        }

        for (int i = 0; i <= newArrayremove.length - 1; i++) {
            newArrayremove[i] = newArrayadd[i+1];
        }

        return newArrayremove ;
    }

    /**
     * Return true if the array contains three increasing adjacent numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains three increasing adjacent numbers, otherwise false.
     */
    public boolean tripleIncreasingOrder(int[] nums) {

        int counttimes=0;
        for (int i = 0; i<=nums.length-2; i++)
        {
            if ((nums[i]-nums[i+1]) == -1)
            {   counttimes+=1;
            }
        }
        if (counttimes>=2){
            return true;}

        return false;
    }

    /**
     * Return true if the array contains the same number of odds and even numbers, otherwise false.
     * @param nums array of ints.
     * @return true if the array contains the same number of odds and even numbers, otherwise false.
     */
    public boolean evenOrOdd(int[] nums){
        int k1=0;
        int q1=0;

        for( int i=0 ;i<=(nums.length-1) ;i++) {
            if (nums[i] % 2 == 0) {
                k1 += 1;
            } else {
                q1 += 1;
            }
        }

        return (k1==q1);
    }
}

