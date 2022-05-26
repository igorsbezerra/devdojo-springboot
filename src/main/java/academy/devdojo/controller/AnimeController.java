package academy.devdojo.controller;

import academy.devdojo.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping("list")
    public List<Anime> list() {
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("DBZ"));
        animes.add(new Anime("Berserk"));

        return animes;
    }
}
