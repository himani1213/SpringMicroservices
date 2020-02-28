package arrayPractice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Ants {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int winTerm =0;
        int winAnt =0;
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();*/
        //String s[] = new String[n];
        StringBuffer s = new StringBuffer("AATT");
        for(int i=0;i<s.length();i++) {
           // if(sc.hasNext()) {
                //sc.next();
                 //s.append(sc.next());
            if(s.charAt(i)==('A')) {
                winAnt++;
            }
            else if(s.charAt(i)==('T')) {
                winTerm++;
            }
            if(i!=0 && s.charAt(i-1)==('A') && s.charAt(i)==('T')) {
                //winTerm++;
                winAnt--;
            }
           // }
           
        }
        if(winAnt> winTerm) {
            System.out.print("Ants");
        } else if(winAnt< winTerm) {
            System.out.print("Termites");
        }else {
            System.out.print("Tie");
        }
    }
}