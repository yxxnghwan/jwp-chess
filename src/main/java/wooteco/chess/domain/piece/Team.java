package wooteco.chess.domain.piece;

import java.util.HashMap;
import java.util.Map;

public enum Team {
    WHITE,
    BLACK,
    BLANK;

    private static final Map<String, Team> TEAM_MAP = new HashMap<>();

    static {
        for (Team team : values()) {
            TEAM_MAP.put(team.name(), team);
        }
    }

    public static Team of(final String name) {
        return TEAM_MAP.get(name);
    }

    public boolean isNotSame(final Team team) {
        return this != team && this != BLANK && team != BLANK;
    }
}