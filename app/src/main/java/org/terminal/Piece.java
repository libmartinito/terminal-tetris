package org.terminal;

import java.util.ArrayList;
import java.util.List;

public class Piece {
  List<Coordinate> coordinates;

  public Piece(String type) {
    initializeCoordinates(type);
  }

  private void initializeCoordinates(String type) {
    switch (type) {
      case "T" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(5, 1));
        this.coordinates.add(new Coordinate(4, 2));
        this.coordinates.add(new Coordinate(5, 2));
        this.coordinates.add(new Coordinate(6, 2));
      }
      case "O" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(4, 1));
        this.coordinates.add(new Coordinate(5, 1));
        this.coordinates.add(new Coordinate(4, 2));
        this.coordinates.add(new Coordinate(5, 2));
      }
      case "I" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(4, 1));
        this.coordinates.add(new Coordinate(5, 1));
        this.coordinates.add(new Coordinate(6, 1));
        this.coordinates.add(new Coordinate(7, 1));
      }
      case "J" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(4, 1));
        this.coordinates.add(new Coordinate(4, 2));
        this.coordinates.add(new Coordinate(5, 2));
        this.coordinates.add(new Coordinate(6, 2));
      }
      case "L" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(6, 1));
        this.coordinates.add(new Coordinate(4, 2));
        this.coordinates.add(new Coordinate(5, 2));
        this.coordinates.add(new Coordinate(6, 2));
      }
      case "S" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(5, 1));
        this.coordinates.add(new Coordinate(6, 1));
        this.coordinates.add(new Coordinate(4, 2));
        this.coordinates.add(new Coordinate(5, 2));
      }
      case "Z" -> {
        this.coordinates = new ArrayList<>();
        this.coordinates.add(new Coordinate(4, 1));
        this.coordinates.add(new Coordinate(5, 1));
        this.coordinates.add(new Coordinate(5, 2));
        this.coordinates.add(new Coordinate(6, 2));
      }
    }
  }
}
