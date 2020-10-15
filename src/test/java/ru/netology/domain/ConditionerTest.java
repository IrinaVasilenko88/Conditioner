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
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        int expected = 25;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void shouldNotIncreaseCurrentTemperatureIfTemperatureIsMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 30;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        int expected = 30;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void shouldNotIncreaseCurrentTemperatureIfTemperatureIsOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 31;
        conditioner.setCurrentTemperature(currentTemperature);
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());

    }
    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 24;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        int expected = 23;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void shouldNotDecreaseCurrentTemperatureIfTemperatureIsMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 20;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        int expected = 20;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
    @Test
    void shouldNotDecreaseCurrentTemperatureIfTemperatureIsLessThanMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(20);
        conditioner.setMaxTemperature(30);
        int currentTemperature = 19;
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        int expected = 0;
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @Test
    void isOn() {
    }

    @Test
    void setOn() {
    }
}