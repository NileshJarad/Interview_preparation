package exercise.array


import common.printArray
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals

class RotateArrayKtTest {
    @Test
    fun `rotate by array should throw exception when rotate by is larger than the array size`() {
        //GIVEN
        val classUnderTest = RotateArray()

        //WHEN
        val exception = assertThrows<RuntimeException> { classUnderTest.rotateArrayBy(arrayOf(1, 2), 50) }

        //THEN
        assertEquals("'rotateBy' can not be large than the array size", exception.message)
    }

    @Test
    fun `rotate by array should rotate array by 2 steps`() {
        //GIVEN
        val classUnderTest = RotateArray()
        val arrayToRotate = arrayOf(1, 2, 5, 6, 7, 8, 9)
        arrayToRotate.printArray()

        //WHEN
        val result = classUnderTest.rotateArrayBy(arrayToRotate, 2)
        arrayToRotate.printArray()

        //THEN
        assertEquals(8, arrayToRotate.first())
    }

    @Test
    fun `rotate by array should rotate array by 3 steps`() {
        //GIVEN
        val classUnderTest = RotateArray()
        val arrayToRotate = arrayOf(1, 2, 5, 6, 7, 8, 9)
        arrayToRotate.printArray()

        //WHEN
        val result = classUnderTest.rotateArrayBy(arrayToRotate, 3)
        arrayToRotate.printArray()

        //THEN
        assertEquals(7, arrayToRotate.first())
    }
}