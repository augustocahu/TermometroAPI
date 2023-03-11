package termometro.api.colaborador;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "colaborador")
@Entity(name = "Colaborador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Colaborador {


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String gestor;
    private String setor;

    @Enumerated(EnumType.STRING)
    private Humor  humor;

    public Colaborador(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.gestor = dados.gestor();
        this.setor = dados.setor();
        this.humor = dados.humor();

    }
}
