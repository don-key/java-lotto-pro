package lotto.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoIssueTest {

    @Test
    public void 로또번호를_5장_발급한다() {
        //given
        int purchaseQuantity = 5;

        //when
        List<Lotto> lottos = LottoIssue.ofAuto(purchaseQuantity);

        //then
        assertThat(lottos.size()).isEqualTo(purchaseQuantity);
    }
}