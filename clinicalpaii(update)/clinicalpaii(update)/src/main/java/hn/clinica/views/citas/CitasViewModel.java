package hn.clinica.views.citas;

import java.util.List;

import hn.clinica.data.entity.Citas;

public interface CitasViewModel {
	
	void refrescarGridCitas(List<Citas> cita);
	void mostrarMensajeCreacion(boolean exito);
	void mostrarMensajeActualizacion(boolean exito);
	void mostrarMensajeEliminacion(boolean exito);
	

}
