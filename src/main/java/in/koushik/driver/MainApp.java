package in.koushik.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.koushik.bean.AppConfig;
import in.koushik.bean.Car;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car bean = context.getBean(Car.class);
		System.out.println(bean.hashCode());
		
		Car b = context.getBean(Car.class);
		System.out.println(b.hashCode());

	}

	

}
