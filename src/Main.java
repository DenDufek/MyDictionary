// Файл Main.java
public class Main {
    public static void main(String[] args) {
        MyDictionary<String, Integer> myDictionary = new MyDictionary<>();

        myDictionary.add("Ключ 1", 42);
        myDictionary.add("Ключ 2", 100);
        myDictionary.add("Ключ 3", 73);

        System.out.println("Кількість пар у словнику: " + myDictionary.getSize());

        System.out.println("Значення для Ключа 2: " + myDictionary.get("Ключ 2"));
    }
}
