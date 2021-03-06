package com.reyco.core.binlog.service;

import java.util.List;

import com.reyco.core.binlog.model.LogDefinition;

/**
 * 保存日志
 * @author reyco
 *
 */
public interface OperationLogService {
	/**
	 * 批量保存日志
	 * @param logDefinitions
	 * @throws Exception
	 */
	void save(List<LogDefinition> logDefinitions) throws Exception;
}
