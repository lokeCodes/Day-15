// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int rem =0;
        int sum =0;
        while(t-- > 0){
            int x = s.nextInt();
            sum = x%10;
            while(x>0){
                rem = x%10;
                x=x/10;
            }
            sum = sum+rem;
            System.out.println(sum);
        }
	}
}


