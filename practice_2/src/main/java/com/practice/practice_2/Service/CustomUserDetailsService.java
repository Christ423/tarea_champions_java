package com.practice.practice_2.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aquí debes agregar lógica para buscar al usuario en la base de datos.
        // Por ejemplo:
        if (!username.equals("admin")) { // Esto es solo un ejemplo. Cambia según tus necesidades.
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }

        // Devuelve un usuario simulado para pruebas.
        return org.springframework.security.core.userdetails.User
                .withUsername(username)
                .password("{noop}password") // {noop} deshabilita la codificación de contraseñas para pruebas.
                .roles("USER")
                .build();
    }
}
