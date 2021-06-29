package io.amey;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    TaskDAO dao = new TaskDAO();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertNotNull(dao.connectMongo());
    }
}
