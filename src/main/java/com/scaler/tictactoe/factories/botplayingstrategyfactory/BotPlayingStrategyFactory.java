package com.scaler.tictactoe.factories.botplayingstrategyfactory;

import com.scaler.tictactoe.models.BotDifficultyLevel;
import com.scaler.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.scaler.tictactoe.strategies.botplayingstrategies.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {

//        BotPlayingStrategy strategy = null;
//
//        switch (difficultyLevel) {
//            case EASY ->
//        }

        return switch (difficultyLevel) {
            case EASY, MEDIUM, HARD -> new RandomBotPlayingStrategy();
        };
    }
}
