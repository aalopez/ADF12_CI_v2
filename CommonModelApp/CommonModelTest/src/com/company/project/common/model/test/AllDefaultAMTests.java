package com.company.project.common.model.test;

import com.company.project.common.model.test.applicationModule.DefaultAMFixture;
import com.company.project.common.model.test.view.CountriesDefaultVO.CountriesDefaultVOTest;
import com.company.project.common.model.test.view.RegionsDefaultVO.RegionsDefaultVOTest;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CountriesDefaultVOTest.class, RegionsDefaultVOTest.class })
public class AllDefaultAMTests {
    @BeforeClass
    public static void setUp() {
    }

    @AfterClass
    public static void tearDown() throws Exception {
        DefaultAMFixture.getInstance().release();
    }
}
