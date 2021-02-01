package dev.bstk.dockerk8s.perfils.api.resource;

import dev.bstk.dockerk8s.perfils.api.response.PerfilResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/usuarios")
public class PerfilResource {

    @RequestMapping
    public ResponseEntity<PerfilResponse> usuarios() {
        return ResponseEntity.ok().build();
    }
}
