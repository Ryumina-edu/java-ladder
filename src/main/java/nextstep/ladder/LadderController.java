package nextstep.ladder;

import nextstep.ladder.domain.player.Players;
import nextstep.ladder.ui.InputView;

public class LadderController {

    public static void main(String[] args) {
        Players players = new Players(InputView.getPlayersName());
        int ladderHeight = InputView.getLadderHeight();

    }
}
