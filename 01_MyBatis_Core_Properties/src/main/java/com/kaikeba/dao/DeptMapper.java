package com.kaikeba.dao;

import java.util.List;
import java.util.Map;

import com.kaikeba.beans.Dept;

public interface DeptMapper {
   public Dept deptFindById(Integer deptno);
   
   public List<Map<String, Object>>  query();
}
