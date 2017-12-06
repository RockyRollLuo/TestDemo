package demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;


public class AccountServiceImpl implements AccountService {
	
	//注入转账的DAO
	private AccountDao accountDao;

	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;

	/**
	 * 匿名内部类使用了该匿名内部类之外的参数，需要将参数设置为final类型
	 * @param out
	 * @param in
	 * @param money
	 */
	@Override
	public void transfer(final String out, final String in, final Double money) {
		/*accountDao.outMoney(out, money);
		//int i = 1/0;
		accountDao.inMoney(in, money);*/

		/**
		 * 在下面的代码中，要么全部执行，要么全部不执行
		 * 发生异常后，会产生回滚，匿名函数内的语句都不会执行
		 */
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				accountDao.outMoney(out, money);
//				int i = 1/0; //产生异常
				accountDao.inMoney(in, money);
			}
		});
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

}
