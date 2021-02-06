package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void validateLowerLimitInvalidAge() {
        Person prueba = new Person("Cristian", 1111111, -5, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateUpperLimitInvalidAge() {
        Person prueba = new Person("Cristian", 1111111, 201, Gender.MALE , true);
        RegisterResult result = registry.registerVoter(prueba);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
}
