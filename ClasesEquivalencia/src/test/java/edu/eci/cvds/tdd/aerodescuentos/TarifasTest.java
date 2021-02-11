package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {
	private CalculadorDescuentos calculo;
	@Test
	public void Dias20 () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos();
		Assert.assertEquals(calculo.calculoTarifa(10000,21,20),7500);
	}

	@Test
	public void menores18 () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		Assert.assertEquals(calculo.calculoTarifa(10000,12,16),9500);
	}

	@Test
	public void mayores65 () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		Assert.assertEquals(calculo.calculoTarifa(10000,12,68),9200);
	}

	@Test
	public void mayores65YDias20 () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		Assert.assertEquals(calculo.calculoTarifa(10000,21,68),7700);
	}

	@Test
	public void menores18YDias20 () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		Assert.assertEquals(calculo.calculoTarifa(10000,21,68),8000);
	}


	@Test
	public void noDeberiaDescuento () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		Assert.assertEquals(calculo.calculoTarifa(10000,5,24),10000);
	}

	@Test
	public void edadErronea () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		try { calculo.calculoTarifa(10000,5,-24);}
			catch(ExcepcionParametrosInvalidos e){
				Assert.assertTrue(true);
			}
	}

	@Test
	public void diasErroneos () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		try { calculo.calculoTarifa(10000,-5,24);}
			catch(ExcepcionParametrosInvalidos e){
				Assert.assertTrue(true);
			}
	}

	@Test
	public void precioErroneo () throws ExcepcionParametrosInvalidos{
		calculo = new CalculadorDescuentos;
		try { calculo.calculoTarifa(-10000,5,24);}
			catch(ExcepcionParametrosInvalidos e){
				Assert.assertTrue(true);
			}
	}




}
