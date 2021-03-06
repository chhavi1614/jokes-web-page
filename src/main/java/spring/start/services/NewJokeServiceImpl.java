package spring.start.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
@Service
public class NewJokeServiceImpl implements NewJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public NewJokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String sayNewJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
