package lab1;

import java.util.ArrayList;

/*
 * This class exercises functions and decision statements
 */
public class Problem5 {
    public static void getAverage(ArrayList<Integer> numberList) {
        if (numberList == null || numberList.isEmpty()) {
            System.out.println("List is empty");
        }//nothing there

        int total = 0;
        for (int num : numberList) {
            total += num;
        }// if there is numbers, add them all up

        System.out.println(total / numberList.size());// make an average by dividing the amount there is
    }
    public static void getMiddle(ArrayList<Integer> numberList) {
        if (numberList == null || numberList.isEmpty()) {
            System.out.println("List is empty - no middle value");
            return;
            //empty list, nothing to print
        }

        int size = numberList.size();
        int mid = size / 2;

        if (size % 2 == 1) {
            System.out.println("Middle value: " + numberList.get(mid));//if its an odd number
        } else {
            System.out.println("Middle values: " + numberList.get(mid - 1) + " and " + numberList.get(mid));// if its an even number

        }
    }
    public static void getNegativeTotal(ArrayList<Integer> numberList) {
        if (numberList == null || numberList.isEmpty()) {
            System.out.println("List is empty - no negative total");
            return;
            //empty list, nothing to print
        }               
        int negativeTotal = 0;
        for (int num : numberList) {
            if (num < 0) {
                negativeTotal += num;
            }
        }
        System.out.println("Total of negative numbers: " + negativeTotal);
    }
    public static void isMoreNegative(ArrayList<Integer> numberList) {
        if (numberList == null || numberList.isEmpty()) {
            System.out.println("List is empty - cannot compare negatives and positives");
            return;
            //empty list, nothing to print
        }               
        int negativeCount = 0;
        int positiveCount = 0;
        for (int num : numberList) {//counting positives and negatives
            if (num < 0) {
                negativeCount++;
            } else if (num > 0) {
                positiveCount++;
            }
        }
        if (negativeCount > positiveCount) {
            System.out.println("More negative numbers");
        } else if (positiveCount > negativeCount) {
            System.out.println("More positive numbers");
        } else {
            System.out.println("Equal number of positive and negative numbers");
        }
    }   

    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        //adds numbers to the newly created list
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(0);
        numberList.add(-1);
        numberList.add(-2);
        numberList.add(-3);
        numberList.add(-4);
        getAverage(numberList);
        getMiddle(numberList);
        getNegativeTotal(numberList);
        isMoreNegative(numberList); 


    }

    

    

}
