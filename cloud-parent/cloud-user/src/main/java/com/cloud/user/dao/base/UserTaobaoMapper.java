package com.cloud.user.dao.base;

import com.cloud.user.dao.base.model.UserTaobao;
import com.cloud.user.dao.base.model.UserTaobaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTaobaoMapper {
    long countByExample(UserTaobaoExample example);

    int deleteByExample(UserTaobaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTaobao record);

    int insertSelective(UserTaobao record);

    List<UserTaobao> selectByExample(UserTaobaoExample example);

    UserTaobao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTaobao record, @Param("example") UserTaobaoExample example);

    int updateByExample(@Param("record") UserTaobao record, @Param("example") UserTaobaoExample example);

    int updateByPrimaryKeySelective(UserTaobao record);

    int updateByPrimaryKey(UserTaobao record);
}