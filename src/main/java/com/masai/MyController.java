package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;

@RestController
public class MyController {

	static List<Book> list = new ArrayList<>();

	@GetMapping(value = "/books")
	public List<Book> getAllTheBooksController() {

		List<Book> lis = MyController.list;

		return lis;

	}

	@GetMapping(value = "/book/{id}")
	public Book getOneBook(@PathVariable("id") Integer id) {
		Book b1 = null;
		List<Book> lis = MyController.list;
		for (Book book : lis) {
			if (book.getBookId() == id)
				b1 = book;
		}

		return b1;
	}

	@PostMapping(value = "/book", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createNewBookController(@RequestBody Book b1) {

		MyController.list.add(b1);

		return "Successfully added " + b1;

	}

	@DeleteMapping(value = "/book/{id}")
	public String deleteBookController(@PathVariable("id") Integer id) {

		List<Book> lis = MyController.list;
		for (Book book : lis) {
			if (book.getBookId() == id)
				lis.remove(book);

		}
		return "Deleted";

	}

}
