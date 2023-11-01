package br.edu.fatecrl.mvcdemo.controllers;


import br.edu.fatecrl.mvcdemo.models.Estados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/estados")
public class DadosController {
    private static final List<Estados> ESTADOS = new ArrayList<Estados>();

    public DadosController() {
        ESTADOS.add(new Estados("São Paulo","São Paulo"));
        ESTADOS.add(new Estados("Bahia","Salvador"));
        ESTADOS.add(new Estados("Pará","Belém"));
    }
    @GetMapping
    public List<Estados> getEstados()
    {
        return ESTADOS;
    }
}
