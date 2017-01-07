package reproducer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(ctx.getBean("A", Command.class).exec());
		System.out.println(ctx.getBean("B", Command.class).exec());
	}
}
