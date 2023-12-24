package com.course.javabasics.oop.hw.accounttransactions;

import java.util.Arrays;

public class Account {
	private int id;
	private Transaction[] transactions;
	
	
	
	public Account(int id) {
		super();
		this.id = id;
	}

	public void sendMoneyToAccount(Account accountTo, double moneyAmount) {
		
		Transaction currentAccountTransaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_SEND);
		Transaction toAccountTransaction = new Transaction(this, accountTo, moneyAmount, StandardAccountOperations.MONEY_TRANSFER_RECEIVE);
		
		Transaction[] newCurrentAccountTransactions;
		Transaction[] newToAccountTransactions;
		
		if (accountTo == null) {
			return;
		}
		
		if (this.transactions == null) {
			newCurrentAccountTransactions = new Transaction[] { currentAccountTransaction };
		} else {
			newCurrentAccountTransactions = Arrays.copyOf(this.transactions, this.transactions.length+1);
			newCurrentAccountTransactions[this.transactions.length] =  currentAccountTransaction;
		}
		
		if (accountTo.transactions == null) {
			newToAccountTransactions = new Transaction[] {toAccountTransaction};
		} else {
			newToAccountTransactions = Arrays.copyOf(accountTo.transactions, accountTo.transactions.length+1);
			newToAccountTransactions[accountTo.transactions.length] = toAccountTransaction;
			
		}
		
		this.transactions = newCurrentAccountTransactions;
		accountTo.transactions = newToAccountTransactions;
		
		
	}
	
	public void withdrawMoney(double moneyAmount) {
		
		Transaction newTransaction = new Transaction(this, null, moneyAmount, StandardAccountOperations.WITHDRAW);
		Transaction[] newTransactionArray;
		
		
		if (transactions == null) {
			newTransactionArray = new Transaction[] { newTransaction };
		} else {
			newTransactionArray = Arrays.copyOf(this.transactions, this.transactions.length+1);
			newTransactionArray[this.transactions.length] = newTransaction;
		}
		
		this.transactions = newTransactionArray;
		
	}
	
	public Transaction[] getTransactions() {
		if (transactions == null) {
			return new Transaction[0];
		}
		return this.transactions.clone();
	}
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + "]";
	}



	public class Transaction {
		Account accountFrom;
		Account accountTo;
		double moneyAmmount;
		StandardAccountOperations operation;
		
		public Transaction(Account accountFrom, Account accountTo, double moneyAmmount, StandardAccountOperations operation) {
			this.accountFrom = accountFrom;
			this.accountTo = accountTo;
			this.moneyAmmount = moneyAmmount;
			this.operation = operation;
		}

		@Override
		public String toString() {
			return "Transaction [accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", moneyAmmount="
					+ moneyAmmount + ", operation=" + operation + "]";
		}
		
		
		
	}

}
