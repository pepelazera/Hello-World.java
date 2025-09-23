package aulasjavapoo;

public class ObjetoAula07 {


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
    public void Construtor(){
        String no = nome;
        String na = nacionalidade;
        int id = idade;
        float al = altura;
        // setPeso(pe)
        int vi = vitorias;
        int de = derrotas;
        int em = empates;
    }

    public void apresentar(){
        System.out.println(this.getNome());
        System.out.println(this.getNacionalidade());
        System.out.println(this.getIdade());
        System.out.println(this.getAltura());
        System.out.println(this.getPeso());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("É um peso: "+this.getCategoria());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }


    // Métodos especiais

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }


    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }


    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }


    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }


    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
