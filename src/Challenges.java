import java.util.Arrays;


public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        int count = 0;
        for (boolean b : arr) {
            if (b) {
                count++;
            }
        }
        return count;
    }
        

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int diff = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] < min) {
                min = nums[x];
            }

            diff = max - min;
            if(diff<0){
                diff=diff*-1;
            }
        }

        // you will need to change the return statement
        return diff;
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        String elip = "... ";
        String ques = "?";
        String first = str.substring(0,2)+elip;
        String end = str+ques;
        String stutteredWord = first+first+end;
        // write your code here
        // you will need to change the return statement
        return stutteredWord;
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int x = nums.length -2;

        // write your code here
        // you will need to change the return statement
        return nums[x];
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        String word= "";

        if (num % 3 == 0 && num % 5 == 0){
            word = "FizzBuzz";
        }else if(num % 3 == 0){
            word = "Fizz";
        }else if(num % 3 != 0 && num % 5 != 0) {
            word = String.valueOf(num);
        }else if(num % 5 == 0){
            word = "Buzz";
        }
        // write your code here
        // you will need to change the return statement
        return word;
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        int x = countFrom;
        String list = "";

        if(countTo<countFrom){
            list = "Try again with better numbers!";
        }else {
            while (x <= countTo) {
                if (x == countTo || x+countBy>countTo) {
                    list = list + x;
                } else {
                    list = list + x + ".. ";
                }
                x = x + countBy;
            }
        }
        return list;
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        String str = "";
        char[] try1 = reverseMe.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            char c = try1[i];
                if (Character.isUpperCase(c))
                {
                    try1[i] = Character.toLowerCase(c);
                }
                else if (Character.isLowerCase(c))
                {
                    try1[i] = Character.toUpperCase(c);
                }
            str = str + (try1[i]);
        }
        return str;
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr){
            int[] b = new int[arr.length];
            int j = arr.length;
            
            for (int i = 0; i < arr.length; i++) {
                b[j - 1] = arr[i];
                j = j - 1;
            }
        return b;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        String search;
        checkMe = checkMe.toLowerCase();

        if(checkMe.contains("bomb")){
            search = "DUCK!";
        }else{
            search="Relax, there's no bomb.";
        }
        // write your code here
        // you will need to change the return statement
        return search;
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str){
        str = Arrays.stream(str).distinct().toArray(String[]::new);
        // write your code here
        // you will need to change the return statement
        return str;
    }
}