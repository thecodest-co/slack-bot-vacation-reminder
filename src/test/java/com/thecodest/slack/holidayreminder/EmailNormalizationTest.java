package com.thecodest.slack.holidayreminder;

import com.thecodest.slack.holidayreminder.EmailNormalization.NormalizedEmail;
import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static com.thecodest.slack.holidayreminder.EmailNormalization.normalize;
import static com.thecodest.slack.holidayreminder.NormalizedEmailAssert.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class EmailNormalizationTest {

	public static final String EXPECTED = "test@test.com";
	public static final String LOCAL = "test";
	public static final String DOMAIN = "test.com";

	@Test
	void shouldNormalizeCommonEmail() throws ParseException {
		assertThat(normalize(EXPECTED))
				.hasNormalForm(EXPECTED)
				.hasCommonForm(EXPECTED)
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases(LOCAL);
		assertThat(normalize("test@test.com  "))
				.hasNormalForm(EXPECTED)
				.hasCommonForm(EXPECTED)
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases(LOCAL);
		assertThat(normalize("   test@test.com"))
				.hasNormalForm(EXPECTED)
				.hasCommonForm(EXPECTED)
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases(LOCAL);
		assertThat(normalize("   test@test.com    "))
				.hasNormalForm(EXPECTED)
				.hasCommonForm(EXPECTED)
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases(LOCAL);
	}

	@Test
	void shouldNormalizeCasing() throws ParseException {
		assertThat(normalize("test@TEST.com"))
				.hasNormalForm(EXPECTED)
				.hasCommonForm("test@TEST.com")
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases(LOCAL);
		assertThat(normalize("TEST@test.com"))
				.hasNormalForm(EXPECTED)
				.hasCommonForm("TEST@test.com")
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases("TEST");
	}

	@Test
	void shouldNormalizeAliases() throws ParseException {
		assertThat(normalize("test+alias@test.com"))
				.hasNormalForm(EXPECTED)
				.hasCommonForm("test+alias@test.com")
				.hasLocalPart(LOCAL)
				.hasDomainPart(DOMAIN)
				.hasLocalPartWithAliases("test+alias");
	}

	@Test
	void shouldThrowNPE() {
		assertThatThrownBy(() -> normalize(null)).isInstanceOf(NullPointerException.class);
	}

	@Test
	void shouldThrowParseException() {
		assertThatThrownBy(() -> normalize("Some random text")).isInstanceOf(ParseException.class);
		assertThatThrownBy(() -> normalize("Some random text@")).isInstanceOf(ParseException.class);
		assertThatThrownBy(() -> normalize("@Some random text")).isInstanceOf(ParseException.class);
	}
}

class NormalizedEmailAssert extends AbstractAssert<NormalizedEmailAssert, NormalizedEmail> {

	protected NormalizedEmailAssert(NormalizedEmail emailNormalization) {
		super(emailNormalization, NormalizedEmailAssert.class);
	}

	public static NormalizedEmailAssert assertThat(NormalizedEmail emailNormalization) {
		return new NormalizedEmailAssert(emailNormalization);
	}

	public NormalizedEmailAssert hasNormalForm(String expected) {
		isNotNull();
		Assertions.assertThat(actual.normalForm())
				.isNotNull()
				.isEqualTo(expected);
		return this;
	}

	public NormalizedEmailAssert hasCommonForm(String expected) {
		isNotNull();
		Assertions.assertThat(actual.commonForm())
				.isNotNull()
				.isEqualTo(expected);
		return this;
	}

	public NormalizedEmailAssert hasLocalPart(String expected) {
		isNotNull();
		Assertions.assertThat(actual.localPart())
				.isNotNull()
				.isEqualTo(expected);
		return this;
	}

	public NormalizedEmailAssert hasDomainPart(String expected) {
		isNotNull();
		Assertions.assertThat(actual.domainPart())
				.isNotNull()
				.isEqualTo(expected);
		return this;
	}

	public NormalizedEmailAssert hasLocalPartWithAliases(String expected) {
		isNotNull();
		Assertions.assertThat(actual.localPartWithAliases())
				.isNotNull()
				.isEqualTo(expected);
		return this;
	}

	public NormalizedEmailAssert areStrictEquals(NormalizedEmail expected) {
		isNotNull();
		Assertions.assertThat(actual)
				.isNotNull()
				.matches(ne -> ne.strictEquals(expected), "NormalizedEmails are not strict equals");
		return this;
	}
}