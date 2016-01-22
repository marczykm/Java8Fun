import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MMARCZYK on 2016-01-15.
 */
public class MethodsReferencing {
    public static void main(String[] args){
        oldMethod();
        System.out.println();
        newMethod();
    }

    private static void oldMethod() {
        List<File> files = Arrays.asList(new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        }));
        for (File f : files)
            System.out.print(f.getName() + ", ");
    }

    private static void newMethod(){
        List<File> files = Arrays.asList(new File(".").listFiles(File::isFile));
        files.forEach(file->System.out.print(file.getName() + ", "));
    }
}
