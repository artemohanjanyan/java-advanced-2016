package info.kgeorgiy.java.advanced.implementor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.imageio.IIOException;
import javax.imageio.plugins.bmp.BMPImageWriteParam;
import javax.management.ImmutableDescriptor;
import javax.management.relation.RelationNotFoundException;
import javax.naming.ldap.LdapReferralException;
import java.io.IOException;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClassImplementorTest extends InterfaceImplementorTest {
    @Test
    public void test07_defaultConstructorClasses() throws IOException {
        test(false, BMPImageWriteParam.class, RelationNotFoundException.class);
    }

    @Test
    public void test08_noDefaultConstructorClasses() throws IOException {
        test(false, IIOException.class, ImmutableDescriptor.class, LdapReferralException.class);
    }
}
