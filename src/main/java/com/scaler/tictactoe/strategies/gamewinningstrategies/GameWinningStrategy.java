package com.scaler.tictactoe.strategies.gamewinningstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Cell;
import com.scaler.tictactoe.models.Player;

public interface GameWinningStrategy {

    boolean checkIfWon(Board board, Player player, Cell moveCell);
}
