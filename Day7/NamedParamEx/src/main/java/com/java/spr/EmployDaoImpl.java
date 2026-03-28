package com.java.spr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EmployDaoImpl implements EmployDao {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public EmployDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Employ searchEmploy(int empno) {
		String cmd = "select * from Employ where empno = :empno";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("empno", empno);
		List<Employ> employList = namedParameterJdbcTemplate.query(cmd,params, (rs,rownum) -> {
			Employ employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(Gender.valueOf(rs.getString("gender")));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			return employ;
		});
		if (employList.size() == 0) {
			return null;
		}
		return employList.get(0);
	}

	@Override
	public String addEmploy(Employ employ) {
		String cmd = "Insert into Employ(empno,name,gender,dept,"
				+ "desig,basic) values(:empno,:name,:gender,"
				+ ":dept,:desig,:basic)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("empno", employ.getEmpno());
		params.put("name", employ.getName());
		params.put("gender", employ.getGender().toString());
		params.put("dept", employ.getDept());
		params.put("desig", employ.getDesig());
		params.put("basic", employ.getBasic());
		namedParameterJdbcTemplate.update(cmd, params);
		return "Employ record Inserted...";
	}

	@Override
	public String updateEmploy(Employ employUpdated) {
		String cmd = "Update Employ set name=:name,gender=:gender,"
				+ "dept=:dept,desig=:desig,basic=:basic where empno=:empno";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("empno", employUpdated.getEmpno());
		params.put("name", employUpdated.getName());
		params.put("gender", employUpdated.getGender().toString());
		params.put("dept", employUpdated.getDept());
		params.put("desig", employUpdated.getDesig());
		params.put("basic", employUpdated.getBasic());
		namedParameterJdbcTemplate.update(cmd, params);
		return "Employ Record Updated...";
	}

	@Override
	public String deleteEmploy(int empno) {
		String cmd = "Delete from Employ where empno=:empno";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("empno", empno);
		namedParameterJdbcTemplate.update(cmd, params);
		return "*** Employ Record Deleted ***";
	}

}
