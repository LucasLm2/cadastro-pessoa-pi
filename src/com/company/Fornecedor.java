package com.company;

import java.util.Date;

public class Fornecedor extends PessoaJuridica {
    private String produto;
    private Date dataUltimaEntrega;
    private Date dataProximaEntrega;
    private String status;

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Date getDataUltimaEntrega() {
        return dataUltimaEntrega;
    }

    public void setDataUltimaEntrega(Date dataUltimaEntrega) {
        this.dataUltimaEntrega = dataUltimaEntrega;
    }

    public Date getDataProximaEntrega() {
        return dataProximaEntrega;
    }

    public void setDataProximaEntrega(Date dataProximaEntrega) {
        this.dataProximaEntrega = dataProximaEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
