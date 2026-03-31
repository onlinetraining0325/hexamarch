package com.hexaware.main;

import java.sql.SQLException;
import java.util.List;

import com.hexaware.dao.EmployDao;
import com.hexaware.dao.EmployDaoImpl;
import com.hexaware.model.Employ;

public class EmployShowMain {

	public static void main(String[] args) {
		EmployDao dao = new EmployDaoImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			employList.forEach(x -> {
				System.out.println(x);
			});
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
