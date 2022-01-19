import java.util.ArrayList;
import java.util.List;

public class Folder implements FileManager {
    String name,type;
    private List<FileManager> fileList=new ArrayList<FileManager>();
    public Folder(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void singleClick() {
        System.out.println("Name:"+name+", Type:"+type);
    }

    @Override
    public void doubleClick() {
        System.out.println(name+" Folder is opened.");
        System.out.println("Contents:");
        for (FileManager fileManager:fileList
             ) {
            fileManager.singleClick();
        }
    }
    public void add(FileManager fileManager){
        fileList.add(fileManager);
    }
    public void remove(FileManager fileManager){
        fileList.remove(fileManager);
    }
}
