package personal.example.mysqlnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "personal.example.mysqlnspringboot")
@SpringBootApplication
public class MysqlnspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlnspringbootApplication.class, args);
	}

}
