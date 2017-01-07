package reproducer;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TravisCiMavenTest {

	@Test
	public void testTravisCi() {
		AppController controller = new AppController();
		String response = controller.init();

		assertThat(response).isNotBlank().isEqualTo("A");
	}
}
