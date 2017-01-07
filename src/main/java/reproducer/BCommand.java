package reproducer;

import org.springframework.stereotype.Component;

@Component
public class BCommand implements Command {
	// autowire stuff
	@Override
	public String exec() {
		return "B";
	}
}
