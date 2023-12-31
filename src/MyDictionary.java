// Файл MyDictionary.java
import java.util.HashMap;
import java.util.Map;

public class MyDictionary<K, V> {
    private Map<K, V> dictionary;

    public MyDictionary() {
        dictionary = new HashMap<>();
    }

    public void add(K key, V value) {
        dictionary.put(key, value);
    }

    public V get(K key) {
        return dictionary.get(key);
    }

    public int getSize() {
        return dictionary.size();
    }
}
