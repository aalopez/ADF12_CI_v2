package com.company.project.common.code.fwk;

import oracle.adf.share.logging.ADFLogger;

import oracle.jbo.JboException;

public class ViewObjectImpl extends oracle.jbo.server.ViewObjectImpl {

    private static ADFLogger logger = ADFLogger.createADFLogger(ViewObjectImpl.class);

    @Override
    public void executeQuery() {
        try {
            this.setQueryTimeOut(10000);
            super.executeQuery();
        } catch (JboException ex) {
            if ("27126".equals(ex.getErrorCode())) {
                logger.warning("Timeout de consulta alcanzado");
            } else {
                throw ex;
            }

        }
    }
}
