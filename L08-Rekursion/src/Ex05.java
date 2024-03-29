import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) {
        String path = "C:/Users/allan/IdeaProjects/PRO2-DMU/";
        //scanDir(path);
        System.out.println(path);
        scanDirWlvl(path);
    }

    public static void scanDir(String path){
        File root = new File(path);
        File[] list = root.listFiles();

        if(list == null){
            return;
        }

        for(File f : list){
            if (f.isDirectory()) {
                scanDir(f.getAbsolutePath());
                System.out.println(f.getName());
            }
        }
    }

    public static void scanDirWlvl(String path){
        File root = new File(path);
        File[] list = root.listFiles();

        if(list == null){
            return;
        }

        for(File f : list){
            if (f.isDirectory()) {
                List<String> levelstr = Arrays.asList(path.split("/"));
                int level = levelstr.size() - levelstr.indexOf("PRO2-DMU");
                StringBuilder absolutePath = new StringBuilder();
                for (int i = 0; i < level; i++) {
                    absolutePath.append("\t");
                }
                absolutePath.append(f.getAbsolutePath());
                System.out.println(absolutePath);
                scanDirWlvl(f.getAbsolutePath().replace("\\", "/"));
//                System.out.printf("Dir lvl: %d Name: %s\n", level, f.getAbsolutePath());

            }
        }
    }
}
