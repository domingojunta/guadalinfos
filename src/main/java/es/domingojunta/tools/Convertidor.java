package es.domingojunta.tools;

import org.springframework.stereotype.Component;

import es.domingojunta.entities.Convocatoria;
import es.domingojunta.entities.Orden;
import es.domingojunta.models.convocatoria.ConvocatoriaListarViewModel;
import es.domingojunta.models.orden.OrdenCrearViewModel;
import es.domingojunta.models.orden.OrdenListarViewModel;

@Component
public class Convertidor {
	
	public Orden OrdenListarViewModel2Orden(Orden orden, OrdenListarViewModel viewModel) {
		orden.setIdOrden(viewModel.getIdOrden());
		orden.setNombre(viewModel.getNombreOrden());
		orden.setAlias(viewModel.getAliasOrden());
		return orden;
		
	}
	
	public Orden OrdenCrearViewModel2Orden(Orden orden, OrdenCrearViewModel viewModel) {
		orden.setNombre(viewModel.getNombreOrden());
		orden.setAlias(viewModel.getAliasOrden());
		return orden;
		
	}

	public Convocatoria ConvocatoriaListarViewModel2Convocatoria(Convocatoria convocatoria,
			ConvocatoriaListarViewModel vm) {
		convocatoria.setIdConvocatoria(vm.getIdConvocatoria());
		convocatoria.setNombre(vm.getNombreConvocatoria());
		convocatoria.setYear(vm.getYearConvocatoria());
		convocatoria.setIdOrden(vm.getIdOrden());
		convocatoria.setFechaInicio(vm.getFechaInicio());
		convocatoria.setFechaFin(vm.getFechaFin());
		convocatoria.setImporteAyuntamientoA(vm.getImporteAyuntamientoA());
		convocatoria.setImporteAyuntamientoB(vm.getImporteAyuntamientoB());
		convocatoria.setImporteAyuntamientoC(vm.getImporteAyuntamientoC());
		convocatoria.setImporteELAA(vm.getImporteELAA());
		convocatoria.setImporteELAB(vm.getImporteELAB());
		convocatoria.setFechaJustificacion(vm.getFechaJustificacion());
		convocatoria.setSUBAG(vm.getSUBAG());
		convocatoria.setSUBCO(vm.getSUBCO());
		convocatoria.setImporteGuadalinfoCorriente(vm.getImporteGuadalinfoCorriente());
		convocatoria.setImporteGuadalinfoFuturo(vm.getImporteGuadalinfoFuturo());
		convocatoria.setImporteELACorriente(vm.getImporteELACorriente());
		convocatoria.setImporteELAFuturo(vm.getImporteELAFuturo());
		convocatoria.setNumeroDias(vm.getNumeroDias());
		convocatoria.setAplicacionPresupuestariaCorriente(vm.getAplicacionPresupuestariaCorriente());
		convocatoria.setAplicacionPresupuestariaFutura(vm.getAplicacionPresupuestariaFutura());
		convocatoria.setResuelvePago(vm.getResuelvePago());
		convocatoria.setResuelveJustificacion(vm.getResuelveJustificacion());
		
		
		return convocatoria;
	}

}
