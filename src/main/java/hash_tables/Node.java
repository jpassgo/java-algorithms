package hash_tables;

import lombok.Data;
import lombok.Setter;

public class Node<T> {

    public Node(String key, T value) {
        setKey(key);
        setValue(value);
    }

    private String key;
    private T value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
