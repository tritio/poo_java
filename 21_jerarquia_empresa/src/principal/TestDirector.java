package principal;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TestDirector {

	@SuppressWarnings("deprecation")
	@Test
	void testIncentivar() {
		Director director = new Director("a", 10, LocalDate.now().minusMonths(31) , 2000, "d", 30 );
		director.incentivar();
		assertEquals(3200, director.getSalario());
	}

}
