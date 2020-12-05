package serializer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.*;

import java.io.File;
import java.io.IOException;


public class XMLSerializer<T extends Phone> implements Serializer<T> {

    private static XmlMapper mapper;
    private Class<T> myClass;

    public XMLSerializer(Class<T> myClass) {
        this.myClass = myClass;
        mapper = new XmlMapper();
    }

    @Override
    public void Serialize(T obj, File file) throws IOException {
        try {
            mapper.writeValue(file, obj);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public T Deserialize(File file) throws IOException {
        try {
            return mapper.readValue(file, myClass);
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}