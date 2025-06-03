package SequentialWriting;

import java.io.FileOutputStream;
import java.io.IOException;

public class SequentialWritingDynamic {
    public static void main(String[] args) {
        try {
            System.out.print("Digite um texto: ");

            FileOutputStream f0 = new FileOutputStream("C:\\Users\\Aluno\\Desktop\\Java\\Files\\SequentialWriting\\Saida0.txt");

            byte a = (byte)System.in.read();
            while(a != '\n') {
                f0.write(a);
                a = (byte) System.in.read();
            }

            f0.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
