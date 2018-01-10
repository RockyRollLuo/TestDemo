package indi.rocky.dp.adapter;

public class AdvanceMediaPlayer_VideoPlayer implements AdvancedMediaPlayer {
    public void play_Audio(String fileName) {
        //do nothing
    }

    public void play_Video(String fileName) {
        System.out.println("Playing Video file:" + fileName);
    }
}
