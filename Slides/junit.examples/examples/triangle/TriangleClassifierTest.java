import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.MethodSorters;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TriangleClassifierTest {
  
    public static void main (String[] args) {
	Result result = JUnitCore.runClasses (TriangleClassifierTest.class);
	List<Failure> failures = result.getFailures();
	for (Failure failure : failures) {
	    System.out.println(failure);
	    System.out.println(failure.getTrace());
	}
    }
   

    @Before
    public void setUp () {
    }

    @Test
    public void checkInvalid () {
	TriangleClassifier classifier = new TriangleClassifier (3, 4, 8);

        assertEquals(TriangleClassifier.INVALID, classifier.classify ());
    }

    @Test
    public void checkScalene () {
	TriangleClassifier classifier = new TriangleClassifier (4, 5, 6);
        assertEquals(TriangleClassifier.SCALENE, classifier.classify ());
    }

    @Test
    public void checkIsoceles () {
	TriangleClassifier classifier = new TriangleClassifier (3, 3, 4);
        assertEquals(TriangleClassifier.ISOCELES, classifier.classify ());
    }

    @Test
    public void checkEquilateral () {
	TriangleClassifier classifier = new TriangleClassifier (3, 3, 3);
        assertEquals(TriangleClassifier.EQUILATERAL, classifier.classify ());	
    }

    @After
    public void tearDown () {
    }

}
