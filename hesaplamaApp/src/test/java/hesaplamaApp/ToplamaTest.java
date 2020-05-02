package hesaplamaApp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void test() {
		//Given
		hesap toplama=new Toplama();
		String sayi1="250";
		String sayi2="1000";
		
		//When
		String sonuc =toplama.sonucubul(sayi1, sayi2);
		
		//Then
		assertEquals("1250", sonuc);
	}
	
	@Test
	public void test2() {
		//Given
		hesap toplama=new Toplama();
		String sayi1="-100";
		String sayi2="1000";
		
		//When
		String sonuc =toplama.sonucubul(sayi1, sayi2);
		
		//Then
		assertEquals("900", sonuc);
	}
}
