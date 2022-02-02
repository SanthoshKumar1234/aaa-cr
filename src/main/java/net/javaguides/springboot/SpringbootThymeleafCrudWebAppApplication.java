package net.javaguides.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;

@SpringBootApplication
@RestController
public class SpringbootThymeleafCrudWebAppApplication extends SpringBootServletInitializer {
	private static final Logger logger = LogManager.getLogger(SpringbootThymeleafCrudWebAppApplication.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootThymeleafCrudWebAppApplication.class);
	}

	@GetMapping("/test")
	public String getTest() {
		
		logger.info("application deployed - test");
		return "Deployed";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafCrudWebAppApplication.class, args);
	}

	
	public void run(ApplicationArguments applicationArguments) throws Exception {
		logger.debug("Debugging log");
		logger.info("Info log");
		logger.warn("Hey, This is a warning!");
		logger.error("Oops! We have an Error. OK");
		logger.fatal("Damn! Fatal error. Please fix me.");
	}

}
