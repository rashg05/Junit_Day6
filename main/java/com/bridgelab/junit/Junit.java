package com.bridgelab.junit;

public class Junit {

	public int[] vendingMachine(int money, int[] notes) {
		int i = 0, rem;
		int k=0;
		int arr[]= new int[10];
		while (money > 0) {
			if (money >= notes[i]) {
				int calcNotes = money / notes[i];
				arr[k]=money / notes[i];
				rem = money % notes[i];
				money = rem;
				System.out.println(notes[i] + " Notes ---> " + calcNotes+"arr: " +arr[k]);
				k++;
			}
			i++;
		}
		int arr1[] = new int[3];
		for(i=0;i<k;i++)
			arr1[i]=arr[i];
		return arr1;
	}

	public int calculateDayOfWeek(int date, int month, int year) {
		int y1, x, m, d1;
		y1 = year - (2 - month) / 12;
		x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
		m = month + 12 * ((2 - month) / 12) - 3;
		d1 = (date + x + 31 * m / 12) % 7;
		return d1;
	}
	
	public double TemperatureConversionFtoC(int x) {
		return (double)(x - 32) * 5/9;
	}
	
	public double TemperatureConversionCtoF(double x) {
		return (double)(x * 9/5) + 32;
	}
	
	public double monthlyPayment(int principalLoanAmount, int year, double R) {
		double payment, r;
		int n;
		n = 12 * year;
		r = (R / (12 * 100));

		payment = (principalLoanAmount * r) / (1 - Math.pow(1 + r, -n));
		return payment;
	}
	
	public double Sqrt(int c) {
		double t, epsilon;
		t = c;
		epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		return t;
	}
	
	public int[] DecToBinary(int n)
	{
		int[] binaryNum = new int[1000];
		int i = 0;
		while (n > 0) 
		{
			binaryNum[i] = n % 2;
			n = n / 2;
			i++;
		}
		int [] binary = new int[i+1];
		int k = 0;
		for (int j = i ; j >= 0; j--) {
			
			System.out.println("binaryNum : "+binaryNum[j]);
			binary[k] = binaryNum[j];
			System.out.println("binary : "+binary[k]);
			k++;
		}
		System.out.println(binary);
		return binary;
	}

	public int[] swapNibbles(int[] arr) {
		int temp, j = arr.length - 4;
		for (int i = 0; i < 4; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j++;
		}
		return arr;
	}			

}
