package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;


/**
 * Abstract base class for {@link Name} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractNameAssert<S extends AbstractNameAssert<S, A>, A extends Name> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractNameAssert}</code> to make assertions on actual Name.
   * @param actual the Name we want to make assertions on.
   */
  protected AbstractNameAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Name's first is equal to the given one.
   * @param first the given first to compare the actual Name's first to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Name's first is not equal to the given one.
   */
  public S hasFirst(String first) {
    // check that actual Name we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected first of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualFirst = actual.getFirst();
    if (!org.assertj.core.util.Objects.areEqual(actualFirst, first)) {
      failWithMessage(assertjErrorMessage, actual, first, actualFirst);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Name's last is equal to the given one.
   * @param last the given last to compare the actual Name's last to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Name's last is not equal to the given one.
   */
  public S hasLast(String last) {
    // check that actual Name we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpected last of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualLast = actual.getLast();
    if (!org.assertj.core.util.Objects.areEqual(actualLast, last)) {
      failWithMessage(assertjErrorMessage, actual, last, actualLast);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
