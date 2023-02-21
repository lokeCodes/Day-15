// https://www.codechef.com/problems/INTEST?tab=statement
// Question Link^^^

import java.util.*;


public class Main {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int k = s.nextInt();
        int sum=0;
        while(t-- > 0){
            int t1 = s.nextInt();
            if(t1%k==0){
                sum++;
            }
        }
        System.out.println(sum);
	}
}
