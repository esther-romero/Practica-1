import java.util.ArrayList;
import java.util.List;

public class ShapeClassifier {
    private List<GeometricShape> squares;
    private List<GeometricShape> circles;
    private List<GeometricShape> triangles;
    
    public ShapeClassifier() {
        this.squares = new ArrayList();
        this.circles = new ArrayList();
        this.triangles = new ArrayList();
    }

    public List<GeometricShape> getShapes() {
        List<GeometricShape> shapes = new ArrayList();
        shapes.addAll(squares);
        shapes.addAll(circles);
        shapes.addAll(triangles);

        return shapes;
    }

    public void addShape(GeometricShape shape) {
        String form = shape.getForm();
        switch (form) {
            case "square":
            if (circles.size() > 0) {
                if (!circles.get(0).getColour().equals(shape.getColour())) {
                    addInAList(squares, shape);
                }
            } else {
                addInAList(squares, shape);
            }
            break;
            case "circle":
            if (circles.size() == 0 && squares.size() > 0 && 
            !squares.get(squares.size() - 1).getColour().equals(shape.getColour())) {
                addInAList(circles, shape);
            } else if (circles.size() > 0 && triangles.size() > 0 && 
            !triangles.get(0).getColour().equals(shape.getColour())) {
                addInAList(circles, shape);
            } else if (circles.size() > 0 && triangles.size() == 0) {
                addInAList(circles, shape);
            }
            break;
            case "triangle":
            addInAList(triangles, shape);
            break;
        }
    }

    private void addInAList(List<GeometricShape> shapes, GeometricShape shape) {
        if (shapes.size() == 0) {
            shapes.add(shape);
        }
        for (int i = 0; i < shapes.size(); i++) {
            if (compareColours(shapes.get(i).getColour(), shape.getColour())) {
                int index = i + 1;
                if (index == shapes.size()) {
                    shapes.add(shape);
                } else {
                    shapes.add(index, shape);
                }

            } else if (compareColours(shape.getColour(), shapes.get(i).getColour())) {
                int index = i - 1;
                if (index < 0) {
                    shapes.add(0, shape);
                } else {
                    shapes.add(index, shape);
                }
            }
        }
    }

    private boolean compareColours(String colour1, String colour2) {
        boolean comparation = colour1.equals("YELLOW") && colour2.equals("BLUE") ||
        colour1.equals("BLUE") && colour2.equals("RED") || 
        colour1.equals("RED") && colour2.equals("YELLOW");
        
        return comparation;
    }

    public List<String> createReport() {
        List <String> report = new ArrayList<>();
        for (GeometricShape shape : getShapes()) {
            report.add(shape.toString() + "=" + valueShape(shape));
        }
        return report;
    } 

    private int valueShape(GeometricShape shape) {
        String form = shape.getForm();
        switch (form) {
            case "circle":
            if (shape.getColour().equals("YELLOW")) {
                return 2;
            } else {
                return 1;
            }
            case "triangle":
                return 1;
            case "square":
                return 0;
            default:
                return 3;
        }
    }
}
