package aulasjavapoo;

public class Lutadores {
    
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas; 
    private int empates;

    public void apresentar() {
        System.out.println("==========================================");
        System.out.println("Lutador: "+this.getNome());
        System.out.println("Nacionalidade: "+this.getNacionalidade());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Altura: "+this.getAltura());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Vitórias: "+this.getVitorias());
        System.out.println("Derrotas: "+this.getDerrotas());
        System.out.println("Empates: "+this.getEmpates());
        System.out.println("==========================================");
    }
    public void status() {
        System.out.println(this.getNome());
        System.out.println(this.getNome()+" é um peso "+ getCategoria());
        System.out.println("Ganhou "+this.getVitorias());
        System.out.println("Perdeu "+this.getDerrotas());
        System.out.println("Empatou "+this.getEmpates());
    }
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public Lutadores(String no, String na, int id,float al,
                   float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String no) {
        nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String na) {
        nacionalidade = na;
    }
    
    public int getIdade() {
        return idade;  
    }
    public void setIdade(int id) {
        idade = id;
    }
    
    public float getAltura() {
        return altura;
    }
    public void setAltura(float al) {
        altura = al;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        }
        else if (this.peso <= 70.3) {
            this.categoria = "Leve";
        }
        else if (this.peso <= 83.3) {
            this.categoria = "Médio";
        }
        else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        }
        else {
            this.categoria = "Inválido";
        }
        this.categoria = categoria;
    }

    public float getPeso() {
        return peso;
    }
    private void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }


    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vi){
        vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int de) {
        derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int em) {
        empates = em;
    }
}
