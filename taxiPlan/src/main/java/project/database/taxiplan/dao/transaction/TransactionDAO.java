package project.database.taxiplan.dao.transaction;

import project.database.taxiplan.model.Transaction;

public interface TransactionDAO {

		  void persistTransaction(Transaction transaction);

		  Transaction findTransactionById(String id);

		  void updateTransaction(Transaction transaction);

		  void deleteTransaction(Transaction transaction);

}
