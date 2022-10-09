package org.outofoffice.eida.manager.controller;

import lombok.Data;
import org.outofoffice.eida.common.testing.EidaSocketTestFacade;
import org.outofoffice.eida.common.testing.TestRequest;

@Data
public class GetDestTestRequest implements TestRequest {

    private final String address = "localhost:10325";
    private final String message = "get dst, user";

    public static void main(String[] args) {
        EidaSocketTestFacade.request(new GetDestTestRequest());
    }

}
