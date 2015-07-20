package ru.home.txw.generator;

import java.util.Date;

import ru.home.txw.entity.Entry;

public class EntryGenerator {
	
	public static Entry getEntry() {
		Entry en = new Entry();
		
		en.setContent(getContent());
		en.setCreationDate(getDate());
		
		return en;
	}
	
	private static String getContent() {
		return "123467890";
	}
	
	private static Date getDate() {
		return new Date();
	}
	
}
