package termometro.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import termometro.api.colaborador.DadosCadastroMedico;

@RestController
@RequestMapping("colaboradores")
public class ColaboradorController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){

        System.out.println(dados);



    }


}
