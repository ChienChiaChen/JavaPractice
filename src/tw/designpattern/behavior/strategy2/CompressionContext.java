package tw.designpattern.behavior.strategy2;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by chiachen on 2016/11/5.
 */
public class CompressionContext {
    CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }
    public void createArchive(ArrayList<File> files){
        compressionStrategy.compressFiles(files);
    }
}
