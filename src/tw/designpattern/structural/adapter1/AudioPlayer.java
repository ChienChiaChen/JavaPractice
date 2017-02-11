package tw.designpattern.structural.adapter1;

/**
 * Created by chiachen on 2017/1/10.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;
    public static final String MEDIA_FORMAT_MP3 = "MP3";
    public static final String MEDIA_FORMAT_MP4 = "MP4";
    public static final String MEDIA_FORMAT_VLC = "VLC";

    @Override
    public void play(String audioType, String fileName) {
        if (MEDIA_FORMAT_MP3.equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (MEDIA_FORMAT_VLC.equalsIgnoreCase(audioType) || MEDIA_FORMAT_MP4.equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println(" Invalid Media " + audioType);
        }
    }
}
