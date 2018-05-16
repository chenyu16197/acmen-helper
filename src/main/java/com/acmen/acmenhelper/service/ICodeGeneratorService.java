package com.acmen.acmenhelper.service;

import com.acmen.acmenhelper.common.ServiceMultiResult;
import com.acmen.acmenhelper.common.ServiceResult;
import com.acmen.acmenhelper.model.CodeDefinition;
import com.acmen.acmenhelper.model.DBDefinition;

import java.util.List;

/**
 * 代码生成器接口
 * @author gaowenfeng
 */
public interface ICodeGeneratorService {

    /**
     * 根据数据库定义信息返回数据库中的表列表
     * @param dbDefinition
     * @return
     */
     ServiceMultiResult<String> getTableList(DBDefinition dbDefinition);

    /**
     * 代码生成的核心方法
     * @param codeDefinition
     * @return
     */
     ServiceResult<String> genCode(CodeDefinition codeDefinition);
}
