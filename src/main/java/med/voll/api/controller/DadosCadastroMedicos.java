package med.voll.api.controller;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.medico.Especialidade;

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade esp,
DadosEndereco endereco) {
}
