public class ColourPaletteTest {
    public static void main(String[] args) {
        Colour colour1 = new Colour(2,2,2);
        Colour colour2 = new Colour(1, 2, 3);
        Colour colour3 = new Colour(4,4,4);

        ColourPalette palette1 = new ColourPalette(4);
        ColourPalette palette2 = new ColourPalette(4);

        palette1.add(colour1);
        palette1.add(colour2);
        palette1.add(colour3);

        palette2.add(colour1);
        palette2.add(colour2);
        palette2.add(colour3);

        System.out.println(palette1.toString() + "\n" + palette2.toString());
        System.out.println("Palette 1, number of gray (2): " + palette1.getNumberOfGrayColours());
        System.out.println("Equals (yes): " + palette1.equals(palette2));
        palette1.mixColour(0, colour3);
        System.out.println("Mixed colour: " + palette1.get(0));
        System.out.println("colour with index 0 from the second palette: " + palette2.get(0));
        System.out.println("Equals (no): " + palette1.equals(palette2));

    }
}
