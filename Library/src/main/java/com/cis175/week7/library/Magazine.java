package com.cis175.week7.library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="magazines")
public class Magazine {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long issn;
	private String title;
	private String genre;
	private String publisher;
	private String language;
	private int issue;
	
	public long getIssn() {
		return issn;
	}
	public void setIssn(long issn) {
		this.issn = issn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getIssue() {
		return issue;
	}
	public void setIssue(int issue) {
		this.issue = issue;
	}

}
