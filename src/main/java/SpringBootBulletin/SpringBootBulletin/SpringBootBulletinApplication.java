package SpringBootBulletin.SpringBootBulletin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootBulletinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBulletinApplication.class, args);
	}

	@GetMapping
	public String HelloWorld(){
		return "Hello World";
	}
}
