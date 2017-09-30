package tw.se.generic_pretice3;

import java.util.List;

public class ListGenericFoo<T extends List> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
