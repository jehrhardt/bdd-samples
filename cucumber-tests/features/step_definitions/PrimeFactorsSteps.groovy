import org.ducktools.bdd.samples.Calculator

this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~"a calculator") { -> calculator = new Calculator() }

When(~"prime factors of (\\d+) are calculated") { int number ->
  result = calculator.primeFactors(number)
}

Then(~"(.*) are the prime factors") { String expected ->
  assert expected == result.toString()
}
