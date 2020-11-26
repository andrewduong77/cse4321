import org.junit.runner.RunWith;
import org.junit.*;
import org.junit.runner.*;

import org.junit.runners.Suite;
import org.junit.runner.notification.Failure;
import java.util.List;



@RunWith(Suite.class)
@Suite.SuiteClasses ({
   TriangleClassifierTest.class
})

// this class is just a place holder
public class SuiteTest {
    public static void main (String[] args) {
	Result result = JUnitCore.runClasses (SuiteTest.class);
	List<Failure> failures = result.getFailures();
	for (Failure failure : failures) {
	    System.out.println(failure);
	    System.out.println(failure.getTrace());
	}
    }
}
