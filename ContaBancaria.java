import Utilitario.Utilitario;

public class ContaBancaria{
    
        private static int contadorDeContas =1;
        private int numeroConta;
        private Pessoa pessoa;
        private Double saldo = 0.0;
    
        public ContaBancaria(Pessoa pessoa2) {
    }
        public void Conta(Pessoa pessoa) {
          this.numeroConta = contadorDeContas;
          this.pessoa = pessoa;
          contadorDeContas +=1;
    }
          public int getNumeroConta() {
            return numeroConta;
    }
            public void setNumeroConta(int sobreNome) {
             
    }
             public Pessoa getPessoa() {
            return pessoa;
    }
            public void setPessoa(Pessoa pessoa) {
             this.pessoa = pessoa;
    }
            public Double getSaldo() {
            return saldo;
    }
            public void setPessoa(Double saldo) {
             this.saldo = saldo;
           
    }
        
            public String toString() {
                return  "\nNúmero da conta: " + this.getNumeroConta() +
                        "\nNome : " + this.pessoa.getNome() +
                        "\nSobreNome: " + this.pessoa.getSobreNome() +
                        "\nAgencia : " + this.pessoa.getAgencia() +
                         "\nSaldo : " + Utilitario.douString(this.getSaldo()) +
                        "\n";
            }

                        public void depositar(Double valor){
                            if(valor > 0) {
                                setPessoa(getSaldo() + valor);
                                System.out.println("Seu depósito foi realizado com sucesso");
                            }else {
                              System.out.println("Não foi possivel realizar o depósito!");
         
    }
                    
}
                    
}

      
        
       


    

    