public class Task3 {
    public static void main(String[] args) {

        double a=6;
        double b=3;
        double c=8;

        System.out.println(areaOFtriangle(6,3,8));

    }

    static  double areaOFtriangle(double a, double b, double c) {

        if (a + b > c && a + c > b && b + c > a) {
            double p = (a + b + c) / 2;
            double areaOFtriangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return areaOFtriangle;
        } else {
            return 101;
        }


    }
}