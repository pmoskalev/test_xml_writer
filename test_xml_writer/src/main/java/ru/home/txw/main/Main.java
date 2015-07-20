package ru.home.txw.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.bind.JAXBException;

import ru.home.txw.generator.XMLGenerator;

public class Main {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();
		
		while(XMLGenerator.add() != -1) {
			service.submit(new Runnable() {
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName());
						XMLGenerator.generateXML();
					} catch (JAXBException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
		
		service.shutdown();
	}

}
