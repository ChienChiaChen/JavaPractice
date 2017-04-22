package tw.se.thread.threadlocal;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by chiachen on 2017/4/22.
 */
public class SimpleThreadLogger {
    private static final
    java.lang.ThreadLocal<Logger> threadLocal =
            new java.lang.ThreadLocal<>();
    // 輸出訊息
    public static void log(String msg) {
        getThreadLogger().log(Level.INFO, msg);
    }
    // 根據執行緒取得專屬Logger
    private static Logger getThreadLogger() {
        Logger logger = threadLocal.get();

        if(logger == null) {
            try {
                logger = Logger.getLogger(
                        Thread.currentThread().getName());
                // Logger 預設是在主控台輸出
                // 我們加入一個檔案輸出的Handler
                // 它會輸出XML的記錄文件
                logger.addHandler(
                        new FileHandler(
                                Thread.currentThread().getName()
                                        + ".log"));
            }
            catch(IOException e) {}

            threadLocal.set(logger);
        }

        return logger;
    }
}
