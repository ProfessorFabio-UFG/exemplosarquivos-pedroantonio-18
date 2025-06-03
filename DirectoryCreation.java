package DirectoryCreation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DirectoryCreation {
    public static void main(String[] args) {
        try {
            File diretorio = new File("C:\\Users\\Aluno\\Desktop\\Java\\Files\\Directory");
            diretorio.mkdir();

            File subdir1 = new File(diretorio, "subdir1");
            subdir1.mkdir();

            File subdir2 = new File(diretorio, "subdir2");
            subdir2.mkdir();

            File arquivo = new File(diretorio, "arquivoVazio.txt");
            FileWriter f = new FileWriter(arquivo);
            
            f.close();

            String[] arquivos = diretorio.list();
            for (int i = 0; i < arquivos.length; i++) {
                File filho = new File(diretorio, arquivos[i]);
                System.out.println(filho.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
