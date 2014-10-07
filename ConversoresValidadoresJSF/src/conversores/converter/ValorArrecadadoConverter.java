package conversores.converter;

import java.text.DecimalFormat;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter("conversor.valor")
public class ValorArrecadadoConverter implements Converter {

	

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		 
		Double valor = null;
		
		if (value != null && !value.equals("")) {
			if (value.equalsIgnoreCase("um milhão")) {
				valor = new Double(1000000);
			} else {
				try {
					valor = Double.parseDouble(value);
				} catch (Exception e) {
					FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Valor inválido",
							" o valor digitado não é um numero");
					throw new ConverterException(msg);

				}
			}
		}
		return valor;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		DecimalFormat formatador = new DecimalFormat("#,##0.00");
		
		if (value.equals(1000000)){
			return "um milhão";
		}

		return formatador.format(value);
	}

}
