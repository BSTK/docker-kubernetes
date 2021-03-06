package dev.bstk.dockerk8s.perfils.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.bstk.dockerk8s.perfils.api.response.PerfilResponse;
import dev.bstk.dockerk8s.perfils.domain.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/v1/usuarios")
public class PerfilResource {

    private final ModelMapper mapper;
    private final UsuarioRepository repository;

    @Autowired
    public PerfilResource(final ModelMapper mapper,
                          final UsuarioRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @RequestMapping
    public ResponseEntity<List<PerfilResponse>> usuarios() {
        final var usuarios = repository.usuarios();
        final var usuariosResponse = usuarios.stream()
                .map(usuario -> mapper.map(usuario, PerfilResponse.class))
                .collect(Collectors.toList());

        log.warn("Request endpoint: /usuarios");
        return ResponseEntity.ok(usuariosResponse);
    }

    @RequestMapping("/{uuid}")
    public ResponseEntity<PerfilResponse> usuario(@PathVariable("uuid") final UUID uuid) {
        final var usuario = repository.usuario(uuid);
        final var usuarioResponse = mapper.map(usuario, PerfilResponse.class);

        log.warn("Request endpoint: /usuarios/{uuid}");
        return ResponseEntity.ok(usuarioResponse);
    }

}
