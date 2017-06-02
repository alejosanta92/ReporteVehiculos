package com.example.alejandro.webservicedatosabiertos.datosAPI;

import com.example.alejandro.webservicedatosabiertos.models.ReporteMortalidad;
import com.example.alejandro.webservicedatosabiertos.models.ReporteVehiculo;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by alejandro on 22/05/17.
 */

public interface DatosOpenAPIService {
    @GET("rvmt-7x4r.json")
    Call<ArrayList<ReporteVehiculo>> obtenerListaReportes();

    @GET("3r8i-4u3w.json")
    Call<ArrayList<ReporteMortalidad>> obtenerListaMortalidad();
}
