package aulasjavapoo;

public class aula10_Faculdade {
    public static void main(String[] args) {
        // Programa principal
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario f1 = new Funcionario();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();

        // Visitante
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("Masculino");

        System.out.println(v1.getNome());
        System.out.println(v1.getIdade());
        System.out.println(v1.getSexo());


        // Aluno
        System.out.println();
        a1.setNome("Claudio");
        a1.setMatricula(11203);
        a1.setCurso("Informatica");
        a1.setIdade(19);
        a1.setSexo("Masculino");

        System.out.println(a1.getNome());
        System.out.println(a1.getMatricula());
        System.out.println(a1.getCurso());
        System.out.println(a1.getIdade());
        System.out.println(a1.getSexo());
        a1.pagarMensalidade();
        System.out.println();


        // Bolsista
        System.out.println();
        b1.setNome("Pedro");
        b1.setBolsa(12.5f);
        System.out.println(b1.getNome());
        System.out.println("Valor de desconto: "+b1.getBolsa()+"%");
        b1.pagarMensalidade();
        System.out.println();


        // Tecnico
        System.out.println();
        t1.setNome("Ivaldo");
        t1.setIdade(43);
        t1.setSexo("Masculino");
        t1.setRegistroPessoal(43235);

        System.out.println(t1.getNome());
        System.out.println(t1.getIdade());
        System.out.println(t1.getSexo());
        System.out.println("Registro pessoal: "+t1.getRegistroPessoal());
        t1.praticar();
    }
}
