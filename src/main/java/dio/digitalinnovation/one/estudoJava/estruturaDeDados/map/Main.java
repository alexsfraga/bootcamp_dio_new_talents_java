package dio.digitalinnovation.one.estudoJava.estruturaDeDados.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Map> alunos = new HashMap<>();

        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome","Joao");
        aluno1.put("Idade","17");
        aluno1.put("Media","8.5");
        aluno1.put("Turma","3a");

        System.out.println( aluno1 );

        //System.out.println( aluno1.keySet() );
        //System.out.println( aluno1.values() );

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Maria");
        aluno2.put("Idade","15");
        aluno2.put("Media","9.5");
        aluno2.put("Turma","1a");

        System.out.println( aluno2 );

        alunos.put("aluno1" , aluno1);
        alunos.put("aluno2" , aluno2);

        System.out.println(alunos);
    }
}
