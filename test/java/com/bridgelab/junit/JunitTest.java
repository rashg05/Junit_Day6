package com.bridgelab.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

	Junit method = null;
	@Before
	public void initialization() {
		method = new Junit();
	}

	@Test
	public void givenNoOfNotesShouldReturnChangeInRs() {

		Junit method = new Junit();
		int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int money = 222;
		int output[] = method.vendingMachine(money,notes);
		int expected[] = {2,2,1};
		Assert.assertArrayEquals(expected, output);
	}

	@Test
	public void givenDateMonthAndYearShouldReturnDay() {
		int date = 2;
		int month = 3;
		int year = 2022;
		int day = method.calculateDayOfWeek(date, month, year);
		Assert.assertEquals(1, day);
	}

	@Test
	public void givenTempeInFShouldReturnTempInC() {
		int tempInF = 32;
		double tempInC = method.TemperatureConversionFtoC(tempInF);
		Assert.assertEquals(0, tempInC,0.0);
	}

	@Test
	public void givenTempeInCShouldReturnTempInF() {
		double tempInC = 1;
		double tempInF = method.TemperatureConversionCtoF(tempInC);
		Assert.assertEquals(33.8, tempInF,0.0);
	}

	@Test
	public void givenYearPricipleLoanInterestShouldReturnMonthlypayent() {
		int principalLoanAmount = 12 ;
		int year = 2;
		double interestRate = 20;	
		double payment = method.monthlyPayment(principalLoanAmount, year, interestRate);
		Assert.assertEquals(0.6107496317188686, payment,0.0);
	}

	@Test
	public void givenNumberShouldReturnSquareRoot() {
		int num = 3;
		double sqaureRoot = method.Sqrt(num);
		Assert.assertEquals(1.7320508075688772, sqaureRoot,0.0);
	}

	@Test
	public void givenDecimalShouldReturnBinary() {
		int arr[] = method.DecToBinary(100);  
		int expected []= {0,1,1,0,0,1,0,0};
		Assert.assertArrayEquals(expected,arr);
	}

	@Test
	public void givenBinaryShouldReturnSwapedNibble() {
		int arr[] = method.DecToBinary(100);  
		int output[] = method.swapNibbles(arr);
		int expected []= {0,1,0,0,0,1,1,0};
		Assert.assertArrayEquals(expected,output);
	}

}
