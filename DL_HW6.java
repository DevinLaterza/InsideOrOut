// the purpose of this program is to determine whether an ordered pair input by the user lies within a circle (size determined by user),
// a rectangle (size determined by user), both or neither
// this program also draws a random card and displays the result
// circle and rectangle assumed to be centered over origin
// Programmer: Devin Laterza
// Professor: Dr. Pushkar Ogale
// CSC 102
import java.util.Scanner;
import java.util.*;

public class DL_HW6
{
  public static void main(String[] args)
  {
   //this part of the program determines whether a point lies within a circle, rectangle, both or neither
    Scanner input = new Scanner(System.in);
    boolean continueInput = true;
    int radius = 0;
    int length = 0;
    int width = 0;
    int x = 0;
    int y = 0;
    //try-catch statements nested within do while loops catch mismatched input and re-prompt for input
    do {
      try {
      System.out.println("Please enter the radius of a circle");
      radius = input.nextInt();
      if (radius < 1)
        System.out.println("Radius must be a positive integer");
      else
        continueInput = false; //user entered a valid integer
      // this is a test
    }
    catch (InputMismatchException ex){
      System.out.println("Invalid input, please enter an integer value");
      input.nextLine();
    }
    } while(continueInput);
    
    continueInput = true;
    
    do {
      try {
      System.out.println("Please enter the length of a rectangle");
      length = input.nextInt();
      if (length < 1)
        System.out.println("Length must be a positive integer");
      else
        continueInput = false;
      }
      catch(InputMismatchException ex) {
        System.out.println("Invalid input, please enter an integer value");
        input.nextLine();
      }
    } while (continueInput);
    
    //this is a new change
    
    continueInput = true;
    
    do {
      try{
        System.out.println("Please enter the width of that rectangle");
        width = input.nextInt();
        if (width < 1)
          System.out.println("Width must be a positive integer");
        else
          continueInput = false;
      }
      catch (InputMismatchException ex) {
        System.out.println("Invalid input, please enter an integer value");
        input.nextLine();
      }
    } while (continueInput);
    
    continueInput = true;
    
    do {
      try{
        System.out.println("Please enter the x value of an ordered pair");
        x = input.nextInt();
        continueInput = false;
      }
      catch (InputMismatchException ex) {
        System.out.println("Invalid input, please enter an integer value");
        input.nextLine();
      }
    } while (continueInput);
    
    continueInput = true;
    
    do {
      try {
        System.out.println("Please enter the y value of an ordered pair");
        y = input.nextInt();
        continueInput = false;
      }
      catch (InputMismatchException ex) {
        System.out.println("Invalid input, please enter an integer value");
        input.nextLine();
      }
    } while (continueInput);
 
    //pythagorean theorem to process the distance of the point from the origin of a theoretical cartesian plane
    double z = (Math.pow(x,2)) + (Math.pow(y,2));
    z = Math.sqrt(z);
    //dimensions of rectangle divided by 2 as rectangle is assumed to be centered over origin
    double halfWidth = width / 2;
    double halfLength = length / 2; 
    //conditional statements to determine point in relation to circle and rectangle
    if (z <= radius) //inside the circle
    {
      if ((x <= halfLength && y <= halfWidth))
          System.out.println("The point lies within both the circle and the rectangle");
      else
        System.out.println(" The point lies within the circle but oustide of the rectangle");
    }

    else //outside the circle
    {
      if ((x <= halfLength && y <= halfWidth))
          System.out.println("The point lies outside of the circle and inside of the rectangle");
      else
        System.out.println("The point lies outside of both");
    }
    //this part of the program generates and outputs a random card
   int rank = 1 + (int)(Math.random() * 13) ;
   int suit = (int)(Math.random() * 4);
   System.out.print("The random card picked was ");
   //conditional statement to print only numeric ranks
   if (rank > 1 && rank < 11)
     System.out.print(rank);
   //conditional statements to print royal ranks
   if (rank == 11)
     System.out.print("Jack");
   if (rank == 12)
     System.out.print("Queen");
   if (rank == 13)
     System.out.print("King");
   if (rank == 1)
     System.out.print("Ace");
   //conditional statements to print suits
   if (suit == 0)
     System.out.println(" of Hearts");
   if (suit == 1)
     System.out.println(" of Diamonds");
   if (suit == 2)
     System.out.println(" of Clubs");
   if (suit == 3)
     System.out.println(" of Spades");
    
     input.close();
  }
}
      