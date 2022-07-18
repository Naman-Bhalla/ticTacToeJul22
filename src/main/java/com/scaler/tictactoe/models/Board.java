package com.scaler.tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public Board(int dimension) {
        this.dimension = dimension;

        board = new ArrayList<>();

        for (int i = 0; i < dimension; ++i) {
            board.add(new ArrayList<>(dimension));
        }

    }

    Cell getCell(int i, int j) {
        return board.get(i).get(j);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
