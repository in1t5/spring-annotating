package reproducer;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TravisCiMavenTest {

	@Test
	public void testTravisCi() {
		AppController controller = new AppController();
		String response = controller.init();

		assertThat(response).isNotBlank().isEqualTo("A");
	}
}
