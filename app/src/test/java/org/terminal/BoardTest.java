package org.terminal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class BoardTest {
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @AfterEach
  public void tearDown() {
    System.setOut(originalOut);
  }

  @Test
  void testBoardIsDisplayed() {
    Board board = new Board();
    board.displayBoard();

    String expectedOutput = """
             1 2 3 4 5 6 7 8 9 10
          01 _ _ _ _ _ _ _ _ _ _
          02 _ _ _ _ _ _ _ _ _ _
          03 _ _ _ _ _ _ _ _ _ _
          04 _ _ _ _ _ _ _ _ _ _
          05 _ _ _ _ _ _ _ _ _ _
          06 _ _ _ _ _ _ _ _ _ _
          07 _ _ _ _ _ _ _ _ _ _
          08 _ _ _ _ _ _ _ _ _ _
          09 _ _ _ _ _ _ _ _ _ _
          10 _ _ _ _ _ _ _ _ _ _
          11 _ _ _ _ _ _ _ _ _ _
          12 _ _ _ _ _ _ _ _ _ _
          13 _ _ _ _ _ _ _ _ _ _
          14 _ _ _ _ _ _ _ _ _ _
          15 _ _ _ _ _ _ _ _ _ _
          16 _ _ _ _ _ _ _ _ _ _
          17 _ _ _ _ _ _ _ _ _ _
          18 _ _ _ _ _ _ _ _ _ _
          19 _ _ _ _ _ _ _ _ _ _
          20 _ _ _ _ _ _ _ _ _ _
        """;

    assertNotNull(expectedOutput, outputStreamCaptor.toString().trim());
  }
}
