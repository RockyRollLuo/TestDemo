package indi.rocky.dp.adapter;

public class AdvanceMediaPlayer_AudioPlayer implements AdvancedMediaPlayer {
    public void play_Audio(String fileName) {
        System.out.println("Play audio file:"+fileName);
    }

    public void play_Video(String fileName) {
        //do nothing
    }
}
