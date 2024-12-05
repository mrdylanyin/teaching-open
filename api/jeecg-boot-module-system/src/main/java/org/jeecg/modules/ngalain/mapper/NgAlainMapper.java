package org.jeecg.modules.ngalain.mapper;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface NgAlainMapper {
    List<Map<String, String>> getDictByTable(@Param("table") String table, 
                                           @Param("key") String key, 
                                           @Param("value") String value);
}
