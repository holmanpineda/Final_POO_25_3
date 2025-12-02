package gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EjerciciosTest {
    
    private Ejercicios ejercicios = new Ejercicios();
    
    // =================================================================
    // 1. TESTS PARA TIPOS DE DATOS Y CONVERSIÓN
    // =================================================================
    
    @Test
    public void testDeclararEntero() {
        assertEquals(42, ejercicios.declararEntero());
    }
    
    @Test
    public void testDeclararDecimal() {
        assertEquals(3.14159, ejercicios.declararDecimal(), 0.00001);
    }
    
    @Test
    public void testDeclararTexto() {
        assertEquals("Hola Mundo", ejercicios.declararTexto());
    }
    
    @Test
    public void testDeclararBooleano() {
        assertTrue(ejercicios.declararBooleano());
    }
    
    @Test
    public void testConvertirEnteroATexto() {
        assertEquals("123", ejercicios.convertirEnteroATexto(123));
        assertEquals("0", ejercicios.convertirEnteroATexto(0));
        assertEquals("-456", ejercicios.convertirEnteroATexto(-456));
    }
    
    @Test
    public void testConvertirTextoAEntero() {
        assertEquals(456, ejercicios.convertirTextoAEntero("456"));
        assertEquals(0, ejercicios.convertirTextoAEntero("0"));
        assertEquals(-789, ejercicios.convertirTextoAEntero("-789"));
    }
    
    @Test
    public void testConvertirDecimalAEntero() {
        assertEquals(9, ejercicios.convertirDecimalAEntero(9.87));
        assertEquals(5, ejercicios.convertirDecimalAEntero(5.1));
        assertEquals(-3, ejercicios.convertirDecimalAEntero(-3.99));
    }
    
    @Test
    public void testConvertirEnteroADecimal() {
        assertEquals(5.0, ejercicios.convertirEnteroADecimal(5), 0.001);
        assertEquals(0.0, ejercicios.convertirEnteroADecimal(0), 0.001);
        assertEquals(-10.0, ejercicios.convertirEnteroADecimal(-10), 0.001);
    }
    
    // =================================================================
    // 2. TESTS PARA ASIGNACIÓN E INTERACCIÓN DE VARIABLES
    // =================================================================
    
    @Test
    public void testAsignarEdad() {
        assertEquals(25, ejercicios.asignarEdad(25));
        assertEquals(0, ejercicios.asignarEdad(0));
        assertEquals(100, ejercicios.asignarEdad(100));
    }
    
    @Test
    public void testAsignarNombre() {
        assertEquals("Juan", ejercicios.asignarNombre("Juan"));
        assertEquals("María", ejercicios.asignarNombre("María"));
        assertEquals("", ejercicios.asignarNombre(""));
    }
    
    @Test
    public void testIntercambiarValores() {
        assertArrayEquals(new int[]{10, 5}, ejercicios.intercambiarValores(5, 10));
        assertArrayEquals(new int[]{-3, 7}, ejercicios.intercambiarValores(7, -3));
        assertArrayEquals(new int[]{0, 0}, ejercicios.intercambiarValores(0, 0));
    }
    
    @Test
    public void testConcatenarDatos() {
        assertEquals("Ana tiene 22 años", ejercicios.concatenarDatos("Ana", 22));
        assertEquals("Pedro tiene 30 años", ejercicios.concatenarDatos("Pedro", 30));
        assertEquals("Luis tiene 0 años", ejercicios.concatenarDatos("Luis", 0));
    }
    
    @Test
    public void testCalcularSalarioTotal() {
        assertEquals(1200.0, ejercicios.calcularSalarioTotal(1000.0, 200.0), 0.001);
        assertEquals(2500.0, ejercicios.calcularSalarioTotal(2000.0, 500.0), 0.001);
        assertEquals(1000.0, ejercicios.calcularSalarioTotal(1000.0, 0.0), 0.001);
    }
    
    @Test
    public void testActualizarContador() {
        assertEquals(15, ejercicios.actualizarContador(10, 5));
        assertEquals(3, ejercicios.actualizarContador(8, -5));
        assertEquals(10, ejercicios.actualizarContador(10, 0));
    }
    
    // =================================================================
    // 3. TESTS PARA OPERADORES
    // =================================================================
    
    @Test
    public void testSumarDosNumeros() {
        assertEquals(10, ejercicios.sumarDosNumeros(7, 3));
        assertEquals(-2, ejercicios.sumarDosNumeros(5, -7));
        assertEquals(0, ejercicios.sumarDosNumeros(-5, 5));
    }
    
    @Test
    public void testCalcularResto() {
        assertEquals(2, ejercicios.calcularResto(17, 5));
        assertEquals(1, ejercicios.calcularResto(13, 4));
        assertEquals(0, ejercicios.calcularResto(10, 5));
    }
    
    @Test
    public void testEsMayorQue() {
        assertTrue(ejercicios.esMayorQue(8, 5));
        assertFalse(ejercicios.esMayorQue(3, 7));
        assertFalse(ejercicios.esMayorQue(5, 5));
    }
    
    @Test
    public void testEsParYPositivo() {
        assertTrue(ejercicios.esParYPositivo(6));
        assertFalse(ejercicios.esParYPositivo(-4));
        assertFalse(ejercicios.esParYPositivo(5));
        assertFalse(ejercicios.esParYPositivo(-3));
    }
    
    @Test
    public void testEsMultiploDeTres() {
        assertTrue(ejercicios.esMultiploDeTres(9));
        assertFalse(ejercicios.esMultiploDeTres(7));
        assertTrue(ejercicios.esMultiploDeTres(0));
        assertTrue(ejercicios.esMultiploDeTres(-6));
    }
    
    @Test
    public void testEsMultiploDeN() {
        assertTrue(ejercicios.esMultiploDeN(20, 4));
        assertFalse(ejercicios.esMultiploDeN(15, 4));
        assertTrue(ejercicios.esMultiploDeN(0, 5));
    }
    
    @Test
    public void testIncrementarEnUno() {
        assertEquals(6, ejercicios.incrementarEnUno(5));
        assertEquals(1, ejercicios.incrementarEnUno(0));
        assertEquals(0, ejercicios.incrementarEnUno(-1));
    }
    
    @Test
    public void testEsDivisiblePor() {
        assertTrue(ejercicios.esDivisiblePor(15, 3));
        assertFalse(ejercicios.esDivisiblePor(16, 3));
        assertTrue(ejercicios.esDivisiblePor(0, 5));
    }
    
    // =================================================================
    // 4. TESTS PARA CONDICIONALES
    // =================================================================
    
    @Test
    public void testEsMayorDeEdad() {
        assertTrue(ejercicios.esMayorDeEdad(20));
        assertFalse(ejercicios.esMayorDeEdad(16));
        assertTrue(ejercicios.esMayorDeEdad(18));
        assertFalse(ejercicios.esMayorDeEdad(17));
    }
    
    @Test
    public void testClasificarNumero() {
        assertEquals("positivo", ejercicios.clasificarNumero(5));
        assertEquals("negativo", ejercicios.clasificarNumero(-3));
        assertEquals("cero", ejercicios.clasificarNumero(0));
    }
    
    @Test
    public void testEvaluarPrueba() {
        assertEquals("apto", ejercicios.evaluarPrueba(3.5));
        assertEquals("no apto", ejercicios.evaluarPrueba(2.8));
        assertEquals("apto", ejercicios.evaluarPrueba(3.0));
        assertEquals("apto", ejercicios.evaluarPrueba(4.5));
    }
    
    @Test
    public void testEvaluarAptitud() {
        assertEquals("apto", ejercicios.evaluarAptitud(4.0, 22, true));
        assertEquals("no apto", ejercicios.evaluarAptitud(2.5, 22, true));
        assertEquals("no apto", ejercicios.evaluarAptitud(4.0, 16, true));
        assertEquals("no apto", ejercicios.evaluarAptitud(4.0, 22, false));
        assertEquals("apto", ejercicios.evaluarAptitud(3.0, 18, true));
    }
    
    @Test
    public void testCalcularDescuentoEstudiante() {
        assertEquals(85.0, ejercicios.calcularDescuentoEstudiante(100.0, 20, true), 0.001);
        assertEquals(100.0, ejercicios.calcularDescuentoEstudiante(100.0, 26, true), 0.001);
        assertEquals(100.0, ejercicios.calcularDescuentoEstudiante(100.0, 20, false), 0.001);
        assertEquals(170.0, ejercicios.calcularDescuentoEstudiante(200.0, 22, true), 0.001);
    }
    
    @Test
    public void testDeterminarCategoria() {
        assertEquals("niño", ejercicios.determinarCategoria(8));
        assertEquals("adolescente", ejercicios.determinarCategoria(15));
        assertEquals("adulto", ejercicios.determinarCategoria(30));
        assertEquals("adulto mayor", ejercicios.determinarCategoria(70));
        assertEquals("niño", ejercicios.determinarCategoria(12));
        assertEquals("adolescente", ejercicios.determinarCategoria(13));
        assertEquals("adulto", ejercicios.determinarCategoria(18));
        assertEquals("adulto mayor", ejercicios.determinarCategoria(65));
    }
    
    // =================================================================
    // 5. TESTS PARA CICLOS
    // =================================================================
    
    @Test
    public void testSumarHastaN() {
        assertEquals(15, ejercicios.sumarHastaN(5)); // 1+2+3+4+5 = 15
        assertEquals(10, ejercicios.sumarHastaN(4)); // 1+2+3+4 = 10
        assertEquals(1, ejercicios.sumarHastaN(1));
        assertEquals(0, ejercicios.sumarHastaN(0));
    }
    
    @Test
    public void testFactorial() {
        assertEquals(24, ejercicios.factorial(4)); // 4×3×2×1 = 24
        assertEquals(120, ejercicios.factorial(5)); // 5×4×3×2×1 = 120
        assertEquals(1, ejercicios.factorial(1));
        assertEquals(1, ejercicios.factorial(0));
    }
    
    @Test
    public void testFibonacci() {
        assertEquals(8, ejercicios.fibonacci(6)); // 0,1,1,2,3,5,8
        assertEquals(5, ejercicios.fibonacci(5)); // 0,1,1,2,3,5
        assertEquals(0, ejercicios.fibonacci(0));
        assertEquals(1, ejercicios.fibonacci(1));
        assertEquals(1, ejercicios.fibonacci(2));
        assertEquals(2, ejercicios.fibonacci(3));
    }
    
    @Test
    public void testEsNumeroPerfecto() {
        assertTrue(ejercicios.esNumeroPerfecto(6)); // 1+2+3 = 6
        assertTrue(ejercicios.esNumeroPerfecto(28)); // 1+2+4+7+14 = 28
        assertFalse(ejercicios.esNumeroPerfecto(12));
        assertFalse(ejercicios.esNumeroPerfecto(1));
    }
    
    @Test
    public void testEsBisiesto() {
        assertTrue(ejercicios.esBisiesto(2024));
        assertFalse(ejercicios.esBisiesto(2023));
        assertTrue(ejercicios.esBisiesto(2000));
        assertFalse(ejercicios.esBisiesto(1900));
        assertTrue(ejercicios.esBisiesto(2020));
    }
    
    @Test
    public void testNumeroMagico() {
        assertTrue(ejercicios.numeroMagico(25)); // 2+5 = 7, múltiplo de 7
        assertTrue(ejercicios.numeroMagico(34)); // 3+4 = 7, múltiplo de 7
        assertFalse(ejercicios.numeroMagico(23)); // 2+3 = 5, no múltiplo de 7
        assertTrue(ejercicios.numeroMagico(52)); // 5+2 = 7, múltiplo de 7
        assertTrue(ejercicios.numeroMagico(169)); // 1+6+9 = 16, no... 1+6 = 7, múltiplo de 7
    }
    
    @Test
    public void testContarDigitos() {
        assertEquals(4, ejercicios.contarDigitos(1234));
        assertEquals(1, ejercicios.contarDigitos(5));
        assertEquals(1, ejercicios.contarDigitos(0));
        assertEquals(3, ejercicios.contarDigitos(-456));
    }
    
    @Test
    public void testTablaMultiplicar() {
        String esperado3 = "3x1=3\n3x2=6\n3x3=9\n3x4=12\n3x5=15\n3x6=18\n3x7=21\n3x8=24\n3x9=27\n3x10=30";
        assertEquals(esperado3, ejercicios.tablaMultiplicar(3));
        
        String esperado2 = "2x1=2\n2x2=4\n2x3=6\n2x4=8\n2x5=10\n2x6=12\n2x7=14\n2x8=16\n2x9=18\n2x10=20";
        assertEquals(esperado2, ejercicios.tablaMultiplicar(2));
    }
}