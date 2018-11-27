package test;
import prueba.*;
import org.junit.*;


import static org.junit.Assert.*;

public class Test {

	int [] v1 = {3,5,12,4};
	int [] v2 = {9,25,144,16,25,144};
	int [] v3 = {3,5,12,4};
	int [] v4 = {9,25,144,16,25,144,114};
	int [] v5 = {3,5,12,4};
	int [] v6 = {9,25,144,16,25,144};
	int [] v7 = {3,5,12,4};
	int [] v8 = {9,25,144,16,25,144};

    
	
    @org.junit.jupiter.api.Test
	public void ttyxdlolepepfgnlkdjbgvlkxbnñkxdgñkzdfjfdk() {
		
		assertTrue("falla assertTrue v1 y v2",Main.Compara(v1,v2));
		assertFalse("falla assertTrue v1 v4",Main.Compara(v1,v4));

	}
}
