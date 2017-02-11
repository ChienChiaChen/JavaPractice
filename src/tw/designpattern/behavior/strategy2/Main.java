package tw.designpattern.behavior.strategy2;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by chiachen on 2017/1/29.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<File> files = new ArrayList<>();
        CompressionContext compressionContext =
                new CompressionContext(new RarCompressionStrategy());
        compressionContext.createArchive(files);


        CompressionContext compressionContext1 =
                new CompressionContext(new ZipCompressionStrategy());
        compressionContext1.createArchive(files);

    }
}
