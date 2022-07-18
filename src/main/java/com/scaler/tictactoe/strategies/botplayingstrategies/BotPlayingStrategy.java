package com.scaler.tictactoe.strategies.botplayingstrategies;

import com.scaler.tictactoe.models.Board;
import com.scaler.tictactoe.models.Move;
import com.scaler.tictactoe.models.Player;
import com.scaler.tictactoe.models.Symbol;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}
