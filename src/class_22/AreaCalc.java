package class_22;


    public class AreaCalc {
        /*
        Create 1 class in which create a method that
         will calculate the area  of
        Rectangle
        Square
        Box
        Use separate class to test your code
         */
        void area(double height){
            System.out.println("Area of square is "+height*height);
        }

        void area(double height, double width){
            System.out.println("Area of rectangle is "+(height*width));
        }
        void area(double height, double width, double length){
            System.out.println("Area of box is "+(width*height*length));
        }
    }

