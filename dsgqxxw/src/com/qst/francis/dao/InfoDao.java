package com.qst.francis.dao;

import java.util.List;

import com.qst.francis.pojo.Info;

public interface InfoDao {
	public boolean insertInfo(Info info);
	public Info queryById(String id);
	public List<Info> queryByState(String pay_state, String check_state, String info_type, int start, int step);
	public int queryCnt(String pay_state, String check_state, String info_type);
	public boolean checkInfo(String id);
	public boolean payInfo(String id);
	public boolean deleteById(String id);
	public Info queryFreeByTypeId(String info_type_id);
	public Info queryPayByTypeId(String info_type_id);
	public List<Info> queryByCondition(String coninput, String condition, String matchType, int start, int step);
	public int queryByConditionCnt(String coninput, String condition, String matchType);
	public Info queryByIdChecked(String info_id);
}
