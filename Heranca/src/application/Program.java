package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		Account acc  = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		//A CLASSE QUE EXTENDE "É UM" -> É UMA CLASSE PAI OU SEJA BUSINESACCOUNT É UM ACCOUNT
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
		//ACC3 FOI DECLARA COMO ACCOUNT POREM É DO TIPO SAVINGACCOUNT IRÁ DAR ERRO NO MOMENTO DE EXECUÇÃO POIS ESTAMOS TENTANDO UTILIZAR COMO BUSINESSACCOUNT ALGO QUE É SAVINGACCOUNT.
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		
		// PARA NÃO OCORRER ERROS DESTA NATUREZA PRECISO TESTAR O TIPO, CONFORME ABAIXO:
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
	}

}
