package testng;

import org.testng.annotations.Test;

public class Annotations_Example2 extends BaseClass{
	
	
	@Test(groups= {"sanity"})
	public void test3() {
		
		System.out.println("inside test3");
		
	}
	
	@Test
	public void test4() {
		
		System.out.println("inside test4");
		
	}


}
