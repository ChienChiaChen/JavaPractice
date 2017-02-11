package tw.designpattern.structural.adapter1;

/**
 * Created by chiachen on 2017/1/10.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play(AudioPlayer.MEDIA_FORMAT_MP3, "beyond the horizon.mp3");
        audioPlayer.play(AudioPlayer.MEDIA_FORMAT_MP4, "alone.mp4");
        audioPlayer.play(AudioPlayer.MEDIA_FORMAT_VLC, "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
