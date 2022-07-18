package com.scaler.tictactoe.exceptions;

public class EmptyMovesUndoOperationException extends Exception {

    public EmptyMovesUndoOperationException() {
        super("Undo operation was called when no move existed");
    }
}
