package reproducer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "reproducer" })
public class AppConfig {

	@Bean
	public CommandProvider commandProvider() {
		return new CommandProvider();
	}

	// @Bean
	// public ACommand aCommand() {
	// return new ACommand();
	// }
	//
	// @Bean
	// public BCommand bCommand() {
	// return new BCommand();
	// }
}
