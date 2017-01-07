package reproducer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

	public String init() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		return ctx.getBean("A", Command.class).exec();
	}
}
