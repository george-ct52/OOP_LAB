
class Perimeter {
    int length, breadth, radius;

    Perimeter(int length, int breadth) {
        double perimeter = 2 * (length + breadth);
        System.out.println("The Perimeter of the rectangle = " + perimeter);
    }

    Perimeter(int radius) {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("The Perimeter of the circle = " + perimeter);
    }

    public static void main(String args[]) {
        Perimeter circle = new Perimeter(4);
        Perimeter rect = new Perimeter(10, 20);
    }
}
