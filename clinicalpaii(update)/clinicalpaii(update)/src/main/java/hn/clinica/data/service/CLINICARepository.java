package hn.clinica.data.service;

import hn.clinica.data.entity.Citas;
import hn.clinica.data.entity.Pacientes;
import hn.clinica.data.entity.ResponseCitas;
import hn.clinica.data.entity.ResponseMedicamento;
import hn.clinica.data.entity.ResponsePacientes;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CLINICARepository {

	@Headers({
	    "Content-Type: application/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	
	@GET("/pls/apex/wencellr_pav2_98_2/clinica/pacientes/")
	Call<ResponsePacientes> obtenerPacientes();
	
	
	@Headers({
	    "Content-Type: application/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	
	@POST("/pls/apex/wencellr_pav2_98_2/clinica/pacientes/")
	Call<ResponseBody> crearPaciente(@Body Pacientes nuevo);

	
	// METODO CREAR CITA
	@Headers({
	    "Content-Type: application/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	
	@GET("/pls/apex/wencellr_pav2_98_2/clinica/citas/")
	Call<ResponseCitas> obtenerCitas();
	
	// METODO CONSULTA CITA
	@Headers({
	    "Content-Type: application/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	
	@POST("/pls/apex/wencellr_pav2_98_2/clinica/citas/")
	Call<ResponseBody> crearCitas(@Body Citas nuevo );
	
	
	
	@Headers({
	    "Content-Type: application/json",
	    "Accept-Charset: utf-8",
	    "User-Agent: Retrofit-Sample-App"
	})
	
	@GET("pls/apex/wencellr_pav2_98_2/clinica/medicamentos/")
	Call<ResponseMedicamento> obtenerMedicamentos();
	
		
	
	
	
		
}
