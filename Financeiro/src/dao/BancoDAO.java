package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Banco;
import model.ContaReceber;

public class BancoDAO {

	private Connection con;
	private PreparedStatement stm;
	private ResultSet rs;
	
	public ArrayList<Banco> bancos;


	
	public BancoDAO() {
		con = new Conexao().getConexao();
		
	}
	
	
public ArrayList<Banco> listarBancos(){
		
		
	bancos = new ArrayList<Banco>();
		String sql = "select * from banco";
		try {
			stm = con.prepareStatement(sql);
			rs = stm.executeQuery();
			while(rs.next()){
				Banco banco = new Banco();
				banco.setIdBanco(rs.getInt("idBanco"));
				banco.setNome(rs.getString("nome"));
				
				bancos.add(banco);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return bancos;
		
	}
	
}
