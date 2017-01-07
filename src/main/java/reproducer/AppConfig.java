package reproducer;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "reproducer" })
public class AppConfig {
	// configure stuff and beans
}
