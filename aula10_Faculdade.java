package aulasjavapoo;

public class aula10_Faculdade {
    public static void main(String[] args) {
        // Programa principal
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario f1 = new Funcionario();

        p1.setNome("Pedro");
        a1.setNome("Maria");
        p2.setNome("Claudio");
        f1.setNome("Fabiana");


        p1.setSexo("Masculino");
        a1.setSexo("Feminino");
        p2.setSexo("Masculino");
        f1.setSexo("Feminino");

        p1.setIdade(19);
        a1.setIdade(18);
        p2.setIdade(43);
        f1.setIdade(28);

        p2.setSalario(2500.75f); // Claudio
        f1.setSetor("Estoque"); // Fabiana

        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(p2.toString());
        System.out.println(f1.toString());
    }
}
