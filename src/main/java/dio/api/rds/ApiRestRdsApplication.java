package dio.api.rds;

import dio.api.rds.entitys.Person;
import dio.api.rds.repositorys.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiRestRdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestRdsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository){
		return args -> {
			repository.save(new Person("Joao", "Silva"));
			repository.save(new Person("Juliana", "Mascarenhas"));

		};
	}

}
