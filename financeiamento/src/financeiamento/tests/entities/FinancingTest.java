package financeiamento.tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import financeiamento.entities.Financing;
public class FinancingTest {
	
	@Test
	public void constructorShouldCreateObjectWhenValidData() {
		
		// Metodo AAA
		
		// Arrange - preparando os dados		
		
		// Act -  executando as ações necessarias
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
				
	}
	
	@Test
	public void constructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
		
		// Metodo AAA
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			// Act -  executando as ações necessarias
			new Financing(100000.0, 2000.0, 20);
		
		});		
				
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {
		
		// Metodo AAA
		
		// Arrange - preparando os dados		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		
		// Act -  executando as ações necessarias
		f.setTotalAmount(90000.0);
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(90000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
				
	}
	
	@Test
	public void setTotalAmountShouldSetDataWhenInValidData() {
		
		// Metodo AAA
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			// Arrange - preparando os dados		
			Financing f = new Financing(100000.0, 2000.0, 80);
			
			
			// Act -  executando as ações necessarias
			f.setTotalAmount(110000.0);
		
		});
		
		
				
	}
	
	@Test
	public void setIncomeAmountShouldSetDataWhenValidData() {
		
		// Metodo AAA
		
		// Arrange - preparando os dados		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		
		// Act -  executando as ações necessarias
		f.setIncome(2100.0);
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(2100.0, f.getIncome());
				
	}
	
	@Test
	public void setIncomeAmountShouldSetDataWhenInValidData() {
		
		// Metodo AAA
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			// Arrange - preparando os dados		
			Financing f = new Financing(100000.0, 2000.0, 80);
			
			
			// Act -  executando as ações necessarias
			f.setIncome(1900.0);
		
		});
		
		
				
	}
	
	@Test
	public void setMonthsShouldSetDataWhenValidData() {
		
		// Metodo AAA
		
		// Arrange - preparando os dados		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		
		// Act -  executando as ações necessarias
		f.setMonths(90);
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(90, f.getMonths());
				
	}
	
	@Test
	public void setMonthsShouldSetDataWhenInValidData() {
		
		// Metodo AAA
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			// Arrange - preparando os dados		
			Financing f = new Financing(100000.0, 2000.0, 80);
			
			
			// Act -  executando as ações necessarias
			f.setMonths(70);
		
		});
		
		
				
	}
	
	
	@Test
	public void entryShouldCalculateEntryCorrectly() {
		// Metodo AAA
		
		// Arrange - preparando os dados		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(20000.0, f.entry());
		
	}
	
	@Test
	public void quotaShouldCalculateQuotaCorrectly() {
		// Metodo AAA
		
		// Arrange - preparando os dados		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		
		//Assert -> declare o que deveria acontecer(resultado esperado)
		Assertions.assertEquals(1000.0, f.quota());
		
	}

}
