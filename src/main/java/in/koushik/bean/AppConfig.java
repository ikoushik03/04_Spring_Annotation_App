package in.koushik.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"in.koushik"})
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig constructor");
	}
	
	@Bean
	public Robot fun() {
		Robot robot = new Robot();
		return robot;
	}

}
