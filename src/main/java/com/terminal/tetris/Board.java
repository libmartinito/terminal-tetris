package main.java.com.terminal.tetris;

public class Board {
  int height;
  int width;

  public Board() {
    this.height = 20;
    this.width = 10;
  }

  private String getHeaderRow() {
    StringBuilder headerRow = new StringBuilder();

    for (int i = 0; i <= this.width; i++) {
      switch (i) {
        case 0 -> {
          headerRow.append("  ");
        }
        default -> {
          headerRow.append(i);
        }
      }

      headerRow.append(" ");
    }

    headerRow.append("\n");
    return headerRow.toString();
  }

  private String getRow(int rowNumber) {
    StringBuilder row = new StringBuilder();

    for (int i = 0; i <= this.width; i++) {
      switch (i) {
        case 0 -> {
          row.append(rowNumber < 10 ? String.format("0%d", rowNumber) : rowNumber);
        }
        default -> {
          row.append("_");
        }
      }

      row.append(" ");
    }

    row.append("\n");
    return row.toString();
  }

  public void displayBoard() {
    StringBuilder board = new StringBuilder();

    for (int i = 0; i <= this.height; i++) {
      switch (i) {
        case 0 -> {
          board.append(getHeaderRow());
        }
        default -> {
          board.append(getRow(i));
        }
      }
    }

    System.out.println(board.toString());
  }
}
