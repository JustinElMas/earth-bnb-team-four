package com.jorge.demo.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.jorge.demo.models.Usuario;
import com.jorge.demo.services.UsuarioServicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/datos")
public class UsuarioController {

    private final UsuarioServicio usuarioServicio;

    public UsuarioController(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    @GetMapping("")
    public String index(Model model) {
        List<Usuario> usuarios = usuarioServicio.findAll();

        model.addAttribute("usuarios", usuarios);

        System.out.println(usuarios);

        return "datos";
    }
    


    @PostMapping
    public String crearUsuario(
        @RequestParam("nombre") String nombre,
        @RequestParam("email") String email
    ) {
        try {
            Usuario usuario = new Usuario();
            usuario.setNombre(nombre);
            usuario.setEmail(email);

            usuarioServicio.createUsuario(usuario);
        } catch (IllegalArgumentException error) {
           
        }
        return "redirect:/datos";
    }     
    
    
    
//     @RestController
// public class BooksApi {
//     private final BookService bookService;
//     public BooksApi(BookService bookService){
//         this.bookService = bookService;
//     }
//     @RequestMapping("/api/books")
//     public List<Book> index() {
//         return bookService.allBooks();
//     }
    
//     @RequestMapping(value="/api/books", method=RequestMethod.POST)
//     public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
//         Book book = new Book(title, desc, lang, numOfPages);
//         return bookService.createBook(book);
//     }
    
//     @RequestMapping("/api/books/{id}")
//     public Book show(@PathVariable("id") Long id) {
//         Book book = bookService.findBook(id);
//         return book;
//     }
// }
}

