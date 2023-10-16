package Objects;
import java.util.ArrayList;
import java.util.List;


public class Database<T extends Record> {
    private List<T> records = new ArrayList<>();

    public boolean addRecord(T record) {
        return records.add(record);
    }

    public boolean deleteRecord(T record) {
        return records.remove(record);
    }

    public T getRecordById(Object id) {
        for (T record : records) {
            if (record.getId().equals(id)) {
                return record;
            }
        }
        return null;
    }
}
