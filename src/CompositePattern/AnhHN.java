
package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class AnhHN{
public static void main (String[] args) {
    List<FileComponent> files = new ArrayList<FileComponent>();

    FileComponent file1 = new FileLeaf("Hoang", 27);
    files.add(file1);
    FileComponent file2 = new FileLeaf("Ngoc", 12);
    files.add(file2);
    FileComponent file3 = new FileLeaf("Anh", 97);
    files.add(file3);

    FileComponent folder = new FolderComposite(files);
    System.out.println("Name" + " Size");
    folder.showProperty();
    System.out.println("Total Size: " + folder.totalSize());
    }
}

