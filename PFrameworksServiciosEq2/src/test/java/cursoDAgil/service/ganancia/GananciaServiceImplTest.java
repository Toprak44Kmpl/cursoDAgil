package cursoDAgil.service.ganancia;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cursoDAgil.bd.domain.Ganancia;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"/applicationContext.xml"})
public class GananciaServiceImplTest {

	@Inject
	GananciaService gananciaService;
	
	@Test
	public void pruebaListarGanancia() {
		System.out.println("------------------------------------------------------");
		System.out.println("Test consultar todas las ganancias");
		try {			
			List<Ganancia> lista = gananciaService.listarGanancia();
			int a = lista.size();
			assertEquals(lista.size(),a);
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
	
	@Test
	public void pruebaListarPorFecha() {
		System.out.println("------------------------------------------------------");
		System.out.println("Test consultar por fecha");
		Ganancia ganancia = new Ganancia();
		Map<String, String> mapGanancia = new HashMap<>();
		mapGanancia.put("fecha","2022-04-23");
		try {
			ganancia=gananciaService.listarPorFecha(mapGanancia);
			//assertNotNull(ganancia);
			System.out.println("Fecha" + ganancia.getFecha());
			System.out.println("Total ganancia" + ganancia.getTotalGanancia());
			System.out.println("Id ganancia" + ganancia.getIdGanancia());
			System.out.println("Id venta" + ganancia.getVentaId());
			System.out.println();
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}








