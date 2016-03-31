package com.rexen.service;

import java.util.List;

import com.rexen.mapper.MybatisMapper;


public abstract class AbstractService <T> implements IService<T>{
	
	protected abstract MybatisMapper<T> getMapper();

	public void delete(String id) {
		getMapper().delete(id);
	}

	public void delete(int id) {
		getMapper().delete(id);
	}

	public void insert(T model) {
		getMapper().insert(model);
	}

	public void insertBatch(List<T> models) {
		getMapper().insertBatch(models);
	}

	public T select(String id) {
		return getMapper().select(id);
	}

	public T select(int id) {
		return getMapper().select(id);
	}

	public void update(T model) {
		getMapper().update(model);
	}
	
	public void updateBatch(List<T> models) {
		getMapper().updateBatchList(models);
	}
}
