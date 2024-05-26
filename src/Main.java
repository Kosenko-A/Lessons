import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //firstExample();
        //secondExample();
        //thirdExample();
        //fourthExample();
        //example5();
        try {
            example6();
        } catch (CloneNotSupportedException e) {
            System.out.println("ошибка");
        }

        ArrayList<String> listNames = new ArrayList<>();
        listNames.add("Sasha");
        listNames.get(0);
        listNames.size();
        listNames.set(0, "Masha");


        HashMap<String, String> hm = new HashMap<>();
        hm = fillCollection(hm);
        for (HashMap.Entry<String, String> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        Voice voice = new Voice();
        Cat cat = new Cat("Black", voice);
        System.out.println(cat);
        voice.mau();

        method1(cat);


    }

    public static HashMap<String, String> fillCollection(HashMap<String, String> hm) {
        hm.put("Russia", "Moscow");
        hm.put("France", "Paris");
        hm.put("Germany", "Berlin");
        hm.put("Norway", "Oslo");

        return hm;
    }

    public static void method1(Cat cat){
        System.out.println(cat);
    }

    public static void firstExample() {
        int num = 6;
        System.out.println("My favourite number is " + num);
    }

    public static void secondExample() {
        //Сравнение примитивных типов
        int a = 7;
        int b = 6;
        if (a == b){
            System.out.println("false");
        }

        //Сравнение строк (строки - это как и объекты ссылочный тип данных)
        String s1 = "кот";
        String s2 = "кот";
        System.out.println(s1.equals(s2));
    }

    public static void thirdExample() {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);

        Integer n = new Integer(1);
        Integer m = n;
        System.out.println(n==m);

        if (n.hashCode() == m.hashCode()) {
            System.out.println("Объекты равны по хэшкодам");
        } else {
            System.out.println("Объекты не равны по хэшкодам");
        }
    }

    public static void fourthExample() {
        Cat bella = new Cat("Black");
        Cat murka = new Cat("Orange");
        Cat murzik = new Cat("Black");

        System.out.println(bella.equals(murka));
        System.out.println(murzik.equals(bella));

        //toString
        System.out.println(murka);

        //Hash code
        //можно вывести для сравнения
        System.out.println(murzik.hashCode());

        if (bella.hashCode() == murzik.hashCode()) {
            System.out.println("Объекты равны по хэшкодам");
        } else {
            System.out.println("Объекты не равны по хэшкодам");
        }
    }

    public static void example5() {
        Cat bella = new Cat("Black");
        System.out.println(bella.getClass());
        System.out.println(bella instanceof Cat);
    }

    public static void example6() throws CloneNotSupportedException {
        Cat kitty = new Cat("White");
        Object cat = kitty.clone();
        System.out.println(cat);
    }
}