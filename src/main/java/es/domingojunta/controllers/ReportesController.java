package es.domingojunta.controllers;

import java.io.OutputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import es.domingojunta.model.RequerimientoConcesionViewModel;
import es.domingojunta.model.SolicitudListarViewModel;
import es.domingojunta.tools.GeneradorDeReportes;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@Controller
@CrossOrigin(origins="*")
public class ReportesController {
	
	@Autowired
	private GeneradorDeReportes reporte;
	
	@GetMapping("/reporte/comunicacionEntrada/{id}")
	public void generarComunicacionEntrada(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		response.setContentType("application/x-download");
		
		JasperPrint reporteRelleno = reporte.generarReporteComunicacionEntrada(id);
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
	}
	
	@PutMapping("/reporte/requerimientoConcesion")
	public void generarComunicacionEntrada(@RequestBody SolicitudListarViewModel viewModel, HttpServletResponse response) throws Exception {
		
		
		RequerimientoConcesionViewModel reqvm = new RequerimientoConcesionViewModel();
		reqvm.setIdSolicitud(viewModel.getIdSolicitud());
		reqvm.setDocumentacionRequerida(viewModel.getDocumentacionRequerida());
		response.setContentType("application/x-download");
		
		JasperPrint reporteRelleno = reporte.generarReporteRequerimientoConcesion(reqvm);
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
	}
	
	@GetMapping("/reporte/propuestaConcesion/{id}")
	public void generarPropuestaConcesion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		response.setContentType("application/x-download");System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReportePropuestaConcesion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
	}
	
	@GetMapping("/reporte/resolucionConcesion/{id}")
	public void generarResolucionConcesion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		response.setContentType("application/x-download");System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteResolucionConcesion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
	}
	
	@GetMapping("/reporte/resolucionConcesionNotificacion/{id}")
	public void generarResolucionConcesionNotificacion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		response.setContentType("application/x-download");
		
		JasperPrint reporteRelleno = reporte.generarReporteNotificacionResolucionConcesion(id);
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
	}

}
