
import java.util.InputMismatchException;
import java.util.Scanner;
        public class Main {


            public static void main(String[] args) {
                int x;
                Scanner scan = new Scanner(System.in);
                start();
                System.out.println("Restart program?:");
                x = scan.nextInt();
                if (x==1){
                    start();
                }

            }
            private static void start(){
                double s;
                Scanner scan = new Scanner(System.in);
                System.out.println("Введите фигуру, плозадь которой будет вычисляться" +
                        "\n" + "Треугольник - это 1; Квадрат - это 2" +
                        "\n" + "Прямоугольник - это 3; Ромб - это 4; Круг - это 5;");

                Integer x = scan.nextInt();
                Input input = new Input();
                input.In(x);
                s = input.S1;
                System.out.println(s);
            }
        }