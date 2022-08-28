package Ex04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        String path = "L01-Collections/src/Ex04/Gjoengehoevdingen.txt";
        useTreeSet(path); // 8681 unikkke ord ud af 93428 total antal ord
    }

    public static void useTreeSet(String path){
        File in = new File(path);
        String w;
        Set<Word> treeSet = new TreeSet<>();
        int uniqueCounter = 0;
        int wordCounter = 0;
        try(Scanner scanner = new Scanner(in)){
            while(scanner.hasNext()){
                w = scanner.next().toLowerCase().replaceAll("[^a-å’]","");
                if(!w.equals("")){
                    wordCounter++;
                    boolean found = false;
                    for (Word e : treeSet) {
                        if (e.getWord().equals(w)) {
                            found = true;
                            e.addAmount();
                            break;
                        }
                    }
                    if(!found){
                        Word word = new Word(w);
                        treeSet.add(word);
                        uniqueCounter++;
                    }
                }
            }
        } catch(FileNotFoundException ex){
            System.out.println("Hej jeg er en fejl");
        }
        System.out.printf("%d unikkke ord ud af %d total antal ord\n", uniqueCounter, wordCounter);
        System.out.println(treeSet);
    }
}
