package enigma;

import org.junit.Assert;
import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
        
        
        public void convertForwardNewDesign(){
            int[] k = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
            int p = 1;
            Rotor r = new Rotor(k,0);
            r.setPosition(0);
            int expected  = r.convertForward(1);
            int done = (k[(p+0)%26]-0)%26;
            Assert.assertEquals(expected, done);
        }
        
        
        public void convertBackwardNewDesign(){
            int[] k = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
            int[] g = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for(int i =0; i<26; i++){
			g[k[i]] = i;
            }   
            int p = 1;
            Rotor r = new Rotor(k,0);
            r.setPosition(0);
            int expected  = r.convertBackward(1);
            int done = (g[(p+0)%26]-0)%26;
            Assert.assertEquals(expected, done);
        }
        
        @Test
        public void convertForward(){
            //nouveau test pour vérifier que cela fonctionnne apres le changement de code
        }
        
        @Test
        public void convertBackward(){
            //nouveau test pour vérifier que cela fonctionnne apres le changement de code
        }
        
}
