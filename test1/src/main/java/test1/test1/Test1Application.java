package test1.test1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application implements CommandLineRunner {

	public static void main(String[] args) { SpringApplication.run(Test1Application.class, args);}


	@Override
	public void run(String... args) throws Exception {
		Rechner start = new Rechner();
		System.out.println(start.rechnen(5,1));

	}

}

