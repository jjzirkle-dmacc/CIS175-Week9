package com.cis175.week7.library;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name="books")
@SecondaryTable(name="magazines")
public class TitleAndGenre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String title;
	private String genre;
	

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

}
