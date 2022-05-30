package com.masai;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.model.Book;

@SpringBootApplication
public class SpringbootEvaluation1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEvaluation1Application.class, args);

//		List<Book> li = MyController.list;
//		for (Book book : li) {
//			System.out.println(book);
//		}
	}

}
