package rekurze

import org.junit.jupiter.api.Assertions.*
import org.junit.Test

internal class BootlegMathTest{

    @Test
    fun testAdd() {
        assertEquals(4, BootlegMath.add(2, 2))
        assertEquals(20000000, BootlegMath.add(10000000, 10000000))
    }

    @Test
    fun testMultiply() {
        assertEquals(6, BootlegMath.multiply(3, 2))
    }

    @Test
    fun powerTest(){
        assertEquals(9, BootlegMath.power(3, 2))
    }

    @Test
    fun sumTest(){
        assertEquals(6, BootlegMath.sumOfDigits(123))
    }

    @Test
    fun palindromeTest(){
        assertTrue(BootlegMath.isPalindrome("bummub"))
        assertTrue(BootlegMath.isPalindrome("racecar"))
        assertFalse(BootlegMath.isPalindrome("bum"))
    }
}
