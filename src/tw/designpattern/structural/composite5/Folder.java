package tw.designpattern.structural.composite5;


import java.util.ArrayList;
import java.util.List;

public class Folder implements Composite {
    private String mName;
    private List<AbstractFile> mFileList = new ArrayList<>();

    public Folder(String name) {

        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void add(AbstractFile abstractFile) {
        mFileList.add(abstractFile);
    }

    public void remove(AbstractFile abstractFile) {
        mFileList.remove(abstractFile);
    }
    @Override
    public void killFil() {
        for (AbstractFile abstractFile : mFileList) {
            abstractFile.killFil();
        }
    }

    @Override
    public AbstractFile getChild(int index) {
        return (mFileList.size() > index) ? mFileList.get(index) : null;
    }
}
