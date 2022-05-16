package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Day03_6 {
	
	public static void main(String[] args) {
		
		
		
		//3
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=i1 ; i1_1++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		
		//4
		/*
		for(int i1=5 ; i1>=1 ; i1--) {
			for(int i1_1=1 ; i1_1<=i1 ; i1_1++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//5
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=i1 ; i1_2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//6
		/*
		for(int i1=5 ; i1>=1 ; i1--) {
			for(int i1_2=0 ; i1_2<(5-i1) ; i1_2++) {
				System.out.print(" ");
			}
			for(int i1_1=0 ; i1_1<i1 ; i1_1++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//7
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//8
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				System.out.printf("%d", i1);
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		
		
		//9
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=i1 ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(10-(2*i1-1)) ; i1_2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//10
		/*
		for(int i1=1 ; i1<=5 ; i1++) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i1=4 ; i1>=1 ; i1--) {
			for(int i1_1=1 ; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		
		
		//11
		
		/*
		for(int i1=0;i1<=6;i1++) {
			for(int i1_1=0;i1_1<=6;i1_1++) {
				if(i1_1==i1) {System.out.print("*");}
				else if(i1_1==(6-i1)) {System.out.print("*");}
				else {System.out.print(" ");}
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		//12
		
		/*
		for(int i1=1; i1<=5 ; i1++) {
			for(int i1_1=1; i1_1<=i1 ; i1_1++) {
				System.out.print("*");
			}
			for(int i1_1=1; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}	
			for(int i1_1=1; i1_1<=(5-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_1=1; i1_1<=i1 ; i1_1++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
				
		for(int i1=1; i1<5 ; i1++) {
			for(int i1_1=4; i1_1>=(i1) ; i1_1--) {
				System.out.print("*");
			}
			for(int i1_1=1; i1_1<=i1 ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_1=1; i1_1<=i1 ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_1=4; i1_1>=(i1) ; i1_1--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		
		
		
		
		
		

		
		
		
		//13
		
		
		
		
		for(int i1=1 ; i1<=3 ; i1++) {
			for(int i1_1=1 ; i1_1<=(3-i1) ; i1_1++) {
				System.out.print(" ");
			}
			for(int i1_2=1 ; i1_2<=(2*i1-1) ; i1_2++) {
				if((i1==2)&&(i1_2==2)) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
	}
		
}


