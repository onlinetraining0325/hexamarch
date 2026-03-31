package com.hexaware.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.hexaware.model.Employ;
import com.hexaware.util.ConnectionUtil;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement preparedStatement;
	
//	private EmployDao dao;
//	
//	public EmployDaoImpl(EmployDao dao) {
//		this.dao = dao;
//	}
	
	
	public EmployDaoImpl() {}
	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		connection = ConnectionUtil.getConnection();
		String cmd = "select * from Employ";
		preparedStatement = connection.prepareStatement(cmd);
		ResultSet rs = preparedStatement.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionUtil.getConnection();
		String cmd = "select * from Employ where empno = ?";
		preparedStatement = connection.prepareStatement(cmd);
		preparedStatement.setInt(1, empno);
		ResultSet rs = preparedStatement.executeQuery();
		Employ employ = null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}
	@Override
	public Optional<Employ> searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		List<Employ> employList = showEmployDao();
		Optional<Employ> employ= employList.stream().filter(x -> x.getEmpno() == empno).findFirst();
		return employ;
		
	} 

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		connection = ConnectionUtil.getConnection();
		preparedStatement = connection.prepareStatement(cmd);
		preparedStatement.setInt(1, employ.getEmpno());
		preparedStatement.setString(2, employ.getName());
		preparedStatement.setString(3, employ.getGender());
		preparedStatement.setString(4, employ.getDept());
		preparedStatement.setString(5, employ.getDesig());
		preparedStatement.setDouble(6, employ.getBasic());
		preparedStatement.executeUpdate();
		return "Employ Record Inserted...";
	}

}
