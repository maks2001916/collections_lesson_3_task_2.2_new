import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Storage {
    private Map<Integer, String> storage;
    private int key;
    private String meaning;

    Map<Integer, String> storages = new HashMap<>();
    public Storage(Integer key, String meaning) {
        this.key = key;
        this.meaning = meaning;
        storages.put(this.key, this.meaning);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage1 = (Storage) o;
        return key == storage1.key && Objects.equals(storage, storage1.storage) && Objects.equals(meaning, storage1.meaning) && Objects.equals(storages, storage1.storages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, key, meaning, storages);
    }

    @Override
    public String toString() {
        return "{ ключ - " + key + " " +
                meaning  + '}';
    }
}
