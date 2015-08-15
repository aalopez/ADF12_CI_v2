package com.company.project.common.model.test.view.CountriesDefaultVO;

import com.company.project.common.model.test.applicationModule.DefaultAMFixture;

import oracle.jbo.AttrSetValException;
import oracle.jbo.ViewObject;

import org.junit.*;
import static org.junit.Assert.*;

public class CountriesDefaultVOTest {
    private DefaultAMFixture fixture1 = DefaultAMFixture.getInstance();

    public CountriesDefaultVOTest() {
    }

    @Test
    public void testAccess() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("CountriesDefault");
        assertNotNull(view);
    }
    
    @Test(expected = AttrSetValException.class)
    public void testCountryNameUniqueKey() {
        ViewObject view = fixture1.getApplicationModule().findViewObject("CountriesDefault");

        oracle.jbo.Row row = view.createRow();
        row.setAttribute("CountryName", "New Country");

        row = view.createRow();
        row.setAttribute("CountryName", "New Country");
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
