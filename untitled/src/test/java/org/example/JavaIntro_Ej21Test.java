package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JavaIntro_Ej21Test {

    @Test
    void testProbandoMetodos() {
        assertEquals(11, JavaIntro_Ej21.ProbandoMetodos(5, 6));
        assertEquals(0, JavaIntro_Ej21.ProbandoMetodos(-3, 3));
        assertEquals(-1, JavaIntro_Ej21.ProbandoMetodos(-2, 1));
    }
}