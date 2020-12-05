package serializer;

import model.Phone;

import java.io.File;
import java.io.IOException;

public interface Serializer<T extends Phone> {
    void Serialize(T obj, File file) throws IOException;
    T Deserialize(File file) throws IOException;
}