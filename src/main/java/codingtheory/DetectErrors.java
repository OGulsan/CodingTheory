package codingtheory;

import java.util.*;

public class DetectErrors {

    public static void main(String[] args) {

        //Given a binary code, determine the number of errors that it can detect and
        //the number of errors that it can correct


        //Establish code and codewords based off of user input
        int numOfCodeWords;
        int lenOfCodeWords;
        Scanner in = new Scanner(System.in);

        System.out.println("How many code words are in your Code: ");
        numOfCodeWords = in.nextInt();

        System.out.println("What is the length of each code word: ");
        lenOfCodeWords = in.nextInt();

        String[] Code = new String[numOfCodeWords];

        //Ask user for code words and make sure  each input is valid
        int count = 0;

        while(count != numOfCodeWords)
        {
            System.out.println("Enter code word " + (int) (count + 1) + ":");
            String input = in.next();
            //checks if valid input
            try{
                if(isBinary(Integer.parseInt(input)) && input.length() == lenOfCodeWords){ //checks if input is binary and proper length
                    Code[count] = input;
                    count++;
                }
                else
                    System.out.println("Invalid Input...");
            }
            catch (NumberFormatException ex){
                ex.printStackTrace();
            }
        }

        // Calculates and displays number of errors that can be detected and corrected
        int hemmingDistance = hemmingDistance(Code, lenOfCodeWords);
        detectErrors(hemmingDistance);
        correctErrors(hemmingDistance);

    }

    public static int hemmingDistance(String[] Code, int lenOfCodeWords){
        int min = lenOfCodeWords + 1;

        for(int i = 0; i < Code.length; i++)
        {
            for(int j = i + 1; j < Code.length; j++)
            {
                //for each code word - find the distance of itself compared with the other codewords
                // and return the minimum distance
                int distance = distance(Code[i], Code[j]);
                if(distance < min)
                    min = distance;
            }
        }
        return min;
    }


    public static int distance(String s1, String s2){
        // Calculates the distance between two codewords
        int count = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            if(Character.compare(s1.charAt(i), s2.charAt(i)) != 0)
                count += 1;
        }
        return count;
    }


    public static int correctErrors(int hemmingDistance){
        int numOfCorrections = (hemmingDistance - 1) / 2;
        System.out.println("Can correct up to: " + numOfCorrections + " errors.");
        return numOfCorrections;
    }


    public static int detectErrors(int hemmingDistance){
        int numOfErrors = hemmingDistance - 1;
        System.out.println("Can detect up to: " + numOfErrors + " errors.");
        return numOfErrors;
    }

    public static boolean isBinary(int number) {
        int input = number;

        while (input != 0) {
            if (input % 10 > 1 || input % 10 < 0) {
                return false;
            }
            input = input / 10;
        }
        return true;
    }


}