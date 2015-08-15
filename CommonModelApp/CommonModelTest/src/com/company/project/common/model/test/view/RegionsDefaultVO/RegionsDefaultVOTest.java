package com.company.project.common.model.test.view.RegionsDefaultVO;

import com.company.project.common.model.test.applicationModule.DefaultAMFixture;

import oracle.jbo.AttrValException;
import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class RegionsDefaultVOTest {
    private DefaultAMFixture fixture1 = DefaultAMFixture.getInstance();

    public RegionsDefaultVOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("RegionsDefault");
        assertNotNull(view);
    }
    
    @Test(expected = AttrValException.class)
    public void testEmailFormat() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("EmployeesDefault");
        oracle.jbo.Row row = view.createRow();
        row.setAttribute("Email", "not.an.email.com");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
