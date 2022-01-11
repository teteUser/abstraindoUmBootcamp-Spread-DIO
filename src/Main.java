import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java Básico");
        cursoJava.setDescricao("Iniciando no Java");
        cursoJava.setCargaHoraria(40);

        Curso cursoSQL = new Curso();
        cursoSQL.setTitulo("Curso SQL");
        cursoSQL.setDescricao("Aprenda Banco de Dados SQL");
        cursoSQL.setCargaHoraria(40);

        Mentoria mentoriaJavaAvancado = new Mentoria();
        mentoriaJavaAvancado.setTitulo("Java Avançado");
        mentoriaJavaAvancado.setDescricao("Mentoria em Java Avançado");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Spread");
        bootcamp.setDescricao("Bootcamp Java Developer na plataforma DIO");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoSQL);
        bootcamp.getConteudos().add(mentoriaJavaAvancado);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos do João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosInscritos());

        devJoao.progredir();
        devMaria.progredir();

        System.out.println("Conteúdos Inscritos do João: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosConcluidos());

        System.out.println("Conteúdos Inscritos do João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos da Maria" + devMaria.getConteudosInscritos());

        System.out.println("XP do João: " + devJoao.calcularTotalXp());
        System.out.println("XP da Maria: " + devMaria.calcularTotalXp());

        System.out.println("Maria dá mais uma passo no Bootcamp...");
        devMaria.progredir();



    }
}
