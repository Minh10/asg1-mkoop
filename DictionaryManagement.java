import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
public class DictionaryManagement {
    // nhap du lieu
    public static ArrayList<Word> data = new ArrayList<Word>();
//    static void insertFromCommandline(Word[] data){
//          Scanner sc = new Scanner(System.in);
//          System.out.print("word: ");
//          data[0].setWordtarget(sc.nextLine());
//          sc.nextLine();
//          System.out.print("mean: ");
//          data[0].setMean(sc.nextLine());
//          data[0].display();
//
//    }
    public void insertFromFile(){
        try{
            File inFile = new File("C:\\Users\\home\\IdeaProjects\\Dictionary\\src\\main\\java\\Dictionary.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            Word w = new Word();
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] empty = line.split("\\s");
                w.setWordtarget(empty[0]);
                w.setMean(empty[1]);
                data.add(w);
            }
            reader.close();
            fileReader.close();
        }
        catch(IOException e){
            e.printStackTrace();
            }
    }
    public static void main(String[] args){
//        Word w = new Word("English", "VietNamese");
//        data.add(w);
//        data.get(0).display();
        //insertFromCommandline(data);
        DictionaryManagement    dic = new DictionaryManagement();
        dic.insertFromFile();
        for(int i = 0; i < data.size(); i++){
            data.get(i).display();
        }
    }
}
