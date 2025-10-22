import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;
    protected String classificacao;


    // Metodos
    public void tempoExp() {
        if (this.getExperiencia() <= 1) {
            this.setClassificacao("Iniciante");
            System.out.println("Nivel: "+this.getClassificacao());
        }

        else if (this.getExperiencia() < 3) {
            this.setClassificacao("Intermediario");
            System.out.println("Nivel: "+this.getClassificacao());
        }

        else if (this.getExperiencia() < 6) {
            this.setClassificacao("Avancado");
            System.out.println("Nivel: "+this.getClassificacao());
        }

        else if (this.getExperiencia() >= 6) {
            this.setClassificacao("Avancado");
            System.out.println("Nivel: "+this.getClassificacao());
        }

        else {
            System.out.println("Nao sei exatamente aonde voce se classifica.");
        }

    }

    
    public void status () {
        System.out.println("=== Informações da pessoa ===");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Tempo de experiencia: "+this.getExperiencia());
        System.out.println("Categoria: "+this.getClassificacao());
    }


    protected void ganharExp() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos de experiencia voce quer acrescentar ? ");
        int experienciaExtra = sc.nextInt();


        while (true) {
            if (experienciaExtra > 0) {
                experienciaExtra++;
                this.setExperiencia(getExperiencia() + experienciaExtra);
                break;
            }

            else if (experienciaExtra == 0) {
                experienciaExtra = getExperiencia();
                System.out.println("Experiencia: "+experienciaExtra);
                break;
            }

            else {
                System.out.println("ERRO: Por favor, escreva novamente: ");
            }
        }

        sc.close();
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


}
