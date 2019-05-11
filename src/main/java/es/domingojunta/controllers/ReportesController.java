package es.domingojunta.controllers;

import java.io.File;
import java.io.OutputStream;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import es.domingojunta.model.ConcesionRequerimientoViewModel;
import es.domingojunta.model.LiquidacionRequerimientoViewModel;
import es.domingojunta.model.SolicitudListarViewModel;
import es.domingojunta.tools.GeneradorDeReportes;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.export.Exporter;

@Controller
@CrossOrigin(origins="*")
@PreAuthorize("(hasAuthority('USUARIO') or hasAuthority('ADMINISTRADOR'))")
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
	public void generarRequerimientoConcesion(@RequestBody SolicitudListarViewModel viewModel, HttpServletResponse response) throws Exception {
		
		
		ConcesionRequerimientoViewModel reqvm = new ConcesionRequerimientoViewModel();
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
	
	@GetMapping("/reporte/requerimientoConcesion/{id}")
	public void generarRequerimientoConcesionEditable(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		//Generar doc.
		ConcesionRequerimientoViewModel reqvm = new ConcesionRequerimientoViewModel();
		reqvm.setIdSolicitud(id);
		reqvm.setDocumentacionRequerida("");
		response.setContentType("application/x-download");
		JasperPrint reporteRelleno = reporte.generarReporteRequerimientoConcesion(reqvm);
		OutputStream out = response.getOutputStream();
		//exportar ODT
        response.setHeader("Content-Disposition", "attachment; filename=\"fichero.rtf\"");
        //File file = new File("filename=\"fichero.rtf\"");
        
        JRRtfExporter exporter = new JRRtfExporter();
        
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
        exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, reporteRelleno);
        //exporter.setParameter(JRExporterParameter.OUTPUT_FILE, file);
        exporter.exportReport();
        
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

	
	@PutMapping("/reporte/requerimientoLiquidacion")
	public void generarRequerimientoLiquidacion(@RequestBody SolicitudListarViewModel viewModel, HttpServletResponse response) throws Exception {
		
		
		LiquidacionRequerimientoViewModel reqvm = new LiquidacionRequerimientoViewModel();
		reqvm.setIdSolicitud(viewModel.getIdSolicitud());
		reqvm.setDocumentacionRequerida(viewModel.getDocumentacionRequerida());
		response.setContentType("application/x-download");
		
		JasperPrint reporteRelleno = reporte.generarReporteRequerimientoLiquidacion(reqvm);
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		        
        out.flush();
		out.close();
		
	}
	
	
	@GetMapping("/reporte/requerimientoLiquidacion/{id}")
	public void generarRequerimientoLiquidacionEditable(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		LiquidacionRequerimientoViewModel reqvm = new LiquidacionRequerimientoViewModel();
		reqvm.setIdSolicitud(id);
		reqvm.setDocumentacionRequerida("");
		response.setContentType("application/x-download");
		JasperPrint reporteRelleno = reporte.generarReporteRequerimientoLiquidacion(reqvm);
		OutputStream out = response.getOutputStream();
		//exportar ODT
        response.setHeader("Content-Disposition", "attachment; filename=\"fichero.rtf\"");
        //File file = new File("filename=\"fichero.rtf\"");
        
        JRRtfExporter exporter = new JRRtfExporter();
        
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
        exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, reporteRelleno);
        //exporter.setParameter(JRExporterParameter.OUTPUT_FILE, file);
        exporter.exportReport();
        
        out.flush();
		out.close();
		
	}
	
	@GetMapping("/reporte/propuestaLiquidacion/{id}")
	public void generarPropuestaLiquidacion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReportePropuestaLiquidacion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/resolucionLiquidacionPDF/{id}")
	public void generarResolucionLiquidacionPDF(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteResolucionLiquidacionPDF(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/resolucionLiquidacionDoc/{id}")
	public void generarResolucionLiquidacionDoc(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteResolucionLiquidacionPDF(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.rtf\"")); 
		
		OutputStream out = response.getOutputStream();
		//JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		   
        JRRtfExporter exporter = new JRRtfExporter();
        
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
        exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, reporteRelleno);
        //exporter.setParameter(JRExporterParameter.OUTPUT_FILE, file);
        exporter.exportReport();
        
        out.flush();
		out.close();
		
		
	}
	
	@GetMapping("/reporte/notificacionResolucionLiquidacion/{id}")
	public void generarNotificacionResolucionLiquidacion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteNotificacionResolucionLiquidacion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/certificadosEmpleoSubvenciones/{id}")
	public void generarCertificadosEmpleoSubvenciones(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteCertificadoEmpleoSubvenciones(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/acuerdoInicioReintegro/{id}")
	public void generarAcuerdoInicioReintegro(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteAcuerdoInicioReintegro(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/acuerdoInicioReintegroNotificacion/{id}")
	public void generarAcuerdoInicioReintegroNotificacion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteAcuerdoInicioReintegroNotificacion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	
	
	@GetMapping("/reporte/notificacionResolucionReintegro/{id}")
	public void generarReintegroResolucionNotificacion(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteReintegroResolucionNotificacion(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/resolucionReintegroDoc/{id}")
	public void generarReintegroResolucionDoc(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteResolucionReintegroPDF(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.pdf\"")); 
		
		OutputStream out = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		out.flush();
		out.close();
		
		
		
	}
	
	@GetMapping("/reporte/resolucionReintegroPDF/{id}")
	public void generarResolucionReintegroPDF(@PathVariable("id") int id, HttpServletResponse response) throws Exception {
		
		
		response.setContentType("application/x-download");
		//System.out.println("El id introducido para el reporte es:"+id);
		JasperPrint reporteRelleno = reporte.generarReporteResolucionReintegroDoc(id);
		
		response.setHeader("Content-Disposition", String.format("attachment; filename=\"fichero.rtf\"")); 
		
		OutputStream out = response.getOutputStream();
		//JasperExportManager.exportReportToPdfStream(reporteRelleno,out);
		   
        JRRtfExporter exporter = new JRRtfExporter();
        
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, out);
        exporter.setParameter(JRExporterParameter.CHARACTER_ENCODING, "UTF-8");
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, reporteRelleno);
        //exporter.setParameter(JRExporterParameter.OUTPUT_FILE, file);
        exporter.exportReport();
        
        out.flush();
		out.close();
		
		
	}
	
	
}
