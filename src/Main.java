
import java.util.InputMismatchException;
import java.util.Scanner;
        public class Main {


            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите фигуру, плозадь которой будет вычисляться" +
                        "\n" + "Треугольник - это 1; Квадрат - это 2" +
                        "\n" + "Прямоугольник - это 3; Ромб - это 4; Круг - это 5;");

                Integer x = scan.nextInt();
                Input input = new Input();
                input.In(x);
            }
        }