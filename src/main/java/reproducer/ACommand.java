package reproducer;

import org.springframework.stereotype.Component;

@Component("A")
public class ACommand implements Command {
	// autowire stuff
	@Override
	public String exec() {
		return "A";
	}
}
