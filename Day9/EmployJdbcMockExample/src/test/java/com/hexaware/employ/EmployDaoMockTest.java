package com.hexaware.employ;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.hexaware.dao.EmployDao;
import com.hexaware.model.Employ;

public class EmployDaoMockTest {

	@Mock
	private EmployDao employMockDao;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSearchByEmpIdDao() throws ClassNotFoundException, SQLException {
		 Optional<Employ> e1 =  Optional.of(new Employ(1, "Raj", "MALE","Java", "Prgrammer", 84234));
		 Employ e2 =  new Employ(2, "Raj", "MALE","Java", "Prgrammer", 84234);
		 Employ e3 = null;
		 when(employMockDao.searchEmployDao(-1)).thenReturn(null);
		 when(employMockDao.searchEmployDao(1)).thenReturn(e1);
		 assertNull(employMockDao.searchEmployDao(-1));
		 assertEquals(e1, employMockDao.searchEmployDao(1));
	}
	
	@Test
	public void testEmployShowDao() throws ClassNotFoundException, SQLException {
		 List<Employ> employList = Arrays.asList(
				  new Employ(1, "Raj", "MALE","Java", "Prgrammer", 84234),
				  new Employ(2, "Balaji", "MALE","Java", "Prgrammer", 84234),
				  new Employ(3, "Jahnavi", "FEMALE","Java", "Prgrammer", 84234)
				  );
		 when(employMockDao.showEmployDao()).thenReturn(employList);
		 assertEquals(3, employMockDao.showEmployDao().size());
	}
}
