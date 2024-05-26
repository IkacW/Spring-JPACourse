package com.example.JPACourse;

import com.example.JPACourse.Models.Author;
import com.example.JPACourse.Models.Video;
import com.example.JPACourse.repositories.AuthorRepository;
import com.example.JPACourse.repositories.VideoRepository;
import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCourseApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository authorRepository,
			VideoRepository videoRepository
	) {
		return args -> {
			Faker faker = new Faker();
//			for(int i = 0 ; i < 50; i++) {
//				Author author = new Author()
//						.builder()
//						.firstName(faker.name().firstName())
//						.lastName(faker.name().lastName())
//						.age(faker.number().numberBetween(19, 50))
//						.email(faker.internet().emailAddress())
//						.build();
//				authorRepository.save(author);
//			}
//			var author = Author.builder()
//					.firstName("Ilija")
//					.lastName("Vulic")
//					.age(23)
//					.email("ikacwallet@gmail.com")
//					.build();
//			authorRepository.save(author);
//			var video = Video.builder()
//					.name("abc")
//					.size(64)
//					.length(12)
//					.build();
//			videoRepository.save(video);
		};
	}

}
