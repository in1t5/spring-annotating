package reproducer;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class CommandProvider implements ApplicationContextAware {

	private static Map<String, Command> commands = new ConcurrentHashMap<String, Command>();;
	private ApplicationContext context;

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}

	public Command getCommand(String name) {
		initMap();
		return commands.get(name);
	}

	private void initMap() {
		BeanFactory factory = context;
		commands.put("aCommand", factory.getBean(ACommand.class));
		commands.put("bCommand", factory.getBean(BCommand.class));
	}
}
