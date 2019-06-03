package utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.table.AbstractTableModel;

import model.ContaPagar;
import model.ContaReceber;



public class GenericTableModel extends AbstractTableModel{

	ArrayList<?> listaObjetos;
	//String[] nomecolunas; 
	List<String> nomecolunas;
	String nomeClasse;
	
	JScrollPane scrollTabela;


	public GenericTableModel(ArrayList<?> listaObjetos , String[] colunas, String nomeClasse){
		
		this.listaObjetos = listaObjetos;
		//this.nomecolunas = colunas;
		nomecolunas = Arrays.asList(colunas);
		this.nomeClasse = nomeClasse;
		
	}


	@Override
	public int getColumnCount(){
		
		return nomecolunas.size();
	}

	@Override
	public int getRowCount() {
		
		return listaObjetos.size();
	}

	@Override
	public Object getValueAt(int linhas, int colunas) {
			
			
		
		if(nomeClasse.equals("ContaReceber")){
			
			ContaReceber cb = (ContaReceber) listaObjetos.get(linhas);
			
			if(colunas == 0){
				return cb.getIdConta_Receber();
			}else if(colunas == 1){
				return cb.getValor();
			}else if(colunas == 2){
				return cb.getNomeBanco();
			}else if(colunas == 3){
				return cb.getVencimento();
			}			
		}else if(nomeClasse.equals("ContaPagar")){

			ContaPagar cp = (ContaPagar) listaObjetos.get(linhas);
			
			if(colunas == 0){
				return cp.getIdConta_Pagar();
			}else if(colunas == 1){
				return cp.getValor();
			}else if(colunas == 2){
				return cp.getNomeBanco();
			}else if(colunas == 3){
				return cp.getVencimento();
			}	
			
		}


		return "";
		
		
		
	}
	
	@Override
	public String getColumnName(int column){//apropria tabela que /
	//chama esse metodo passando o numero de colunas, desenvolvedor nao chama esse metodo
		
		for(int i = 0; i <= column; i++){
			if(column == i){
				return nomecolunas.get(i);
			}
		}
		
		
		return "";
		
	}
	
	public void dadoInserido(Object objeto){
		this.fireTableRowsInserted(0, listaObjetos.size());
	}
	

}
