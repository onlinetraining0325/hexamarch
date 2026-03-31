package com.java.spr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:com/java/spr/jdbc.xml")
public class EmployDaoTest {

    @Autowired
    private EmployDao employDao;

    @Test
    public void testShowEmployDao() {
        assertEquals(7, employDao.showEmploy().size());
    }
}