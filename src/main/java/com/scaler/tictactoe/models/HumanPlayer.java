package com.scaler.tictactoe.models;

public class HumanPlayer extends Player {
    private User user;

    public HumanPlayer(Symbol symbol, User user) {
        super(PlayerType.HUMAN, symbol);
        this.user = user;
    }
}

// List<Player> players;
// for (Player p: players) {
//   if (p.getType() == HUMAN) {
//   } else if (p.getType() == )
// }
