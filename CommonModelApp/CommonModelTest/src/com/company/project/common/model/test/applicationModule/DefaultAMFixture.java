package com.company.project.common.model.test.applicationModule;

import oracle.jbo.ApplicationModule;
import oracle.jbo.client.Configuration;

public class DefaultAMFixture {
    private static DefaultAMFixture fixture1 = new DefaultAMFixture();
    private ApplicationModule _am;

    private DefaultAMFixture() {
        _am =
            Configuration.createRootApplicationModule("com.company.project.common.model.am.DefaultAM",
                                                      "DefaultAMLocal");
    }

    public void setUp() {
    }

    public void tearDown() {
    }

    public static DefaultAMFixture getInstance() {
        return fixture1;
    }

    public void release() throws Exception {
        Configuration.releaseRootApplicationModule(_am, true);
    }

    public ApplicationModule getApplicationModule() {
        return _am;
    }
}
