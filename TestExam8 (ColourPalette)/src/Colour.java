public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void set(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed(){
        return red;
    }

    public int getGreen(){
        return green;
    }

    public int getBlue(){
        return blue;
    }

    public boolean isGray(){
        return red==green && green == blue;
    }

    public void mixWith(Colour colour2){
        this.red = (int)(0.5 * red + 0.5 * colour2.getRed());
        this.green = (int)(0.5 * green + 0.5*colour2.getGreen());
        this.blue = (int)(0.5*blue + 0.5 * colour2.getBlue());
    }

    public Colour copy(){
        Colour copy = new Colour(red, green, blue);
        return copy;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Colour)){
            return false;
        }

        Colour other = (Colour)obj;
        return red == other.red && green == other.green && blue == other.blue;
    }

    public String toString(){
        return "\nred/green/blue: " + red + "/" + green +"/" + blue;
    }
}
