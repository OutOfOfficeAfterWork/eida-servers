package org.outofoffice.eida.common.io;


import org.outofoffice.eida.common.exception.EidaException;

public class EidaFileNotFoundException extends EidaException {
    public EidaFileNotFoundException(String filePath) {
        super(filePath);
    }
}
