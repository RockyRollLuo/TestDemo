package indi.rocky.dp.template;


/**
 * 游戏抽象类
 */
public abstract class Game {

    //初始游戏
    abstract void initialize();

    //开始游戏
    abstract void startPlay();

    //结束游戏
    abstract void endPlay();

    /*
     * 模板方法
     * 所有的游戏自己定义自己的各种细节，但游戏流程不能变化
     * 设为final类，是游戏流程不能变化
     */
    public final void play() {
        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
