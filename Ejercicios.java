public class Ejercicios {
    
    // =================================================================
    // 1. TIPOS DE DATOS Y CONVERSIÓN
    // =================================================================
    
    /**
     * Crea una variable de tipo entero, asígnale el valor 42 y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar 42
     */
    public int declararEntero() {
        int numero =42;
        return numero;
    }
    
    /**
     * Crea una variable de tipo double, asígnale el valor 3.14159 y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar 3.14159
     */
    public double declararDecimal() {
        // TODO: Implementar
        double num=3.14159;
        return num;
    }
    
    /**
     * Crea una variable String, asígnale "Hola Mundo" y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar "Hola Mundo"
     */
    public String declararTexto() {
        // TODO: Implementar
        String mensaje = "Hola Mundo";
        return mensaje;
    }
    
    /**
     * Crea una variable boolean, asígnale true y retórnala.
     * Ejemplo: Si ejecutas la función, debe retornar true
     */
    public boolean declararBooleano() {
        // TODO: Implementar
       boolean resultado=true;
        return resultado;
    }
    
    /**
     * Convierte un número entero a texto usando String.valueOf().
     * Ejemplo: Si pasas 123, debe retornar "123"
     */
    public String convertirEnteroATexto(int num) {


        return String.valueOf(num);
    }
    
    /**
     * Convierte un texto que contiene un número a entero usando Integer.parseInt().
     * Ejemplo: Si pasas "456", debe retornar 456
     */
    public int convertirTextoAEntero(String texto) {
        // TODO: Implementar
        return Integer.parseInt(texto);
    }
    
    /**
     * Convierte un número decimal a entero (truncando los decimales).
     * Ejemplo: Si pasas 9.87, debe retornar 9
     */
    public int convertirDecimalAEntero(double decimal) {
        // TODO: Implementar
        int entero = (int) decimal;
        return entero;
    }
    
    /**
     * Convierte un número entero a decimal.
     * Ejemplo: Si pasas 5, debe retornar 5.0
     */
    public double convertirEnteroADecimal(int entero) {
        // TODO: Implementar
        double decimal= (double) entero;
        return decimal;
    }
    
    // =================================================================
    // 2. ASIGNACIÓN E INTERACCIÓN DE VARIABLES
    // =================================================================
    
    /**
     * Recibe una edad, guárdala en una variable local y retórnala.
     * Ejemplo: Si pasas 25, debe retornar 25
     */
    public int asignarEdad(int edad) {
        // TODO: Implementar
        int años = edad;
        return años;
    }
    
    /**
     * Recibe un nombre, guárdalo en una variable local y retórnalo.
     * Ejemplo: Si pasas "Juan", debe retornar "Juan"
     */
    public String asignarNombre(String nombre) {
        // TODO: Implementar
        String persona=nombre;
        return persona;
    }
    
    /**
     * Intercambia dos valores y retorna un array con los valores intercambiados.
     * Ejemplo: Si pasas (5, 10), debe retornar [10, 5]
     */
    public int[] intercambiarValores(int a, int b) {
        // TODO: Implementar

        return new int[]{b, a};
    }
    
    /**
     * Combina el nombre y la edad en un texto descriptivo.
     * Ejemplo: Si pasas ("Ana", 22), debe retornar "Ana tiene 22 años"
     */
    public String concatenarDatos(String nombre, int edad) {
        // TODO: Implementar
        String persona=nombre;
        int num= edad;
        return nombre + " tiene " + edad + " años";
    }
    
    /**
     * Suma el salario base más los bonos para obtener el salario total.
     * Ejemplo: Si pasas (1000.0, 200.0), debe retornar 1200.0
     */
    public double calcularSalarioTotal(double salarioBase, double bonos) {
        // TODO: Implementar
        int salario=(int) (salarioBase + bonos);
        return salario;
    }
    
    /**
     * Incrementa un contador con el valor especificado.
     * Ejemplo: Si pasas (10, 5), debe retornar 15
     */
    public int actualizarContador(int contadorActual, int incremento) {
        // TODO: Implementar
        int suma=contadorActual+incremento;
        return suma;
    }
    
    // =================================================================
    // 3. OPERADORES
    // =================================================================
    
    /**
     * Suma dos números enteros.
     * Ejemplo: Si pasas (7, 3), debe retornar 10
     */
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar
        int suma= a+b;
        return suma;
    }
    
    /**
     * Calcula el residuo de una división usando el operador módulo (%).
     * Ejemplo: Si pasas (17, 5), debe retornar 2
     */
    public int calcularResto(int dividendo, int divisor) {
        // TODO: Implementar
        int residuo= dividendo%divisor;
        return residuo;
    }
    
    /**
     * Compara si el primer número es mayor que el segundo.
     * Ejemplo: Si pasas (8, 5), debe retornar true
     */
    public boolean esMayorQue(int a, int b) {
        // TODO: Implementar
        boolean mayorque= a>b;
        return mayorque;
    }
    
    /**
     * Verifica si un número es par Y positivo usando operadores lógicos.
     * Ejemplo: Si pasas 6, debe retornar true. Si pasas -4, debe retornar false
     */
    public boolean esParYPositivo(int num) {
        // TODO: Implementar

        return num%2==0 && num>0;
    }
    
    /**
     * Verifica si un número es múltiplo de 3 usando el operador módulo.
     * Ejemplo: Si pasas 9, debe retornar true. Si pasas 7, debe retornar false
     */
    public boolean esMultiploDeTres(int num) {
        // TODO: Implementar
        return num%3==0;
    }
    
    /**
     * Verifica si el primer número es múltiplo del segundo.
     * Ejemplo: Si pasas (20, 4), debe retornar true
     */
    public boolean esMultiploDeN(int num, int n) {
        // TODO: Implementar
        return num % n == 0;
    }
    
    /**
     * Incrementa un número en 1 usando operadores de asignación.
     * Ejemplo: Si pasas 5, debe retornar 6
     */
    public int incrementarEnUno(int num) {
        // TODO: Implementar
        return ++num;
    }
    
    /**
     * Verifica si un número es divisible por otro (residuo = 0).
     * Ejemplo: Si pasas (15, 3), debe retornar true
     */
    public boolean esDivisiblePor(int num, int divisor) {
        // TODO: Implementar
        return num% divisor==0;
    }
    
    // =================================================================
    // 4. CONDICIONALES
    // =================================================================
    
    /**
     * Verifica si una persona es mayor de edad (18 años o más).
     * Ejemplo: Si pasas 20, debe retornar true. Si pasas 16, debe retornar false
     */
    public boolean esMayorDeEdad(int edad) {
        // TODO: Implementar
        return edad>=18;
    }
    
    /**
     * Clasifica un número como "positivo", "negativo" o "cero".
     * Ejemplo: Si pasas 5, debe retornar "positivo"
     */
    public String clasificarNumero(int num) {
        // TODO: Implementar
        if (num > 0) {
            return "positivo";
        } else if (num < 0) {
            return "negativo";
        } else {
            return "cero";
        }

    }
    
    /**
     * Determina si un estudiante es "apto" (nota >= 3.0) o "no apto".
     * Ejemplo: Si pasas 3.5, debe retornar "apto"
     */
    public String evaluarPrueba(double nota) {
        // TODO: Implementar
        if (nota >= 3.0) {
            return "apto";
        } else {
            return "no apto";
        }

    }
    
    /**
     * Evalúa aptitud considerando: nota >= 3.0, edad >= 18 y experiencia.
     * Ejemplo: Si pasas (4.0, 22, true), debe retornar "apto"
     */
    public String evaluarAptitud(double nota, int edad, boolean tieneExperiencia) {
        // TODO: Implementar
        if (nota >= 3.0 && edad >= 18 && tieneExperiencia) {
            return "apto";
        } else {
            return "no apto";
        }

    }
    
    /**
     * Aplica 15% descuento si es estudiante menor de 25 años.
     * Ejemplo: Si pasas (100.0, 20, true), debe retornar 85.0
     */
    public double calcularDescuentoEstudiante(double precio, int edad, boolean esEstudiante) {
        // TODO: Implementar
        if (esEstudiante && edad < 25) {
            return precio * 0.85;
        } else {
            return precio;
        }
    }
    
    /**
     * Categoriza por edad: 0-12 "niño", 13-17 "adolescente", 18-64 "adulto", 65+ "adulto mayor".
     * Ejemplo: Si pasas 30, debe retornar "adulto"
     */
    public String determinarCategoria(int edad) {
        // TODO: Implementar
        if (edad >= 0 && edad <= 12) {
            return "niño";
        } else if (edad >= 13 && edad <= 17) {
            return "adolescente";
        } else if (edad >= 18 && edad <= 64) {
            return "adulto";
        } else if (edad >= 65) {
            return "adulto mayor";
        } else {
            return "edad inválida";
        }
    }
    
    // =================================================================
    // 5. CICLOS
    // =================================================================
    
    /**
     * Calcula la suma de números desde 1 hasta n (1+2+3+...+n).
     * Ejemplo: Si pasas 5, debe retornar 15 (1+2+3+4+5)
     */
    public int sumarHastaN(int n) {
        // TODO: Implementar
        int sumar = 0;
        for (int i = 1; i <= n; i++) {
            sumar += i;
        }
        return sumar;
    }
    
    /**
     * Calcula el factorial de n (n! = n × (n-1) × ... × 1).
     * Ejemplo: Si pasas 4, debe retornar 24 (4×3×2×1)
     */
    public int factorial(int n) {
        // TODO: Implementar
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * Retorna el n-ésimo número de la secuencia Fibonacci (0,1,1,2,3,5,8...).
     * Ejemplo: Si pasas 6, debe retornar 8
     */
    public int fibonacci(int n) {
        // TODO: Implementar
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    
    /**
     * Verifica si un número es perfecto (suma de sus divisores = él mismo).
     * Ejemplo: Si pasas 6, debe retornar true (1+2+3=6)
     */
    public boolean esNumeroPerfecto(int num) {
        // TODO: Implementar
        if (num <= 1) return false;

        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
    
    /**
     * Determina si un año es bisiesto (divisible por 4, excepto centenarios no divisibles por 400).
     * Ejemplo: Si pasas 2024, debe retornar true
     */
    public boolean esBisiesto(int año) {
        // TODO: Implementar
        if (año % 400 == 0) {
            return true;
        } else if (año % 100 == 0) {
            return false;
        } else if (año % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Verifica si la suma de los dígitos de un número es múltiplo de 7.
     * Ejemplo: Si pasas 25, debe retornar true (2+5=7, que es múltiplo de 7)
     */
    public boolean numeroMagico(int num) {
        // TODO: Implementar
        int suma = 0;
        //int suma = Math.abs(num);
        int ultimo = num % 10;

        // Primer dígito
        /*
        int primero = num;
        while (primero >= 10) {
            primero /= 10;
        }
        System.out.println("primero"+primero);
        System.out.println("ultimo"+ultimo);
*/
        int temp = num;
        while (temp >= 100) {
            temp /= 10;
        }

        int primero = temp / 10;
        int segundo = temp % 10;

        System.out.println("Número: " + num);
        System.out.println("Primer dígito: " + primero);
        System.out.println("Segundo dígito: " + segundo);
        return (primero + segundo) % 7 == 0;

    }
    
    /**
     * Cuenta cuántos dígitos tiene un número.
     * Ejemplo: Si pasas 1234, debe retornar 4
     */
    public int contarDigitos(int num) {
        // TODO: Implementar
        if (num == 0) return 1;

        num = Math.abs(num);  // Manejar negativos
        int contador = 0;

        while (num > 0) {
            contador++;
            num /= 10;
        }

        return contador;

    }
    
    /**
     * Genera la tabla de multiplicar del 1 al 10 para el número dado, retorna como String.
     * Ejemplo: Si pasas 3, debe retornar "3x1=3\n3x2=6\n3x3=9\n...3x10=30"
     */
    public String tablaMultiplicar(int num) {
        // TODO: Implementar
        String resultado = "";
        for (int i = 1; i <= 10; i++) {
            resultado += num + "x" + i + "=" + (num * i);
            if (i < 10) {
                resultado += "\n";
            }
        }
        return resultado;
    }
}