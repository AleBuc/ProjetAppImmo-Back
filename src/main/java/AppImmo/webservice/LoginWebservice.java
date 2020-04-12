package AppImmo.webservice;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginWebservice {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (!(auth instanceof AnonymousAuthenticationToken)) {
			return new ModelAndView("redirect:/dashboard"); //si authentification:OK, passe au tableau de bord
		}
		return new ModelAndView("login"); //sinon, retour sur la page de login
	}
}
