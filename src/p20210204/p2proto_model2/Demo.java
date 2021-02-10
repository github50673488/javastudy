package p20210204.p2proto_model2;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> lstShapeProto = new ArrayList<>();
        List<Shape> lstShapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        lstShapeProto.add(circle);

//        Circle anotherCircle = (Circle) circle.clone();
//        lstShapeProto.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        lstShapeProto.add(rectangle);

        cloneAndCompare(lstShapeProto, lstShapesCopy);
    }

    private static void cloneAndCompare(List<Shape> lstShapeProto, List<Shape> lstShapesCopy) {
        for (Shape shape : lstShapeProto) {
            lstShapesCopy.add(shape.clone());
        }

        for (int i = 0; i < lstShapeProto.size(); i++) {
            if (lstShapeProto.get(i) != lstShapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (lstShapeProto.get(i).equals(lstShapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
