package com.task1;

import java.util.Scanner;

public class BmiCalculator {

   public static void main(String[] args) throws Exception {
       calculateBMI();
   }

   private static void calculateBMI() throws Exception 
   {
       System.out.print("Please enter your weight in kg: ");
       Scanner s = new Scanner(System.in);
       float weight = s.nextFloat();
       System.out.print("Please enter your height in cm: ");
       float height = s.nextFloat();
       float bmi = (100*100*weight)/(height*height);
       System.out.println("Your BMI is: "+bmi);
       printBMICategory(bmi);    
   }
   private static void printBMICategory(float bmi) 
   {
       if(bmi < 18.5) {
           System.out.println("underweight");
       }else if (bmi>=18.5 || bmi < 25) {
           System.out.println("normal");
       }else if (bmi>=25 || bmi < 30) {
           System.out.println("overweight");
       }else if(bmi>=30) {
           System.out.println("obese");
       }
   }
}
