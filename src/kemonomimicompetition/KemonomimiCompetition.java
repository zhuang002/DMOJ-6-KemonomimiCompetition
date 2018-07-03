/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemonomimicompetition;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class KemonomimiCompetition {
    static Scanner sc=new Scanner(System.in);
    static int[] c=new int[4];
    static int[] timeNeeded;
    static int elapsedTime=0;
    static int[] pi;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=sc.nextInt();
        timeNeeded=new int[n];
        pi=new int[n];
        for (int i=0;i<c.length;i++)
            c[i]=sc.nextInt();
        
        for (int i=0;i<n;i++) {
            calculateTimeNeeded(i);
        }
        for (int i=0;i<n;i++) {
            if (timeNeeded[i]<=180-elapsedTime)
                System.out.println(10-pi[i]);
            else 
                System.out.println("The kemonomimi are too cute!");
        }
    }

    private static void calculateTimeNeeded(int index) {
        int i=sc.nextInt();
        pi[index]=sc.nextInt();
        int si=sc.nextInt();
        int ti=sc.nextInt();
        if (elapsedTime<si)
            elapsedTime=si;
        timeNeeded[index]=ti*c[i-1];
    }
    
}
