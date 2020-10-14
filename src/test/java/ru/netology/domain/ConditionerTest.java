package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
      Conditioner conditioner = new Conditioner();
      String expected = "Valli";
      assertNull(conditioner.getName());
      conditioner.setName(expected);
      assertEquals (expected, conditioner.getName());
    }


    @Test
    void setName() {
    }

    @Test
    void getMaxTemperature() {
    }

    @Test
    void setMaxTemperature() {
    }

    @Test
    void getMinTemperature() {
    }

    @Test
    void setMinTemperature() {
    }

    @Test
    void getCurrentTemperature() {
    }

    @Test
    void setCurrentTemperature() {

    }

    @Test
    void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(currentTemperature);
        int expected = 25;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void increaseCurrentTemperatureIfTemperatureIsMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 30;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(currentTemperature);
        int expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void increaseCurrentTemperatureIfTemperatureIsOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 31;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature(currentTemperature);
        int expected = 31;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature(currentTemperature);
        int expected = 23;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentTemperatureIfTemperatureIsMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 20;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature(currentTemperature);
        int expected = 20;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void decreaseCurrentTemperatureIfTemperatureIsLessThanMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 19;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature(currentTemperature);
        int expected = 19;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void isOn() {
    }

    @Test
    void setOn() {
    }
}