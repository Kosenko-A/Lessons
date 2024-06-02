import java.util.*;

public class Main {

    public static void main(String[] args) {
        //do1Task();

        /*TelephoneBook book = new TelephoneBook();
        book.add("Вадим", "896196543");
        book.add("Катя", "896197788");
        System.out.println(book.get("Вадим"));
        System.out.println(book.get("Катя"));
        System.out.println(book.get("Саша"));*/

        //doTask1();
        //doTask2();
        //doTask3();

        Box<Paper> boxForPaper = new Box<>();
        Paper paper = new Paper();
        boxForPaper.putItem(paper);

        Box<Glass> boxForGlass = new Box<>();
        Glass glass = new Glass();
        boxForGlass.putItem(glass);

        Glass gl = boxForGlass.getItem();
        gl.toGl();

        TwoCellsBox<Paper, Glass> plasticGlassBox = new TwoCellsBox<>();
    }


    public static void do1Task() {
        // Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        String [] words = {"cat", "dog", "cat", "watermelon", "kiwi", "kiwi", "banana", "cat", "watermelon", "cat"};

        List<String> wordsList = Arrays.asList(words);
        System.out.println("Все элементы коллекции: " + wordsList);


        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> wordsSet = new HashSet<>(wordsList);
        System.out.println("Неповторяющиеся элементы коллекции: " + wordsSet);


        // Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> checkWords = new HashMap<>();
        for (String i: wordsList){
            if (checkWords.containsKey(i)){
                Integer point = checkWords.get(i);
                point++;
                checkWords.put(i, point);
            } else {
                checkWords.put(i, 1);
            }
        }
        System.out.println(checkWords);
    }

    public static void doTask1(){
        // Массив предназначен для хранения значений ростов двенадцати человек.
        // помощью датчика случайных чисел заполнить массив целыми значениями,
        // лежащими в диапазоне от 163 до 190 включительно.

        List<Integer> heights = new ArrayList<>();
        for (int i = 0; i<=12; i++){
            heights.add(i, generateRandomValue());
        }
        System.out.println(heights);
    }
    public static int generateRandomValue(){
        int v = (int)(Math.random()*(190-163+1)+163);
        return v;
    }

    public static void doTask2(){
        //Используя датчик случайных чисел, заполнить массив из двадцати элементов неповторяющимися числами.

        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int i = 0; i<=20; i++){
            uniqueValues.add((int)(Math.random()*1000));
        }
        System.out.println(uniqueValues);
    }
    public static void doTask3(){
        //Заполнить массив:
        // двадцатью первыми натуральными числами, делящимися нацело на 13 или на 17
        // и находящимися в интервале, левая граница которого равна 300;

        List<Integer>naturalValues = new ArrayList<>();
        int check = 0;
        int val = 300;

        do {
            if ((val%13 ==0) || (val%17 ==0)){
                naturalValues.add(val);
                check++;
            }
            val++;
        } while (check !=20);
        System.out.println(naturalValues);
    }

}