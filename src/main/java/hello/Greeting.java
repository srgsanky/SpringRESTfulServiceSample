package hello;

import lombok.Getter;

public class Greeting {
    @Getter
    private final long id;
    @Getter
    private final String content;

    public Greeting (final long id, final String content) {
        this.id = id;
        this.content = content;
    }

}
