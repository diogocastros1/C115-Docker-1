package br.inatel.c206.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Cadastro {
    private static final Path alunos = Paths.get("alunos.txt");
    private static final Path professor = Paths.get("professor.txt");
    private static final Path monitor = Paths.get("monitor.txt");

    public static void aluno(String nome, String curso){
        try{
            Files.writeString(alunos, nome + " ; ",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            Files.writeString(alunos, curso + "\n",
                    StandardOpenOption.APPEND);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void professor(String nome, String materia){
        try{
            Files.writeString(professor, nome + " ; ",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            Files.writeString(professor, materia + "\n",
                    StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void monitor(String nome, String curso, int horariosLivre){
        try{
            Files.writeString(monitor, nome + " ; ",
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
            Files.writeString(monitor, curso + " ; ",
                    StandardOpenOption.APPEND);
            Files.writeString(monitor, Integer.toString(horariosLivre) + "\n",
                    StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
