package com.java.spr;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:com/java/spr/jdbc.xml")
public class EmployDaoMockTest {
	@Mock
	public EmployDaoImpl employDaoMock;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testDeleteEmployDao() {
		String result1 = "Employ Record Deleted...";
		String result2 = "Employ Record Not Found...";
		when(employDaoMock.deleteEmploy(1)).thenReturn(result1);
		when(employDaoMock.deleteEmploy(-1)).thenReturn(result2);
		assertEquals(result1, employDaoMock.deleteEmploy(1));
		assertEquals(result2, employDaoMock.deleteEmploy(-1));
	}
	
	@Test
	public void testUpdateEmployDao() {
		String result = "Employ Record Updated...";
		Employ e1 =  new Employ(100, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
		when(employDaoMock.updateEmploy(e1)).thenReturn(result);
		assertEquals("Employ Record Updated...", employDaoMock.updateEmploy(e1));
	}
	
	@Test
	public void testAddEmployDao() {
		String result = "Employ Record Inserted...";
		Employ e1 =  new Employ(100, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
		when(employDaoMock.addEmploy(e1)).thenReturn(result);
		assertEquals("Employ Record Inserted...", employDaoMock.addEmploy(e1));
	}

	@Test
	public void testSearchByEmpIdDao() throws ClassNotFoundException, SQLException {
		 Employ e1 =  new Employ(1, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
//		 Employ e2 =  new Employ(2, "Raj", Gender.MALE,"Java", "Prgrammer", 84234);
		 Employ e3 = null;
		 when(employDaoMock.searchEmploy(-1)).thenReturn(null);
		 when(employDaoMock.searchEmploy(1)).thenReturn(e1);
		 assertNull(employDaoMock.searchEmploy(-1));
		 assertEquals(e1, employDaoMock.searchEmploy(1));
	}
	
	@Test
	public void testShowEmployDao() throws ClassNotFoundException, SQLException {
		 List<Employ> employList = Arrays.asList(
				  new Employ(1, "Raj", Gender.MALE,"Java", "Prgrammer", 84234),
				  new Employ(2, "Balaji", Gender.MALE,"Java", "Prgrammer", 84234),
				  new Employ(3, "Jahnavi", Gender.FEMALE,"Java", "Prgrammer", 84234)
				  );
		 when(employDaoMock.showEmploy()).thenReturn(employList);
		 assertEquals(3, employDaoMock.showEmploy().size());
	}
}
