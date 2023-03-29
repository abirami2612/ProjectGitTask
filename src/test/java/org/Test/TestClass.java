package org.Test;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class TestClass extends BaseClass {
	
	public  TestClass() {
		
		PageFactory.initElements(driver, this);
		
	}

}
