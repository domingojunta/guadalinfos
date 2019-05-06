package es.domingojunta.model;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;


public class LiquidacionPropuestaViewModel {
		
	private int idSolicitud;
	private String yearConvocatoria;
	private String expediente;
	private String fechaEntrada;
	private BigDecimal costePersonal;
	private BigDecimal costeDietas;
	private BigDecimal subvencionPersonal;
	private BigDecimal subvencionDietas;
	private String fechaResolucionConcesion;
	private BigDecimal importeOJ;
	private String fechaPagoMaterialOJ;
	private int objetivoNumeroActividades;
	private int objetivoNumeroActividadesMarcadas;
	private int objetivoNumeroMeses;
	private int numeroActividadesAlcanzado;
	private int numeroActividadesMarcadasAlcanzado;
	private int numeroMesesAlcanzado;
	private BigDecimal gradoCumplimientoTecnico;
	private BigDecimal importeJustificadoPersonal;
	private BigDecimal importeJustificadoDietas;
	private BigDecimal importeAceptadoPersonal;
	private BigDecimal importeAceptadoDietas;
	
	
		
	private int idEntidad;
	private String nombreEntidad;
	private String grupoEntidad;
	private String cif;
	private String tipoEntidad;
	private String direccion;
	private String codigoPostal;
	private String municipio;
	private String provincia;
	
	private int idOrden;
	private String nombreOrden;
	
	private int idConvocatoria;
	private String nombreConvocatoria;
	
	private String aplicacionPresupuestariaCorriente;
	private String aplicacionPresupuestariaFutura;
	private String fechaInicio;
	private String fechaFin;
	private int numeroDiasYear;
	private int numeroDiasCerrado;
	
	private String parrafoNotificacion;
	private String parrafoInformacion;
	private String parrafoNormativa;
	private String parrafoDatosSubvencion;
	private String parrafoVista;
	private String antecedente01;
	private String antecedente02;
	private String antecedente03;
	private String antecedente04Minoracion;
	private String antecedente04RevisionEconomica;
	private String antecedente04RevisionTecnica;
	private String antecedente06;
	private String propone01;
	private String propone02;
	private String parrafoAnexo;
	private BigDecimal costeResolucionConcesion;
	private BigDecimal subvencionResolucionConcesion;
	private BigDecimal gradoFinanciacion;
	private BigDecimal financiacionPropia;
	
	private BigDecimal gradoMinoracionTemporal;
	private BigDecimal costeEjecutablePersonal;
	private BigDecimal costeEjecutableDietas;
	private BigDecimal costeEjecutableTotal;
	private BigDecimal subvencionEjecutableTotal;
	private BigDecimal financiacionPropiaEjecutable;
	
	//private BigDecimal gradoMinoracionEconomica;
	private BigDecimal importeAceptadoTotal;
	private BigDecimal importeSubvencionProvisionalPersonal;
	private BigDecimal importeSubvencionProvisionalDietas;
	private BigDecimal importeSubvencionProvisionalTotal;
	
	private BigDecimal gradoMinoracionTecnica;
	private BigDecimal importeMinoracionTecnica;
	private BigDecimal importeSubvencionDefinitivoDietas;
	private BigDecimal importeSubvencionDefinitivoPersonal;
	private BigDecimal importeSubvencionDefinitivoTotal;
	private BigDecimal resultadoLiquidacion;
	private BigDecimal perdidaDerechoAlCobro;
	
	
	
	public LiquidacionPropuestaViewModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void setCoste() {
		this.costeResolucionConcesion = getCostePersonal().add(getCosteDietas());
	}
	
	public void setSubvencion() {
		this.subvencionResolucionConcesion = getSubvencionPersonal().add(getSubvencionDietas());
	}
	
	public void setGradoFinanciacion() {
		BigDecimal cien = new BigDecimal(100);
		BigDecimal numerador = getSubvencionResolucionConcesion().multiply(cien);
		BigDecimal porcentaje = numerador.divide(getCoste(),10, RoundingMode.HALF_UP);
		
		
		this.gradoFinanciacion = porcentaje;	
	}
	
	public void setFinanciacionPropia() {
		this.financiacionPropia = getCoste().subtract(getSubvencion());
	}
	
	

	public String getParrafoNotificacion() {
		return parrafoNotificacion;
	}


	public void setParrafoNotificacion(String parrafoNotificacion) {
		this.parrafoNotificacion = parrafoNotificacion;
	}


	public String getParrafoInformacion() {
		return parrafoInformacion;
	}


	public void setParrafoInformacion(String parrafoInformacion) {
		this.parrafoInformacion = parrafoInformacion;
	}


	public String getParrafoNormativa() {
		return parrafoNormativa;
	}


	public void setParrafoNormativa(String parrafoNormativa) {
		this.parrafoNormativa = parrafoNormativa;
	}


public void setParrafoNotificacion() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getTipoEntidad().toUpperCase());
		sb.append(" DE ");
		sb.append(getNombreEntidad().toUpperCase());
		sb.append("\n");
		sb.append(getDireccion());
		sb.append("\n");
		sb.append(getCodigoPostal());
		sb.append(" ");
		sb.append(getNombreEntidad());
		sb.append(" ");
		sb.append(getProvincia());
		this.parrafoNotificacion = sb.toString();
		
	}
	
	public void setParrafoInformacion() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("N/Ref: Desarrollo Tecnológico DO/al");
		sb.append("\n");
		sb.append("Fecha: La de la firma");
		sb.append("\n");
		sb.append("Asunto: Propuesta Resolución de Liquidación");
		sb.append("\n");
		sb.append("Expediente: ");
		sb.append(getExpediente());
		sb.append(" / ");
		sb.append(getYearConvocatoria());
		
		this.parrafoInformacion = sb.toString();
		
		
	}
	
	public void setParrafoNormativa() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Adjunto se remite Propuesta de Resolución de Liquidación de la subvención concedida en el marco de la ");
		sb.append(getNombreOrden());
		sb.append(", una subvención en régimen de concurrencia no competitiva, al amparo de la ");
		sb.append(getNombreConvocatoria());
		sb.append(".");
		
		this.parrafoNormativa= sb.toString();
		
	}
	public void setParrafoDatosSubvencion() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getTipoEntidad().toUpperCase()+": "+getNombreEntidad());
		sb.append("\n");
		sb.append("CIF: "+getCif());
		sb.append("\n");
		sb.append("DOMICILIO: "+getDireccion());
		sb.append("\n");
		sb.append("EXPEDIENTE: "+getExpediente()+" / "+getYearConvocatoria());
		sb.append("\n");
		sb.append("GRUPO: "+getGrupoEntidad());
		sb.append("\n");
		sb.append("PARTIDAS PRESUPUESTARIAS:");
		sb.append("\n");
		sb.append(getAplicacionPresupuestariaCorriente());
		sb.append("\n");
		sb.append(getAplicacionPresupuestariaFutura());
		sb.append("\n");
		sb.append("PRESUPUESTO APROBADO: "+ formatCurrency(getCoste())+" €.");
		sb.append("\n");
		sb.append("CUANTÍA DE LA SUBVENCIÓN: "+formatCurrency(getSubvencion())+" €.");
		sb.append("\n");
		sb.append("FINANCIACIÓN DEL PROYECTO POR LA JUNTA DE ANDALUCÍA: "+ getGradoFinanciacion()+" %.");
				
		this.parrafoDatosSubvencion = sb.toString();
		
	}
	
		public void setParrafoVista() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Visto el expediente arriba indicado en el marco de la ");
		sb.append(getNombreOrden());
		sb.append(", al amparo de la ");
		sb.append(getNombreConvocatoria());
		sb.append(" y en base a los siguientes: ");
				
		this.parrafoVista = sb.toString();
		
	}
		
		public void setAntecedente01() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("Primero.- Con fecha ");
			sb.append(formatDate(getFechaEntrada()));
			sb.append(" tiene entrada en el Registro de este Órgano, la solicitud presentada por el/la ");
			sb.append(getTipoEntidad().toUpperCase());
			sb.append(" DE ");
			sb.append(getNombreEntidad().toUpperCase());
			sb.append(" con número de expediente: ");
			sb.append(getExpediente()+" / "+getYearConvocatoria());
			sb.append(", solicitando la concesión de una subvención para la Dinamización de un Centro de Acceso ");
			sb.append("Público a Internet en la localidad cordobesa de ");
			sb.append(getNombreEntidad());
			sb.append(".");
					
			this.antecedente01 = sb.toString();
		}
		
		public void setAntecedente02() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("Segundo.- Con fecha ");
			sb.append(formatDate(getFechaResolucionConcesion()));
			sb.append(" se emite resolución de concesión del Delegado Territorial en Córdoba, por la que se aprueba un presupuesto de ");
			sb.append(formatCurrency(getCoste()));
			sb.append(" y se concede una subvención por importe de ");
			sb.append(formatCurrency(getSubvencion()));
			sb.append(", lo que supone un porcentaje de financiación de ");
			sb.append(getGradoFinanciacion());
			sb.append(" %.");
					
			this.antecedente02 = sb.toString();
		}
		
		public void setAntecedente03() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("Tercero.- Con fecha ");
			sb.append(formatDate(getFechaPagoMaterialOJ()));
			sb.append(" se procede a hacer efectivo el primer pago, ");
			sb.append(formatCurrency(getImporteOJ()));
			sb.append(" €, correspondientes al 75% del importe total de la subvención concedida conforme a lo establecido en la ");
			sb.append("Resolución de convocatoria.");
								
			this.antecedente03 = sb.toString();
		}
		
		public void setAntecedente04Minoracion() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("1.- Minoración.- Resultado de la revisión del periodo efectivo de actividad y del período previsto en la concesión. ");
			sb.append("De los ");
			sb.append(getNumeroDiasYear());
			sb.append(" días de ejecución del proyecto subvencionado (desde el 1 de enero hasta el 31 de diciembre), la entidad no ha ejecutado: ");
			sb.append(getNumeroDiasCerrado());
			sb.append(" días, lo que supone un porcentaje ejecutado del: ");
			sb.append(getGradoMinoracionTemporal());
			sb.append(" %. De la multiplicación del presupuesto aceptado en la Resolución por el porcentaje ejectuable, obtenemos el ");
			sb.append("Presupuesto ejecutable del proyecto, que en el supuesto ser inferior al 100%, supondrá una minoración de la cantidad ");
			sb.append("inicialmente aprobada.");
			sb.append("\n");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("PARTIDA                                           P.ACEPTADO     P.EJECUTABLE ");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("Gastos de Personal:                             ");
			sb.append(formatCurrency(getCostePersonal()));
			sb.append("            "+formatCurrency(getCosteEjecutablePersonal()));
			sb.append("\n");
			sb.append("Gastos de dietas y desplazamientos:        ");
			sb.append(formatCurrency(getCosteDietas()));
			sb.append("                "+formatCurrency(getCosteEjecutableDietas()));
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("\n");
			sb.append("Presupuesto total del proyecto previsto en la Resolución Concesión: ");
			sb.append(formatCurrency(getCoste()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Presupuesto total ejecutable: ");
			sb.append(formatCurrency(getCosteEjecutableTotal()));
			sb.append(" €.");
			
								
			this.antecedente04Minoracion = sb.toString();
		}
		
		public void setAntecedente04RevisionEconomica() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("2.- Resultado de la Revisión Económica");
			sb.append("\n");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("PARTIDA                                           P.EJECUTABLE   JUST.ACEPT. ");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("Gastos de Personal:                             ");
			sb.append(formatCurrency(getCosteEjecutablePersonal()));
			sb.append("            "+formatCurrency(getImporteAceptadoPersonal()));
			sb.append("\n");
			sb.append("Gastos de dietas y desplazamientos:        ");
			sb.append(formatCurrency(getCosteEjecutableDietas()));
			sb.append("                "+formatCurrency(getImporteAceptadoDietas()));
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("\n");
			sb.append("Presupuesto total ejecutable: ");
			sb.append(formatCurrency(getCosteEjecutableTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Justificación total aceptada: ");
			sb.append(formatCurrency(getImporteAceptadoTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("\n");
			sb.append("(1) Importe del proyecto que se considera correctamente justificado tras la revisión ");
			sb.append("de los justificantes previstos en el artículo 25 de la Orden, por parte del Servicio de ");
			sb.append("Cooperación Económica y Desarrollo Tecnológico de la Delegación Territorial.");
			
								
			this.antecedente04RevisionEconomica = sb.toString();
		}
		
		public void setAntecedente04RevisionTecnica() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("3.- Resultado de la Revisión Técnica");
			sb.append("\n");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("PARTIDA                                                    OBJETIVO     ALCANZADO ");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("Número de actividades:                                    ");
			sb.append(getObjetivoNumeroActividades());
			sb.append("             "+getNumeroActividadesAlcanzado());
			sb.append("\n");
			sb.append("Número actividades marcadas por el CFR        ");
			sb.append(getObjetivoNumeroActividadesMarcadas());
			sb.append("                "+getNumeroActividadesMarcadasAlcanzado());
			sb.append("\n");
			sb.append("Número de meses con actividades mínimas     ");
			sb.append(getObjetivoNumeroMeses());
			sb.append("                "+getNumeroMesesAlcanzado());
			sb.append("\n");
			sb.append("\n");
			sb.append("El grado de cumplimiento de objetivos es del: ");
			sb.append(getGradoCumplimientoTecnico());
			sb.append(" %.");
			sb.append("\n");
			sb.append("Se adjunta Informe Técnico emitido por la Entidad Colaboradora (CFR) a la presente propuesta ");
						
								
			this.antecedente04RevisionTecnica = sb.toString();
		}
		
		public void setAntecedente06() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("Sexto.- De la aplicación de los anteriores criterios de revisión, se obtiene la siguiente liquidación:");
			sb.append("\n");
			sb.append("\n");
			sb.append("(1) Importe provisional de la subvención: ");
			sb.append(formatCurrency(getImporteSubvencionProvisionalTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("(2) Importe minoración por incumplimiento de objetivos: ");
			sb.append(formatCurrency(getImporteMinoracionTecnica()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("(3) Importe definitivo de la subvención: ");
			sb.append(formatCurrency(getImporteSubvencionDefinitivoTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("(4) Importe del pago anticipado: ");
			sb.append(formatCurrency(getImporteOJ()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("==================================================================");
			sb.append("\n");
			sb.append("(5) RESULTADO DE LA LIQUIDACIÓN: ");
			sb.append(formatCurrency(getResultadoLiquidacion()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("\n");
			sb.append("(1) El importe provisional de la subvención se obtiene de aplicar al importe reflejado en la columna ");
			sb.append("Justificación Aceptada, el porcentaje de financiación del proyecto establecido en la subvención.");
			sb.append("\n");
			sb.append("(2) El importe de la minoración por incumplimiento de los objetivos establecidos en el plan de trabajo ");
			sb.append("firmado con la Entidad Colaboradora (CFR) será la resultante de aplicar sobre el importe provisional de la ");
			sb.append(" subvención (1), el porcentaje a reintegrar previsto en el artículo 26.4 de la Orden");
			sb.append("\n");
			sb.append("(3) El importe definitivo de la subvención será el resultante de restar al importe provisional de la subvención (1), ");
			sb.append("la minoración por incumplimiento de los objetivos técnicos (2).");
			sb.append("\n");
			sb.append("(5) El resultado de la liquidación se obtiene de la diferencia ente el importe definitivo de la subvención (3) ");
			sb.append("y el importe del pago anticipado (4). Un importe negativo indica que no sólo no corresponde un segundo pago de ");
			sb.append("la subvención, sino que deberá de iniciarse el correspondiente procedimiento de reintegro de cantidades indebidamente ");
			sb.append("percibidas.");
			
								
			this.antecedente06 = sb.toString();
		}
		
		
		
		public void setPropone01() throws ParseException {
			StringBuilder sb = new StringBuilder();
			sb.append("PRIMERO.- Declarar el ");
			
			sb.append(getTipoCumplimiento().toUpperCase());
			sb.append(" de la actividad que fundamenta la concesión de la subvención.");
					
			this.propone01 = sb.toString();
		}
		
		public String getTipoCumplimiento() {
			String tipo = "CUMPLIMIENTO";
			
			if (getResultadoLiquidacion().floatValue()<= 0) {
				
				tipo = "INCUMPLIMIENTO";
			} else if (getPerdidaDerechoAlCobro().floatValue()>0) {
				tipo= "CUMPLIMIENTO PARCIAL";
			}
			
			return tipo;
		}
		
		public void setPropone02() throws Exception {
			StringBuilder sb = new StringBuilder();
			
			if (this.perdidaDerechoAlCobro.intValue()==0) {
				
				sb.append("SEGUNDO.- Procede un segundo pago por importe de ");
				sb.append(formatCurrency(getResultadoLiquidacion()));
				sb.append(" €, lo que implica una minoración del pago sobre el inicialmente previsto de ");
				sb.append(formatCurrency(getPerdidaDerechoAlCobro()));
				sb.append("€.");
				sb.append("\n\nTERCERO.- Conceder a la entidad beneficiaria un plazo de QUINCE DÍAS para formular las alegaciones ");
				sb.append("y aportar cuantos documentos y justificaciones estime convenientes, de conformidad con el artículo 82.2 ");
				sb.append("de la Ley 39/2015, de 1 de octubre, del Procedimiento Administrativo Común de las Administraciones Públicas.");
				
			} else if (this.gradoMinoracionTemporal.floatValue()==100 && this.resultadoLiquidacion.floatValue()>=0) {
				
				sb.append("SEGUNDO.- Acordar la pérdida del derecho al cobro parcial de la subvención ");
				sb.append("por incumplimiento en la justificación derivada de la liquidación efectuada: Procede un segundo pago por ");
				sb.append("importe de ");
				sb.append(formatCurrency(getResultadoLiquidacion()));
				sb.append(" euros, lo que implica una minoración del pago sobre el inicialmente previsto de ");
				sb.append(formatCurrency(getPerdidaDerechoAlCobro()));
				sb.append(" euros.");
				sb.append("\n\n");
				sb.append("TERCERO.- Conceder a la entidad beneficiaria un plazo de QUINCE DÍAS para formular las alegaciones ");
				sb.append("y aportar cuantos documentos y justificaciones estime convenientes, de conformidad con el artículo 82.2 ");
				sb.append("de la Ley 39/2015, de 1 de octubre, del Procedimiento Administrativo Común de las Administraciones Públicas.");
			
			} else if (this.gradoMinoracionTemporal.floatValue()==100 && this.resultadoLiquidacion.floatValue()<0) {
				
				sb.append("SEGUNDO.- Acordar la pérdida del derecho al cobro parcial de la subvención ");
				sb.append("por incumplimiento en la justificación derivada de la liquidación efectuada: No procede un segundo pago por ");
				sb.append("importe de ");
				sb.append(formatCurrency(getPerdidaDerechoAlCobro()));
				sb.append(" euros.");
				sb.append("\n\n");
				sb.append("TERCERO.- Conceder a la entidad beneficiaria un plazo de QUINCE DÍAS para formular las alegaciones ");
				sb.append("y aportar cuantos documentos y justificaciones estime convenientes, de conformidad con el artículo 82.2 ");
				sb.append("de la Ley 39/2015, de 1 de octubre, del Procedimiento Administrativo Común de las Administraciones Públicas.");
			
			} else if (this.gradoMinoracionTemporal.floatValue()<100 && this.resultadoLiquidacion.floatValue()>=0) {
				
				sb.append("SEGUNDO.- Minorar la subvención concedida en base a que el periodo ejectuable es inferior al periodo previsto ");
				sb.append("en la resolución de concesión, resultando un nuevo importe de subvención: de ");
				sb.append(formatCurrency(getSubvencionEjecutableTotal()));
				sb.append(" euros, toda vez que la subvención originalmente concedida se reduce por este motivo, hasta alcanzar el ");
				sb.append(getGradoMinoracionTemporal());
				sb.append(" % del importe inicial. ");
				sb.append("En el anexo se detalla el nuevo presupuesto para la entidad.");
				sb.append("\n\n");
				sb.append("TERCERO.- Acordar la pérdida del derecho al cobro parcial de la subvención ");
				sb.append("por incumplimiento en la justificación derivada de la liquidación efectuada: Procede un segundo pago por ");
				sb.append("importe de ");
				sb.append(formatCurrency(getResultadoLiquidacion()));
				sb.append(" euros, lo que implica una minoración del pago sobre el inicialmente previsto de ");
				sb.append(formatCurrency(getPerdidaDerechoAlCobro()));
				sb.append(" euros.");
				sb.append("\n\n");
				sb.append("CUARTO.- Conceder a la entidad beneficiaria un plazo de QUINCE DÍAS para formular las alegaciones ");
				sb.append("y aportar cuantos documentos y justificaciones estime convenientes, de conformidad con el artículo 82.2 ");
				sb.append("de la Ley 39/2015, de 1 de octubre, del Procedimiento Administrativo Común de las Administraciones Públicas.");
			
			} else if (this.gradoMinoracionTemporal.floatValue()<100 && this.resultadoLiquidacion.floatValue()<0) {
				
				sb.append("SEGUNDO.- Minorar la subvención concedida en base a que el periodo ejectuable es inferior al periodo previsto ");
				sb.append("en la resolución de concesión, resultando un nuevo importe de subvención: de ");
				sb.append(formatCurrency(getSubvencionEjecutableTotal()));
				sb.append(" euros, toda vez que la subvención originalmente concedida se reduce por este motivo, hasta alcanzar el ");
				sb.append(getGradoMinoracionTemporal());
				sb.append(" % del importe inicial. ");
				sb.append("En el anexo se detalla el nuevo presupuesto para la entidad.");
				sb.append("\n\n");
				sb.append("TERCERO.- Acordar la pérdida del derecho al cobro parcial de la subvención ");
				sb.append("por incumplimiento en la justificación derivada de la liquidación efectuada: No procede un segundo pago por ");
				sb.append("importe de ");
				sb.append(formatCurrency(getPerdidaDerechoAlCobro()));
				sb.append(" euros.");
				sb.append("\n\n");
				sb.append("CUARTO.- Conceder a la entidad beneficiaria un plazo de QUINCE DÍAS para formular las alegaciones ");
				sb.append("y aportar cuantos documentos y justificaciones estime convenientes, de conformidad con el artículo 82.2 ");
				sb.append("de la Ley 39/2015, de 1 de octubre, del Procedimiento Administrativo Común de las Administraciones Públicas.");
			
			} 
			
					
			this.propone02 = sb.toString();
		}
		
		public void setParrafoAnexo() throws Exception {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("PRESUPUESTO ACEPTADO PARA LA DINAMIZACIÓN DEL CENTRO DE ACCESO PÚBLICO A INTERNET EN EL/LA ");
			sb.append(getTipoEntidad().toUpperCase());
			sb.append(" DE ");
			sb.append(getNombreEntidad().toUpperCase());
			sb.append(" (CÓRDOBA).");
			sb.append("\n");
			sb.append("\n");
			
			if (getGradoMinoracionTemporal().floatValue()==100) {
				
				sb.append("El presupuesto coincide con el previsto en la Resolución de Concesión, al cual nos remitimos.");
				
			} else {
			
			sb.append("======================================================");
			sb.append("\n");
			sb.append("                    PARTIDA                           IMPORTE");
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("Gastos de Personal:                               ");
			sb.append(formatCurrency(getCosteEjecutablePersonal()));
			sb.append("\n");
			sb.append("Gastos de dietas y desplazamientos:        ");
			sb.append(formatCurrency(getCosteEjecutableDietas()));
			sb.append("\n");
			sb.append("======================================================");
			sb.append("\n");
			sb.append("\n");
			sb.append("Presupuesto total del proyecto: ");
			sb.append(formatCurrency(getCosteEjecutableTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Subvención total aprobada:       ");
			sb.append(formatCurrency(getSubvencionEjecutableTotal()));
			sb.append(" €.");
			sb.append("\n");
			sb.append("Financiación propia total(1):       ");
			sb.append(formatCurrency(getFinanciacionPropiaEjecutable()));
			sb.append(" €.");
			sb.append("\n\n");
			sb.append("(1) Incluye la aportación de fondos propios de la entidad solicitante junto con las ");
			sb.append("posibles subvenciones de otras entidades que puedan aplicarse concurrentemente a la que se propone.");
			
			}
			
			this.parrafoAnexo = sb.toString();
		}



	public int getIdSolicitud() {
		return idSolicitud;
	}



	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}



	public String getYearConvocatoria() {
		return yearConvocatoria;
	}



	public void setYearConvocatoria(String yearConvocatoria) {
		this.yearConvocatoria = yearConvocatoria;
	}

	

	public String getCif() {
		return cif;
	}



	public void setCif(String cif) {
		this.cif = cif;
	}



	public String getExpediente() {
		return expediente;
	}



	public void setExpediente(String expediente) {
		this.expediente = expediente;
	}

	


	public String getAplicacionPresupuestariaCorriente() {
		return aplicacionPresupuestariaCorriente;
	}



	public void setAplicacionPresupuestariaCorriente(String aplicacionPresupuestariaCorriente) {
		this.aplicacionPresupuestariaCorriente = aplicacionPresupuestariaCorriente;
	}



	public String getAplicacionPresupuestariaFutura() {
		return aplicacionPresupuestariaFutura;
	}



	public void setAplicacionPresupuestariaFutura(String aplicacionPresupuestariaFutura) {
		this.aplicacionPresupuestariaFutura = aplicacionPresupuestariaFutura;
	}



	public String getGrupoEntidad() {
		return grupoEntidad;
	}



	public void setGrupoEntidad(String grupoEntidad) {
		this.grupoEntidad = grupoEntidad;
	}



	public String getFechaEntrada() {
		return fechaEntrada;
	}



	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}



	public int getIdEntidad() {
		return idEntidad;
	}



	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}



	public String getNombreEntidad() {
		return nombreEntidad;
	}



	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}



	public String getTipoEntidad() {
		return tipoEntidad;
	}



	public void setTipoEntidad(String tipoEntidad) {
		this.tipoEntidad = tipoEntidad;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String getCodigoPostal() {
		return codigoPostal;
	}



	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}



	public String getMunicipio() {
		return municipio;
	}



	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}



	public String getProvincia() {
		return provincia;
	}



	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}



	public int getIdOrden() {
		return idOrden;
	}



	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}



	public String getNombreOrden() {
		return nombreOrden;
	}



	public void setNombreOrden(String nombreOrden) {
		this.nombreOrden = nombreOrden;
	}



	public int getIdConvocatoria() {
		return idConvocatoria;
	}



	public void setIdConvocatoria(int idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}



	public String getNombreConvocatoria() {
		return nombreConvocatoria;
	}



	public void setNombreConvocatoria(String nombreConvocatoria) {
		this.nombreConvocatoria = nombreConvocatoria;
	}



	

	
	public String getParrafoDatosSubvencion() {
		return parrafoDatosSubvencion;
	}



	public void setParrafoDatosSubvencion(String parrafoDatosSubvencion) {
		this.parrafoDatosSubvencion = parrafoDatosSubvencion;
	}



	public String getParrafoVista() {
		return parrafoVista;
	}



	public void setParrafoVista(String parrafoVista) {
		this.parrafoVista = parrafoVista;
	}



	public String getAntecedente01() {
		return antecedente01;
	}



	public void setAntecedente01(String antecedente01) {
		this.antecedente01 = antecedente01;
	}



	public String getPropone01() {
		return propone01;
	}



	public void setPropone01(String propone01) {
		this.propone01 = propone01;
	}



	public String getPropone02() {
		return propone02;
	}



	public void setPropone02(String propone02) {
		this.propone02 = propone02;
	}



	public String getParrafoAnexo() {
		return parrafoAnexo;
	}



	public void setParrafoAnexo(String texto) {
		this.parrafoAnexo = texto;
	}


	public BigDecimal getCostePersonal() {
		return costePersonal;
	}


	public void setCostePersonal(BigDecimal costePersonal) {
		this.costePersonal = costePersonal;
	}


	public BigDecimal getCosteDietas() {
		return costeDietas;
	}


	public void setCosteDietas(BigDecimal costeDietas) {
		this.costeDietas = costeDietas;
	}


	public BigDecimal getSubvencionPersonal() {
		return subvencionPersonal;
	}


	public void setSubvencionPersonal(BigDecimal subvencionPersonal) {
		this.subvencionPersonal = subvencionPersonal;
	}


	public BigDecimal getSubvencionDietas() {
		return subvencionDietas;
	}


	public void setSubvencionDietas(BigDecimal subvencionDietas) {
		this.subvencionDietas = subvencionDietas;
	}


	public BigDecimal getCoste() {
		return costeResolucionConcesion;
	}


	public void setCoste(BigDecimal coste) {
		this.costeResolucionConcesion = coste;
	}


	public BigDecimal getSubvencion() {
		return subvencionResolucionConcesion;
	}


	public void setSubvencion(BigDecimal subvencion) {
		this.subvencionResolucionConcesion = subvencion;
	}
	
	
	

	public String getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}


	public String getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	

	public BigDecimal getFinanciacionPropia() {
		return financiacionPropia;
	}


	public void setFinanciacionPropia(BigDecimal financiacionPropia) {
		this.financiacionPropia = financiacionPropia;
	}
	
	

	
	
	public BigDecimal getCosteResolucionConcesion() {
		return costeResolucionConcesion;
	}


	public void setCosteResolucionConcesion(BigDecimal costeResolucionConcesion) {
		this.costeResolucionConcesion = costeResolucionConcesion;
	}


	public BigDecimal getSubvencionResolucionConcesion() {
		return subvencionResolucionConcesion;
	}


	public void setSubvencionResolucionConcesion(BigDecimal subvencionResolucionConcesion) {
		this.subvencionResolucionConcesion = subvencionResolucionConcesion;
	}


	public BigDecimal getGradoFinanciacion() {
		return gradoFinanciacion;
	}


	public void setGradoFinanciacion(BigDecimal gradoFinanciacion) {
		this.gradoFinanciacion = gradoFinanciacion;
	}

	
	

	public BigDecimal getImporteOJ() {
		return importeOJ;
	}


	public void setImporteOJ(BigDecimal importeOJ) {
		this.importeOJ = importeOJ;
	}


	public String getFechaPagoMaterialOJ() {
		return fechaPagoMaterialOJ;
	}


	public void setFechaPagoMaterialOJ(String fechaPagoMaterialOJ) {
		this.fechaPagoMaterialOJ = fechaPagoMaterialOJ;
	}


	public int getObjetivoNumeroActividades() {
		return objetivoNumeroActividades;
	}


	public void setObjetivoNumeroActividades(int objetivoNumeroActividades) {
		this.objetivoNumeroActividades = objetivoNumeroActividades;
	}


	public int getObjetivoNumeroActividadesMarcadas() {
		return objetivoNumeroActividadesMarcadas;
	}


	public void setObjetivoNumeroActividadesMarcadas(int objetivoNumeroActividadesMarcadas) {
		this.objetivoNumeroActividadesMarcadas = objetivoNumeroActividadesMarcadas;
	}


	public int getObjetivoNumeroMeses() {
		return objetivoNumeroMeses;
	}


	public void setObjetivoNumeroMeses(int objetivoNumeroMeses) {
		this.objetivoNumeroMeses = objetivoNumeroMeses;
	}


	public int getNumeroActividadesAlcanzado() {
		return numeroActividadesAlcanzado;
	}


	public void setNumeroActividadesAlcanzado(int numeroActividadesAlcanzado) {
		this.numeroActividadesAlcanzado = numeroActividadesAlcanzado;
	}


	public int getNumeroActividadesMarcadasAlcanzado() {
		return numeroActividadesMarcadasAlcanzado;
	}


	public void setNumeroActividadesMarcadasAlcanzado(int numeroActividadesMarcadasAlcanzado) {
		this.numeroActividadesMarcadasAlcanzado = numeroActividadesMarcadasAlcanzado;
	}


	public int getNumeroMesesAlcanzado() {
		return numeroMesesAlcanzado;
	}


	public void setNumeroMesesAlcanzado(int numeroMesesAlcanzado) {
		this.numeroMesesAlcanzado = numeroMesesAlcanzado;
	}


	public BigDecimal getGradoCumplimientoTecnico() {
		return gradoCumplimientoTecnico;
	}


	public void setGradoCumplimientoTecnico(BigDecimal gradoCumplimientoTecnico) {
		this.gradoCumplimientoTecnico = gradoCumplimientoTecnico;
	}


	public BigDecimal getImporteJustificadoPersonal() {
		return importeJustificadoPersonal;
	}


	public void setImporteJustificadoPersonal(BigDecimal importeJustificadoPersonal) {
		this.importeJustificadoPersonal = importeJustificadoPersonal;
	}


	public BigDecimal getImporteJustificadoDietas() {
		return importeJustificadoDietas;
	}


	public void setImporteJustificadoDietas(BigDecimal importeJustificadoDietas) {
		this.importeJustificadoDietas = importeJustificadoDietas;
	}


	public BigDecimal getImporteAceptadoPersonal() {
		return importeAceptadoPersonal;
	}


	public void setImporteAceptadoPersonal(BigDecimal importeAceptadoPersonal) {
		this.importeAceptadoPersonal = importeAceptadoPersonal;
	}


	public BigDecimal getImporteAceptadoDietas() {
		return importeAceptadoDietas;
	}


	public void setImporteAceptadoDietas(BigDecimal importeAceptadoDietas) {
		this.importeAceptadoDietas = importeAceptadoDietas;
	}


	public int getNumeroDiasYear() {
		return numeroDiasYear;
	}


	public void setNumeroDiasYear(int numeroDiasYear) {
		this.numeroDiasYear = numeroDiasYear;
	}


	public int getNumeroDiasCerrado() {
		return numeroDiasCerrado;
	}


	public void setNumeroDiasCerrado(int numeroDiasCerrado) {
		this.numeroDiasCerrado = numeroDiasCerrado;
	}


	public BigDecimal getGradoMinoracionTemporal() {
		return gradoMinoracionTemporal;
	}


	public void setGradoMinoracionTemporal(BigDecimal gradoMinoracionTemporal) {
		this.gradoMinoracionTemporal = gradoMinoracionTemporal;
	}


	public BigDecimal getCosteEjecutablePersonal() {
		return costeEjecutablePersonal;
	}


	public void setCosteEjecutablePersonal(BigDecimal costeEjecutablePersonal) {
		this.costeEjecutablePersonal = costeEjecutablePersonal;
	}


	public BigDecimal getCosteEjecutableDietas() {
		return costeEjecutableDietas;
	}


	public void setCosteEjecutableDietas(BigDecimal costeEjecutableDietas) {
		this.costeEjecutableDietas = costeEjecutableDietas;
	}


	public BigDecimal getCosteEjecutableTotal() {
		return costeEjecutableTotal;
	}


	public void setCosteEjecutableTotal(BigDecimal costeEjecutableTotal) {
		this.costeEjecutableTotal = costeEjecutableTotal;
	}


	/*public BigDecimal getGradoMinoracionEconomica() {
		return gradoMinoracionEconomica;
	}


	public void setGradoMinoracionEconomica(BigDecimal gradoMinoracionEconomica) {
		this.gradoMinoracionEconomica = gradoMinoracionEconomica;
	}*/


	public BigDecimal getImporteAceptadoTotal() {
		return importeAceptadoTotal;
	}


	public void setImporteAceptadoTotal(BigDecimal importeAceptadoTotal) {
		this.importeAceptadoTotal = importeAceptadoTotal;
	}


	public BigDecimal getImporteSubvencionProvisionalPersonal() {
		return importeSubvencionProvisionalPersonal;
	}


	public void setImporteSubvencionProvisionalPersonal(BigDecimal importeSubvencionProvisionalPersonal) {
		this.importeSubvencionProvisionalPersonal = importeSubvencionProvisionalPersonal;
	}


	public BigDecimal getImporteSubvencionProvisionalDietas() {
		return importeSubvencionProvisionalDietas;
	}


	public void setImporteSubvencionProvisionalDietas(BigDecimal importeSubvencionProvisionalDietas) {
		this.importeSubvencionProvisionalDietas = importeSubvencionProvisionalDietas;
	}


	public BigDecimal getImporteSubvencionProvisionalTotal() {
		return importeSubvencionProvisionalTotal;
	}


	public void setImporteSubvencionProvisionalTotal(BigDecimal importeSubvencionProvisionalTotal) {
		this.importeSubvencionProvisionalTotal = importeSubvencionProvisionalTotal;
	}


	public BigDecimal getGradoMinoracionTecnica() {
		return gradoMinoracionTecnica;
	}


	public void setGradoMinoracionTecnica(BigDecimal gradoMinoracionTecnica) {
		this.gradoMinoracionTecnica = gradoMinoracionTecnica;
	}


	public BigDecimal getImporteMinoracionTecnica() {
		return importeMinoracionTecnica;
	}


	public void setImporteMinoracionTecnica(BigDecimal importeMinoracionTecnica) {
		this.importeMinoracionTecnica = importeMinoracionTecnica;
	}


	public BigDecimal getResultadoLiquidacion() {
		return resultadoLiquidacion;
	}


	public void setResultadoLiquidacion(BigDecimal resultadoLiquidacion) {
		this.resultadoLiquidacion = resultadoLiquidacion;
	}
	
	


	public BigDecimal getImporteSubvencionDefinitivoDietas() {
		return importeSubvencionDefinitivoDietas;
	}


	public void setImporteSubvencionDefinitivoDietas(BigDecimal importeSubvencionDefinitivoDietas) {
		this.importeSubvencionDefinitivoDietas = importeSubvencionDefinitivoDietas;
	}


	public BigDecimal getImporteSubvencionDefinitivoPersonal() {
		return importeSubvencionDefinitivoPersonal;
	}


	public void setImporteSubvencionDefinitivoPersonal(BigDecimal importeSubvencionDefinitivoPersonal) {
		this.importeSubvencionDefinitivoPersonal = importeSubvencionDefinitivoPersonal;
	}


	public BigDecimal getImporteSubvencionDefinitivoTotal() {
		return importeSubvencionDefinitivoTotal;
	}


	public void setImporteSubvencionDefinitivoTotal(BigDecimal importeSubvencionDefinitivoTotal) {
		this.importeSubvencionDefinitivoTotal = importeSubvencionDefinitivoTotal;
	}
	
	


	public BigDecimal getPerdidaDerechoAlCobro() {
		return perdidaDerechoAlCobro;
	}


	public void setPerdidaDerechoAlCobro(BigDecimal perdidaDerechoAlCobro) {
		this.perdidaDerechoAlCobro = perdidaDerechoAlCobro;
	}


	public static String formatCurrency(BigDecimal numero) {

        double doubleNumero = numero.doubleValue();
        //NumberFormat formatter = new DecimalFormat("#,#00.00");
        NumberFormat formatter = new DecimalFormat("#,###,#00.00");
        
        String numeroFormateado = formatter.format(doubleNumero);
        
        return numeroFormateado;
    }
	
	public static String formatDate(String fecha) throws ParseException {
		
		SimpleDateFormat formatter2Date = new SimpleDateFormat("yyyy-MM-dd");
		Date fechaISO = formatter2Date.parse(fecha);
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		String fechaFormateada = formatter.format(fechaISO);
		return fechaFormateada;
	}
	
	
	public void generarCalculosLiquidacion() {
		
		setCoste(getCostePersonal().add(getCosteDietas()));
		setSubvencion(getSubvencionPersonal().add(getSubvencionDietas()));
		BigDecimal cien = new BigDecimal("100");
		BigDecimal dividePorCien = new BigDecimal("0.01");
		setGradoFinanciacion((getSubvencion().multiply(cien)).divide(getCoste(), 10, RoundingMode.HALF_DOWN));
		
		BigDecimal numeroDiasYearBigDecimal = BigDecimal.valueOf(getNumeroDiasYear());
		//System.out.println("El numero de dias al año es: "+numeroDiasYearBigDecimal);
		BigDecimal numeroDiasCerradoBigDecimal = BigDecimal.valueOf(getNumeroDiasCerrado());
		//System.out.println("El número de días al año es: "+numeroDiasCerradoBigDecimal);
		BigDecimal porcentajeDelYearCerrado = numeroDiasCerradoBigDecimal.multiply(cien).divide(numeroDiasYearBigDecimal, 10, RoundingMode.HALF_DOWN); 
	
		//System.out.println("El porcentaje del año cerrado es: "+porcentajeDelYearCerrado);
		BigDecimal gradoMinoracionTemporalBigDecimal = cien.subtract(porcentajeDelYearCerrado);
		//System.out.println("El grado de Minoración Temporal es: "+gradoMinoracionTemporalBigDecimal);
		setGradoMinoracionTemporal(gradoMinoracionTemporalBigDecimal);
		//System.out.println("Y desde el getter: "+getGradoMinoracionTemporal());
		
		BigDecimal costeEjecutablePersonalSinRedondeo = getCostePersonal().multiply(getGradoMinoracionTemporal().multiply(dividePorCien));
		setCosteEjecutablePersonal(costeEjecutablePersonalSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		BigDecimal costeEjecutableDietasSinRedondeo = getCosteDietas().multiply(getGradoMinoracionTemporal().multiply(dividePorCien));
		setCosteEjecutableDietas(costeEjecutableDietasSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		setCosteEjecutableTotal(getCosteEjecutablePersonal().add(getCosteEjecutableDietas()));
		setSubvencionEjecutableTotal(getCosteEjecutableTotal().multiply(getGradoFinanciacion().multiply(dividePorCien)));
		setFinanciacionPropiaEjecutable(getCosteEjecutableTotal().subtract(getSubvencionEjecutableTotal()));
		
		setImporteAceptadoPersonal(getImporteJustificadoPersonal().min(getCosteEjecutablePersonal()));
		setImporteAceptadoDietas(getImporteJustificadoDietas().min(getCosteEjecutableDietas()));
		setImporteAceptadoTotal(getImporteAceptadoPersonal().add(getImporteAceptadoDietas()));
		
		setGradoMinoracionTecnica(getPorcentajeReintegroTecnico(getGradoCumplimientoTecnico()));
		
		BigDecimal importeSubvencionProvisionalTotalSinRedondeo =getImporteAceptadoTotal().multiply(getGradoFinanciacion().multiply(dividePorCien));
		setImporteSubvencionProvisionalTotal(importeSubvencionProvisionalTotalSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
		BigDecimal importeMinoracionTecnicaSinRedondeo = getImporteSubvencionProvisionalTotal().multiply(getGradoMinoracionTecnica().multiply(dividePorCien));
		setImporteMinoracionTecnica(importeMinoracionTecnicaSinRedondeo.setScale(2, BigDecimal.ROUND_HALF_EVEN));
		
    	setImporteSubvencionDefinitivoTotal(getImporteSubvencionProvisionalTotal().subtract(getImporteMinoracionTecnica()));
		setResultadoLiquidacion(getImporteSubvencionDefinitivoTotal().subtract(importeOJ));
		BigDecimal diferencia = null;
		if (getResultadoLiquidacion().intValue()<=0) {
			diferencia = new BigDecimal("0");
			
		} else {
			diferencia = getResultadoLiquidacion();
		}
		setPerdidaDerechoAlCobro(getSubvencion().subtract(getImporteOJ()).subtract(diferencia));
		
		
		
	}


	private BigDecimal getPorcentajeReintegroTecnico(BigDecimal gradoCumplimiento) {
		
		int incumplimientoEntero = gradoCumplimiento.setScale(0, RoundingMode.DOWN).intValueExact();
		
		if (incumplimientoEntero>=95) {
			return new BigDecimal("0");
		} else if (incumplimientoEntero>=90) {
			return new BigDecimal("3");
		} else if (incumplimientoEntero>=85) {
			return new BigDecimal("6");
		} else if (incumplimientoEntero>=80) {
			return new BigDecimal("9");
		} else if (incumplimientoEntero>=75) {
			return new BigDecimal("12");
		} else if (incumplimientoEntero>=70) {
			return new BigDecimal("15");
		} else {
			return new BigDecimal("100");
		}
		
	
	}


	public String getAntecedente02() {
		return antecedente02;
	}


	public void setAntecedente02(String antecedente02) {
		this.antecedente02 = antecedente02;
	}


	public String getAntecedente03() {
		return antecedente03;
	}


	public void setAntecedente03(String antecedente03) {
		this.antecedente03 = antecedente03;
	}


	public String getAntecedente04Minoracion() {
		return antecedente04Minoracion;
	}


	public void setAntecedente04Minoracion(String antecedente04Minoracion) {
		this.antecedente04Minoracion = antecedente04Minoracion;
	}


	public String getAntecedente04RevisionEconomica() {
		return antecedente04RevisionEconomica;
	}


	public void setAntecedente04RevisionEconomica(String antecedente04RevisionEconomica) {
		this.antecedente04RevisionEconomica = antecedente04RevisionEconomica;
	}

	

	public String getAntecedente04RevisionTecnica() {
		return antecedente04RevisionTecnica;
	}


	public void setAntecedente04RevisionTecnica(String antecedente04RevisionTecnica) {
		this.antecedente04RevisionTecnica = antecedente04RevisionTecnica;
	}


	public String getAntecedente06() {
		return antecedente06;
	}


	public void setAntecedente06(String antecedente06) {
		this.antecedente06 = antecedente06;
	}


	


	public String getFechaResolucionConcesion() {
		return fechaResolucionConcesion;
	}


	public void setFechaResolucionConcesion(String fechaResolucionConcesion) {
		this.fechaResolucionConcesion = fechaResolucionConcesion;
	}


	public BigDecimal getSubvencionEjecutableTotal() {
		return subvencionEjecutableTotal;
	}


	public void setSubvencionEjecutableTotal(BigDecimal subvencionEjecutableTotal) {
		this.subvencionEjecutableTotal = subvencionEjecutableTotal;
	}


	public BigDecimal getFinanciacionPropiaEjecutable() {
		return financiacionPropiaEjecutable;
	}


	public void setFinanciacionPropiaEjecutable(BigDecimal financiacionPropiaEjecutable) {
		this.financiacionPropiaEjecutable = financiacionPropiaEjecutable;
	}
	
	

}
