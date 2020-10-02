package spring.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokesWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(JokesWebApplication.class, args);
		/*ApplicationContext ctx = SpringApplication.run(JokesWebApplication.class, args);
		System.out.println("---------starting");
		MvcController mvcController= (MvcController)ctx.getBean("mvcController");
		System.out.println(mvcController.getNewJoke());*/
	}

}
