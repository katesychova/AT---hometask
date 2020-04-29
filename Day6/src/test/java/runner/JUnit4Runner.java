package runner;

import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Suite;
import test.AdditionalUnitTest;
import test.BigTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({BigTest.class, AdditionalUnitTest.class})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JUnit4Runner {
}
