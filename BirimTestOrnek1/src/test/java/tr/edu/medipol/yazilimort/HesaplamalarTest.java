package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void faktoriyelRec5Sonucu120Olmali() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120, sonuc);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(120, sonuc);
	}
	
	@Test
	public void testFaktoriyel() {
		for(int i=1; i<1000; i++) {
			int sonuc1 = Hesaplamalar.faktoriyelLoop(i);
			int sonuc2 = Hesaplamalar.faktoriyelRec(i);
			assertEquals(sonuc1, sonuc2);
		}
	}

}
