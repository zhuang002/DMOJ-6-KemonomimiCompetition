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
    static int elapsedTime=0;
    static Record[] records;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=sc.nextInt();
        
        for (int i=0;i<c.length;i++)
            c[i]=sc.nextInt();
        
        records=new Record[n];
        for (int i=0;i<n;i++) {
            records[i]=new Record();
            records[i].read(sc);
            
        }
        
        for (int i=0;i<n;i++) {
            if (elapsedTime<records[i].si)
                elapsedTime=records[i].si;
        }
        
        for (int i=0;i<n;i++) {
            records[i].calculateAdditionalScore(c,elapsedTime);
        }
        
        for (int i=0;i<n;i++) {
            records[i].printAdditionalScore();
        }
    }
}

class Record {
    int i;
    int pi;
    int si;
    int ti;
    private int additionalScore;

    void calculateAdditionalScore(int[] c,int elapsedTime) {
        int timeNeeded=c[this.i]*this.ti;
        if (timeNeeded<=180-elapsedTime)
            this.additionalScore=10-this.pi;
        else
            this.additionalScore=-1;
    }

    void printAdditionalScore() {
        if (this.additionalScore>=0) {
            System.out.println(this.additionalScore);
        } else
            System.out.println("The kemonomimi are too cute!");
    }

    void read(Scanner sc) {
        this.i=sc.nextInt()-1;
        this.pi=sc.nextInt();
        this.si=sc.nextInt();
        this.ti=sc.nextInt();
    }
}
