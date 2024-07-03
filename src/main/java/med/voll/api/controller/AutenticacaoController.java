package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.domain.usuario.DadosAutenticacao;
import med.voll.api.domain.usuario.Usuario;
import med.voll.api.infra.security.DadosTokenJWT;
import med.voll.api.infra.security.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Parâmetros:
 * O método efetuarLogin recebe um objeto DadosAutenticacao como parâmetro.
 * Esse objeto contém informações como o login (nome de usuário)
 * e a senha fornecidos pelo usuário durante o processo de login.

 * Autenticação:
 * A linha var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(),
 * dados.senha()); cria um token de autenticação com base no login e senha fornecidos.
 * Em seguida, a linha var authentication = manager.authenticate(authenticationToken);
 * realiza a autenticação desse token. O objeto manager (provavelmente um AuthenticationManager)
 * verifica se as credenciais são válidas.

 * Geração do Token JWT:
 * Se a autenticação for bem-sucedida, o próximo passo é gerar um token JWT (JSON Web Token) para o usuário autenticado.
 * A linha var tokenJWT = tokenService.generateToken((Usuario) authentication.getPrincipal());
 * chama um serviço (provavelmente chamado tokenService) para criar o token JWT
 * com base nas informações do usuário autenticado (representado pelo authentication.getPrincipal()).

 * Resposta HTTP:
 * Por fim, a linha return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
 * cria uma resposta HTTP com status 200 (OK) e o corpo contendo um objeto DadosTokenJWT que encapsula o token JWT gerado.
 * O ResponseEntity permite configurar completamente a resposta HTTP, incluindo o status, cabeçalhos e corpo
 */
@RestController
@RequestMapping("/login")
public class AutenticacaoController {

    @Autowired
    private AuthenticationManager manager;
    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAutenticacao dados) {

        var authenticationToken = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = manager.authenticate(authenticationToken);

        var tokenJWT = tokenService.generateToken((Usuario) authentication.getPrincipal());
        return ResponseEntity.ok(new DadosTokenJWT(tokenJWT));
    }
}
