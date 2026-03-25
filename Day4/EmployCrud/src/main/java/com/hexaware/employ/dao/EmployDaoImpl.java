package com.hexaware.employ.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.employ.model.Employ;
import com.hexaware.employ.model.Gender;
import com.hexaware.employ.util.ConnectionHelper;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement psmt;
	
	@Override
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		psmt = connection.prepareStatement(cmd);
		ResultSet rs = psmt.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ=null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		ResultSet rs = psmt.executeQuery();
		Employ employ=null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
		}
		return employ;
	}

	@Override
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Employ(empno,name,gender,dept,desig,basic) "
				+ " values(?,?,?,?,?,?)";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, employ.getEmpno());
		psmt.setString(2, employ.getName());
		psmt.setString(3, employ.getGender().toString());
		psmt.setString(4, employ.getDept());
		psmt.setString(5, employ.getDesig());
		psmt.setDouble(6, employ.getBasic());
		psmt.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, "
				+ "Desig = ?, Basic = ? WHERE Empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setString(1, employ.getName());
		psmt.setString(2, employ.getGender().toString());
		psmt.setString(3, employ.getDept());
		psmt.setString(4, employ.getDesig());
		psmt.setDouble(5, employ.getBasic());
		psmt.setInt(6, employ.getEmpno());
		psmt.executeUpdate();
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Delete From Employ where empno = ?";
		psmt = connection.prepareStatement(cmd);
		psmt.setInt(1, empno);
		psmt.executeUpdate();
		return "Employ Record Deleted...";
	}
}
