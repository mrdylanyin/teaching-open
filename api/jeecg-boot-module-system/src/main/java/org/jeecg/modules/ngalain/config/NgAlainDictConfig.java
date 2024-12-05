package org.jeecg.modules.ngalain.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * NgAlain字典配置
 */
public class NgAlainDictConfig {
    
    // 允许查询的表白名单
    private static final Set<String> ALLOWED_TABLES = new HashSet<>(Arrays.asList(
        "sys_dict",
        "sys_depart",
        // 在这里添加其他允许的表
        "your_other_safe_table"
    ));
    
    // 允许查询的字段白名单
    private static final Set<String> ALLOWED_FIELDS = new HashSet<>(Arrays.asList(
        "dict_name",
        "dict_code",
        "depart_name",
        "id",
        // 在这里添加其他允许的字段
        "your_other_safe_field"
    ));
    
    /**
     * 检查表名是否在白名单中
     */
    public static boolean isTableAllowed(String tableName) {
        return ALLOWED_TABLES.contains(tableName.toLowerCase());
    }
    
    /**
     * 检查字段名是否在白名单中
     */
    public static boolean isFieldAllowed(String fieldName) {
        return ALLOWED_FIELDS.contains(fieldName.toLowerCase());
    }
}
