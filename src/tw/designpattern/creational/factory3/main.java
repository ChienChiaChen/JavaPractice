package tw.designpattern.creational.factory3;

/**
 * Created by chiachen on 2017/6/14.
 */
public class main {
    public static void main(String[] args) {
        String str[] = new String[]{"text.jpeg", "text.gif"};
        DecodedImage decodedImage;
        ImageReader reader = null;
        String format = str[0].substring(str[0].indexOf('.') + 1, (str[0].length()));
        if (format.equals("gif")) {
            reader = new GifReader(str[0]);
        }else if (format.equals("jpeg")) {
            reader = new JpegReader(str[0]);
        }
        if (reader == null)
            return;

        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
