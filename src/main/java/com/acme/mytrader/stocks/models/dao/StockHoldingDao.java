package com.acme.mytrader.stocks.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.acme.mytrader.stocks.models.StockHolding;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface StockHoldingDao extends CrudRepository<StockHolding, Integer> {

    StockHolding findBySymbolAndOwnerId(String symbol, int ownerId);

}
