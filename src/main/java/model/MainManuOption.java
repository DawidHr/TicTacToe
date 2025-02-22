package model;

import java.util.Arrays;
import java.util.Optional;

public enum MainManuOption {
    PLAYER_VS_PLAYER("1", "Gra dla 2 graczy"),
    PLAYER_VS_COMPUTER("2", "Gra dla 1 gracza"),
    END("3", "Zamknij Program");

    private final String option;
    private final String description;

    MainManuOption(String option, String description) {
        this.option = option;
        this.description = description;
    }

    public String getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public static MainManuOption getMainMenuOptionByOption(String option) {
        if (option == null)
            return null;

        Optional<MainManuOption> findOption = Arrays.stream(MainManuOption.values()).filter(o -> option.equals(o.getOption())).findFirst();
        return findOption.orElse(null);
    }
}
