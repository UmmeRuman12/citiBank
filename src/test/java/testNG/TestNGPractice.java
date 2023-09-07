package testNG;

import org.testng.annotations.Test;

public class TestNGPractice {
	@Test(priority = -1)//u can give 1 2 3 for priority or -3 -2 -1 or etc
	public void createCustomer1()
	//to run this test twice @Test(invocationCount = 2)
	{
		System.out.println("customer created");
	}
	@Test
	public void modifycustomer()
	{
		System.out.println("customer modified");
	}
	@Test(priority = 3)
	public void deletedCustomer()
	{
		System.out.println("customer deleted");
	}

}
