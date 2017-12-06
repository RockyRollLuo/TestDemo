package demo1;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	/**
	 * @param out
	 * @param money
	 */
	@Override
	public void outMoney(String out, Double money) {
		String sql = "update account set money = money-? where name = ?";
		this.getJdbcTemplate().update(sql, money, out);
	}

	/**
	 * @param in
	 * @param money
	 */
	@Override
	public void inMoney(String in, Double money) {
		String sql = "update account set money = money+? where name = ?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
