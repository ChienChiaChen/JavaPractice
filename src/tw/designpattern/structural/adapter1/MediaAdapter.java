package tw.designpattern.structural.adapter1;

/**
 * Created by chiachen on 2017/1/10.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (AudioPlayer.MEDIA_FORMAT_MP4.equalsIgnoreCase(audioType))
            advancedMediaPlayer = new Mp4Player();
        if (AudioPlayer.MEDIA_FORMAT_VLC.equalsIgnoreCase(audioType))
            advancedMediaPlayer = new VlcPlayer();

    }

    @Override
    public void play(String audioType, String fileName) {
        if (AudioPlayer.MEDIA_FORMAT_MP4.equalsIgnoreCase(audioType))
            advancedMediaPlayer.playMp4(fileName);

        if (AudioPlayer.MEDIA_FORMAT_VLC.equalsIgnoreCase(audioType))
            advancedMediaPlayer.playVlc(fileName);
    }

}
