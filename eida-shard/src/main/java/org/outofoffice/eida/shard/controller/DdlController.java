package org.outofoffice.eida.shard.controller;

import lombok.RequiredArgsConstructor;
import org.outofoffice.eida.shard.service.DdlService;

@RequiredArgsConstructor
public class DdlController {
    private final DdlService ddlService;

    public void createTable(String tableName) {
        ddlService.createTable(tableName);
    }

    public void renameTable(String currentName, String nextName) {
        ddlService.renameTable(currentName, nextName);
    }

    public void dropTable(String tableName) {
        ddlService.dropTable(tableName);
    }

    public void createColumn(String tableName) {
        createColumn(tableName, "<null>");
    }

    public void createColumn(String tableName, String defaultValue) {
        ddlService.createColumn(tableName, defaultValue);
    }

    public void deleteColumn(String tableName, int columnIndex) {
        ddlService.deleteColumn(tableName, columnIndex);
    }

}
