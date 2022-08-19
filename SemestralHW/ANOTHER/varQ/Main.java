public class Main {
    public static void main(String[] args) {

        //define vector
        Vector vecA = new Vector(new Point(0,0), new Point(5,5));
        Vector vecB = new Vector(new Point(-6,-4), new Point(-4,-6));

        vecA.isOrthogonal(vecB);

    }
}
