package java.automation.lab.fall.kapinus.core22.io;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class XMLIO<T> {
    private Class<T> clasz;

    public XMLIO(Class<T> clasz) {
        this.clasz = clasz;
    }

    @SuppressWarnings(value = "unchecked")
    public T read(String pathTo) throws JAXBException {
        T obj = null;
        JAXBContext context = JAXBContext.newInstance(clasz);
        return (T) context.createUnmarshaller().unmarshal(new File(pathTo).getAbsoluteFile());
    }

    public void write(T obj, String pathTo) throws JAXBException {
        System.out.println(obj.getClass());
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(obj, new File(pathTo).getAbsoluteFile());
    }
}
