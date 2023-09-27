package com.Labastie.calculator;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.InstanceOfAssertFactories.optional;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    private Calculator monCalculator;

    @BeforeEach
    void setUp() {  monCalculator = new Calculator(); }

    @AfterEach
    void tearDown() { monCalculator  = null; }



    @Test
    void faire_somme_2_nombres() {

        // GIVEN
        int premier_nombre = 23;
        int deuxieme_nombre = 12;

        // WHEN
        int somme = monCalculator.add(premier_nombre,deuxieme_nombre);

        // THEN
        assertThat(somme).isEqualTo(35);
    }

    @Test
    void faire_division_2_nombres() {

        // GIVEN
        int premier_nombre = 20;
        int deuxieme_nombre = 5;

        // WHEN
        int division = monCalculator.divide(premier_nombre,deuxieme_nombre);

        // THEN
        assertThat(division).isEqualTo(4);
    }

    @ParameterizedTest
    @CsvSource({" 1, 2, 3"," 4, 6, 10","-5, 6, 1"})
    void Somme_Parametre(int premier_nombre, int deuxieme_nombre, int resultat) {

        //GIVEN

        //WHEN
        int somme = monCalculator.add(premier_nombre,deuxieme_nombre);
        //THEN
        assertThat(somme).isEqualTo(resultat);
    }

}