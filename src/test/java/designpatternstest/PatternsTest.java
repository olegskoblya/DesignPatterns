package designpatternstest;

import com.company.singleton.Singleton;
import com.company.singleton.chocolate1.ChocolateBoiler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by oleg on 18.06.15.
 */
public class PatternsTest extends Assert {
    @Before
    public void before() {
        System.out.println("Before test");
    }

    @After
    public void after() {
        System.out.println("After Test!");
    }

    @Test
    public void shouldCreateSingleton() {
        Exception ex = null;
        try {
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        } catch (Exception e) {
            ex = e;
        }
        assertEquals(null, ex);
    }
}
