package com.testingshastra.regression;

import org.testng.annotations.Test;

public class AnnotationOfTestng {
	@Test(description = "To check description Annotation")
	public void m1() {
		System.out.println("First Method");
	}

	@Test  (dependsOnMethods = "m5",alwaysRun=true)                         //(priority = -1)
	public void m2() {
		System.out.println("Second Method");

	}

	@Test(enabled = false)
	public void m3() {
		System.out.println("Third Method");

	}

	@Test(invocationCount = 3,threadPoolSize = 3)
	public void m4() {
		System.out.println("Fourth Method");

	}

	@Test(expectedExceptions = { InterruptedException.class, RuntimeException.class }) // (timeOut=3000)
	public void m5() throws InterruptedException {
		System.out.println("Fifth Method");
		Thread.sleep(3000);

	}
	
	  @Test (invocationTimeOut = 4000,invocationCount = 3)
	   public void m6()  throws InterruptedException{
	  System.out.println("Sixth Method");
	  Thread.sleep(3000);
	  
	  }
	  @Test  (dependsOnMethods =  "m2",alwaysRun = true)
	  public void m7(){
		  System.out.println("Seventh Method");

	}
	  @Test (groups = {"searchcomponent","Sanity"})
	  public void m8() {
		
	System.out.println("eighth Method");
	  }
	  @Test ()
	  public void m9() {
	
        System.out.println("Nineth Method");
	}
	

	 

}
