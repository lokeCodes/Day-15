/* package codechef; // don't place package name! */

// https://www.codechef.com/problems/BUDGET_
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = 30*(s.nextInt());
		    String res = (y<=x) ? "YES" : "NO ";
		    System.out.println(res);
		}
	}
}
