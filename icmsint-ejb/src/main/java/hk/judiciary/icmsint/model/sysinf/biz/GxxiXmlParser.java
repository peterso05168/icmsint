package hk.judiciary.icmsint.model.sysinf.biz;

import java.io.ByteArrayOutputStream;
import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import org.xml.sax.SAXException;

public class GxxiXmlParser<T> {
	private Class<T> clazz;

	public GxxiXmlParser(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	public T toObject(File xmlFile, File schemaFile) throws JAXBException, SAXException  {
		JAXBContext jc = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = jc.createUnmarshaller();
		@SuppressWarnings("unchecked")
		T obj = (T) unmarshaller.unmarshal(xmlFile);
		Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(schemaFile);
        marshaller.setSchema(schema);
        marshaller.marshal(obj, System.out);
		return obj;
	}
	
	public ByteArrayOutputStream toByteArrayOutputStream(T obj) throws JAXBException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(obj, System.out);
		jaxbMarshaller.marshal(obj, baos);
		return baos;
	}
}
