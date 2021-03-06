package com.qst.francis.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.qst.francis.dao.InfoTypeDao;
import com.qst.francis.util.JDBCConnection;

public class InfoTypeDaoImpl implements InfoTypeDao{
	private JDBCConnection jdbcconnection = new JDBCConnection();
	private ResultSet resultSet = null;
	private PreparedStatement preparedStatement = null;
	private String tb_name = "sd_info_type";
	
	//By Id 查询类型
	@Override
	public String queryById(int id) {
		String info_type_name = "";
		
		String sqlString = String.format("select * from %s where info_type_id=?",
							tb_name);
		try {
			preparedStatement = jdbcconnection.createConnection().prepareStatement(sqlString);
			preparedStatement.setInt(1, id);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()){
				info_type_name = resultSet.getString("INFO_TYPE_NAME");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("info_type_name query by id failed");
			e.printStackTrace();
		}
		finally{
			jdbcconnection.closeConnection(resultSet, preparedStatement);
		}
		return info_type_name;
	}

}
