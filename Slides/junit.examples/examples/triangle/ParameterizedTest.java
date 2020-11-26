import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;

import static org.junit.Assert.*;

import java.util.*;

@RunWith(Parameterized.class)

public class ParameterizedTest {
    @Parameters
    public static Iterable<Object[]> data() {
	return Arrays.asList(new Object[][] { 
		{ 3, 4, 8, TriangleClassifier.INVALID }, 
		{ 4, 5, 6, TriangleClassifier.SCALENE }, 
		{ 3, 3, 4, TriangleClassifier.ISOCELES }, 
		{ 3, 3, 8, TriangleClassifier.EQUILATERAL }, 
	    });
     }

    @Parameter(0)
    public int side1;

    @Parameter(1)
    public int side2;

    @Parameter(2)
    public int side3;

    @Parameter(3)
    public int expected;

    @Test
    public void test () {
	TriangleClassifier classifier = new TriangleClassifier (side1, side2, side3);
        assertEquals(expected, classifier.classify ());
    }
}
