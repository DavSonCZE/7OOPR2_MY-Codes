public class Vector {
    private Point pointA;
    private Point pointB;

    public Vector(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void isOrthogonal(Vector vec){

        //TODO: dopocitat skalar
        //z 2 bodu 1 vektor
        //z 2 bodu fruhy vektor
        //promena na scalar
        //scalar= veca * vecb;
        double angle = Math.toDegrees(Math.atan2(pointB.y - pointA.y, pointB.x - pointA.x));
        double angle2 = Math.toDegrees(Math.atan2(vec.pointB.y - vec.pointA.y, vec.pointB.x - vec.pointA.x));

        double diff = angle2 - angle;
        double result = (int) (Math.cos(Math.toRadians(diff))*100)/100d;
        System.out.println("angles: " + angle + " " + angle2 + " " + "diff: " + diff + " result: " + result);

        if(result == 0){
            System.out.println("[ODPOVED] Primky jsou kolme");
        }
        else{
            System.out.println("[ODPOVED] Primky nejsou kolme.");
        }

    }
}
