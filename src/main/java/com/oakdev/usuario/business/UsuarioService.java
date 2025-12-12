package com.oakdev.usuario.business;


import com.oakdev.usuario.business.dto.UsuarioDTO;
import com.oakdev.usuario.business.mapper.UsuarioMapper;
import com.oakdev.usuario.infrastructure.entity.Usuario;
import com.oakdev.usuario.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioMapper.paraUsuario(usuarioDTO);
        return usuarioMapper.paraUsuarioDTO(
                usuarioRepository.save(usuario));
    }
}
