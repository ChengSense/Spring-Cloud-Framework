package com.cloud.user.dao.base;

import com.cloud.user.dao.base.model.BaseSmsRequest;
import com.cloud.user.dao.base.model.BaseSmsRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaseSmsRequestMapper {
    long countByExample(BaseSmsRequestExample example);

    int deleteByExample(BaseSmsRequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BaseSmsRequest record);

    int insertSelective(BaseSmsRequest record);

    List<BaseSmsRequest> selectByExample(BaseSmsRequestExample example);

    BaseSmsRequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BaseSmsRequest record, @Param("example") BaseSmsRequestExample example);

    int updateByExample(@Param("record") BaseSmsRequest record, @Param("example") BaseSmsRequestExample example);

    int updateByPrimaryKeySelective(BaseSmsRequest record);

    int updateByPrimaryKey(BaseSmsRequest record);
}