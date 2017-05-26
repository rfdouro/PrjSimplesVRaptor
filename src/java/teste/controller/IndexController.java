package teste.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
public class IndexController {

	private final Result result;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
		this(null);
	}
	
	@Inject
	public IndexController(Result result) {
		this.result = result;
	}

	//@Path("/")
        @Path(value = "/", priority = Integer.MAX_VALUE)
	public void index() {
		result.include("variable", "VRaptor!");
	}
       
        public void teste(){
            result.include("v", 123);
        }
}