package academy.devdojo.controller;

import academy.devdojo.domain.Anime;
import academy.devdojo.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    private DateUtil dateUtil;

    @GetMapping("list")
    public List<Anime> list() {
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        List<Anime> animes = new ArrayList<>();
        animes.add(new Anime("DBZ"));
        animes.add(new Anime("Berserk"));

        return animes;
    }
}
