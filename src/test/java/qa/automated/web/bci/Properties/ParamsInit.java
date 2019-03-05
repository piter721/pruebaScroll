package qa.automated.web.bci.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ParamsInit {

	public static Properties parametros;
	public String TEXTOHOLA;
	public String TEXTONOERESTU;
	public String TEXTORUT;
	public String TEXTOPASS;
	public String TEXTOPROBLEMAS;
	public String TEXTOTERMINOS;
	public String TEXTOPOLITICAS;
	public String TEXTOPPALHUELLA;
	public String TEXTOSECHUELLA;
	public String TEXTOTYCFINGER;
	public String TEXTOBIENVENIDO;
	public String TEXTOCONGRATSPRUEBA;

	public String TEXTONUMEROCUENTA;
	public String TEXTOPAGOCUENTAS;
	public String TEXTOCONSULTARPAGOSPENDIENTES;
	public String TEXTOTOTALAPAGAR;
	public String TEXTOCUENTAINSCRITA;
	public String TEXTOBILLER;
	public String TEXTONCLIENTE;
	public String TEXTOVENCIMIENTO;

	public ParamsInit() {
		Properties parametros;
		File propFileName = new File("src/test/java/qa/automated/web/bci/Config/params.properties").getAbsoluteFile();
		FileInputStream inputStream;

		try {
			inputStream = new FileInputStream(propFileName);
			parametros = new Properties();
			parametros.load(inputStream);

			// Textos
			TEXTOHOLA = parametros.getProperty("TEXTOHOLA");
			TEXTONOERESTU = parametros.getProperty("TEXTONOERESTU");
			TEXTORUT = parametros.getProperty("TEXTORUT");
			TEXTOPASS = parametros.getProperty("TEXTOPASS");
			TEXTOPROBLEMAS = parametros.getProperty("TEXTOPROBLEMAS");
			TEXTOTERMINOS = parametros.getProperty("TEXTOTERMINOS");
			TEXTOPOLITICAS = parametros.getProperty("TEXTOPOLITICAS");
			TEXTOPPALHUELLA = parametros.getProperty("TEXTOPPALHUELLA");
			TEXTOSECHUELLA = parametros.getProperty("TEXTOSECHUELLA");
			TEXTOTYCFINGER = parametros.getProperty("TEXTOTYCFINGER");
			TEXTOBIENVENIDO = parametros.getProperty("TEXTOBIENVENIDO");
			TEXTOCONGRATSPRUEBA = parametros.getProperty("TEXTOCONGRATSPRUEBA");

			TEXTONUMEROCUENTA = parametros.getProperty("TEXTONUMEROCUENTA");
			TEXTOPAGOCUENTAS = parametros.getProperty("TEXTOPAGOCUENTAS");
			TEXTOCONSULTARPAGOSPENDIENTES = parametros.getProperty("TEXTOCONSULTARPAGOSPENDIENTES");
			TEXTOTOTALAPAGAR = parametros.getProperty("TEXTOTOTALAPAGAR");
			TEXTOCUENTAINSCRITA = parametros.getProperty("TEXTOCUENTAINSCRITA");
			TEXTOBILLER = parametros.getProperty("TEXTOBILLER");
			TEXTONCLIENTE = parametros.getProperty("TEXTONCLIENTE");
			TEXTOVENCIMIENTO = parametros.getProperty("TEXTOVENCIMIENTO");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getTEXTOHOLA() {
		return TEXTOHOLA;
	}

	public void setTEXTOHOLA(String tEXTOHOLA) {
		TEXTOHOLA = tEXTOHOLA;
	}

	public static Properties getParametros() {
		return parametros;
	}

	public static void setParametros(Properties parametros) {
		ParamsInit.parametros = parametros;
	}

	public String getTEXTONOERESTU() {
		return TEXTONOERESTU;
	}

	public void setTEXTONOERESTU(String tEXTONOERESTU) {
		TEXTONOERESTU = tEXTONOERESTU;
	}

	public String getTEXTORUT() {
		return TEXTORUT;
	}

	public void setTEXTORUT(String tEXTORUT) {
		TEXTORUT = tEXTORUT;
	}

	public String getTEXTOPASS() {
		return TEXTOPASS;
	}

	public void setTEXTOPASS(String tEXTOPASS) {
		TEXTOPASS = tEXTOPASS;
	}

	public String getTEXTOPROBLEMAS() {
		return TEXTOPROBLEMAS;
	}

	public void setTEXTOPROBLEMAS(String tEXTOPROBLEMAS) {
		TEXTOPROBLEMAS = tEXTOPROBLEMAS;
	}

	public String getTEXTOTERMINOS() {
		return TEXTOTERMINOS;
	}

	public void setTEXTOTERMINOS(String tEXTOTERMINOS) {
		TEXTOTERMINOS = tEXTOTERMINOS;
	}

	public String getTEXTOPOLITICAS() {
		return TEXTOPOLITICAS;
	}

	public void setTEXTOPOLITICAS(String tEXTOPOLITICAS) {
		TEXTOPOLITICAS = tEXTOPOLITICAS;
	}

	public String getTEXTOPPALHUELLA() {
		return TEXTOPPALHUELLA;
	}

	public void setTEXTOPPALHUELLA(String tEXTOPPALHUELLA) {
		TEXTOPPALHUELLA = tEXTOPPALHUELLA;
	}

	public String getTEXTOSECHUELLA() {
		return TEXTOSECHUELLA;
	}

	public void setTEXTOSECHUELLA(String tEXTOSECHUELLA) {
		TEXTOSECHUELLA = tEXTOSECHUELLA;
	}

	public String getTEXTOTYCFINGER() {
		return TEXTOTYCFINGER;
	}

	public void setTEXTOTYCFINGER(String tEXTOTYCFINGER) {
		TEXTOTYCFINGER = tEXTOTYCFINGER;
	}

	public String getTEXTOBIENVENIDO() {
		return TEXTOBIENVENIDO;
	}

	public void setTEXTOBIENVENIDO(String tEXTOBIENVENIDO) {
		TEXTOBIENVENIDO = tEXTOBIENVENIDO;
	}

	public String getTEXTOCONGRATSPRUEBA() {
		return TEXTOCONGRATSPRUEBA;
	}

	public void setTEXTOCONGRATSPRUEBA(String tEXTOCONGRATSPRUEBA) {
		TEXTOCONGRATSPRUEBA = tEXTOCONGRATSPRUEBA;
	}

	public String getTEXTONUMEROCUENTA() {
		return TEXTONUMEROCUENTA;
	}

	public void setTEXTONUMEROCUENTA(String tEXTONUMEROCUENTA) {
		TEXTONUMEROCUENTA = tEXTONUMEROCUENTA;
	}

	public String getTEXTOPAGOCUENTAS() {
		return TEXTOPAGOCUENTAS;
	}

	public void setTEXTOPAGOCUENTAS(String tEXTOPAGOCUENTAS) {
		TEXTOPAGOCUENTAS = tEXTOPAGOCUENTAS;
	}

	public String getTEXTOTOTALAPAGAR() {
		return TEXTOTOTALAPAGAR;
	}

	public void setTEXTOTOTALAPAGAR(String tEXTOTOTALAPAGAR) {
		TEXTOTOTALAPAGAR = tEXTOTOTALAPAGAR;
	}

	public String getTEXTOCUENTAINSCRITA() {
		return TEXTOCUENTAINSCRITA;
	}

	public void setTEXTOCUENTAINSCRITA(String tEXTOCUENTAINSCRITA) {
		TEXTOCUENTAINSCRITA = tEXTOCUENTAINSCRITA;
	}

	public String getTEXTOBILLER() {
		return TEXTOBILLER;
	}

	public void setTEXTOBILLER(String tEXTOBILLER) {
		TEXTOBILLER = tEXTOBILLER;
	}

	public String getTEXTONCLIENTE() {
		return TEXTONCLIENTE;
	}

	public void setTEXTONCLIENTE(String tEXTONCLIENTE) {
		TEXTONCLIENTE = tEXTONCLIENTE;
	}

	public String getTEXTOVENCIMIENTO() {
		return TEXTOVENCIMIENTO;
	}

	public void setTEXTOVENCIMIENTO(String tEXTOVENCIMIENTO) {
		TEXTOVENCIMIENTO = tEXTOVENCIMIENTO;
	}

	public String getTEXTOCONSULTARPAGOSPENDIENTES() {
		return TEXTOCONSULTARPAGOSPENDIENTES;
	}

	public void setTEXTOCONSULTARPAGOSPENDIENTES(String tEXTOCONSULTARPAGOSPENDIENTES) {
		TEXTOCONSULTARPAGOSPENDIENTES = tEXTOCONSULTARPAGOSPENDIENTES;
	}
}
