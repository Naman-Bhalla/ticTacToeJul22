package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Cell;
import com.scaler.tictactoe.models.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkIfWon(Board board, Player player) {
        return false;
    }
}
