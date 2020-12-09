package JUnit4Printtokens2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Printtokens2Test {

	@Test
	void is_comment_test() {
//		assertEquals(true, Printtokens2.is_comment("jfiowfjqnfdsvjhiengpviejgoijfqihpovioaenrifjwiofjhvicvnmoiewjfieowf"));
		assertEquals(false, Printtokens2.is_comment("iewncvjlew"));
	}
	
	@Test
	void is_keyword_test() {
		assertEquals(true, Printtokens2.is_keyword("and"));
		assertEquals(true, Printtokens2.is_keyword("or"));
		assertEquals(true, Printtokens2.is_keyword("if"));
		assertEquals(true, Printtokens2.is_keyword("xor"));
		assertEquals(true, Printtokens2.is_keyword("lambda"));
		assertEquals(true, Printtokens2.is_keyword("=>"));
		assertEquals(false, Printtokens2.is_keyword("==>"));
		assertEquals(false, Printtokens2.is_keyword("not"));
	}
	
	@Test
	void is_char_constant_test() {
		assertEquals(true, Printtokens2.is_char_constant("#ab"));
		assertEquals(false, Printtokens2.is_char_constant("1ab"));
	}
	
	@Test
	void is_num_constant_test() {
//		assertEquals(true, Printtokens2.is_num_constant("123"));
		assertEquals(false, Printtokens2.is_num_constant("ab1"));
	}
	
	@Test
	void is_str_constant_test() {
//		assertEquals(true, Printtokens2.is_str_constant("woieha"));
		assertEquals(false, Printtokens2.is_str_constant("woieha"));
	}
	
	@Test
	void is_identifier_test() {
//		assertEquals(true, Printtokens2.is_identifier("dkjfweiha12313_"));
		assertEquals(false, Printtokens2.is_identifier("woieha#@%#@@233821_"));
	}

}
