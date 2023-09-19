public class Usuario{
    
    private String nome;
    private String sobreNome;
    private String agencia;

    public Usuario(String nome, String sobreNome, String agencia){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.agencia = agencia;
    }
      public String getNome() {
        return nome;
    }
        public String setNome(String nome) {
        return this.nome = nome;

    }
     public String getSobreNome() {
        return sobreNome;
    }
        public String setSobrenome(String sobreNome) {
        return this.sobreNome = sobreNome;
        
    }
       public String getAgencia() {
        return agencia;
    }
        public String setAgencia(String agencia) {
        return this.agencia = agencia;
    }

    public String toString() {
        return "\nNome: " + this.getNome() +
                "\nSobreNome: " + this.getSobreNome() +
                "\nAgencia: " + this.getAgencia();    
}
}