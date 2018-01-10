package indi.rocky.dp.template;

public class Game_Football extends Game {
    @Override
    void initialize() {
        System.out.println("Game Football initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Game Football start");
    }

    @Override
    void endPlay() {
        System.out.println("Game Football end");
    }
}
