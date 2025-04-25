import org.scalatest.flatspec.AnyFlatSpec
import ApiRoutes._

class OptimizerTest extends AnyFlatSpec {
  "Optimizer" should "create a valid move" in {
    val input = OptimizationInput(
      Vector(Container("C1", "A"), Container("C2", "B")),
      Rules(Vector(Vector(0, 5), Vector(5, 0)), Vector(1, 2))
    )

    val result = Optimizer.optimize(input)

    assert(result.moves.nonEmpty)
    assert(result.totalCost == 5)
  }
}
