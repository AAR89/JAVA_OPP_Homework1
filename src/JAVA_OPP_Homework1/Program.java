package JAVA_OPP_Homework1;

import java.awt.dnd.InvalidDnDOperationException;

public class Program {
    public static void main(String[] args) {
        var irina = new Person("Ирина", 50);
        var vasya = new Person("Вася", 30);
        var masha = new Person("Маша", 28);
        var jenya = new Person("Женя", 10);
        var ivan = new Person("Иван", 8);

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jenya);
        gt.append(vasya, ivan);
        System.out.println(new Research(gt).spend(irina, Relationships.PARENT));

    }
}
