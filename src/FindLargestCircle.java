public class FindLargestCircle {
    public static void main(String[] args) {
        Circle[] circleArray = new Circle[10];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 10);
        }

        Circle largestCircle = circleArray[0];
        for (Circle circle : circleArray) {
            if (circle.getArea() > largestCircle.getArea()) {
                largestCircle = circle;
            }
        }
        
        System.out.println("Круг с самой большой площадью:");
        System.out.println("Радиус: " + largestCircle.radius);
        System.out.println("Площадь: " + largestCircle.getArea());
        System.out.println("Периметр: " + largestCircle.getPerimeter());
    }
}

