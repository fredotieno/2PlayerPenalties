import static org.junit.Assert.*;

import org.junit.Test;


public class PlayerTest {

	@Test
	public void testPlayer1() {
		//In this test their is a draw
		Player one = new Player("LLRRM", "MMRLL");
		Player two = new Player("MRLLM", "LRMMM");
		one.toThePenaltyBox(two);
		two.toThePenaltyBox(one);
		assertEquals(one.getScore(),two.getScore());
	}
	
	@Test
	public void testPlayer2() {
		//In this test Player One wins the penalty shotout
		Player one = new Player("MLRRM", "MMRLL");
		Player two = new Player("MRLLM", "LRMMM");
		one.toThePenaltyBox(two);
		two.toThePenaltyBox(one);
		assertTrue(one.getScore()>two.getScore());
	}


}
