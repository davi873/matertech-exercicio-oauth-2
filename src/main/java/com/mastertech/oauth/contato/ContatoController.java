package com.mastertech.oauth.contato;

import com.mastertech.oauth.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @PostMapping("/contato")
    private Boolean create(@RequestBody ContatoDTO contatoDTO, @AuthenticationPrincipal Usuario usuario){
        Contato contato = new Contato(contatoDTO.getNome(), contatoDTO.getTelefone(), usuario.getId());
        return contatoService.create(contato);
    }

    @GetMapping("/contatos")
    private List<Contato> getAllByUserId(@AuthenticationPrincipal Usuario usuario){
        return contatoService.getAllByUserId(usuario.getId());
    }

}
