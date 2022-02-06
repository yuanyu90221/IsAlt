import kotlin.test.Test
import kotlin.test.assertEquals

internal class IsAltKtTest {

    @Test
    fun testWithAlt() {
        assertEquals(true, isAlt("amazon"))
        assertEquals(true, isAlt("banana"))
    }
    @Test
    fun testWithNotAlt() {
        assertEquals(false, isAlt("apple"))
    }
}