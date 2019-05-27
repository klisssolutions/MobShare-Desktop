package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.ContaReceber;

public class ContaReceberDAO {
	
	private Connection con;
	private PreparedStatement stm;
	private ResultSet rs;
	public ArrayList<ContaReceber> listaContaReceber;

	
	public ContaReceberDAO() {
		con = new Conexao().getConexao();
	}
	
	
	public ArrayList<ContaReceber> listarContaReceber(){
		
		
		listaContaReceber = new ArrayList<ContaReceber>();
		String sql = "select * from v_conta_receber";
		try {
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			while(rs.next()){
				ContaReceber contaReceber = new ContaReceber();
				contaReceber.setIdConta_Receber(rs.getInt("idConta_Receber"));
				contaReceber.setValor(rs.getFloat("valor"));
				contaReceber.setNomeBanco(rs.getString("nomeBanco"));
				contaReceber.setVencimento(rs.getDate("vencimento"));
				contaReceber.setIdBanco(rs.getInt("idBanco"));
				
				
				listaContaReceber.add(contaReceber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return listaContaReceber;
		
	}

}
