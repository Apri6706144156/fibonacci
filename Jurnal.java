/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

/**
 *
 * @author Praktikum
 */
import java.util.Scanner;
public class Jurnal {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int num1=0,num2=2,jum;
		int count;
	//REVERSE FIBONANCI
		System.out.println("penjumlahan angka" +
				" beberapa digit angka di input oleh user");
		
		System.out.println("enter N");
		int N = input.nextInt();
		System.out.println("pertama " + N  + " angka di fibonacci" +
				"angka yang diikuti");
		
		
		

		for (count = 1;count<= N; count++) { 
		jum=num1+num2; 
		num1=num2; 
		num2=jum; 
		System.out.print(" "+num1); 
	} 
    } 
} 
        
