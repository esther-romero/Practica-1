
public class GeometricShape {
    private final String forma;
    private final String color;

    public GeometricShape(String form, String colour) {
        this.forma = form;
        this.color = colour;
    }

    public String getForm() {
        return forma;
    }

    public String getColour() {
        return color;
    }

    public String toString() {
        return "form: " + forma + " colour: " + color;
    }
    
}
