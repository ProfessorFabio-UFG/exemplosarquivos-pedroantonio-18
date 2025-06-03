package SequentialReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SequentialReading {
    public static void main(String[] args) {
        try {
            File arquivo = new File("C:\\Users\\Aluno\\Desktop\\Java\\Files\\SequentialReading\\listaAlunos.txt");
            FileInputStream in = new FileInputStream(arquivo);
            InputStreamReader conversor = new InputStreamReader(in);
            BufferedReader bf = new BufferedReader(conversor);
            boolean continua = true;
            String linha;

            for (int i = 1; continua != false; i++) {
                linha = bf.readLine();
                if (linha == null) {
                    continua = false;
                } else {
                    System.out.println(i + ". " + linha);
                }
            }
            bf.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
