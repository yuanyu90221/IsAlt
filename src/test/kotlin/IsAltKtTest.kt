import kotlin.test.Test
import kotlin.test.assertEquals

internal class IsAltKtTest {

    @Test
    fun testWithAlt() {
        assertEquals(isAlt("amazon"), true)
        assertEquals(isAlt("banana"), true)
    }
    @Test
    fun testWithNotAlt() {
        assertEquals(isAlt("apple"), false)
    }
}