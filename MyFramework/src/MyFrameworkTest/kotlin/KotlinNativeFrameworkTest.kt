import kotlin.test.Test
import kotlin.test.assertEquals

class KotlinNativeFrameworkTest {

    @Test
    fun testAddDoubles() {
        val result = KotlinNativeFramework().addDoubles(1.0, 2.0)

        assertEquals(3.0, result)
    }

    @Test
    fun testAddDoublesShouldFail() {
        val result = KotlinNativeFramework().addDoubles(1.0, 2.0)

        assertEquals(0.0, result)
    }

}