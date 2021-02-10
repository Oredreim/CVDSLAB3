package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validaredadMenorACero() {
        Person prueba = new Person("Cristian", 1234567, -5, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validarEdadMaxima() {
        Person prueba = new Person("Cristian", 1234567, 201, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validarMenorDeEdad() {
        Person prueba = new Person("Cristian", 1234567, 17, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validarMuerto() {
        Person prueba = new Person("Cristian", 1234567, 28, Gender.MALE , false);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validarDuplicado() {
        Person prueba = new Person("Pepito", 1111111, 28, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);
    }

    @Test
    public void validarVivo() {
        Person prueba = new Person("Cristian", 231546, 28, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void validarNoDuplicado() {
        Person prueba = new Person("Pepito", 22222, 28, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
}
