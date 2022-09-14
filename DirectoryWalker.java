package eckel.examples;

import java.io.*;

import static jdk.nashorn.internal.objects.Global.print;

public class DirectoryWalker {
    public static void main(String[] args) {
        PPrint.pprint(Directory.walk(".").dirs);
        for(File file : Directory.local(".","T.*"))
            print(file);
        print("-------------");
        for (File file : Directory.walk(".", "T.\\.java"))
            print(file);
        print("=============");
        for(File file : Directory.walk(".", ".*[Zz].*\\.class"))
            print(file);
    }
}
