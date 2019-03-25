package co.simplon.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.simplon.entities.*;

public class AccountDao extends Dao<Account> {
	@Override
	public Account find(int id) {
		String str = "select * from T_Accounts where NumAt=?";
		PreparedStatement ps;
		Account compte = null;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,id);
			ResultSet resultSet = ps.executeQuery();
			if(resultSet.next()){
				compte = new Account(resultSet.getInt(1),resultSet.getDate(2),resultSet.getDouble(3),resultSet.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return compte;
	}

	@Override
	public boolean create(Account obj) {
		String str = "INSERT INTO T_Accounts (NumAt,DateCreation,Balance,IdCust) VALUES (?, ? ,? ,?);";
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1, obj.getNumAt());
			ps.setDate(2,(java.sql.Date) obj.getDateCreation());
			ps.setDouble(3,obj.getBalance());
			ps.setInt(4, obj.getIdCust());
			ps.executeQuery();
			ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public boolean update(Account obj) {		
		String str = " update T_Accounts set Balance=? where NumAt=?;";		
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setDouble(1,obj.getBalance());
			ps.setInt(2,obj.getNumAt());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return ok;
	}

	@Override
	public boolean delete(Account obj) {
		String str = "delete from T_Accounts where NumAt=?;";	
		PreparedStatement ps;
		boolean ok = false;
		try {
			ps = connection.prepareStatement(str);
			ps.setInt(1,obj.getNumAt());
			int row = ps.executeUpdate();
			if(row > 0)	ok = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ok;
	}
}
