package com.wizian.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.wizian.web.dto.AdminDTO;

@Repository
@Mapper
public interface AdminDAO {

	List<Map<String, Object>> studentList();

	List<Map<String, Object>> gcounStudList();

	List<Map<String, Object>> getGcounList();

	List<Map<String, Object>> getGcounStudList(String gcounCd);

	List<Map<String, Object>> getEcounList();

	List<Map<String, Object>> getEcounStudList(String cslNo);
	
	List<Map<String, Object>> getGcounCslList();

	int gcounEnroll(AdminDTO adminDTO);

	
}