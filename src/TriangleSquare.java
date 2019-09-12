public class TriangleSquare {
    public static void main(String[] args) {
        double  aX= 2.0;
        double  bX= 5.5;
        double cX= 2.0;
        double aY = 1.1;
        double bY = 2.0;
        double cY = 4.3;
        double area;
        double a = Math.sqrt((aX - bX) * (aX - bX) + (aY - bY) * (aY - bY));
        double b = Math.sqrt((aX - cX) * (aX - cX) + (aY - cY) * (aY - cY));
        double c = Math.sqrt((bX-cY) * (bX-cY) + (bY - cY) * (bY - cY));
        if (a + b <= c && a + c <= b && b + c <= a) {
            System.out.println("Triangle does not exist");
        }
        else {
            area=(aX*(bY-cY)+bX*(cY-aY)+cX*(aY-bY))/2;
            System.out.println("Square is "+area);
        }
    }
}
