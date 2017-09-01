package tw.designpattern.structural.proxy3;

public interface Printable {
    void setPrinterName(String name);   // 命名
    String getPrinterName();            // 取得名稱
    void print(String string);          // 輸出字串（列印）
}
