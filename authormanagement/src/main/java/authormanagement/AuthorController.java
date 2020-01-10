package authormanagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.Arrays.asList;

@RestController
public class AuthorController {
    private List<Author> list;
    private Map<Integer, Author> autoresPorId = new HashMap<>();


    public AuthorController() {
        Author carlosDrummond = new Author(1, "Carlos", "Drummond de Andrade", "1902-10-31", true);
        Author machadoDeAssis = new Author(2, "Machado", "de Assis", "1839.06.21", true);
        Author ecaDeQueiroz = new Author(3, "Eça", "de Queiroz", "1845.11.25", true);

        autoresPorId.put(carlosDrummond.getId(), carlosDrummond);
        autoresPorId.put(machadoDeAssis.getId(), machadoDeAssis);
        autoresPorId.put(ecaDeQueiroz.getId(), ecaDeQueiroz);

        list = asList(carlosDrummond, machadoDeAssis, ecaDeQueiroz);
    }

    @GetMapping("/listall")
    public List<Author> listAll() {
        return list;
    }

    @GetMapping("/getauthorbyid/{id}")
    public Author getAuthorById(@PathVariable("id") int id) {
        return autoresPorId.get(id);
    }

    @PutMapping("/createauthor")
    public Map<Integer, Author> createAuthor(@RequestBody Author newAuthor) {
        autoresPorId.put(newAuthor.getId(), newAuthor);
        System.out.println("Author added to the list!");
        return autoresPorId;
    }

    @PutMapping("/updateauthor/{id}")
    public Map<Integer, Author> updateAuthor(@PathVariable("id") int id, @RequestBody Author newAuthor) {
        autoresPorId.put(id, newAuthor);
        System.out.println("Author updated in the list!");
        return autoresPorId;
    }

    @GetMapping("/deleteauthor/{id}")
    public Map<Integer, Author> deleteAuthor(@PathVariable("id") int id) {
        autoresPorId.remove(id);
        System.out.println("Author deleted from the list!");
        return autoresPorId;
    }

}
