package Project1;

import java.io.*;
import java.util.*;

/**
 *
 * The purpose this class is to simulate a change Jar.
 *
 *
 * 	 NOTE: MUCH MORE CODING IS NEEDED IN THESE METHODS, and you
 * 	 will need to comply with the Java Style Guide.
 * 	 HOWEVER,  HERE IS SOME STARTING CODE.
 *
 * @suthor
 */

public class ChangeJar {

    /** The number of quarters in the current Jar */
    private int quarters;

    /** The number of dimes in the current Jar */
    private int dimes;

    // Now you do the rest of the instance variables using the
    // Java Style guide.
    private int nickels;
    private int pennies;

    /******************************************************************
     *  The is the default constuctor for ChangeJar
     */

    public ChangeJar() {
        quarters = 0;
        dimes = 0;
        nickels = 0;
        pennies = 0;
    }

    public ChangeJar(double amount){
        int quarters = (int) (amount/.25);
        amount = amount - (quarters*.25);

        int dimes = (int) (amount / .10);
        amount = amount - dimes * .10;

        int nickels = (int) (amount / .05);
        amount = amount - nickels * .05;

        int pennies = (int) (amount / .01);
        amount = amount - pennies * .01;

    }

    /******************************************************************
     *
     *   This constructor creates a Change Jar from an existing
     *    Change Jar.
     *
     * @param other is an existing Change Jar
     */

    public ChangeJar(ChangeJar other) {
        quarters = other.quarters;
        dimes = other.dimes;
        nickels = other.nickels;
        pennies = other.pennies;
    }

    /******************************************************************
     *
     *   This constructor creates a Change Jar from with some
     *   initial values for Quarters, Dimes, Nickels, and Pennies.
     **
     * @param quarters is the number of quarters to start with.
     * @param dimes is the number of dimes to start with.
     * @param nickels is the number of nicels to start with.
     * @param pennies is the number of pennies to start with.
     *                 
     */
    public ChangeJar(int quarters, int dimes, int nickels, int pennies) {
        super();

        if (quarters < 0)
            throw new IllegalArgumentException();

        this.quarters = quarters;
        this.dimes = dimes;
        this.nickels = nickels;
        this.pennies = pennies;
    }

// REMEBER to use the Java Style Guide for the rest of your code.

    private static int convertToPennies (ChangeJar temp) {
        return (temp.quarters * 25) + (temp.dimes * 10) + (temp.nickels * 5) + temp.pennies;
    }

    public static void mutate(boolean selected) {
    }

    public boolean equals(ChangeJar s) {
        return true;
    }

    public boolean equals(Object s) {
        return  true;
    }

    public static boolean equals(ChangeJar s, ChangeJar s1) {
        return true;
    }

    public int compareTo(ChangeJar s) {
        return 0;
    }

    public static int compareTo(ChangeJar jar1, ChangeJar jar2)  {
        return 0;
    }

    public void takeOut(int quarters, int dimes, int nickels, int pennies) {
        this.quarters -= quarters;
        this.dimes -= dimes;
        this.nickels -= nickels;
        this.pennies -= pennies;

    }

    public void takeOut(ChangeJar other) {
    }

    public ChangeJar takeOut (double amount) {
        return null;
    }

      public String toString() {

        // here is a hint
        String s = this.quarters + " Quarter" + ((quarters != 1) ? "s" : "") + "\n";
        return s;
    }

    public void save(String fileName) {

        PrintWriter out = null;
        try {
            out = new PrintWriter(new BufferedWriter(new FileWriter(
                    fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }


    public void load(String fileName) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public double getAmount () {
        return convertToPennies(this) / 100.0;
    }


    public static void main(String[] args) {

    }

    public int getQuarters() {
        return quarters;
    }

    public void setQuarters(int quarters) {
        this.quarters = quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public void setDimes(int dimes) {
        this.dimes = dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public void setNickels(int nickels) {
        this.nickels = nickels;
    }

    public int getPennies() {
        return pennies;
    }

    public void setPennies(int pennies) {
        this.pennies = pennies;
    }


}