
public class App {
    public String getGreeting() {
        return "Hello world xD";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        ShapeClassifier classifier = new ShapeClassifier();
        classifier.addShape(new GeometricShape("triangle", "RED"));
        classifier.addShape(new GeometricShape("square", "YELLOW"));
        classifier.addShape(new GeometricShape("square", "BLUE"));
        classifier.addShape(new GeometricShape("circle", "BLUE"));
        classifier.addShape(new GeometricShape("circle", "YELLOW"));
        classifier.addShape(new GeometricShape("circle", "RED"));
        System.out.println(classifier.getShapes());
        System.out.println(classifier.createReport());
    }
}
