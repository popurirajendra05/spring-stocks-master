package com.acme.mytrader.stocks.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acme.mytrader.stocks.models.StockTransaction;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface StockTransactionDao extends CrudRepository<StockTransaction, Integer> {

    List<StockTransaction> findBySymbolAndUid(String symbol, int uid);

}
