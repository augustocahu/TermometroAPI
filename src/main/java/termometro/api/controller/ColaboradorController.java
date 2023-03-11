package termometro.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import termometro.api.colaborador.Colaborador;
import termometro.api.colaborador.ColaboradorRepository;
import termometro.api.colaborador.DadosCadastroMedico;

@RestController
@RequestMapping("colaboradores")
public class ColaboradorController {

    @Autowired
    private ColaboradorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){

        repository.save(new Colaborador(dados));



    }


}
