package io.github.zpring.framework;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ZpringFrameworkTests {

	@Test
	void test() {
		assertThat(new ZpringFramework().name()).isEqualTo("Zpring Framework");
	}

}
