package com.example.spring02.model.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring02.model.shop.dto.CartDTO;
@Repository
public class CartDAOImpl implements CartDAO {
	
	@Inject
	SqlSession sqlsession;

	@Override
	public List<CartDTO> cartMoney() {
		return sqlsession.selectList("cart.cart_money");
	}

	@Override
	public void insert(CartDTO dto) {
		sqlsession.insert("cart.insert",dto);
	}

	@Override
	public List<CartDTO> listCart(String userid) {
		return sqlsession.selectList("cart.listCart",userid);
	}

	@Override
	public void delete(int cart_id) {
		sqlsession.delete("cart.delete",cart_id);
	}

	@Override
	public void deleteAll(String userid) {
		sqlsession.delete("cart.deleteAll",userid);
	}

	@Override
	public void update(int cart_id) {

	}

	@Override
	public int sumMoney(String userid) {
		return sqlsession.selectOne("cart.sumMoney",userid);
	}

	@Override
	public int countCart(String userid, int product_id) {
		return 0;
	}

	@Override
	public void updateCart(CartDTO dto) {

	}

	@Override
	public void modifyCart(CartDTO dto) {
		sqlsession.update("cart.modifyCart",dto);
	}

}
