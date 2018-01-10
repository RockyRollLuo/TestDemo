package indi.rocky.dp.template;

public class MainTemplate {

    public static void main(String[] args) {

        //新建篮球游戏
        Game game = new Game_Basketball();
        game.play();

        System.out.println();

        //新建足球游戏
        game = new Game_Football();
        game.play();

    }
}
