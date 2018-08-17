package com.user.bean;

import java.util.Scanner;

public class mk {

		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int[] values = new int[n];
		    for (int i = 0; i < values.length; i ++) {
		        values[i] = sc.nextInt();
		    }
		    int odd = 0;
		    int even = 0;
		    int i = 1;
		    if (i % 2 == 0) {
		        even = values[i];
		    } else {
		        odd = values[i];
		    }
		    i++;
		    System.out.printf("%d %d%n", odd, even);        
		  }


		}

