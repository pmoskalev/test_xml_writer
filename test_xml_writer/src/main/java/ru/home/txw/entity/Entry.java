package ru.home.txw.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import ru.home.txw.adapter.DateAdapter;

@XmlRootElement(name="Entry")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {
    "content",
    "creationDate"
})
public class Entry {
	
	@XmlElement(name="content", required=true)
	private String content;
	
	@XmlElement(name="creationDate", required=true)
	@XmlJavaTypeAdapter(DateAdapter.class)
	private Date creationDate;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
}
