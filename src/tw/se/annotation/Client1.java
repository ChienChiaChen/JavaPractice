package tw.se.annotation;

import java.util.Date;

public class Client1 {

    @Deprecated
    public void testt(){


    }

    @SuppressWarnings("All")
    private void test(){
        Date date = new Date();
        Date.parse("");
        testt();

    }


    @Override
    public String toString(){
        return "";
    }
}
