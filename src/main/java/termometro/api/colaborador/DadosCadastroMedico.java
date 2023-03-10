package termometro.api.colaborador;

public record DadosCadastroMedico(
        String nome,
        String email,
        String gestor,
        String setor,
        Humor humor) {
}
