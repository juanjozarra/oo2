package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {

	private Biblioteca biblioteca;

	@BeforeEach
	void setUp() {
		biblioteca = new Biblioteca();
	}

	@Test
	void elExporterPorDefectoEsVoorhees() {
		assertTrue(biblioteca.getExporter() instanceof VoorheesExporter);
	}

	@Test
	void exportarSociosSinSociosDevuelveArregloVacioJson() {
		assertEquals("[]", biblioteca.exportarSocios());
	}

	@Test
	void agregarSocioYExportarDelegaAlVoorheesExporter() {
		Socio socio = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		biblioteca.agregarSocio(socio);

		String esperado = new VoorheesExporter().exportar(List.of(socio));
		assertEquals(esperado, biblioteca.exportarSocios());
	}

	@Test
	void agregarVariosSociosSeExportanEnOrden() {
		Socio s1 = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		Socio s2 = new Socio("Tyrion Lannister", "tyrion@thelannisters.com", "2345-2");
		biblioteca.agregarSocio(s1);
		biblioteca.agregarSocio(s2);

		String esperado = new VoorheesExporter().exportar(List.of(s1, s2));
		assertEquals(esperado, biblioteca.exportarSocios());
	}

	@Test
	void setExporterCambiaLaRepresentacionExportada() {
		biblioteca.agregarSocio(new Socio("Nombre", "mail@test.com", "1"));
		biblioteca.setExporter(socios -> "EXPORT:" + socios.size());

		assertEquals("EXPORT:1", biblioteca.exportarSocios());
	}

	@Test
	void setExporterPuedeUsarJsonSimple() {
		biblioteca.agregarSocio(new Socio("Nombre", "mail@test.com", "1"));
		biblioteca.setExporter(new JsonSimple());

		String salida = biblioteca.exportarSocios();
		assertTrue(salida.contains("Nombre"));
		assertTrue(salida.contains("mail@test.com"));
		assertTrue(salida.contains("1"));
	}

	@Test
	void setExporterPuedeUsarJackson() {
		biblioteca.agregarSocio(new Socio("Nombre", "mail@test.com", "1"));
		biblioteca.setExporter(new Jackson());

		String salida = biblioteca.exportarSocios();
		assertTrue(salida.contains("Nombre"));
		assertTrue(salida.contains("mail@test.com"));
		assertTrue(salida.contains("1"));
	}
}
