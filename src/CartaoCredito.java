public class CartaoCredito {
    private int numero;
    private String dataValidade;
    private Cliente cliente;
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CartaoCredito [numero=" + numero + ", dataValidade=" + dataValidade + ", cliente=" + cliente + "]";
    }    
}