package com.sapient.dao;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.exceptions.IdException;
import com.sapient.vo.Account;

public class DaoImpl implements IDao {
	
	private static Map<Integer , Account> amap;
	private static Logger logger = LoggerFactory.getLogger("sapient");
	
	static{
		logger.trace("static block called in dao");
		amap = new HashMap<>();
		amap.put(1001, new Account(1001, "ram", 10000));
		amap.put(1002, new Account(1002, "tom", 5000));
		amap.put(1003, new Account(1003, "sam", 3000));
		logger.debug("hashmap initialised using three account instances");
	}

	@Override
	public Account getAccount(int aid) throws IdException {
		logger.trace("gwt account method invoked");
		logger.debug("checking the aid against the map key");
		if(!amap.containsKey(aid))
			throw new IdException("no id found");
		logger.info("account ID {} found",aid);//parameterrized looger
		return amap.get(aid);
	}

}
