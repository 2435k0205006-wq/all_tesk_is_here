import java.util.Scanner;

public class codding21
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите фигуру (круг, квадрат, прямоугольник, треугольник): ");
        String shape = scan.next().toLowerCase();

        double area = 0;

        switch (shape) {
            case "круг":
                System.out.print("Введите радиус: ");
                double r = scan.nextDouble();
                area = Math.PI * r * r;
                break;

            case "квадрат":
                System.out.print("Введите сторону: ");
                double a = scan.nextDouble();
                area = a * a;
                break;

            case "прямоугольник":
                System.out.print("Введите длину: ");
                double l = scan.nextDouble();
                System.out.print("Введите ширину: ");
                double w = scan.nextDouble();
                area = l * w;
                break;

            case "треугольник":
                System.out.print("Введите основание: ");
                double b = scan.nextDouble();
                System.out.print("Введите высоту: ");
                double h = scan.nextDouble();
                area = 0.5 * b * h;
                break;

            default:
                System.out.println("Неизвестная фигура!");
                scan.close();
                return;
        }

        System.out.println("Площадь = " + area);
        scan.close();
    }
}
