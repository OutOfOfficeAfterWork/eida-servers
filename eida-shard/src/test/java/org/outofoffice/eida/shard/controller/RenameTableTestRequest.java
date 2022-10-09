package org.outofoffice.eida.shard.controller;

import lombok.Data;
import org.outofoffice.eida.common.testing.EidaSocketTestFacade;
import org.outofoffice.eida.common.testing.TestRequest;

@Data
public class RenameTableTestRequest  implements TestRequest {

    private final String address = "localhost:10830";
    private final String message = "rename table, test test1";

    public static void main(String[] args) {
        EidaSocketTestFacade.request(new RenameTableTestRequest());
    }

}