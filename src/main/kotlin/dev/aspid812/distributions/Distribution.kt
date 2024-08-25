package dev.aspid812.distributions

import java.util.random.RandomGenerator
import java.util.stream.DoubleStream


interface Distribution {
	fun draw(rng: RandomGenerator): Double
}


fun RandomGenerator.nextFrom(distribution: Distribution) = distribution.draw(this)

fun RandomGenerator.doubles(distribution: Distribution): DoubleStream {
	return DoubleStream
		.generate { distribution.draw(this) }
		.sequential()
}

fun RandomGenerator.doubles(streamSize: Long, distribution: Distribution): DoubleStream {
	require(streamSize >= 0) { "size must be non-negative" }
	return this.doubles(distribution).limit(streamSize)
}
