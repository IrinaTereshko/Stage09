public class Task02PointInside {
    public static void main(String[] args) {

        double x1, y1, x2, y2, x, y;
//  нет провери вводимых данных

        x1 = InputOutput.inputDouble(" Input the  coordinates of the upper left corner of the rectangle. \nx1 = ");
        y1 = InputOutput.inputDouble("y1= ");
        x2 = InputOutput.inputDouble(" Input the  coordinates of the lower right corner of the rectangle. \nx2= ");
        y2 = InputOutput.inputDouble("y2= ");

        x = InputOutput.inputDouble(" input point coordinates \nx: ");
        y = InputOutput.inputDouble("y: ");


        String result = isPointInside(x, y, x1, y1, x2, y2) ?
                "This point is placed inside of the rectangle." : "This point is placed outside of the rectangle.";

        InputOutput.output(result);
    }

    public static boolean isPointInside(double x, double y, double x1, double y1, double x2, double y2) {
        return (x > x1 & x < x2 & y < y1 & y > y2);
    }
}

