package com.junit.Junit5;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import com.junit.Geometria.Geometria;



public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    Geometria g = new Geometria();
    Geometria g1 = new Geometria(2);
    
    @Test
    public void testareacuadrado() {
    	int result = g.areacuadrado(2);
    	int resultEsperado = 4;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareacuadrado2() {
    	int result = g1.areacuadrado(2);
    	int resultEsperado = 4;
    	assertEquals(resultEsperado, result);
    }
	@Test
    public void testareaCirculo() {
    	Double result = g.areaCirculo(1);
    	Double resultEsperado = 3.1416;
    	assertEquals(resultEsperado, result);
    }
	@Test
    public void testareaCirculo2() {
    	Double result = g1.areaCirculo(1);
    	Double resultEsperado = 3.1416;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareatriangulo() {
    	int result = g.areatriangulo(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareatriangulo2() {
    	int result = g1.areatriangulo(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearectangulo() {
    	int result = g.arearectangulo(2,3);
    	int resultEsperado = 6;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearectangulo2() {
    	int result = g1.arearectangulo(2,3);
    	int resultEsperado = 6;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareapentagono() {
    	int result = g.areapentagono(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareapentagono2() {
    	int result = g1.areapentagono(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearombo() {
    	int result = g.arearombo(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearombo2() {
    	int result = g1.arearombo(2,3);
    	int resultEsperado = 3;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearomboide() {
    	int result = g.arearomboide(2,3);
    	int resultEsperado = 6;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testarearomboide2() {
    	int result = g1.arearomboide(2,3);
    	int resultEsperado = 6;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareatrapecio() {
    	int result = g.areatrapecio(2,2,2);
    	int resultEsperado = 4;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testareatrapecio2() {
    	int result = g1.areatrapecio(2,2,2);
    	int resultEsperado = 4;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura() {
    	String result = g.figura(1);
    	String resultEsperado = "cuadrado";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura2() {
    	String result = g.figura(2);
    	String resultEsperado = "Circulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura3() {
    	String result = g.figura(3);
    	String resultEsperado = "Triangulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura4() {
    	String result = g.figura(4);
    	String resultEsperado = "Rectangulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura5() {
    	String result = g.figura(5);
    	String resultEsperado = "Pentagono";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura6() {
    	String result = g.figura(6);
    	String resultEsperado = "Rombo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura7() {
    	String result = g.figura(7);
    	String resultEsperado = "Romboide";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura8() {
    	String result = g.figura(8);
    	String resultEsperado = "Trapecio";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testfigura9() {
    	String result = g.figura(9);
    	String resultEsperado = "Default";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testgetId() {
    	int result = g1.getId();
    	int resultEsperado = 2;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetId() {
    	g.setId(2);
    	int result = g.getId();
    	int resultEsperado = 2;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetId2() {
    	g1.setId(2);
    	int result = g1.getId();
    	int resultEsperado = 2;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testgetNom() {
    	g.setNom("Circulo");
    	String result = g.getNom();
    	String resultEsperado = "Circulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testgetNom2() {
    	String result = g1.getNom();
    	String resultEsperado = "Circulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetNom() {
    	g.setNom("Circulo");
    	String result = g.getNom();
    	String resultEsperado = "Circulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetNom2() {
    	g1.setNom("Circulo");
    	String result = g1.getNom();
    	String resultEsperado = "Circulo";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testgetArea() {
    	g.setArea(2);
    	Double result = g.getArea();
    	Double resultEsperado = 2.0;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testgetArea2() {
    	g1.setArea(2);
    	Double result = g1.getArea();
    	Double resultEsperado = 2.0;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetArea() {
    	g.setArea(2);
    	Double result = g.getArea();
    	Double resultEsperado = 2.0;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testsetArea2() {
    	g1.setArea(2);
    	Double result = g1.getArea();
    	Double resultEsperado = 2.0;
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testtoString() {
    	g.setArea(12.5664);
    	g.setId(2);
    	g.setNom("Circulo");
    	String result = g.toString();
    	String resultEsperado = "Geometria [id=2, nom=Circulo, area=12.5664]";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testtoString2() {
    	g1.setArea(12.5664);
    	g1.setId(2);
    	g.setNom("Circulo");
    	String result = g1.toString();
    	String resultEsperado = "Geometria [id=2, nom=Circulo, area=12.5664]";
    	assertEquals(resultEsperado, result);
    }
    @Test
    public void testmain() {
    	App.main(null);
    }
}
