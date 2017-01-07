package reproducer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements Command, ApplicationContextAware {

	private static Map<String, Command> map;

	@Autowired
	protected ApplicationContext context;
	
	public void setApplicationContext(ApplicationContext factory) {
		this.context = factory;
	}

	public Command getMapValueFor(String key) {
		if (map == null) {
			initMap();
		}
		return map.get(key);
	}

	private void initMap() {
		/*
		 * FIXME: We can not init the map in a static block or directly
		 * initialize it since the factory is not injected until execution of a
		 * static block and will be null.
		 */
		BeanFactory factory = context;
		map = new HashMap<String, Command>();
		map.put("key", factory.getBean(ServiceImpl.class));

	}

	@Override
	public String exec() {
		// TODO Auto-generated method stub
		return null;
	}
}
