package ar.edu.unq.po2.tpstreamyenum.ej2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import java.time.LocalTime;


public class ActividadSemanal {
	
	private DiaDeLaSemana dia;
	private LocalTime horaInicio;
	private int duracion;
	private Deporte dep;
	
	public ActividadSemanal(DiaDeLaSemana dia, LocalTime horaIn, int duracion, Deporte dep, LocalTime horaInicio) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.dep = dep;
	}
	
	public double costo() {
		if(this.dia == DiaDeLaSemana.LUNES || this.dia == DiaDeLaSemana.MARTES || this.dia == DiaDeLaSemana.MIERCOLES) {
			return 500 + costoPorComplejidad();
		}
		return 1000 + costoPorComplejidad();
	}
	
	public int costoPorComplejidad() {
		return dep.getComplejidad() * 200;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public LocalTime getHorainicio() {
		return horaInicio;
	}
	
	public DiaDeLaSemana getDiaDeLaSemana() {
		return dia;
	}
	
	public Deporte getDeporte() {
		return dep;
	}
	
	public List<ActividadSemanal> actividadesDeFutbol(List<ActividadSemanal> actividades) {
		return actividades.stream().filter(a -> a.esFutbol()).collect(Collectors.toList());
	}
	
	public boolean esFutbol() {
		return this.dep == Deporte.FUTBOL;
	}
	
	public List<ActividadSemanal> actividadesDeComplejidad(List<ActividadSemanal> actividades, int complejidad) {
		return actividades.stream().filter(a -> a.esActividadDeComplejidad(complejidad)).collect(Collectors.toList());
	}
	
	public boolean esActividadDeComplejidad(int complejidad) {
		return this.dep.getComplejidad() == complejidad;
	}
	
	public int cantidadTotalDeHorasSemanales(List<ActividadSemanal> actividadesDeMunicipio) {
		return actividadesDeMunicipio.stream().mapToInt(ActividadSemanal::getDuracion).sum(); // forma con ::
		//return actividadesDeMunicipio.stream().mapToInt(a -> a.duracion).sum(); // forma con lambda
	}
	
	public Optional<ActividadSemanal> actividadDeMenorCostoDeDeporte(List<ActividadSemanal> actividades, Deporte dep) {
		return actividades.stream().filter(a -> a.dep == dep).min(Comparator.comparingDouble(ActividadSemanal::costo));
	}
	
	public Map<Deporte, ActividadSemanal> actividadMasEconomicaPorDeporte(List<ActividadSemanal> actividades) {
		return actividades.stream()
				.collect(Collectors.groupingBy(
					ActividadSemanal::getDeporte,
					Collectors.collectingAndThen(
						Collectors.minBy(Comparator.comparingDouble(ActividadSemanal::costo)), 
						Optional::get
					)
				));
	}
	
	public void imprimirActividades(List<ActividadSemanal> actividades) {
	    actividades.forEach(actividad -> {
	        System.out.println("Día: " + actividad.getDiaDeLaSemana());
	        System.out.println("Hora: " + actividad.getHorainicio());
	        System.out.println("Duración: " + actividad.getDuracion() + " minutos");
	        System.out.println("Deporte: " + actividad.getDeporte());
	        System.out.println("Costo: $" + actividad.costo());
	        System.out.println("----------------------------");
	    });
	}
}