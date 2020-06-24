package com.mastertech.oauth.contato;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public Boolean create(Contato contato){
        try{
            contatoRepository.save(contato);
            return true;
        }catch (Exception e ){
            return false;
        }
    }

    public List<Contato> getAllByUserId(int userId){

        List<Optional<Contato>> listOp =  contatoRepository.findAllByUserId(userId);

        List<Contato> listContato = new ArrayList<>();

        listOp.forEach(contatoOp ->{
            listContato.add(contatoOp.get());
        });

        return listContato;
    }
}
