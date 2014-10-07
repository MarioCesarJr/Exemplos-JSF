package conversores.validator;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.sun.faces.util.MessageFactory;

@FacesValidator("conversores.validator")
public class DataJogoValidator implements Validator{
	
		@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		Date dataPosterior = (Date) value;
		
		if(dataPosterior != null && dataPosterior.after(new Date())){
			Object label = MessageFactory.getLabel(context, component);
			String descricaoErro = label + " não pode ser uma data futura.";
			
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,descricaoErro,descricaoErro);
			throw new ValidatorException(message);		
	   }
	}
}
