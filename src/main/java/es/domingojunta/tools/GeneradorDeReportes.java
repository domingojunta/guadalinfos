package es.domingojunta.tools;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import es.domingojunta.model.CertificadosViewModel;
import es.domingojunta.model.ComunicacionEntradaViewModel;
import es.domingojunta.model.ConcesionNotificacionViewModel;
import es.domingojunta.model.ConcesionViewModel;
import es.domingojunta.model.LiquidacionRequerimientoViewModel;
import es.domingojunta.model.LiquidacionResolucionViewModel;
import es.domingojunta.model.ReintegroAcuerdoInicioViewModel;
import es.domingojunta.model.ReintegroResolucionViewModel;
import es.domingojunta.model.LiquidacionPropuestaViewModel;
import es.domingojunta.model.ConcesionRequerimientoViewModel;
import es.domingojunta.model.SolicitudListarViewModel;
import es.domingojunta.services.SolicitudService;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Component
public class GeneradorDeReportes {

	@Autowired
	private ResourceLoader resourceLoader;
	
	@Autowired
	private SolicitudService solicitudService;
	
	
	
	
	public JasperPrint generarReporteComunicacionEntrada(int id) throws Exception {
		
		List<ComunicacionEntradaViewModel> collection = solicitudService.getComunicacionEntradaViewModel(id);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ComunicacionEntrada.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReporteRequerimientoConcesion(ConcesionRequerimientoViewModel reqvm) throws Exception {
		
		List<ConcesionRequerimientoViewModel> collection = solicitudService.getRequerimientoConcesionViewModel(reqvm);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"RequerimientoConcesion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReportePropuestaConcesion(int id) throws Exception {
		
		List<ConcesionViewModel> collection = solicitudService.getConcesionViewModel(id);
		//System.out.println("El número de ConcesionViewModel traidos desde la BDR es de: "+collection.size());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"PropuestaResolucion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReporteResolucionConcesion(int id) throws Exception {
		
		List<ConcesionViewModel> collection = solicitudService.getConcesionViewModel(id);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ResolucionConcesion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReporteNotificacionResolucionConcesion(int id) throws Exception {
		List<ConcesionNotificacionViewModel> collection = solicitudService.getConcesionNotificacionViewModel(id);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ResolucionConcesionNotificacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReporteRequerimientoLiquidacion(LiquidacionRequerimientoViewModel reqvm) throws Exception {
		
		List<LiquidacionRequerimientoViewModel> collection = solicitudService.getRequerimientoLiquidacionViewModel(reqvm);
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"RequerimientoLiquidacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}




	public JasperPrint generarReportePropuestaLiquidacion(int id) throws Exception {
		
		
		List<LiquidacionPropuestaViewModel> collection = solicitudService.getLiquidacionViewModel(id);
		//System.out.println("El número de ConcesionViewModel traidos desde la BDR es de: "+collection.size());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"PropuestaLiquidacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		
		
		
		/*System.out.println("**********************************************************");
		System.out.println("Coste Personal Resolución: "+vm.getCostePersonal());
		System.out.println("Coste Dietas Resolución: "+vm.getCosteDietas());
		System.out.println("Coste Total: "+vm.getCoste());
		System.out.println("Porcentaje Financiación: "+vm.getGradoFinanciacion());
		System.out.println("===========================================================");
		System.out.println("**********************************************************");
		System.out.println("Coste Personal Ejecutable: "+vm.getCosteEjecutablePersonal());
		System.out.println("Coste Dietas Ejecutable: "+vm.getCosteEjecutableDietas());
		System.out.println("Coste Total Ejecutable: "+vm.getCosteEjecutableTotal());
		System.out.println("Porcentaje Minoración Temporal: "+vm.getGradoMinoracionTemporal());
		System.out.println("===========================================================");
		System.out.println("**********************************************************");
		System.out.println("Coste Personal Aceptado: "+vm.getImporteAceptadoPersonal());
		System.out.println("Coste Dietas Aceptado: "+vm.getImporteAceptadoDietas());
		System.out.println("Coste Total Aceptado: "+vm.getImporteAceptadoTotal());
		System.out.println("===========================================================");
		System.out.println("**********************************************************");
		System.out.println("Grado Cumplimiento Técnico: "+vm.getGradoCumplimientoTecnico());
		System.out.println("Grado Minoración Técnica: "+vm.getGradoMinoracionTecnica());
		System.out.println("===========================================================");
		System.out.println("**********************************************************");
		System.out.println("Importe provisional de subvención: "+vm.getImporteSubvencionProvisionalTotal());
		System.out.println("Importe por incumplimiento técnico: "+vm.getImporteMinoracionTecnica());
		System.out.println("Importe definitivo de la subvención: "+vm.getImporteSubvencionDefinitivoTotal());
		System.out.println("Importe del pago anticipado: "+vm.getImporteOJ());
		System.out.println("RESULTADO DE LA LIQUIDACIÓN = "+vm.getResultadoLiquidacion());
		System.out.println("PÉRDIDA DEL DERECHO AL COBRO = "+vm.getPerdidaDerechoAlCobro());
		System.out.println("===========================================================");
		System.out.println("El párrafo propuesta 02 es:");
		System.out.println(vm.getPropone02());
		System.out.println("--------------------");*/
		
		return jasperPrint;
		
	}

	public JasperPrint generarReportePropuestaLiquidacionDoc(int id) throws Exception{
		List<LiquidacionPropuestaViewModel> collection = solicitudService.getLiquidacionViewModel(id);
		//System.out.println("El número de ConcesionViewModel traidos desde la BDR es de: "+collection.size());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"PropuestaLiquidacionDoc.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		return jasperPrint;
	}
		
		public JasperPrint generarReporteResolucionLiquidacionPDF(int id) throws Exception {
		
		List<LiquidacionResolucionViewModel> collection = solicitudService.getLiquidacionResolucionViewModel(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ResolucionLiquidacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		
		
		return jasperPrint;
	}

	public JasperPrint generarReporteResolucionLiquidacionDoc(int id) throws Exception {
		List<LiquidacionResolucionViewModel> collection = solicitudService.getLiquidacionResolucionViewModel(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ResolucionLiquidacionDoc.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		
		
		return jasperPrint;
	}


	public JasperPrint generarReporteNotificacionResolucionLiquidacion(int id) throws Exception {

		List<LiquidacionResolucionViewModel> collection = solicitudService.getLiquidacionResolucionNotificacionViewModel(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ResolucionLiquidacionNotificacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		
		
		return jasperPrint;
	}




	public JasperPrint generarReporteCertificadoEmpleoSubvenciones(int id) throws Exception {

		
		List<CertificadosViewModel> collection = solicitudService.getCertificadosViewModel(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"CertificadosEmpleoSubvenciones.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}




	public JasperPrint generarReporteAcuerdoInicioReintegro(int id) throws Exception {

		List<ReintegroAcuerdoInicioViewModel> collection = solicitudService.getAcuerdoInicioReintegroViewModel(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ReintegroAcuerdoInicio.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}




	public JasperPrint generarReporteAcuerdoInicioReintegroNotificacion(int id) throws Exception {

		
		List<ReintegroAcuerdoInicioViewModel> collection = solicitudService.getAcuerdoInicioReintegroNotificacion(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ReintegroAcuerdoInicioNotificacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}




	public JasperPrint generarReporteReintegroResolucionNotificacion(int id) throws Exception {
		
		List<ReintegroResolucionViewModel> collection = solicitudService.getReintegroResolucionNotificacion(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ReintegroResolucionNotificacion.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}

	public JasperPrint generarReporteResolucionReintegroPDF(int id) throws Exception {
		
		List<ReintegroResolucionViewModel> collection = solicitudService.getReintegroResolucion(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ReintegroResolucionPDF.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}


	public JasperPrint generarReporteResolucionReintegroDoc(int id) throws Exception {
		
List<ReintegroResolucionViewModel> collection = solicitudService.getReintegroResolucion(id);
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(collection);
		
		String path = resourceLoader.getResource("classpath:"+File.separator+"jasperreport"+File.separator+"ReintegroResolucionDoc.jrxml").getURI().getPath();
		JasperReport jr = JasperCompileManager.compileReport(path);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<String,Object>(), dataSource);
		
		return jasperPrint;
	}




	




	




	

}
