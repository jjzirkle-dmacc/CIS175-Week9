package com.cis175.week7.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cis175.week7.library.Magazine;

@Controller
public class LibraryController {
	
@Autowired LibraryDao dao;
	
	private static final String[ ] language = { "English", "French", "German", "Spanish" };
	
	@RequestMapping(value = "/bookForm")
	public ModelAndView book( ){
		ModelAndView modelAndView = new ModelAndView( );
		
		modelAndView.setViewName("bookForm");
		modelAndView.addObject("book", new Book( ));
		modelAndView.addObject("language", language);
		
		return modelAndView;
	}

	@RequestMapping(value = "/bookResult")
	public ModelAndView processUser(Book book){
		System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertBook(book);
		System.out.println("Value in getName"+ book.getTitle());
		modelAndView.setViewName("bookResult");
		modelAndView.addObject("b", book);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllBooks")
	public ModelAndView viewAllBooks( ){
		ModelAndView modelAndView = new ModelAndView();
		List<Book> allBooks = dao.getAllBooks();
		modelAndView.setViewName("viewAllBooks");
		modelAndView.addObject("all", allBooks);
		return modelAndView;
	}
	
	@RequestMapping(value = "/magazineForm")
	public ModelAndView magazine( ){
		ModelAndView modelAndView = new ModelAndView( );
		
		modelAndView.setViewName("magazineForm");
		modelAndView.addObject("magazine", new Magazine( ));
		modelAndView.addObject("language", language);
		
		return modelAndView;
	}

	@RequestMapping(value = "/magazineResult")
	public ModelAndView processUser(Magazine magazine){
		System.out.println("In processUser");
		ModelAndView modelAndView = new ModelAndView();
		dao.insertMag(magazine);
		System.out.println("Value in getName"+ magazine.getTitle());
		modelAndView.setViewName("magazineResult");
		modelAndView.addObject("m", magazine);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllMagazines")
	public ModelAndView viewAllMagazines( ){
		ModelAndView modelAndView = new ModelAndView();
		List<Magazine> allMags = dao.getAllMags();
		modelAndView.setViewName("viewAllMagazines");
		modelAndView.addObject("all", allMags);
		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAllByGenre")
	public ModelAndView viewAllByGenre( ){
		ModelAndView modelAndView = new ModelAndView();
		List<TitleAndGenre> allByGenre = dao.getAllByGenre();
		modelAndView.setViewName("viewAllByGenre");
		modelAndView.addObject("all", allByGenre);
		return modelAndView;
	}

	@Bean
	public LibraryDao dao(){
		LibraryDao bean = new LibraryDao();
		return bean;
	}

}
