package es.domingojunta.tools;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import es.domingojunta.model.ComunicacionEntradaViewModel;
import es.domingojunta.model.ConcesionNotificacionViewModel;
import es.domingojunta.model.ConcesionViewModel;
import es.domingojunta.model.RequerimientoConcesionViewModel;
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




	public JasperPrint generarReporteRequerimientoConcesion(RequerimientoConcesionViewModel reqvm) throws Exception {
		
		List<RequerimientoConcesionViewModel> collection = solicitudService.getRequerimientoConcesionViewModel(reqvm);
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

}
