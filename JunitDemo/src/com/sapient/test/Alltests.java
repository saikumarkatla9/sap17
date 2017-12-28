package com.sapient.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectClasses({CalcTest.class, RoundTest.class, PalindromeTest.class,
//		ReverseNameTest.class, LoanTest.class})

@SelectPackages("com.sapient.test") // comma separated diff packages can be included
@ExcludeTags("prod")
public class Alltests {
	

}
