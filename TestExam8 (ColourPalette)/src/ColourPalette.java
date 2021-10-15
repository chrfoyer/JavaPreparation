import java.util.Arrays;

public class ColourPalette {
    private int numberOfColours;
    private Colour[] coloursInThePalette;

    public ColourPalette(int maxNumberOfColours){
        this.numberOfColours = 0;
        this.coloursInThePalette = new Colour[maxNumberOfColours];
    }

    public int getNumberOfColours(){
        return numberOfColours;
    }

    public void add(Colour colour){
        for(int i = 0; i< coloursInThePalette.length-1; i++){
            if(coloursInThePalette[i] == null){
                coloursInThePalette[i] = colour.copy();
                numberOfColours++;
                break;
            }
        }
    }

    public Colour get(int index){
        return coloursInThePalette[index];
    }

    public int getNumberOfGrayColours(){
      int counter = 0;

      for(int i =0; i<getNumberOfColours()-1; i++){
          if(coloursInThePalette[i].isGray()){
              counter++;
          }
      }

      return counter;
    }

    public void mixColour(int index, Colour colour2){
        coloursInThePalette[index].mixWith(colour2.copy());
    }

    public boolean equals(Object obj){
        if (!(obj instanceof ColourPalette)) {
            return false;
        }
        ColourPalette other = (ColourPalette)obj;


        for(int i = 0; i<coloursInThePalette.length-1; i++){
            if(!(coloursInThePalette[i].equals(other.coloursInThePalette[i]))){
                return false;
            }
        }

        return numberOfColours==other.numberOfColours;
        }

        public String toString(){
        String coloursInThePaletteString = "";
        for(int i = 0; i<getNumberOfColours(); i++){
            coloursInThePaletteString += coloursInThePalette[i].toString();
        }

        return "Number of Colours in palette: " + numberOfColours
                + "\n colours: " + coloursInThePaletteString;
        }
}

