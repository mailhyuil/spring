package com.callor.naver.persistence;

import java.util.List;

import com.callor.naver.model.NewsVO;

public interface NewsDao extends GenericDao<NewsVO, String> {

	public List<NewsVO> findByTitle(String title);
}
