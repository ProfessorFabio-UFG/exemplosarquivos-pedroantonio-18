package SequentialWriting;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SequentialWriting {
    public static void main(String[] args) {
        try {
            File diretorio = new File("C:\\Users\\Aluno\\Desktop\\Java\\Files\\SequentialWriting");
            diretorio.mkdir();

            File arquivo = new File(diretorio, "lixo.txt");
            FileOutputStream out = new FileOutputStream(arquivo);

            out.write(new byte[]{'1', '2', '3', '4', '5'});

            File subdir = new File(diretorio, "subdir");

            subdir.mkdir();
            String[] arquivos = diretorio.list();
            for (int i = 0; i < arquivos.length; i++) {
                File filho = new File(diretorio, arquivos[i]);
                System.out.println(filho.getAbsolutePath());
            }

            if (arquivo.exists()) {
                arquivo.delete();
            }
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}