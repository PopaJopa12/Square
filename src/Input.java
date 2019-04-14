import java.util.Scanner;
public class Input {

    public static void In(Integer x) {
        Scanner sc = new Scanner(System.in);
        Integer y;
        Float val,a, b, c, h, anglea, angleb, anglec,d,d2,r;

       /*  ArrayList<Float> a, b, c, h, anglea, angleb, anglec,d,d2,r;
       a = new ArrayList<Float>();
        b = new ArrayList<Float>();
        c = new ArrayList<Float>();
        h = new ArrayList<Float>();
        anglea = new ArrayList<Float>();
        angleb = new ArrayList<Float>();
        anglec = new ArrayList<Float>();
        d = new ArrayList<Float>();
        d2 = new ArrayList<Float>();
        r = new ArrayList<Float>(); */
        switch (x) {
            case 1:
                System.out.println("Вы выбрали треугольник, выбирете по какой формуле вычислять S" +
                        "\n" + "1)S = 1/2a*h; 2) S = 1/2*ab*sinC; 3) S = sqrt(p(p-a)(p-b)(p-c));");
                y = sc.nextInt();
                switch (y) {
                    case 1:
                        System.out.println("Вы выбирали первую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("h:");
                        val = sc.nextFloat();
                        h = val;
                        break;
                    case 2:
                        System.out.println("Вы выбирали вторую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("b: ");
                        val = sc.nextFloat();
                        b =val;
                        System.out.println("Угол C: ");
                        val = sc.nextFloat();
                        anglec = val;
                        break;
                    case 3:
                        System.out.println("Вы выбирали третью формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("b: ");
                        val = sc.nextFloat();
                        b = val;
                        System.out.println("c: ");
                        val = sc.nextFloat();
                        c = val;
                        break;
                    default:
                        System.out.println("Не ну ты дебил реально блин?????");
                }
                break;
            case 2:
                System.out.println("Вы выбрали квадрат, выбирете по какой формуле вычислять S" +
                        "\n" + "1)S = square(a); 2) S = 1/2*square(d)");
                y = sc.nextInt();
                switch  (y) {
                    case 1:
                        System.out.println("Вы выбирали первую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        break;
                    case 2:
                        System.out.println("Вы выбирали вторую формулу, введите значения для нее; d:");
                        val = sc.nextFloat();
                        d = val;
                        break;
                    default:
                        System.out.println("Не ну ты дебил реально блин?????");
                }
                break;
            case 3:
                System.out.println("Вы выбрали прямоугольник, выбирете по какой формуле вычислять S" +
                        "\n" + "1) S = ab; 2) S = square(d)/2*sinA");
                y = sc.nextInt();
                switch (y){
                    case 1:
                        System.out.println("Вы выбирали первую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("b: ");
                        val = sc.nextFloat();
                        b = val;
                        break;
                    case 2:
                        System.out.println("Вы выбирали вторую формулу, введите значения для нее; d:");
                        val = sc.nextFloat();
                        d = val;
                        System.out.println("Угол A: ");
                        val = sc.nextFloat();
                        anglea = val;
                        break;
                    default:
                        System.out.println("Не ну ты дебил реально блин?????");                }
                break;
            case 4:
                System.out.println("Вы выбрали ромб, выбирете по какой формуле вычислять S" +
                        "\n" + "1)S = ah; 2) S = d1*d2/2; 3) S = square(a)*sinA; 4) S = 2ar");
                y = sc.nextInt();
                switch (y){
                    case 1:
                        System.out.println("Вы выбирали первую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("h: ");
                        val = sc.nextFloat();
                        h = val;;
                        break;
                    case 2:
                        System.out.println("Вы выбирали вторую формулу, введите значения для нее; d1:");
                        val = sc.nextFloat();
                        d = val;
                        System.out.println("d2: ");
                        val = sc.nextFloat();
                        d2 = val;
                        break;
                    case 3:
                        System.out.println("Вы выбирали третью формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("Угол A: ");
                        val = sc.nextFloat();
                        anglea = val;
                       break;
                    case 4:
                        System.out.println("Вы выбирали четвертую формулу, введите значения для нее; a:");
                        val = sc.nextFloat();
                        a = val;
                        System.out.println("Радиус: ");
                        val = sc.nextFloat();
                        r = val;
                        break;
                    default:
                        System.out.println("Не ну ты дебил реально блин?????");
                }
                break;
            case 5:
                System.out.println("Вы выбрали круг, S будет вычисляться по формуле S  = pi*square(r)");
                System.out.println("Введите значение радиуса: ");
                val = sc.nextFloat();
                r= val;
                break;
            default:
                System.out.println("Не ну ты дебил реально блин?????");
        }
    }
}