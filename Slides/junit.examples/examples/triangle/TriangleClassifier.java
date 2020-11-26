public class TriangleClassifier {

    public final static int INVALID = -1;
    public final static int SCALENE = 0;
    public final static int ISOCELES = 1;
    public final static int EQUILATERAL = 2;

    private int side1;
    private int side2;
    private int side3;

    public TriangleClassifier(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int classify () {
	int rval = 0;

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
	    rval = INVALID;            
        }       
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
               rval = INVALID;
        }                    
        if ((side1 != side2) && (side2 != side3) && (side1 != side3)) {
	    rval = SCALENE;
	} else if (( side1 == side2) || (side2 == side3) || (side1 == side3)) {
	    rval = ISOCELES;
	} else {
	    rval = EQUILATERAL;
	}

	return rval;
    }
}
