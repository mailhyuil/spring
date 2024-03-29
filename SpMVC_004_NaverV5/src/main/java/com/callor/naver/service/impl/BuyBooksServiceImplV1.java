package com.callor.naver.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.callor.naver.model.BookVO;
import com.callor.naver.model.BuyBooksVO;
import com.callor.naver.model.UserVO;
import com.callor.naver.persistance.BookDao;
import com.callor.naver.persistance.BuyBooksDao;
import com.callor.naver.service.BuyBooksService;

@Service
public class BuyBooksServiceImplV1 implements BuyBooksService {

	@Autowired
	protected BookDao bookDao;
	@Autowired
	protected BuyBooksDao buyDao;

	@Override
	public List<BuyBooksVO> selectAll() {
		return null;
	}

	@Override
	public BuyBooksVO findByIsbnAndUserName(String isbn, String username) {
		return null;
	}

	@Override
	public List<BuyBooksVO> findByIsbn(String isbn) {
		return null;
	}

	@Override
	public List<BuyBooksVO> findByUserName(String username) {
		return buyDao.findByUserName(username);
	}

	// 사용하지 않을 insert
	@Override
	public int insert(BuyBooksVO vo) {
		return 0;
	}

	/*
	 * userVO와 bookVO에 담긴 데이터를 기준으로 tbl_books 데이터와 tbl_buybooks 데이터를 추가하기 만약
	 * tbl_books table 에 이미 같은 ISBN이 있으면 update 수행
	 */
	@Transactional
	@Override
	public int insert(UserVO userVO, BookVO bookVO) {
		BookVO resultBook = bookDao.findById(bookVO.getIsbn());
		if (resultBook == null) {
			// 없으면 insert
			bookDao.insert(bookVO);
		} else {
			// 있으면 update
			bookDao.update(bookVO);
		}
		
		// 구입한 도서정보를 tbl_buybooks 에 추가하기
		Date date = new Date(System.currentTimeMillis());

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		BuyBooksVO buyBooksVO = BuyBooksVO.builder().b_date(dateFormat.format(date)).b_isbn(bookVO.getIsbn())
				.b_username(userVO.getUsername()).build();
		
		buyDao.insert(buyBooksVO);
		return 0;
	}

}
