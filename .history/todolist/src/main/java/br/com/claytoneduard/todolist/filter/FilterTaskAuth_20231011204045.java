package br.com.claytoneduard.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        // pegar a autenticacao (user e senha)
        var authorization = request.getHeader("Authorization");

        // extrair os dados do user
        var authEncoded = authorization.substring("Basic".length()).trim();
        // passar os dados para base64
        byte[] authDecoded = Base64.getDecoder().decode(authEncoded);

        var authString =    new String(authDecoded);

        // validar user
        // validar senha
        // continua

        filterChain.doFilter(request, response);
    }

}
