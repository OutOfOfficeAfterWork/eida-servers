package org.outofoffice.eida.shard.configuration.handler.dml;

import lombok.RequiredArgsConstructor;
import org.outofoffice.eida.common.QueryHandler;
import org.outofoffice.eida.shard.controller.DmlController;

@RequiredArgsConstructor
public class DeleteQueryHandler implements QueryHandler {
    private final DmlController dmlController;

    @Override
    public String handle(String parameter) {
        String[] params = parameter.split(" ", 2);
        String tableName = params[0];
        String id = params[1];
        dmlController.delete(tableName, id);

        return null;
    }
}
