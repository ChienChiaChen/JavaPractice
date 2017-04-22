package tw.se.thread.threadlocal;

/**
 * Created by chiachen on 2017/4/22.
 */
public class SomeResource {
    private static final ThreadLocal<SomeResource> threadLocal = new ThreadLocal<>();

    public static SomeResource getResource() {
        // 根據目前執行緒取得專屬資源
        SomeResource resource = threadLocal.get();
        // 如果沒有取得目前專屬資源
        if(resource == null) {
            // 建立一個新的資源並存入ThreadLocal中
            resource = new SomeResource();
            threadLocal.set(resource);
        }
        return resource;
    }
}
