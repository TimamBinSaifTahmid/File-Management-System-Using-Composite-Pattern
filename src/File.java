public class File implements FileManager {
    String name,type;

    public File(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void singleClick() {
        System.out.println("Name:"+name+", Type:"+type);
    }

    @Override
    public void doubleClick() {
        System.out.println(name+"."+type+" file is open");

    }
}
