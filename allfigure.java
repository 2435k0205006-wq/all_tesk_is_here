import java.util.Scanner;

public class allfigure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите фигуру: круг, треугольник, прямоугольник, квадрат, ромб");
        String shape = scan.next().toLowerCase();

        if (shape.equals("круг")) {
            Circle circle = new Circle();
            System.out.print("Введите радиус: ");
            double r = scan.nextDouble();
            circle.calculate(r);

        } else if (shape.equals("квадрат")) {
            Square square = new Square();
            System.out.print("Введите сторону: ");
            double side = scan.nextDouble();
            square.calculate(side);

        } else if (shape.equals("прямоугольник")) {
            Rectangle rectangle = new Rectangle();
            System.out.print("Введите длину: ");
            double length = scan.nextDouble();
            System.out.print("Введите ширину: ");
            double width = scan.nextDouble();
            rectangle.calculate(length, width);

        } else if (shape.equals("треугольник")) {
            Triangle triangle = new Triangle();
            System.out.print("Введите сторону a: ");
            double a = scan.nextDouble();
            System.out.print("Введите сторону b: ");
            double b = scan.nextDouble();
            System.out.print("Введите сторону c: ");
            double c = scan.nextDouble();
            triangle.calculate(a, b, c);

        } else if (shape.equals("ромб")) {
            Rhombus rhombus = new Rhombus();
            System.out.print("Введите сторону: ");
            double s = scan.nextDouble();
            System.out.print("Введите диагональ 1: ");
            double d1 = scan.nextDouble();
            System.out.print("Введите диагональ 2: ");
            double d2 = scan.nextDouble();
            rhombus.calculate(s, d1, d2);

        } else {
            System.out.println("Неизвестная фигура!");
        }

        scan.close();
    }
}

// --- Классы фигур ---
class Circle {
    public void calculate(double r) {
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Площадь = " + area);
        System.out.println("Периметр = " + perimeter);
    }
}

class Square {
    public void calculate(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        System.out.println("Площадь = " + area);
        System.out.println("Периметр = " + perimeter);
    }
}

class Rectangle {
    public void calculate(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Площадь = " + area);
        System.out.println("Периметр = " + perimeter);
    }
}

class Triangle {
    public void calculate(double a, double b, double c) {
        double perimeter = a + b + c;
        double p = perimeter / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь = " + area);
        System.out.println("Периметр = " + perimeter);
    }
}

class Rhombus {
    public void calculate(double s, double d1, double d2) {
        double area = (d1 * d2) / 2;
        double perimeter = 4 * s;
        System.out.println("Площадь = " + area);
        System.out.println("Периметр = " + perimeter);
    }
}
