package ru.home.txw.generator;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import ru.home.txw.entity.Entry;

public class XMLGenerator {

	private static volatile long fileName = 0;

	public static void generateXML() throws JAXBException {
		Entry en = EntryGenerator.getEntry();
		File file = new File(getFileName());
		JAXBContext jaxbContext = JAXBContext.newInstance(Entry.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.marshal(en, file);
	}

	public static long add() {
		return fileName++ < 100 ? fileName : -1;
	}
	
	private static String getFileName() {
		return "files/" + fileName + ".xml";
	}
}
