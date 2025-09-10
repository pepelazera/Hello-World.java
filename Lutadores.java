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
    
    
    // Métodos 
    public void construtor() {
        String no;
        String na;
        int id;
        float al;
        float pe;
        int vi;
        int de;
        int em;
        
        no = nome;
        na = nacionalidade;
        id = idade;
        al = altura;
        pe = peso;
        vi = vitorias;
        de = derrotas;
        em = empates;
    }
    
    public void apresentar() {}
    public void status() {}
    public void ganharLuta() {}
    public void perderLuta() {}
    public void empatarLuta() {} 
    
    
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

    public float getPeso() {
        return peso;
    }
    public void setPeso(float pe) {
        peso = pe;
        setCategoria();
    }
    
    public void setCategoria() {
        if (peso < 52.2) {
            categoria = "inválido";
        }
        else if (peso <= 70.3) {
            categoria = "leve";
        }
        else if (peso <= 83.3) {
            categoria = "Médio";
        }
        else if (peso <= 120.2) {
            categoria = "pesado";
        }
        else {
            categoria = "inválido";
        }
    }
}
