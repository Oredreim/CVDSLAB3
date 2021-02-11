package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.*;

public class TarifasTest {

	private double tarifa;

	@Test
	public void validarEdadMenor0(){
		try{
			tarifa = CalculadorDescuentos.calculoTarifa(5000000,15,-100);
		}
		catch ( Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void validarEdad0(){
		try{
			tarifa = CalculadorDescuentos.calculoTarifa(5000000,15,0);
		}
		catch ( Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void menores18 () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000, 12, 16);
		}
		catch (Exception e) {
			Assert.assertTrue(true);
		}
	}

	@Test
	public void mayores65 () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000, 12, 68);
		}
		catch (Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void mayores65YDias20 () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000,21,68);
		} catch (Exception e) {
			Assert.assertTrue(true);
		}

	}

	@Test
	public void menores18YDias20 () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000, 21, 68);
		}
		catch (Exception e){
			Assert.assertTrue(true);
		}
	}


	@Test
	public void noDeberiaDescuento () {
		tarifa = CalculadorDescuentos.calculoTarifa(10000,5,24);
	}

	@Test
	public void edadErronea () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000,5,-24);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void diasErroneos () {
		try {
			tarifa = CalculadorDescuentos.calculoTarifa(10000,-5,24);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}

	@Test
	public void precioErroneo () {

		try {
			tarifa = CalculadorDescuentos.calculoTarifa(-10000,5,24);
		}
		catch(Exception e){
			Assert.assertTrue(true);
		}
	}
}
