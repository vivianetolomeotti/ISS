package model;
// Generated 07/08/2016 15:51:08 by Hibernate Tools 4.3.1

/**
 * ContaPagar generated by hbm2java
 */
public class ContaPagar  implements java.io.Serializable {

     private Integer idContaPagar;
     private int pessoa;
     private Double valor;
     private Integer qtdparcelas;
     private String descricao;
     private boolean status;
     private String vencimento;

    public ContaPagar() {
    }

    public ContaPagar(int pessoa, Double valor, Integer qtdparcelas, String descricao, boolean status, String vencimento) {
       this.pessoa = pessoa;
       this.valor = valor;
       this.qtdparcelas = qtdparcelas;
       this.descricao = descricao;
       this.status = status;
       this.vencimento = vencimento;
    }

    public boolean isStatus() {
        return status;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    
    
    public Integer getIdContaPagar() {
        return this.idContaPagar;
    }
    
    public void setIdContaPagar(Integer idContaPagar) {
        this.idContaPagar = idContaPagar;
    }
    public int getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(int pessoa) {
        this.pessoa = pessoa;
    }
    public Double getValor() {
        return this.valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public Integer getQtdparcelas() {
        return this.qtdparcelas;
    }
    
    public void setQtdparcelas(Integer qtdparcelas) {
        this.qtdparcelas = qtdparcelas;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public boolean getStatus() {
        return this.status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

}


