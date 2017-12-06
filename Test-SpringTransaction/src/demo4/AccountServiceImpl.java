package demo4;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Transactional可配置参数,也可不配置
 */
//@Transactional
//@Transactional(propagation = Propagation.REQUIRED)
@Transactional(isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {
	
	private AccountDao accountDao;

	@Override
	public void transfer( String out, String in, Double money) {
		accountDao.outMoney(out, money);
		//int i = 1/0;
		accountDao.inMoney(in, money);
		
	}
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

}
