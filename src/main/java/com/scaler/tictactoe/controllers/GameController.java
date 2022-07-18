package com.scaler.tictactoe.controllers;

import com.scaler.tictactoe.models.*;
import com.scaler.tictactoe.strategies.gamewinningstrategies.GameWinningStrategy;

import java.util.List;

// Start a game
// Make a move
// Undo
// CheckWinner
// GetCurrentState
public class GameController {
    public Game createGame(int dimensionOfBoard,
                           List<Player> players,
                           List<GameWinningStrategy> strategies) {
        Game game = null;

        try {
            game = Game.create()
                    .withBoard(new Board(dimensionOfBoard))
                    .addPlayers(players)
                    .addGameWinningStrategies(strategies)
                    .build();
        } catch (Exception exception) {
            System.out.println("We did something wrong");
        }

        return game;
    }

    public MoveResult makeMove(Game game, Move move) {
        return MoveResult.Failure;
    }

    public boolean undo(Game game) {
//        return game.undo();
        return false;
    }

    public Player getWinner(Game game) {
        return null;
    }

    public GameStatus getGameStatus(Game game) {
        return GameStatus.IN_PROGRESS;
    }
}
