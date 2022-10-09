package org.outofoffice.eida.api.service.client;

import lombok.RequiredArgsConstructor;
import org.outofoffice.eida.api.configuration.EidaSocketClient;
import org.outofoffice.eida.api.service.query.EidaShardDdlGenerator;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EidaShardClient {
    private final EidaSocketClient eidaClient;
    private final EidaShardDdlGenerator ddlGenerator;

    public void createTable(String shardUrl, String tableName) {
        String ddl = ddlGenerator.createCreateTableQuery(tableName);
        eidaClient.request(shardUrl, ddl);
    }

    public void renameTable(String shardUrl, String currentName, String nextName) {
        String ddl = ddlGenerator.createRenameTableQuery(currentName, nextName);
        eidaClient.request(shardUrl, ddl);
    }

    public void dropTable(String shardUrl, String tableName) {
        String ddl = ddlGenerator.createDropTableQuery(tableName);
        eidaClient.request(shardUrl, ddl);
    }

    public void createColumn(String shardUrl, String tableName, String defaultValue) {
        String ddl = ddlGenerator.createCreateColumnQuery(tableName, defaultValue);
        eidaClient.request(shardUrl, ddl);
    }

    public void deleteColumn(String shardUrl, String tableName, int columnIndex) {
        String ddl = ddlGenerator.createDeleteColumnQuery(tableName, columnIndex);
        eidaClient.request(shardUrl, ddl);
    }
}
