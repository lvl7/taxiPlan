package project.database.taxiplan.dao.transaction;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.database.taxiplan.model.Transaction;

@Repository("transactionDAO")
public class TransactionDAOImpl implements TransactionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void persistTransaction(Transaction transaction) {
		sessionFactory.getCurrentSession().persist(transaction);
	}

	@Override
	public Transaction findTransactionById(String id) {
		return (Transaction) sessionFactory.getCurrentSession().get(Transaction.class, id);
	}

	@Override
	public void updateTransaction(Transaction transaction) {
		sessionFactory.getCurrentSession().update(transaction);

	}
	@Override
	public void deleteTransaction(Transaction transaction) {
		sessionFactory.getCurrentSession().delete(transaction);

	}

}
