package indi.rocky.dp.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type) {

        if (type.equalsIgnoreCase("AUDIO")) {
            advancedMediaPlayer=new AdvanceMediaPlayer_AudioPlayer();
        } else if (type.equalsIgnoreCase("VIDEO")) {
            advancedMediaPlayer = new AdvanceMediaPlayer_VideoPlayer();
        }
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("AUDIO")) {
            advancedMediaPlayer.play_Audio(fileName);
        } else if (audioType.equalsIgnoreCase("VIDEO")) {
            advancedMediaPlayer.play_Video(fileName);
        }

    }
}
