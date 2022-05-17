//////////////////////////////////
/* Equipo 2							*/
/* Autor: Lòpez Guevara Jesus Alejandro	*/
/* Fecha: 16/05/2022				*/
package cursoDAgil.service.direccion;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import cursoDAgil.bd.domain.Direccion;
import cursoDAgil.dao.direccion.DireccionDao;


@Named
public class DireccionServiceImpl implements DireccionService,Serializable {
	
private static final long serialVersionUID = 7962397593863792875L;
	
	@Inject
	DireccionDao direccionDao;
	@Override
	public List<Direccion> obtenerDirecciones() {
		// TODO Auto-generated method stub
		return direccionDao.obtenerDirecciones();
	}

	@Override
	public Direccion obtenerDireccionPorId(Map<String, Integer> mapDireccion) {
		// TODO Auto-generated method stub
		return direccionDao.obtenerDireccionPorId(mapDireccion);
	}
	

}
