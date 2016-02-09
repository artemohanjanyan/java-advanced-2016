package info.kgeorgiy.java.advanced.walk;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RecursiveWalkTest extends WalkTest {
    @Test
    public void test08_recursion() throws IOException {
        final Path root = DIR.resolve(name.getMethodName());
        test(Collections.singletonList(root.toString()), randomDirs(3, 4, 100, root));
    }

    protected Map<String, String> randomDirs(final int n, final int d, final int maxL, final Path dir) throws IOException {
        final Map<String, String> result = randomFiles(random.nextInt(n + 1), maxL, dir);
        if (d > 0) {
            for (int i = random.nextInt(n + 1); i < n; i++) {
                result.putAll(randomDirs(n, d - 1, maxL, dir.resolve(randomFileName())));
            }
        }
        return result;
    }
}
