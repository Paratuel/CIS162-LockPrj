/*package week1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LockTesting {

	@Test
	public void testBadCode() {
		Lock d = new Lock("246");

		//d.reset();
		d.enterCode("125");
		
		Assert.assertFalse(d.isUnlock());
	}

    @Test
    public void testMasterTrue() {
        Lock d = new Lock("246");

        //d.reset();
        d.enterCode("998");

        Assert.assertTrue(d.isUnlock());
    }

}
*/