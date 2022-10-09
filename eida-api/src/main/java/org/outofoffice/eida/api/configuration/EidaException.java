package org.outofoffice.eida.api.configuration;


public class EidaException extends RuntimeException {

    public EidaException(String message) {
        super(message);
    }

    public EidaException(Exception e) {
        super(e.getClass().getSimpleName() + ": " + e.getMessage());
        e.printStackTrace();
    }

}
