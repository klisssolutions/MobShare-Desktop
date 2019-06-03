package model;

import java.util.Date;

public class ContaPagar {
	
	private int idConta_Pagar;
	private float valor;
	private String nomeBanco;
	private Date vencimento;
	private int idBanco;
	
	
	
	public int getIdConta_Pagar() {
		return idConta_Pagar;
	}
	public void setIdConta_Pagar(int idConta_Pagar) {
		this.idConta_Pagar = idConta_Pagar;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public Date getVencimento() {
		return vencimento;
	}
	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}
	public int getIdBanco() {
		return idBanco;
	}
	public void setIdBanco(int idBanco) {
		this.idBanco = idBanco;
	}
	
	
	

}
