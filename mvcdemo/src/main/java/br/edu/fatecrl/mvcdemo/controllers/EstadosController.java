package br.edu.fatecrl.mvcdemo.controllers;

import br.edu.fatecrl.mvcdemo.models.Estados;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/estados")
public class EstadosController {
    private static final List<Estados> ESTADOS = new ArrayList<Estados>();
    public EstadosController() {
        ESTADOS.add(new Estados("São Paulo","São Paulo"));
        ESTADOS.add(new Estados("Bahia","Salvador" ));
        ESTADOS.add(new Estados("Pará","Belém"));
}

@GetMapping
public String getEstados(Model model)
{
    model.addAttribute("Estados", ESTADOS);
    return "estados";
}
}