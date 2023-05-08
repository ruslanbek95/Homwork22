import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        try {
            FileWriter fileWriter = new FileWriter("alphabet.txt");
            String[] tamga = new String[]{"Aa", "Bb", "Cc", "Dd", "Ee", "Ff", "Gg", "Hh", "Ii", "Jj", "Kk", "Ll", "Mm", "Nn", "Oo", "Pp", "Qq", "Rr", "Ss", "Tt", "Uu", "Vv", "Ww", "Xx", "Yy", "Zz", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            for (int i = 0; i < tamga.length; i++) {
                fileWriter.write(tamga[i] + "\n");
            }
            fileWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try (FileReader fileReader = new FileReader("alphabet.txt")) {
            Scanner scanner1 = new Scanner(fileReader);
            while(scanner1.hasNext()) {
                for (int i = 1; i <=36 ; i++) {
                    System.out.println(i+": "+scanner1.nextLine());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}