package org.assertj.examples.data;


/**
 * {@link BasketBallPlayer} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractBasketBallPlayerAssert} instead.
 */
public class BasketBallPlayerAssert extends AbstractBasketBallPlayerAssert<BasketBallPlayerAssert, BasketBallPlayer> {

  /**
   * Creates a new <code>{@link BasketBallPlayerAssert}</code> to make assertions on actual BasketBallPlayer.
   * @param actual the BasketBallPlayer we want to make assertions on.
   */
  public BasketBallPlayerAssert(BasketBallPlayer actual) {
    super(actual, BasketBallPlayerAssert.class);
  }

  /**
   * An entry point for BasketBallPlayerAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myBasketBallPlayer)</code> and get specific assertion with code completion.
   * @param actual the BasketBallPlayer we want to make assertions on.
   * @return a new <code>{@link BasketBallPlayerAssert}</code>
   */
  public static BasketBallPlayerAssert assertThat(BasketBallPlayer actual) {
    return new BasketBallPlayerAssert(actual);
  }
}
