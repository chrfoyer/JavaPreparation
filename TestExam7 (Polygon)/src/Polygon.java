public class Polygon {
    private int numberOfEdges;
    private Colour lineColour;
    private Colour fillColour;

    public Polygon(int numberOfEdges, Colour lineColour){
        this.numberOfEdges = numberOfEdges;
        this.lineColour = lineColour.copy();
        this.fillColour = null;
    }

    public Polygon(int numberOfEdges){
        this.numberOfEdges = numberOfEdges;
        this.lineColour = null;
        this.fillColour = null;
    }

    public int getNumberOfEdges(){
        return numberOfEdges;
    }

    public Colour getFillColour(){
        return fillColour;
    }

    public Colour getLineColour(){
        return lineColour;
    }

    public void fill(Colour colour){
        this.fillColour = colour.copy();
    }

    public void removeFillColour(){
        this.fillColour = null;
    }

    public boolean isFilled(){
        if(fillColour != null){
            return true;
        }

        return false;
    }

    public String getName(){

        if(numberOfEdges<3){
            return "Error";
        }

        switch(numberOfEdges){
            case 3:
                return "Triangle";
            case 4:
                return "Rectangle";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            case 7:
                return "Heptagon";
            case 8:
                return "Octagon";
            default:
                return "Polygon";
        }
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Polygon)){
            return false;
        }

        Polygon other = (Polygon)obj;
        return numberOfEdges==other.numberOfEdges && lineColour.equals(other.numberOfEdges)
                && lineColour.equals(other.lineColour);

    }

    public String toString(){
        return "Number of edges: " + numberOfEdges + "\nName: " + getName()
                + "\nline colour: " + lineColour + ", fillColour: " + fillColour;
    }
}
