public class Main {

    public static void main(String[] args) {
        //firstExample();
        //secondExample();
        //thirdExample();
        //fourthExample();
        //example5();
        //example6();
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

    public static void example6() {
        Cat kitty = new Cat("White");
        Cat cat = kitty.clone();
        System.out.println(cat);
    }
}