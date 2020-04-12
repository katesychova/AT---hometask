package com.DAY_4;

import com.DAY_4.entity.AutomatedTest;
import com.DAY_4.entity.ManualTest;
import com.DAY_4.entity.TestLevel;
import com.DAY_4.worker.AutomationEngineer;
import com.DAY_4.worker.TestEngineer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ManualTest manualTest = new ManualTest(TestLevel.GUI, 2);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 4);
        TestEngineer testEngineer = new TestEngineer();
        System.out.println("Test " + manualTest.apply(automationEngineer));
        System.out.println("Test " + automatedTest.apply(testEngineer));
        System.out.println("Test " + manualTest.apply(testEngineer));
        System.out.println("Test " + automatedTest.apply(automationEngineer));
    }
}
