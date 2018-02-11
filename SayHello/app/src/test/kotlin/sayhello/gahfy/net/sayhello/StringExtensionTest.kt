package sayhello.gahfy.net.sayhello

import org.junit.Assert
import org.junit.Test

class StringExtensionTest {
    @Test
    fun addHelloPrefix() {
        Assert.assertEquals("Hello", "".addHelloPrefix())
        Assert.assertEquals("Hello", null.addHelloPrefix())
        Assert.assertEquals("Hello Gahfy", "Gahfy".addHelloPrefix())
    }
}