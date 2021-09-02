package org.unitj;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//Method1
//@RunWith(Suite.class)
//@SuiteClasses({JunitSample.class, UnitjTask.class})
public class RunAllClasses {
	//Method2
	
	@Test
	public void tc() {
		Result runclass = JUnitCore.runClasses(JunitSample.class, UnitjTask.class);
		System.out.println("RunCount:"+runclass.getRunCount());
		System.out.println("FailureCount:"+runclass.getFailureCount());
		System.out.println("IgnoreCount"+runclass.getIgnoreCount());
		System.out.println("Status"+runclass.wasSuccessful());
		System.out.println("RunTime"+runclass.getRunTime());
		System.out.println("Failed TestCases");
		List<Failure> allFail = runclass.getFailures();
		for (Failure fail : allFail) {
			System.out.println(fail);
			
		}
		
		System.out.println("Passed Count="+(runclass.getRunCount()-runclass.getFailureCount()));
		System.out.println("Total no of Tc:"+(runclass.getRunCount()+runclass.getIgnoreCount()));

	}
	
	

}
