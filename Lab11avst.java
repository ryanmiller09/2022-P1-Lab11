// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

        for(int k = 2; k < primes.length; k++) {
            primes [k] = true;
        }

       for(int x = 4; x < primes.length; x+=2){
           primes[x] = false;
       }

       for(int y = 6; y < primes.length; y+=3){
           primes[y] = false;
       }

       for(int g = 10; g < primes.length; g+=5){
           primes[g] = false;
       }

       for(int p = 14; p < primes.length; p+=7){

       }


          }





    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for(int k = 2; k < primes.length; k++) {
            if(primes[k] == true){
                System.out.print(k + " ");
            }



        }
    }

}



