package dev.aspid812.distributions

import java.util.random.RandomGenerator

import kotlin.math.ln


fun main() {
	val exponential = object: Distribution {
		override fun draw(rng: RandomGenerator) = -ln(1 - rng.nextDouble())
	}

	val rng = RandomGenerator.getDefault()
	val rvs = rng.doubles(10L, exponential).toArray()
	println(rvs.contentToString())
}
