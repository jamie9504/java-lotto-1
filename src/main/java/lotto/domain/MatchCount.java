package lotto.domain;

import java.util.Objects;

public class MatchCount {

    private static final int MINIMUM_MATCH_COUNT = 1;
    private static final String INVALID_MATCH_COUNT_EXCEPTION_MESSAGE = "유효하지 않는 일치 갯수입니다.";

    private final int matchCount;

    public MatchCount(int matchCount) {
        if (matchCount < MINIMUM_MATCH_COUNT || Lotto.moreThanBallCount(matchCount)) {
            throw new IllegalArgumentException(INVALID_MATCH_COUNT_EXCEPTION_MESSAGE);
        }
        this.matchCount = matchCount;
    }

    public int getMatchCount() {
        return matchCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MatchCount that = (MatchCount) o;
        return matchCount == that.matchCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchCount);
    }
}
