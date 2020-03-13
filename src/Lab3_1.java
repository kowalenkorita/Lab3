import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Определить класс Квадратное уравнение. Класс должен содержать несколько конструкторов.
// Реализовать методы для поиска корней, экстремумов, а также интервалов убывания/возрастания.
// Создать массив объектов и определить наибольшие и наименьшие по значению корни.
// + класс Square_equation
public class Lab3_1 {
    public static void main(String[] args) {
        List<Square_equation> quadratics = new ArrayList<>();
        quadratics.add(new Square_equation(3., 2., 5.));
        quadratics.add(new Square_equation(1.5, 8.5, 3.));
        quadratics.add(new Square_equation(2.5, 10., 2.));
        quadratics.add(new Square_equation(1., 0, 0));
        quadratics.add(new Square_equation(1., 0));

        for (Square_equation quadratic : quadratics) {

            System.out.print("Discriminant = ");
            System.out.println(quadratic.getDiscriminant());

            System.out.print("Root(s) = ");
            System.out.println(Arrays.toString(quadratic.getX()));

            System.out.print("Decreasing interval = ");
            System.out.println(Arrays.toString(quadratic.getDecreasingInterval()));

            System.out.print("Increasing interval = ");
            System.out.println(Arrays.toString(quadratic.getIncreasingInterval()));

            System.out.println();
        }

    }


}
