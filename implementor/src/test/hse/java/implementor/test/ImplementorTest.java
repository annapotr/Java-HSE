package hse.java.implementor.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.hse.java.implementor.ImplementorException;

import java.io.File;
import java.time.Duration;

public class ImplementorTest extends AbstractImplementorTest {
    /*
     * Here you can use for tests following methods:
     *    - checkInterfaceImplementationFromFolder
     *    - checkInterfaceImplementationFromStandardLibrary
     *    - checkAbstractClassImplementationFromFolder
     *    - checkAbstractClassImplementationFromStandardLibrary
     *
     * In each method you should use FQN.
     *
     * You can test implementor on any class/interface, that lays down
     *   in your main module (src/main/java).
     */

    public ImplementorTest() throws Exception {
        super();
    }

    // Uncomment, if you want to cleanup your implementor output directory (tmp)
    //@AfterAll
    public void cleanUp() {
        deleteFolderContent(new File(OUTPUT_DIRECTORY), false);
    }

    @Test
    public void implementClassB() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkAbstractClassImplementationFromFolder("study.inheret.ClassB")
        );
    }

    @Test
    public void implementMyInterface() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkInterfaceImplementationFromFolder("study.MyInterface")
        );
    }

    @Test
    public void implementMyClass() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkAbstractClassImplementationFromFolder("study.MyClass")
        );
    }

    @Test
    public void implementMyClass2WithPrivateConstructor() throws Exception {
        Assertions.assertThrows(ImplementorException.class,
                () -> checkAbstractClassImplementationFromFolder("study.MyClass2")
        );
    }

    @Test
    public void implementMyInterface2RussianWords() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkInterfaceImplementationFromFolder("study.MyInterface2")
        );
    }

    @Test
    public void implementInterfaceFromStandardLibrary() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkInterfaceImplementationFromStandardLibrary("java.lang.Comparable")
        );
    }

    @Test
    public void implementAbstractClassFromStandardLibrary() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkAbstractClassImplementationFromStandardLibrary("java.util.AbstractList")
        );
    }

    @Test
    public void implementAbstractClassA() throws Exception {
        Assertions.assertTimeout(
                Duration.ofSeconds(5),
                () -> checkAbstractClassImplementationFromStandardLibrary("study.inheret.ClassA")
        );
    }
}
