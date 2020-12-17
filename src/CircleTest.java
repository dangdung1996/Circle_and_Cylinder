public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5,"black");
        System.out.println(circle);

        circle = new Circle(5.5,"white",false);
        System.out.println(circle);


    }
}
