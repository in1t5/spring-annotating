package reproducer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/beans.xml");
		CommandProvider provider = ctx.getBean(CommandProvider.class);
		System.out.println(provider.getCommand("aCommand").exec());
		System.out.println(provider.getCommand("bCommand").exec());
	}
}
