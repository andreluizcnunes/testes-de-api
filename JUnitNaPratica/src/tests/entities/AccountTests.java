package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	
	@Test
	public void depositShouldIncreaseBalanceWhenPositiveAmount() {
		
		// Padrão AAA
		
		// Arrange - preparando os dados
		Double amount = 200.0;
		Double expectedValue = 196.0;		
		Account acc = new Account(1L, 0.0);
		
		// Act -  executando as ações necessarias
		acc.deposit(amount);
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
		
	}
}
