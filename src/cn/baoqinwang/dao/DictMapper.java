package cn.baoqinwang.dao;

import java.util.List;

import cn.baoqinwang.pojo.BaseDict;

public interface DictMapper {

	
	public List<BaseDict> findDictByCode(String code);
}
