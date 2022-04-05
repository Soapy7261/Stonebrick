import dev.JustRed23.stonebrick.cfg.Parseable;
import dev.JustRed23.stonebrick.cfg.Config;
import dev.JustRed23.stonebrick.exeptions.ConfigInitializationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigTest {

    @Test
    void testParseable() {
        Parseable testString = new Parseable("hello world");
        Parseable testBoolean = new Parseable(true);
        assertEquals("hello world", testString.asString());
        assertTrue(testBoolean.asBoolean());
    }

    @Test
    void testWrongParse() {
        Parseable testString = new Parseable("hello world");
        assertThrows(Exception.class, testString::asDouble);
    }

    @Test
    void testConfig() throws ConfigInitializationException {
        Config.initialize();
        assertNull(Config.get("keythatdoesnotexist"));
    }
}