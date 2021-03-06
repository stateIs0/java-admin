package com.huiwan.gdata.modules.gdata.Crash.mapper;

import java.util.List;

import com.huiwan.gdata.common.bean.page.Query;
import com.huiwan.gdata.modules.sys.entity.Dict;

public interface CrashMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Dict record);

	int insertSelective(Dict record);

	Dict selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Dict record);

	int updateByPrimaryKey(Dict record);

	Long getCount(Query query);

	List<Dict> queryPages(Query query);
	
}
