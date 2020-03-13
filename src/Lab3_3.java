// Создать объект класса Пианино, используя класс Клавиша. Методы: настроить, играть на пианино, нажимать клавишу.
// классы Piano и Keys

public class Lab3_3 {
    public static void main(String[] args)
    {

        Piano piano1 = new Piano("Model1", "Note1", "Расстроено");
        Piano piano2 = new Piano("Model2", "Note2", "Настроено");

        System.out.println("Модель пианино1: "+ piano1.getPianoname());
        System.out.println("Модель пианино2: "+ piano2.getPianoname());
        System.out.println("Настроить: " + piano2.configure());
        System.out.println("Нажать клавишу: " + piano1.k.pressKey());

        System.out.println(piano1.equals(piano2));
        System.out.println(piano1.k.toString());
        System.out.println(piano2.toString());
    }
}
