public class PolygonTest {
    public static void main(String[] args) {

        Colour colour1 = new Colour(2, 3, 4);
        Colour colour2 = new Colour(0,0,0);

        Polygon polygon = new Polygon(5, colour1);
        polygon.fill(colour2);

        System.out.println("Black (yes): " + colour2.isBlack() + ", Black (no): " + colour1.isBlack());
        System.out.println(polygon.toString());
        polygon.removeFillColour();
        System.out.println("Filled? (no): " + polygon.isFilled());
    }
}
