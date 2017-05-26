/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import javax.inject.Inject;

/**
 *
 * @author romulo.douro
 */
@Controller
public class TesteController {

    private final Result result;

    /**
     * @deprecated CDI eyes only
     */
    protected TesteController() {
        this(null);
    }

    @Inject
    public TesteController(Result result) {
        this.result = result;
    }

    @Path({"/teste", "/teste/", "/teste/index"})
    public void index() {
        result.include("msg", "index de teste");
    }

    public void teste() {
        result.include("mensagem", "Aqui é a mensagem");
    }

    public void carro() {
        result.include("ano", 2001);
    }
}
