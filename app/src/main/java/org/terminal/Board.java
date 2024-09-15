package org.terminal;

import java.util.ArrayList;
import java.util.List;

public class Board {
  int height;
  int width;
  List<List<String>> board;

  public Board() {
    this.height = 20;
    this.width = 10;
    initializeBoard();
  }

  private List<String> getHeaderRowList() {
    List<String> headerRowList = new ArrayList<>(this.width + 1);

    for (int i = 0; i <= this.width; i++) {
      switch (i) {
        case 0 -> {
          headerRowList.add("  ");
        }
        default -> {
          headerRowList.add(String.valueOf(i));
        }
      }
    }

    return headerRowList;
  }

  private List<String> getRowList(int rowNumber) {
    List<String> rowList = new ArrayList<>(this.width + 1);

    for (int i = 0; i <= this.width; i++) {
      switch (i) {
        case 0 -> {
          rowList.add(rowNumber < 10 ? String.format("0%d", rowNumber) : String.valueOf(rowNumber));
        }
        default -> {
          rowList.add("_");
        }
      }
    }

    return rowList;
  }

  private void initializeBoard() {
    this.board = new ArrayList<>(this.height + 1);

    for (int i = 0; i <= this.height; i++) {
      switch (i) {
        case 0 -> {
          this.board.add(getHeaderRowList());
        }
        default -> {
          this.board.add(getRowList(i));
        }
      }
    }
  }

  public void displayBoard() {
    StringBuilder board = new StringBuilder();

    for (int i = 0; i <= this.height; i++) {
      StringBuilder row = new StringBuilder();

      for (int j = 0; j <= this.width; j++) {
        row.append(this.board.get(i).get(j));
        row.append(" ");
      }

      row.append("\n");
      board.append(row);
    }

    System.out.println(board.toString());
  }
}
