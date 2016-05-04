package project.database.taxiplan.service.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import project.database.taxiplan.dao.transaction.TransactionDAO;
import project.database.taxiplan.model.Transaction;

@Service("transactionService")
public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionDAO transactionDAO;

	@Override
	@Transactional
	public void persistTransaction(Transaction transaction) {
		transactionDAO.persistTransaction(transaction);

	}

	@Override
	@Transactional
	public void updateTransaction(Transaction transaction) {
		transactionDAO.updateTransaction(transaction);

	}
	@Override
	@Transactional
	public Transaction findTransactionById(String id) {
		return transactionDAO.findTransactionById(id);
	}

	@Override
	@Transactional
	public void deleteTransaction(Transaction transaction) {
		transactionDAO.deleteTransaction(transaction);

	}

}
