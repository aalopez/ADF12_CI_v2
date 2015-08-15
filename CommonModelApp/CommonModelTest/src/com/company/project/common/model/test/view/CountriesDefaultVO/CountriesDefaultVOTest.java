package com.company.project.common.model.test.view.CountriesDefaultVO;

import com.company.project.common.model.test.applicationModule.DefaultAMFixture;

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

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}
