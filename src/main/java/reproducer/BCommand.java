package reproducer;

import org.springframework.stereotype.Component;

@Component("B")
public class BCommand implements Command {
	// autowire stuff
	@Override
	public String exec() {
		return "B";
	}
}
