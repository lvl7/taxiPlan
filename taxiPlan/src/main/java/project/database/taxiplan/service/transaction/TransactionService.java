package project.database.taxiplan.service.transaction;

import project.database.taxiplan.model.Transaction;

public interface TransactionService {

	void persistTransaction(Transaction transaction);

	Transaction findTransactionById(String id);

	void updateTransaction(Transaction transaction);

	void deleteTransaction(Transaction transaction);
}
