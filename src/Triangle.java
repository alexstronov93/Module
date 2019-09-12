public class Triangle {
    public static void main(String[] args) {
        double x1 = 2.0;
        double x2 = 5.5;
        double x3 = 2.0;
        double y1 = 1.1;
        double y2 = 2.0;
        double y3 = 4.3;
        double area;
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        if (a + b <= c && a + c <= b && b + c <= a) {
            System.out.println("Triangle does not exist");
        }
        else {
            double p=(a+b+c)/2;
            area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Area is "+area);
        }
    }
}
