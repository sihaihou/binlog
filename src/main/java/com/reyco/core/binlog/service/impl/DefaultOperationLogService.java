package com.reyco.core.binlog.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.reyco.core.binlog.model.LogDefinition;
import com.reyco.core.binlog.service.OperationLogService;

public class DefaultOperationLogService implements OperationLogService{

	private static Logger logger = LoggerFactory.getLogger(DefaultOperationLogService.class);
	
	@Override
	public void save(List<LogDefinition> logDefinitions) throws Exception {
		// For subclasses: do nothing by default.
	}

}
