package model;

import java.util.Date;

public class ContaReceber {
	
	private int idConta_Receber;
	private float valor;
	private String nomeBanco;
	private Date vencimento;
	private int idBanco;
	
	
	
	public int getIdConta_Receber() {
		return idConta_Receber;
	}
	public void setIdConta_Receber(int idConta_Receber) {
		this.idConta_Receber = idConta_Receber;
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
