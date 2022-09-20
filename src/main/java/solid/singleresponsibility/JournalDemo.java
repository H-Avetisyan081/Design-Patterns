package solid.singleresponsibility;

import java.io.IOException;

public class JournalDemo {
    public static void main(String[] args) throws IOException {
        Journal journal = new Journal();
        journal.addEntry("I cried today");
        journal.addEntry("I ate bugs and warnings");
        System.out.println(journal);
        Persistence p = new Persistence();
        String filename ="E:\\test.txt";
        p.saveToFile(journal,filename,true);
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
