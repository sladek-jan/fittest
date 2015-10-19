| [src](http://code.google.com/p/fittest/source/browse/#svn%2Ftrunk%2FITE%20Components%20standalone%2FModel%20%20Inference%20and%20Transformer%20tools%2FFSM-based%2FCT2Selenium) | [doc](http://fittest.googlecode.com/svn/trunk/ITE%20Components%20standalone/Model%20%20Inference%20and%20Transformer%20tools/FSM-based/transformtools/Documentation/Documentation-UserGuide.pdf) | [download](https://drive.google.com/folderview?id=0B1lIbYI9LkEJTHhFU0drSERtMGc&usp=sharing&tid=0BwFaBuXA-b2vaXVEdU54ZV9zUEE) |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------|

# Introduction #

CT2Selenium component take classification trees and domain input specification file as input and generate executable test cases in the format of Selenium/JUnit.

Example of a test case:
```
//-- test cases -----------------------------------//
	 	/**
	 * c7 c12 
	 *
	 * 
	 */
	@Test 
	public void test_c2036(){

		// Load target page
		driver.get(targetURL);

		// Trigger web events
		WebElement e1946 = driver.findElement(By.id("memberUsername"));

		assertNotNull(e1946);
		e1946.sendKeys("test1");

		waitForTimeout(driver, 5);

		WebElement e1948 = driver.findElement(By.id("amount"));

		assertNotNull(e1948);
		e1948.sendKeys("0.0");

		WebElement e1949 = driver.findElement(By.id("submitButton"));

		assertNotNull(e1949);
		e1949.click();

		//TODO specify assertions
	}
```